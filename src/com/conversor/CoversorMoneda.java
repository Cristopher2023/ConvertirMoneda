package com.conversor;

import javax.swing.*;

public class CoversorMoneda {


    String moneda1="Dolar";
    String  moneda2= "PesoMX";
    String moneda3="Quetzal";
    String moneda4="Libra Egipcia";

    String moneda5 ="Franco Suizo";
    String moneda6="Peso Cubano";
    double conversion;

    public CoversorMoneda() {
    }

      public void DolaraPesoMexicano(float cantidad){

      conversion = (cantidad * 18.88);

      JOptionPane.showMessageDialog(null,moneda1 +":"+ cantidad + "\n"
                                                                +  moneda2 +":"+conversion   ) ;

   }
    public void DolaraQuetzal(float cantidad){

        conversion = (cantidad * 7.83);

        JOptionPane.showMessageDialog(null,moneda1 +":"+ cantidad + "\n"
                                                               +  moneda3 +":"+conversion   ) ;

    }
    public void DolaraLibra(float cantidad){

        conversion = (cantidad * 30.25);

        JOptionPane.showMessageDialog(null,moneda1 +":"+ cantidad + "\n"
                                                            +  moneda4 +":"+conversion   ) ;

    }

    public void DolaraFranco(float cantidad){

        conversion = (cantidad * 0.92);

        JOptionPane.showMessageDialog(null,moneda1 +":"+ cantidad + "\n"
                +  moneda5 +":"+conversion   ) ;

    }

    public void DolaraCubano(float cantidad){

        conversion = (cantidad * 24.07);

        JOptionPane.showMessageDialog(null,moneda1 +":"+ cantidad + "\n"
                                           +  moneda6 +":"+conversion   ) ;

    }






    }
