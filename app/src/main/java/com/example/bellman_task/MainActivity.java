package com.example.bellman_task;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bellman_task.Adapter.Attractions_Adapter;
import com.example.bellman_task.Adapter.Events_Adapter;
import com.example.bellman_task.Adapter.Hotspots_Adapter;
import com.example.bellman_task.Constants.Constants;
import com.example.bellman_task.Model.AttractionsItem;
import com.example.bellman_task.Model.BellmanResponse;
import com.example.bellman_task.Model.EventsItem;
import com.example.bellman_task.Model.HotSpotsItem;
import com.example.bellman_task.Remote.RetrofitClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    protected Toolbar toolbar;


    protected RecyclerView hotspotsRcview;
    protected RecyclerView eventsRcview;
    protected RecyclerView attractionsRcview;

    protected ProgressBar progressBar;

    protected TextView Location;
    public Attractions_Adapter attractions_adapter;

    public Hotspots_Adapter hotspots_adapter;

    public Events_Adapter events_adapter;
    protected ScrollView mainscrollView;
    protected TextView LocationTextView;
    protected TextView hotspotsEdittext;
    protected TextView eventsEdittext;
    protected TextView attractionsEdittext;


    int fabbtni;

    public List<AttractionsItem> attractionsList;

    public List<EventsItem> eventsList;

    public List<HotSpotsItem> hotSpotsList;
    protected FloatingActionButton hotspotsbtn;
    protected FloatingActionButton eventsbtn;
    protected FloatingActionButton attractionsbtn;
    protected FloatingActionButton fabbtn;


    int PERMISSION_ID = 44;
    FusedLocationProviderClient mFusedLocationClient;


    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);



        toolbar = (Toolbar) findViewById(R.id.toolbar);

        hotspotsRcview = (RecyclerView) findViewById(R.id.hotspots_rcview);
        eventsRcview = (RecyclerView) findViewById(R.id.events_rcview);
        attractionsRcview = (RecyclerView) findViewById(R.id.attractions_rcview);

        mainscrollView = (ScrollView) findViewById(R.id.mainscrollView);

        LocationTextView = findViewById(R.id.location);

        hotspotsEdittext = (TextView) findViewById(R.id.hotspots_edittext);

        eventsEdittext = (TextView) findViewById(R.id.events_edittext);

        attractionsEdittext = (TextView) findViewById(R.id.attractions_edittext);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);

        hotspotsbtn = (FloatingActionButton) findViewById(R.id.hotspotsbtn);
        eventsbtn = (FloatingActionButton) findViewById(R.id.eventsbtn);
        attractionsbtn = (FloatingActionButton) findViewById(R.id.attractionsbtn);
        fabbtn = (FloatingActionButton) findViewById(R.id.fabbtn);


        fabbtni = 0;

        fabbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (fabbtni == 0) {
                    hotspotsbtn.setVisibility(View.VISIBLE);
                    eventsbtn.setVisibility(View.VISIBLE);
                    attractionsbtn.setVisibility(View.VISIBLE);

                    fabbtni = 1;

                } else {

                    hotspotsbtn.setVisibility(View.GONE);
                    eventsbtn.setVisibility(View.GONE);
                    attractionsbtn.setVisibility(View.GONE);

                    fabbtni = 0;

                }
            }
        });


        hotspotsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mainscrollView.fullScroll(ScrollView.FOCUS_UP);


                hotspotsRcview.scrollToPosition(0);
            }
        });


        eventsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainscrollView.post(new Runnable() {
                    public void run() {

                        mainscrollView.scrollTo(0, eventsRcview.getTop());
                    }
                });


                eventsRcview.scrollToPosition(0);
            }
        });


        attractionsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainscrollView.fullScroll(ScrollView.FOCUS_DOWN);
                attractionsRcview.scrollToPosition(0);
            }
        });

        getBellmanData();


        attractionsList = new ArrayList<>();

        hotSpotsList = new ArrayList<>();

        eventsList = new ArrayList<>();


        hotspotsRcview.setHasFixedSize(true);
        hotspotsRcview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        hotspots_adapter = new Hotspots_Adapter(hotSpotsList, this);

        hotspotsRcview.setAdapter(hotspots_adapter);


        eventsRcview.setHasFixedSize(true);
        eventsRcview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        events_adapter = new Events_Adapter(eventsList, this);

        eventsRcview.setAdapter(events_adapter);


        attractionsRcview.setHasFixedSize(true);
        attractionsRcview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));


        attractions_adapter = new Attractions_Adapter(attractionsList, this);

        attractionsRcview.setAdapter(attractions_adapter);



        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);


        getLastLocation();


    }


    private boolean checkPermissions() {
        if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            return true;
        }
        return false;
    }

    private void requestPermissions() {
        ActivityCompat.requestPermissions(
                MainActivity.this,
                new String[]{Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION},
                PERMISSION_ID
        );
    }



    private boolean isLocationEnabled() {
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) || locationManager.isProviderEnabled(
                LocationManager.NETWORK_PROVIDER
        );
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint("MissingPermission")
    private void getLastLocation(){
        if (checkPermissions()) {
            if (isLocationEnabled()) {
                mFusedLocationClient.getLastLocation().addOnCompleteListener(
                        new OnCompleteListener<Location>() {
                            @Override
                            public void onComplete(@NonNull Task<Location> task) {
                                Location location = task.getResult();
                                if (location == null) {
                                    requestNewLocationData();
                                } else {


                                    Geocoder geocoder = new Geocoder(MainActivity.this, Locale.getDefault());
                                    List<Address> addresses = null;
                                    try {
                                        addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    String cityName = addresses.get(0).getAddressLine(0);
                                    String stateName = addresses.get(0).getAddressLine(1);
                                    String countryName = addresses.get(0).getAddressLine(2);

                                    String[] arrOfStr = cityName.split(",");


                                    LocationTextView.setText("You're in "+arrOfStr[arrOfStr.length-2]+", "+arrOfStr[arrOfStr.length-1]);

                                }
                            }
                        }
                );
            } else {
                Toast.makeText(this, "Turn on location", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(intent);
            }
        } else {
            requestPermissions();
        }
    }



    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_ID) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getLastLocation();
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onResume() {
        super.onResume();
        if (checkPermissions()) {
            getLastLocation();
        }

    }


    @SuppressLint("MissingPermission")
    private void requestNewLocationData(){

        LocationRequest mLocationRequest = new LocationRequest();
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        mLocationRequest.setInterval(0);
        mLocationRequest.setFastestInterval(0);
        mLocationRequest.setNumUpdates(1);

        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        mFusedLocationClient.requestLocationUpdates(
                mLocationRequest, mLocationCallback,
                Looper.myLooper()
        );

    }

    private LocationCallback mLocationCallback = new LocationCallback() {
        @Override
        public void onLocationResult(LocationResult locationResult) {
            Location mLastLocation = locationResult.getLastLocation();
            Geocoder geocoder = new Geocoder(MainActivity.this, Locale.getDefault());
            List<Address> addresses = null;
            try {
                addresses = geocoder.getFromLocation(mLastLocation.getLatitude(), mLastLocation.getLongitude(), 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String cityName = addresses.get(0).getAddressLine(0);
            String stateName = addresses.get(0).getAddressLine(1);
            String countryName = addresses.get(0).getAddressLine(2);

            LocationTextView.setText( countryName+ " " + cityName);

        }



    };











    public List<AttractionsItem> attractionsListt;

    public List<HotSpotsItem> hotSpotsListt;

    public List<EventsItem> eventsListt;

    public void getBellmanData() {


        RetrofitClient.getClient().getinfo(Constants.Api_key)
                .enqueue(new Callback<BellmanResponse>() {
                    @Override
                    public void onResponse(Call<BellmanResponse> call, Response<BellmanResponse> response) {


                        if ("success".equals(response.body().getMessage())) {

                            progressBar.setVisibility(View.GONE);

                            List<AttractionsItem> attractionsList = response.body().getData().getAttractions();

                            attractionsListt = attractionsList;

                            attractions_adapter.changeData(attractionsList);


                            List<EventsItem> eventsList = response.body().getData().getEvents();

                            eventsListt = eventsList;

                            events_adapter.changeData(eventsList);


                            List<HotSpotsItem> hotSpotsList = response.body().getData().getHotSpots();

                            //Toast.makeText(MainActivity.this, hotSpotsList.size()+"", Toast.LENGTH_SHORT).show();

                            hotSpotsListt = hotSpotsList;

                            hotspots_adapter.changeData(hotSpotsList);


                        } else {

                            Toast.makeText(MainActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();

                        }


                    }

                    @Override
                    public void onFailure(Call<BellmanResponse> call, Throwable t) {

                        Toast.makeText(MainActivity.this, "Please try again later"

                                        + " as " + t.getLocalizedMessage()

                                , Toast.LENGTH_SHORT).show();

                    }
                });


    }


    @SuppressLint("ResourceType")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);


        SearchManager searchManager =
                (SearchManager) getSystemService(this.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search)
                .getActionView();
        searchView.setSearchableInfo(searchManager
                .getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(this);


        return true;
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

        newText = newText.toLowerCase();


        List<HotSpotsItem> hotSpotsList = new ArrayList<>();

        progressBar.setVisibility(View.VISIBLE);
        for (HotSpotsItem hotSpots : hotSpotsListt) {
            String newsString = hotSpots.getName().toLowerCase();


            if (newsString.contains(newText)) {

                progressBar.setVisibility(View.GONE);
                hotSpotsList.add(hotSpots);
            }
        }

        hotspots_adapter.updateList(hotSpotsList);


        List<EventsItem> eventsList = new ArrayList<>();

        //progressBar.setVisibility(View.VISIBLE);
        for (EventsItem events : eventsListt) {
            String newsString = events.getName().toLowerCase();


            if (newsString.contains(newText)) {

                progressBar.setVisibility(View.GONE);
                eventsList.add(events);
            }
        }

        events_adapter.updateList(eventsList);


        List<AttractionsItem> attractionsList = new ArrayList<>();

        //progressBar.setVisibility(View.VISIBLE);
        for (AttractionsItem attractions : attractionsListt) {
            String newsString = attractions.getName().toLowerCase();


            if (newsString.contains(newText)) {

                progressBar.setVisibility(View.GONE);
                attractionsList.add(attractions);
            }
        }

        attractions_adapter.updateList(attractionsList);


        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        return super.onOptionsItemSelected(item);
    }



}
