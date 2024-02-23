package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Arquero extends Personaje {
    private int destreza;
    private int agilidad;
    private int precision;
    private Collection<String> habilidades;

    public Arquero(String nombre, String descripcion, String apodo, int dineroInicial, int destreza, int agilidad, int precision) {
        super(nombre, descripcion, apodo, dineroInicial);
        this.destreza = destreza;
        this.agilidad = agilidad;
        this.precision = precision;
        this.habilidades = new LinkedList<>();
    }

     @Override
    public void setHabilidades(Collection<String> habilidades) {
        this.habilidades.add("Disparo Rápido ");
        this.habilidades.add("Flecha Venenosa ");
        this.habilidades.add("Tiro Certero ");
        System.out.println("Estableciendo habilidades para un Arquero son: " + habilidades);
    }

    public int getDestreza() {
        return destreza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int getPrecision() {
        return precision;
    }

    public Collection<String> getHabilidades() {
        return habilidades;
    }

    @Override
    public void validarHabilidades(Collection<String> habilidades) {
        // Verificar que las habilidades sean las de un arquero
        for (String habilidad : habilidades) {
            if (!habilidad.equals("Disparo Rápido") && !habilidad.equals("Flecha Venenosa") && !habilidad.equals("Tiro Certero")) {
                throw new IllegalArgumentException("Las habilidades de un Arquero deben ser 'Disparo Rápido', 'Flecha Venenosa' o 'Tiro Certero'.");
            }
        }
    }

    @Override
    public void personalizarPersonaje() {
        //puedes personalizar a tu personaje
        throw new UnsupportedOperationException("Unimplemented method 'personalizarPersonaje'");
    }

}
