package com.example.semoc_bes_droid_builders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterEventItem extends RecyclerView.Adapter<ViewHolderEventItem> {
    private final RecycleViewInterface recycleViewInterface;
    Context context;
    List<EventItem> eventItems;

    public AdapterEventItem(Context context, List<EventItem> eventItems, RecycleViewInterface recycleViewInterface) {
        this.context = context;
        this.eventItems = eventItems;
        this.recycleViewInterface = recycleViewInterface;
    }

    //Layout Inflater
    @NonNull
    @Override
    public ViewHolderEventItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolderEventItem(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false),recycleViewInterface);
    }

    //Bind the data to the view
    @Override
    public void onBindViewHolder(@NonNull ViewHolderEventItem holder, int position) {
        holder.nameView.setText(eventItems.get(position).getName());
        holder.typeView.setText(eventItems.get(position).getType());
        holder.localView.setText(eventItems.get(position).getLocal());
        holder.dateView.setText(eventItems.get(position).getDate());
        holder.imageView.setImageResource(eventItems.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return eventItems.size();
    }

//    public static class MyViewHolder extends RecyclerView.ViewHolder{
//
//        ImageView imageview;
//        TextView name,type,local,date;
//
//        public MyViewHolder(@NonNull View itemView,RecycleViewInterface recycleViewInterface) {
//            super(itemView);
//            imageview = itemView.findViewById(R.id.imageview);
//            name = itemView.findViewById(R.id.name);
//            type = itemView.findViewById(R.id.type);
//            local = itemView.findViewById(R.id.local);
//            date = itemView.findViewById(R.id.date);
//
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if(recycleViewInterface != null){
//                        int pos = getAdapterPosition();
//
//                        if(pos!=RecyclerView.NO_POSITION){
//                            recycleViewInterface.onItemClick(pos);
//                        }
//                    }
//                }
//            });
//        }
//    }
}
