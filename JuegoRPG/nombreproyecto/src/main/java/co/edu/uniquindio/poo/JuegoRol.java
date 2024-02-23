package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class JuegoRol {
    
    private String nombre;
    private Collection<Jugador> jugadores;

    public JuegoRol(String nombre) {
        this.nombre = nombre;
        this.jugadores = new LinkedList<>();
    }
    
    public void registrarJugador(Jugador jugador) {
        jugadores.add(jugador);
        System.out.println("Registrando a " + jugador.getNickname());
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Jugador> getJugadores() {
        return jugadores;
    }

    public void validarPersonajes(Collection<String> habilidades) {
        for (Jugador jugador : jugadores) {
            Personaje personaje = jugador.getPersonaje();
            personaje.validarHabilidades(habilidades);
        }
    }

    public boolean existePersonajeConNombre(String nombre) {
        for (Jugador jugador : jugadores) {
            if (jugador.getPersonaje().getNombre().equals(nombre)) {
                return true; // Ya existe un personaje con el mismo nombre
            }
        }
        return false; // No existe otro personaje con el mismo nombre
    }

}
