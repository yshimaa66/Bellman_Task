package com.example.bellman_task.Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bellman_task.Model.EventsItem;
import com.example.bellman_task.R;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Events_Adapter extends RecyclerView.Adapter<Events_Adapter.Viewholder> {


    List<EventsItem> eventslist;
    Context context;


    int finalI;

    public Events_Adapter(List<EventsItem> eventslist, Context context) {
        this.eventslist = eventslist;
        this.context = context;
    }

    @NonNull
    @Override
    public Events_Adapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);


        return new Events_Adapter.Viewholder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull final Events_Adapter.Viewholder holder, int position) {

        final EventsItem eventsItem = eventslist.get(position);

        holder.itemTitle.setText(eventsItem.getName());


        holder.backwardbtn.setEnabled(false);

        holder.forwardbtn.setEnabled(false);

        if(eventsItem.getPhotos().size()>0) {

            Glide.with(holder.itemView).load(eventsItem.getPhotos().get(0)).into(holder.itemImage);

            holder.backwardbtn.setEnabled(true);

            holder.forwardbtn.setEnabled(true);



            finalI = 0;







            holder.forwardbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final int i = finalI;

                    if(i==eventsItem.getPhotos().size()-1){



                    }else{

                        Glide.with(holder.itemView).load(eventsItem.getPhotos().get(finalI++)).into(holder.itemImage);


                    }






                }
            });


            holder.backwardbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final int i = finalI;

                    if(i==0) {



                    }else{

                        Glide.with(holder.itemView).load(eventsItem.getPhotos().get(finalI--)).into(holder.itemImage);

                    }

                }
            });



        }


        else{

            Glide.with(holder.itemView).load(R.drawable.no_image_available).into(holder.itemImage);

        }

    }


    @Override
    public int getItemCount() {
        return eventslist== null ? 0 : eventslist.size();
    }


    public void changeData(List<EventsItem> eventsList) {

        this.eventslist=eventsList;
        notifyDataSetChanged();

    }

    public class Viewholder extends RecyclerView.ViewHolder {

        protected TextView itemTitle;
        protected ProgressBar progressBar;
        protected ImageView itemImage;

        protected ImageView forwardbtn;

        protected ImageView backwardbtn;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            progressBar = (ProgressBar) itemView.findViewById(R.id.progress_bar);
            itemImage = (ImageView) itemView.findViewById(R.id.item_image);

            forwardbtn = (ImageView) itemView.findViewById(R.id. forwardbtn);


            backwardbtn = (ImageView) itemView.findViewById(R.id.backwardbtn);

        }
    }



    public void updateList(List<EventsItem>  eventsList){


        eventslist = new ArrayList<>();
        eventslist.addAll(eventsList);
        notifyDataSetChanged();


    }
}
