package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Guerrero extends Personaje {
    private int fuerza;
    private int resistencia;
    private int vitalidad;
    private Collection<String> habilidades;

    public Guerrero(String nombre, String descripcion, String apodo, int dineroInicial, int fuerza, int resistencia, int vitalidad) {
        super(nombre, descripcion, apodo, dineroInicial);
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.vitalidad = vitalidad;
        this.habilidades = new LinkedList<>();
    }

    @Override
    public void setHabilidades(Collection<String> habilidades) {
        this.habilidades.add("Espada Afilada ");
        this.habilidades.add("Golpe Definitivo ");
        this.habilidades.add("Escudo Protector ");
        System.out.println("Estableciendo habilidades para un Guerrero son: " + habilidades);
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public Collection<String> getHabilidades() {
        return habilidades;
    }

    @Override
    public void validarHabilidades(Collection<String> habilidades) {
        // Verificar que las habilidades sean las de un guerrero
        for (String habilidad : habilidades) {
            if (!habilidad.equals("Espada Afilada") && !habilidad.equals("Golpe Definitivo") && !habilidad.equals("Escudo Protector")) {
                throw new IllegalArgumentException("Las habilidades de un Guerrero deben ser 'Espada Afilada', 'Golpe Definitivo' o 'Escudo Protector'.");
            }
        }
    }

    @Override
    public void personalizarPersonaje() {
        //puedes personalizar a tu personaje
        throw new UnsupportedOperationException("Unimplemented method 'personalizarPersonaje'");
    }

}
