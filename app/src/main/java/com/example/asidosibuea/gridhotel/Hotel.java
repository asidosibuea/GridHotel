package com.example.asidosibuea.gridhotel;

/**
 * Created by asidosibuea on 10/12/17.
 */

public class Hotel {
    private int id;
    private String name;
    private String address;
    private byte[] image;

    public Hotel(int id, String name, String address, byte[] image) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
