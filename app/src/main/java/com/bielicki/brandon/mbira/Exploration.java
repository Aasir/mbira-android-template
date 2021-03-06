package com.bielicki.brandon.mbira;

import android.graphics.Bitmap;

import java.util.ArrayList;

/**
 * Created by Brandon on 3/12/2015.
 */
public class Exploration {
    public int id;
    public int project_id;
    public int pid;
    public String name;
    public String description;
    public ArrayList<String> direction;
    public String thumb_path;
    public boolean toggle_comments;
    public boolean toggle_media;
    public Bitmap explorationImage;
    public ArrayList<Bitmap> media;

    //MAPITEM RELATED
    private ArrayList<MapItem> mapItemArrayList = new ArrayList<MapItem>();
    public ArrayList<MapItem> getMapItemArrayList() {
        return mapItemArrayList;
    }
    public void addMapItem(MapItem M) {
        mapItemArrayList.add(M);
    }

    //LOCATION RELATED DATA
    private ArrayList<Location> locationArrayList = new ArrayList<Location>();
    public ArrayList<Location> getLocationArrayList() {
        return locationArrayList;
    }
    public void addLocation(Location L) {
        locationArrayList.add(L);
    }

    //AREA RELATED DATA
    private ArrayList<Area> areaArrayList = new ArrayList<Area>();
    public ArrayList<Area> getAreaArrayList() {
        return areaArrayList;
    }
    public void addArea(Area a) {
        areaArrayList.add(a);
    }
}