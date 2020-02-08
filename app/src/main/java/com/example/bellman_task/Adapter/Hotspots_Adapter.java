package com.example.bellman_task.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bellman_task.Model.HotSpotsItem;
import com.example.bellman_task.R;

import java.util.ArrayList;
import java.util.List;

public class Hotspots_Adapter extends RecyclerView.Adapter<Hotspots_Adapter.Viewholder> {

    List<HotSpotsItem> hotSpotslist;
    Context context;


    int finalI;

    public Hotspots_Adapter(List<HotSpotsItem> hotSpotslist, Context context) {
        this.hotSpotslist = hotSpotslist;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);


        return new Viewholder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull final Viewholder holder, int position) {

        final HotSpotsItem hotSpotsItem = hotSpotslist.get(position);


        holder.itemTitle.setText(hotSpotsItem.getName());


        holder.backwardbtn.setEnabled(false);

        holder.forwardbtn.setEnabled(false);

        if(hotSpotsItem.getPhotos().size()>0) {

            Glide.with(holder.itemView).load(hotSpotsItem.getPhotos().get(0)).into(holder.itemImage);

            holder.backwardbtn.setEnabled(true);

            holder.forwardbtn.setEnabled(true);



            finalI = 0;







            holder.forwardbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final int i = finalI;

                    if(i==hotSpotsItem.getPhotos().size()-1){



                    }else{

                        Glide.with(holder.itemView).load(hotSpotsItem.getPhotos().get(finalI++)).into(holder.itemImage);


                    }






                }
            });


            holder.backwardbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final int i = finalI;

                    if(i==0) {



                    }else{

                        Glide.with(holder.itemView).load(hotSpotsItem.getPhotos().get(finalI--)).into(holder.itemImage);

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
        return hotSpotslist== null ? 0 : hotSpotslist.size();
    }


    public void changeData(List<HotSpotsItem> hotSpotsList) {

        this.hotSpotslist=hotSpotsList;
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





    public void updateList(List<HotSpotsItem>  hotSpotsList){


        hotSpotslist = new ArrayList<>();
        hotSpotslist.addAll(hotSpotsList);
        notifyDataSetChanged();


    }
}
