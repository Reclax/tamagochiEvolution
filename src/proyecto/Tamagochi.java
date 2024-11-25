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
public class Tamagochi implements Serializable {

    private int vida;
    private Double peso;
    private int felicidad;
    private String nombre;
    private int nivel;
    private int necesidadBano;

    public Tamagochi(String nombre) {
        this.peso = 5.0;
        this.nivel = 1;
        this.vida = 100;
        this.felicidad = 10;
        this.nombre = nombre;
        this.necesidadBano = 0;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNecesidadBano() {
        return necesidadBano;
    }

    public void setNecesidadBano(int necesidadBano) {
        this.necesidadBano = necesidadBano;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer(int cantidad) {
        this.setPeso(this.getPeso() + (cantidad / this.getPeso()));
    }

    public void jugar() {
        if (this.getFelicidad() < 10) {
            this.felicidad += 1;
        }
    }

    public void levelUp() {
        this.nivel += 1;
    }

    public void irAlBano() {
        this.necesidadBano = 0;
        this.setFelicidad(this.getFelicidad() - 5);
    }

    public void agonizacion(boolean activo) {
        while (activo) {
            this.vida -= 1;
            this.necesidadBano += 1;

            try {
                Thread.sleep(10000); // Pausa de 10 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
