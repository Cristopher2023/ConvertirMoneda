package com.conversor;

import javax.swing.*;

public class CoversorMoneda {

    float cantidad;
    String moneda1,moneda2,moneda3,moneda4,moneda5;
    String Nacion1,Nacion2,Nacion3,Nacion4,Nacion5;
    double conver1,conver2,conver3,conver4,conver5;

    public CoversorMoneda() {
    }

    public CoversorMoneda(float cantidad, String moneda1, String moneda2, String moneda3, String moneda4,
                          String moneda5, String nacion1, String nacion2, String nacion3, String nacion4,
                          String nacion5, double conver1, double conver2, double conver3, double conver4,
                          double conver5) {
        this.cantidad = cantidad;
        this.moneda1 = moneda1;
        this.moneda2 = moneda2;
        this.moneda3 = moneda3;
        this.moneda4 = moneda4;
        this.moneda5 = moneda5;
        Nacion1 = nacion1;
        Nacion2 = nacion2;
        Nacion3 = nacion3;
        Nacion4 = nacion4;
        Nacion5 = nacion5;
        this.conver1 = conver1;
        this.conver2 = conver2;
        this.conver3 = conver3;
        this.conver4 = conver4;
        this.conver5 = conver5;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getMoneda1() {
        return moneda1;
    }

    public void setMoneda1(String moneda1) {
        this.moneda1 = moneda1;
    }

    public String getMoneda2() {
        return moneda2;
    }

    public void setMoneda2(String moneda2) {
        this.moneda2 = moneda2;
    }

    public String getMoneda3() {
        return moneda3;
    }

    public void setMoneda3(String moneda3) {
        this.moneda3 = moneda3;
    }

    public String getMoneda4() {
        return moneda4;
    }

    public void setMoneda4(String moneda4) {
        this.moneda4 = moneda4;
    }

    public String getMoneda5() {
        return moneda5;
    }

    public void setMoneda5(String moneda5) {
        this.moneda5 = moneda5;
    }

    public String getNacion1() {
        return "Peso Mexicano";
    }

    public void setNacion1(String nacion1) {
        Nacion1 = nacion1;
    }

    public String getNacion2() {
        return "Estadounidense";
    }

    public void setNacion2(String nacion2) {
        Nacion2 = nacion2;
    }

    public String getNacion3() {
        return "Franco Suizo";
    }

    public void setNacion3(String nacion3) {
        Nacion3 = nacion3;
    }

    public String getNacion4() {
        return "Libra Egipcia";
    }

    public void setNacion4(String nacion4) {
        Nacion4 = nacion4;
    }

    public String getNacion5() {
        return "Quetzal";
    }

    public void setNacion5(String nacion5) {
        Nacion5 = nacion5;
    }

    public double getConver1() {
        return cantidad * 1.00;
    }

    public void setConver1(double conver1) {
        this.conver1 = conver1;
    }

    public double getConver2() {
        return conver2;
    }

    public void setConver2(double conver2) {
        this.conver2 = conver2;
    }

    public double getConver3() {
        return conver3;
    }

    public void setConver3(double conver3) {
        this.conver3 = conver3;
    }

    public double getConver4() {
        return conver4;
    }

    public void setConver4(double conver4) {
        this.conver4 = conver4;
    }

    public double getConver5() {
        return conver5;
    }

    public void setConver5(double conver5) {
        this.conver5 = conver5;
    }

    public String toString() {
        return "CoversorMoneda" +'\n' +
                 "Tipos de moneda Disponibles: Peso Mexicano|Estadounidense|Franco Suizo|Libra Egipcia|Quetzal"+'\n' +
                "cantidad:"+ getCantidad() + '\n' +
                "Tipo de moneda='" + getMoneda1() + '\n' +
                "Coversion ='" + getConver1() + '\n'+
                "Tipo de moneda:" +getMoneda2() +
                '}';
    }
}
