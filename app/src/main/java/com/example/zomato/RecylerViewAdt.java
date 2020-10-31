package com.example.zomato;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecylerViewAdt extends RecyclerView.Adapter<RecylerViewAdt.MyViewHolder> {

    private ArrayList<Restaurants> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView offerText;
        TextView deliveryText;
        TextView placeName;
        TextView foodType;
        TextView ratingText;
        TextView minOrderText;
        TextView placeStatusText;
        ImageView foodImage;


        public MyViewHolder(View itemView) {
            super(itemView);
            this.offerText = itemView.findViewById(R.id.offerText);
            this.deliveryText = itemView.findViewById(R.id.deliveryTime);
            this.placeName =  itemView.findViewById(R.id.placeName);
            this.foodType = itemView.findViewById(R.id.typeOfFood);
            this.ratingText = itemView.findViewById(R.id.ratingText);
            this.minOrderText = itemView.findViewById(R.id.minOrder);
            this.placeStatusText = itemView.findViewById(R.id.placeStatus);
            this.foodImage = itemView.findViewById(R.id.foodImage);
        }

    }

    public RecylerViewAdt(ArrayList<Restaurants> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_cardview, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        TextView offerText = holder.offerText;
        TextView deliveryText = holder.deliveryText;
        TextView placeName = holder.placeName;
        TextView foodType = holder.foodType;
        TextView ratingText = holder.ratingText;
        TextView minOrderText = holder.minOrderText;
        TextView placeStatusText = holder.placeStatusText;
        ImageView foodImage = holder.foodImage;

        placeName.setText(dataSet.get(position).getName());
        offerText.setText(dataSet.get(position).getOffer()+"%OFF");
        deliveryText.setText(dataSet.get(position).getDeliveryTime()+" mins");
        minOrderText.setText(dataSet.get(position).getMinOrder()+" for one");
        ratingText.setText(dataSet.get(position).getRating()+"/5");
        placeStatusText.setText(dataSet.get(position).getPlaceStatus());
        String[] typeOfFood =dataSet.get(position).getFoodType();
        StringBuilder text = new StringBuilder();
        for(int i =0;i< typeOfFood.length;i++){
                if(i ==  typeOfFood.length-1){
                    text.append(typeOfFood[i]);
                }else {
                    text.append(typeOfFood[i]).append(", ");
                }
        }
        foodType.setText(text.toString());
        foodImage.setImageResource(R.drawable.foodimage);
    }


    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
