package com.brainmatics.dvdapp.controller;

import com.brainmatics.dvdapp.exception.DVDException;
import com.brainmatics.dvdapp.domain.DVDItem;
import java.util.ArrayList;

public interface DVDService {
    void tambahDVD(DVDItem item) throws DVDException;
    DVDItem cariDVD(String title) throws DVDException;
    void hapusDVD(DVDItem item) throws DVDException;
    void updateDVD(DVDItem item) throws DVDException;
    ArrayList<DVDItem> getAllDVDItem() throws DVDException;
}
