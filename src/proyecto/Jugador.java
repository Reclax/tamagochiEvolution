/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.io.Serializable;

/**
 *
 * @author El Jonas
 */
public class Jugador implements Serializable {

    private int edad;
    private String nombre;
    private Tamagochi mascota;
    private String ultima_Conexion;
 
    private String clave;

    public Jugador(String nombre, int edad, Tamagochi mascota, String clave) {
        this.edad = edad;
        this.nombre = nombre;
        this.mascota = mascota;
        this.clave = clave;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Tamagochi getMascota() {
        return this.mascota;
    }

    public String getUltima_Conexion() {
        return ultima_Conexion;
    }

    public void setUltima_Conexion(String ultima_Conexion) {
        this.ultima_Conexion = ultima_Conexion;
    }

    public void setMascota(Tamagochi mascota) {
        this.mascota = mascota;
    }

}
