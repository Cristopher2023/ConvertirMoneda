import com.conversor.CoversorMoneda;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        CoversorMoneda con1 = new CoversorMoneda();
        int terminar;
        float can;


        do{
            terminar = Integer.parseInt(JOptionPane.showInputDialog("Convertidor de Moneda\n"
                    + "1: Convertir Dólar a PesoMX\n"
                    + "2: Convertir Dolar a Quetazal\n"
                    + "3: Convertir Dolar a Libra Egipcia\n"
                    + "4: Convertir Dolar a Franco Suizo\n"
                    + "5: Convertir Dolar a Peso Cubano\n"
                    + "6: Salir \n"
                    + "Elige un opción"));

            switch(terminar){
                case 1:
                   can = Float.parseFloat(JOptionPane.showInputDialog("Convertir Dolar a Peso Mexicano\n"
                            + "Ingresa la cantidad a convertir"));
                   con1.DolaraPesoMexicano(can);


                    break;
                case 2:
                    can = Float.parseFloat(JOptionPane.showInputDialog("Convertir Dolar a Quetzal\n"
                            + "Ingresa la cantidad a convertir"));
                    con1.DolaraQuetzal(can);

                    break;
                case 3:
                    can = Float.parseFloat(JOptionPane.showInputDialog("Convertir Dolar a Libra Egipcia\n"
                            + "Ingresa la cantidad a convertir"));
                    con1.DolaraLibra(can);

                    break;
                case 4:
                    can = Float.parseFloat(JOptionPane.showInputDialog("Convertir Dolar a Franco Suizo\n"
                            + "Ingresa la cantidad a convertir"));
                    con1.DolaraFranco(can);

                    break;

                case 5:
                    can = Float.parseFloat(JOptionPane.showInputDialog("Convertir Dolar a Peso Cubano\n"
                            + "Ingresa la cantidad a convertir"));
                    con1.DolaraCubano(can);

                    break;

                case 6:
                   JOptionPane.showMessageDialog(null, "Salio del programa", "Salida",terminar);
                    break;
              default:
                   JOptionPane.showMessageDialog(null, "Opción no valida", "Error",terminar);
                    break;
            }
        }while(terminar!=5);




    }
}
