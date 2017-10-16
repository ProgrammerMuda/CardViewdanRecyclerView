package com.example.raga.cardviewdanrecyclerview.detaildata;

/**
 * Created by RAGA on 12/10/2017.
 */

public class detaildata {
    private Integer gambar;
    private String title;
    private String subtitle;

    public detaildata(Integer gambar, String title, String subtitle){
        this.gambar = gambar;
        this.title = title;
        this.subtitle = subtitle;


    }

    public Integer getGambar(){
        return gambar;
    }

    public void setGambar(){
        this.gambar = gambar;
    }


    public String getTitle(){
        return title;
    }

    public void setTitle(){
        this.title = title;
    }

    public String getSubtitle(){
        return subtitle;
    }

    public void setSubtitle(){
        this.subtitle = subtitle;
    }




}
