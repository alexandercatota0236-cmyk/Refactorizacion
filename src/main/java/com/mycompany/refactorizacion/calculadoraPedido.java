
package com.mycompany.refactorizacion;

import java.util.List;

public class calculadoraPedido {

    public double calcularSubtotal(List<Double> precios,
                                   List<Integer> cantidades) {

        double subtotal = 0;

        for(int i=0;i<precios.size();i++) {
            subtotal += precios.get(i) * cantidades.get(i);
        }

        return subtotal;
    }

    public double calcularDescuento(double subtotal, String tipoCliente){

        switch (tipoCliente) {

            case "VIP":
                return subtotal * 0.20;

            case "FRECUENTE":
                return subtotal * 0.10;

            case "REGULAR":
                return subtotal * 0.05;

            default:
                return 0;
        }
    }

    public double calcularImpuesto(double subtotal, double descuento) {
        return (subtotal - descuento) * 0.12;
    }

}