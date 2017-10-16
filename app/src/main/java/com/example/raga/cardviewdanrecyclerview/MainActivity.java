package com.example.raga.cardviewdanrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.raga.cardviewdanrecyclerview.detailadapter.detailadapter;
import com.example.raga.cardviewdanrecyclerview.detaildata.detaildata;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvListing;
    RecyclerView.LayoutManager  lmRecyler;
    ArrayList<detaildata> arrayDetail = new ArrayList<>();
    detailadapter detailadp;

    Integer[] gambarpemain = {
           R.drawable.aubameyang,
           R.drawable.dybala,
           R.drawable.ibrahimmovic,
           R.drawable.luissuarez,
           R.drawable.mbappe,
           R.drawable.neymar,
           R.drawable.ozil,
           R.drawable.pogba,
           R.drawable.reus,
           R.drawable.ronaldo,
           R.drawable.rooney,
           R.drawable.messi,
    };

    String[] namapemain = {
            "aubameyang",
            "dybala",
            "ibrahimovic",
            "luis suarez",
            "k.mbappe",
            "neymar jr",
            "mesut ozil",
            "paul pogba",
            "marco reus",
            "Ronaldo",
            "Rooney",
            "messi",

    };

    String[] subtitlepemain = {
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",
            "subtitle",



    };

    int[] nilaiLooping = {
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,
            11,
            12,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListing = (RecyclerView)findViewById(R.id.idcard1);
        rvListing.setHasFixedSize(true);

        lmRecyler = new LinearLayoutManager(this);
        rvListing.setLayoutManager(lmRecyler);


        for (int urutantitle = 0;  urutantitle < namapemain.length; ++urutantitle){}
        for (int urutangambar = 0; urutangambar < gambarpemain.length; ++urutangambar){}
        for (int urutansubtitle = 0; urutansubtitle < subtitlepemain.length; ++urutansubtitle){}
        for (int loop = 0; loop < nilaiLooping.length; ++loop){
            arrayDetail.add(new detaildata(gambarpemain[loop],namapemain[loop], subtitlepemain[loop]));
        }

        detailadp = new detailadapter(this, arrayDetail);
        rvListing.setAdapter(detailadp);


    }
}


