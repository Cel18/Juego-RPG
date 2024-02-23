package co.edu.uniquindio.poo;

import java.util.Collection;

public abstract class Personaje implements InterfazPersonaje {
    protected String nombre;
    protected String descripcion;
    protected String apodo;
    protected int dineroInicial;

    public Personaje(String nombre, String descripcion, String apodo, int dineroInicial){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getApodo() {
        return apodo;
    }

    public int getDineroInicial() {
        return dineroInicial;
    }

    public abstract void setHabilidades(Collection<String> habilidades);

    public abstract void validarHabilidades(Collection<String> habilidades);
    
}
