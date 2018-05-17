package com.example.kwon.movie;

import android.graphics.drawable.Drawable;

public class ListViewItem {
    private Drawable iconDrawable ;
    private String titleStr ;
    private String genreStr ;
    private String openDtStr;
    private String saleshareStr;

    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }
    public void setDesc(String genre) {
        genreStr = genre ;
    }
    public void setOpenDtStr(String openDt){
        openDtStr = openDt;
    }
    public void setSaleshareStr(String saleshare){
        saleshareStr = saleshare;
    }

    public Drawable getIcon() {
        return this.iconDrawable;
    }
    public String getTitle() {
        return this.titleStr ;
    }
    public String getDesc() {
        return this.genreStr ;
    }
    public String getOpenDtStr(){
        return this.openDtStr;
    }
    public String getSaleshareStr(){
        return this.saleshareStr;
    }
}
