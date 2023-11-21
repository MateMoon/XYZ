package com.example.xyz;

public class MainModel {
    String Nombre, Precio, Cantidad, imgURL;

    public MainModel(){

    }

    public MainModel(String nombre, String precio, String cantidad, String imgURL) {
        Nombre = nombre;
        Precio = precio;
        Cantidad = cantidad;
        this.imgURL = imgURL;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String cantidad) {
        Cantidad = cantidad;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
