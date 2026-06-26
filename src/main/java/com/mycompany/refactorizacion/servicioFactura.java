
package com.mycompany.refactorizacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class servicioFactura {

    public void generarFactura(cliente cliente,
                               List<String> productos,
                               List<Double> precios,
                               List<Integer> cantidades,
                               double subtotal,
                               double descuento,
                               double impuesto,
                               double total) {

        try {

            FileWriter writer =
                    new FileWriter("factura_" +
                    cliente.getNombre() + ".txt");

            writer.write("FACTURA\n");
            writer.write("Cliente: " +
                         cliente.getNombre() + "\n");

            for (int i = 0; i < productos.size(); i++) {

                writer.write(productos.get(i)
                        + " x" + cantidades.get(i)
                        + " = $"
                        + (precios.get(i) * cantidades.get(i))
                        + "\n");
            }

            writer.write("Subtotal: $" + subtotal + "\n");
            writer.write("Descuento: $" + descuento + "\n");
            writer.write("Impuesto: $" + impuesto + "\n");
            writer.write("TOTAL: $" + total);

            writer.close();

        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}