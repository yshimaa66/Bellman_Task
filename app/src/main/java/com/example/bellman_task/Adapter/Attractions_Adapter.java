package com.example.bellman_task.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bellman_task.Model.AttractionsItem;
import com.example.bellman_task.R;

import java.util.ArrayList;
import java.util.List;

public class Attractions_Adapter extends RecyclerView.Adapter<Attractions_Adapter.Viewholder> {

    List<AttractionsItem> attractionslist;
    Context context;

    int finalI;

    public Attractions_Adapter(List<AttractionsItem> attractionslist, Context context) {
        this.attractionslist = attractionslist;
        this.context = context;
    }

    @NonNull
    @Override
    public Attractions_Adapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);


        return new Attractions_Adapter.Viewholder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull final Attractions_Adapter.Viewholder holder, int position) {

        final AttractionsItem attractionsItem = attractionslist.get(position);

        holder.itemTitle.setText(attractionsItem.getName());

        holder.backwardbtn.setEnabled(false);

        holder.forwardbtn.setEnabled(false);

         if(attractionsItem.getPhotos().size()>0) {

             Glide.with(holder.itemView).load(attractionsItem.getPhotos().get(0)).into(holder.itemImage);

             holder.backwardbtn.setEnabled(true);

             holder.forwardbtn.setEnabled(true);



                 finalI = 0;







                 holder.forwardbtn.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {

                             final int i = finalI;

                         if(i==attractionsItem.getPhotos().size()-1){



                         }else{

                             Glide.with(holder.itemView).load(attractionsItem.getPhotos().get(finalI++)).into(holder.itemImage);


                         }






                     }
                 });


                 holder.backwardbtn.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {

                         final int i = finalI;

                         if(i==0) {



                         }else{

                         Glide.with(holder.itemView).load(attractionsItem.getPhotos().get(finalI--)).into(holder.itemImage);

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
        return attractionslist== null ? 0 : attractionslist.size();
    }


    public void changeData(List<AttractionsItem> attractionsList) {

        this.attractionslist=attractionsList;
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


    public void updateList(List<AttractionsItem>  attractionsList){


        attractionslist = new ArrayList<>();
        attractionslist.addAll(attractionsList);
        notifyDataSetChanged();


    }
}
