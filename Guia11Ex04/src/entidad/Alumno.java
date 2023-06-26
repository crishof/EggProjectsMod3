package entidad;

import java.util.ArrayList;
import java.util.HashSet;

public class Alumno {

    private String nombreCompleto;
    private String dni;
    private int votosRecibidos;

    ArrayList<Voto> votos;
    public Alumno(String nombre, String documento) {
        this.nombreCompleto = nombre;
        this.dni = documento;
    }

    public Alumno(String nombreCompleto, String dni, int votosRecibidos, HashSet<Alumno> votosEntregados) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.votosRecibidos = votosRecibidos;
        this.votos = votos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getVotosRecibidos() {
        return votosRecibidos;
    }

    public void setVotosRecibidos(int votosRecibidos) {
        this.votosRecibidos = votosRecibidos;
    }

    public HashSet<Alumno> getVotosEntregados() {
        return votosEntregados;
    }

    public void setVotosEntregados(HashSet<Alumno> votosEntregados) {
        this.votosEntregados = votosEntregados;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto + '\'' + ", dni: " + dni + '\''
//                + ", votosRecibidos=" + votosRecibidos +
//                ", votosEntregados=" + votosEntregados +
                + '}';
    }
}

