
package com.mycompany.refactorizacion;
public class cliente {

    private String nombre;
    private String email;
    private String tipo;

    
    public cliente(String nombre, String email, String tipo) {
        this.nombre = nombre;
        this.email = email;
        this.tipo = tipo;
    }

    public boolean esValido() {
        return nombre != null &&
               !nombre.trim().isEmpty() &&
               email != null &&
               email.contains("@");
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTipo() {
        return tipo;
    }
}