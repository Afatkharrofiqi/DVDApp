package com.brainmatics.dvdapp.controller;

import com.brainmatics.dvdapp.domain.DVDItem;
import com.brainmatics.dvdapp.exception.DVDException;
import java.util.ArrayList;

public class DVDServiceMemoryImpl implements DVDService{
    private ArrayList<DVDItem> items;

    public DVDServiceMemoryImpl() {
        items = new ArrayList<>();
        items.add(new DVDItem("Doraemon", "Cartoon", 2014));
        items.add(new DVDItem("Superman", "Action", 2010));
        items.add(new DVDItem("Fast and Furious", "Race", 2015));
        items.add(new DVDItem("3 Idiots", "Comedy", 1996));
    }
        
    @Override
    public void tambahDVD(DVDItem item) throws DVDException {
        String title = item.getTitle();
        for(DVDItem element: items){
            if(element.getTitle().equalsIgnoreCase(title)){
                throw new DVDException("DVD dengan judul "+title+" sudah terdaftar");
            }
        }        
        items.add(item);
    }

    @Override
    public DVDItem cariDVD(String title) throws DVDException {
        DVDItem temp = new DVDItem(title, null, 0);
        if(items.contains(temp)){
            return items.get(items.indexOf(temp));
        }else{
            throw new DVDException("DVD dengan judul "+title+ " tidak ditemukan");
        }
    }

    @Override
    public void hapusDVD(DVDItem item) throws DVDException {
        if(items.contains(item)){
            items.remove(item);
        }else{
            throw new DVDException("DVD dengan judul "+item.getTitle()+ " tidak ditemukan");
        }
    }

    @Override
    public void updateDVD(DVDItem item) throws DVDException {
        if(items.contains(item)){
            items.set(items.indexOf(item), item);            
        }else{
            throw new DVDException("DVD dengan judul "+item.getTitle()+ " tidak ditemukan");
        }
    }

    @Override
    public ArrayList<DVDItem> getAllDVDItem() throws DVDException {
        return items;
    }    
}