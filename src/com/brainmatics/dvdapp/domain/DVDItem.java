package com.brainmatics.dvdapp.domain;

import java.util.Objects;

/**
 *
 * @author Fatkharrofiqi
 */
public class DVDItem {
    private String title;
    private String genre;
    private int year;

    public DVDItem(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.title);
        return hash;
    }
       
    @Override
    public boolean equals(Object obj){
        boolean res = false;
        if(obj != null && obj instanceof DVDItem){
            DVDItem i = (DVDItem) obj;
            if(i.getTitle().equalsIgnoreCase(title))
                res = true;
        }
        return res;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }       

    @Override
    public String toString() {
        return "DVDItem{" + "title=" + title + ", genre=" + genre + ", year=" + year + '}';
    }    
}