package com.example.raga.cardviewdanrecyclerview.detailadapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.raga.cardviewdanrecyclerview.MainActivity;
import com.example.raga.cardviewdanrecyclerview.R;
import com.example.raga.cardviewdanrecyclerview.detaildata.detaildata;

import java.util.ArrayList;

/**
 * Created by RAGA on 12/10/2017.
 */

public class detailadapter extends RecyclerView.Adapter<detailadapter.CustomViewHolder>{


    private ArrayList<detaildata> arrayDetails;
    public detailadapter(MainActivity mainActivity, ArrayList<detaildata> arrayDetails ){
        this.arrayDetails = arrayDetails;
    }

    @Override
    public detailadapter.CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview, null);
        RecyclerView.LayoutParams lpRv = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lpRv);
        return new  CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(detailadapter.CustomViewHolder CutomViewHolder, int position) {
        CutomViewHolder.tvtitle.setText(arrayDetails.get(position).getTitle());
        CutomViewHolder.tvsubtitle.setText(arrayDetails.get(position).getSubtitle());
        CutomViewHolder.Image1.setImageResource(arrayDetails.get(position).getGambar());

    }

    @Override
    public int getItemCount() {
        return (null != arrayDetails ? arrayDetails.size():0);
    }


     class CustomViewHolder extends RecyclerView.ViewHolder {
         TextView tvtitle, tvsubtitle;
         ImageView Image1;
         public CustomViewHolder(View itemView) {
             super(itemView);
             tvtitle = (TextView)itemView.findViewById(R.id.text1);
             tvsubtitle = (TextView)itemView.findViewById(R.id.text2);
             Image1 = (ImageView)itemView.findViewById(R.id.img1);

         }
     }
}

