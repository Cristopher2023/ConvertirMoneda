
import com.conversor.CoversorMoneda;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        CoversorMoneda con1 = new CoversorMoneda();

        con1.setCantidad(Float.parseFloat(JOptionPane.showInputDialog("Ingresa cantidad:")));

        System.out.println(con1.toString());

    }
}