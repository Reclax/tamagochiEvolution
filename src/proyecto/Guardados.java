/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import Interfaces.Login;
import Interfaces.Registrarse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author El Jonas
 */
public class Guardados {

    private ArrayList<Jugador> jugadores;

    /*Metodo Guardar Partida*/
    public void guardarPartida() {
        try {
            FileOutputStream fileOut = new FileOutputStream("datos del Jugador.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(this.jugadores);
            objectOut.close();
            fileOut.close();
            JOptionPane.showMessageDialog(null, "Lista de jugadores guardada en datos del Jugador.dat");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la lista de jugadores: " + e.getMessage());
        }
    }

    /*Metodo para crear la partida*/
    public void crearPartida(Registrarse registrarse, Login l) {
        /*revisa si faltan cmpos por llenar*/
        if (registrarse.nombre.getText().matches("") || registrarse.clave.getText().matches("") || registrarse.claveRepetida.getText().matches("") || registrarse.nombreMascota.getText().matches("") || registrarse.edad.getValue().toString().matches("")) {
            JOptionPane.showMessageDialog(null, "por favor rellene todos los cuadros de texto");
        } else {
            // Intenta cargar los datos existentes del archivo
            try ( ObjectInputStream oi = new ObjectInputStream(new FileInputStream("datos del Jugador.dat"))) {
                this.jugadores = (ArrayList<Jugador>) oi.readObject();
            } catch (IOException | ClassNotFoundException e) {
                // El archivo no existe o está vacío, crea una lista vacía
                this.jugadores = new ArrayList<>();
            }
            Jugador nuevoJugador = null;
            /*si ya hay un jugador con el mismo nombre no se le permitira*/
            boolean nombreDuplicado = false; // Variable para rastrear si se encuentra un nombre duplicado

            for (Jugador j : this.jugadores) {
                if (j.getNombre().equals(registrarse.nombre.getText())) {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe intente con otro nombre");
                    nombreDuplicado = true; // Marca que se encontró un duplicado
                    break; // Sal del bucle si se encuentra un duplicado
                }
            }

            if (!nombreDuplicado) {
                if (registrarse.clave.getText().equals(registrarse.claveRepetida.getText())) {
                    // Crea un nuevo jugador

                    nuevoJugador = new Jugador(registrarse.nombre.getText(), Integer.parseInt(registrarse.edad.getValue().toString()), new Tamagochi(registrarse.nombreMascota.getText()), registrarse.clave.getText());
                    nuevoJugador.setUltima_Conexion(fecha());
                    //crea una nueva partida 
                    JOptionPane.showMessageDialog(null, "Se ha creado una nueva partida");
                    // Agrega el nuevo jugador a la lista
                    this.jugadores.add(nuevoJugador);
                    // Guarda la lista actualizada en el archivo
                    guardarPartida();

                    registrarse.dispose();
                    l.setLocationRelativeTo(null);
                    l.setVisible(true);
                } else {
                    //si la contrasenia no coincide se elimina el texto ingresado en las casillas
                    JOptionPane.showMessageDialog(null, "la contraseña no coincide");
                    registrarse.clave.setText("");
                    registrarse.claveRepetida.setText("");
                }

            }
        }
    }

    /* Método Cargar Partida */
    public Jugador cargarPartida(String nombre, String clave) {
        /*aqui carga el objeto de ese jugador*/
 /*aqui iniciamos un objeto de tipo jugador*/
        Jugador jugador = null;
        try {
            FileInputStream fi = new FileInputStream("datos del Jugador.dat");
            ObjectInputStream oi = new ObjectInputStream(fi);

            this.jugadores = (ArrayList<Jugador>) oi.readObject(); // Cargar objetos

            oi.close();
            fi.close();
            for (Jugador j : this.jugadores) {
                if (j.getNombre().equals(nombre) && j.getClave().equals(clave)) {
                    jugador = j;
                    JOptionPane.showMessageDialog(null, "Objeto Cargado");
                    break;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encuentran archivos");
        }
        return jugador; // Devuelve el jugador cargado
    }

    public String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String fechaEnFormato = formato.format(fecha);
        return fechaEnFormato;
    }
}
