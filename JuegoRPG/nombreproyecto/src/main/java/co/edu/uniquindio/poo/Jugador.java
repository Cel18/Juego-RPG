package co.edu.uniquindio.poo;

public class Jugador {
    
    private String nickname;
    private String correo;
    private int edad;
    private Personaje personaje;

    public Jugador(String nickname, String correo, int edad, Personaje personaje) {
        this.nickname = nickname;
        this.correo = correo;
        this.edad = edad;
        this.personaje = personaje;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

}
