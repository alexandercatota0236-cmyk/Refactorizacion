
package com.mycompany.refactorizacion;


public class servicioEmail {

    public void enviarConfirmacion(cliente cliente,
                                   double total){

        System.out.println("Enviando correo a "
                + cliente.getEmail());

        System.out.println("Asunto: Confirmacion de pedido");

        System.out.println("Cuerpo: Estimado "
                + cliente.getNombre()
                + ", su pedido por $"
                + total
                + " ha sido procesado.");
    }

    public void enviarCancelacion(cliente cliente,
                                  int idPedido){

        System.out.println("Enviando correo a "
                + cliente.getEmail());

        System.out.println("Asunto: Cancelacion de pedido");

        System.out.println("Cuerpo: Estimado "
                + cliente.getNombre()
                + ", su pedido #"
                + idPedido
                + " ha sido cancelado.");
    }

}