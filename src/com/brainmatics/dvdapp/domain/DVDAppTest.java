package com.brainmatics.dvdapp.domain;

import com.brainmatics.dvdapp.controller.DVDService;
import com.brainmatics.dvdapp.controller.DVDServiceMemoryImpl;
import com.brainmatics.dvdapp.exception.DVDException;

public class DVDAppTest {
    public static void main(String[] args) {
        DVDService service = new DVDServiceMemoryImpl();
        // test cari
        try {
            DVDItem item = service.cariDVD("DoRaemon");
            System.out.println("DVD ditemukan "+item);
        } catch (DVDException de) {
            System.out.println(de.getMessage());
        }        
        // test hapus
        try {
            DVDItem item = new DVDItem("Doraemon",null,0);
            service.hapusDVD(item);
            System.out.println("DVD sukses dihapus");
            System.out.println(service.getAllDVDItem());
        } catch (DVDException de) {
            System.out.println(de.getMessage());
        }                
        // test tambah
        try {
            DVDItem item = new DVDItem("Doraemon",null,0);
            service.tambahDVD(item);
            System.out.println("DVD sukses ditambah");
            System.out.println(service.getAllDVDItem());
        } catch (DVDException de) {
            System.out.println(de.getMessage());
        }        
        // test update
        try {
            DVDItem item = new DVDItem("Doraemon",null,2010);
            service.updateDVD(item);
            System.out.println("DVD sukses diupdate");
            System.out.println(service.getAllDVDItem());
        } catch (DVDException de) {
            System.out.println(de.getMessage());
        }        
    }
}
