package com.example.semoc_bes_droid_builders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderEventItem extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView, typeView, localView, dateView;
    public ViewHolderEventItem(@NonNull View itemView,RecycleViewInterface recycleViewInterface) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        typeView = itemView.findViewById(R.id.type);
        localView = itemView.findViewById(R.id.local);
        dateView = itemView.findViewById(R.id.date);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(recycleViewInterface != null){
                    int pos = getAdapterPosition();

                    if(pos!=RecyclerView.NO_POSITION){
                        recycleViewInterface.onItemClick(pos);
                    }
                }
            }
        });

    }
}
