package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Mago extends Personaje {
    private int inteligencia;
    private int sabiduría;
    private int energiaMagica;
    private Collection<String> habilidades;

    public Mago(String nombre, String descripcion, String apodo, int dineroInicial, int inteligencia, int sabiduría, int energiaMagica) {
        super(nombre, descripcion, apodo, dineroInicial);
        this.inteligencia = inteligencia;
        this.sabiduría = sabiduría;
        this.energiaMagica = energiaMagica;
        this.habilidades = new LinkedList<>();
    }

    @Override
    public void setHabilidades(Collection<String> habilidades) {
        this.habilidades.add("Bola de Fuego ");
        this.habilidades.add("Rayo Eléctrico ");
        this.habilidades.add("Hechizo de Curación ");
        System.out.println("Estableciendo habilidades para un Mago son: " + habilidades);
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getSabiduría() {
        return sabiduría;
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public Collection<String> getHabilidades() {
        return habilidades;
    }

    @Override
    public void validarHabilidades(Collection<String> habilidades) {
        // Verificar que las habilidades sean las de un mago
        for (String habilidad : habilidades) {
            if (!habilidad.equals("Bola de Fuego") && !habilidad.equals("Rayo Eléctrico") && !habilidad.equals("Hechizo de Curación")) {
                throw new IllegalArgumentException("Las habilidades de un Mago deben ser 'Bola de Fuego', 'Rayo Eléctrico' o 'Hechizo de Curación'.");
            }
        }
    }

    @Override
    public void personalizarPersonaje() {
        //puedes personalizar a tu personaje
        throw new UnsupportedOperationException("Unimplemented method 'personalizarPersonaje'");
    }

}
