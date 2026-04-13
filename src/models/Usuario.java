package models;

public class Usuario {
    private String nombre;
    private int edad;
    private double peso;

    public Usuario(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " | Edad: " + edad +
                " | Peso: " + peso;
    }
}
