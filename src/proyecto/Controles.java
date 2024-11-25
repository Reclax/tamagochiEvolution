/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author El Jonas
 */
public class Controles {

    Guardados g = new Guardados();

    public void actualizarEstadisticasMascota(Jugador usuario) {
        try {
            String fechaActual = g.fecha();
            String ultimaConexion = usuario.getUltima_Conexion();

            int horasDiferencia = calcularDiferenciaHoras(fechaActual, ultimaConexion);
            int diasDiferencia = calcularDiferenciaDias(fechaActual, ultimaConexion);
            int mesesDiferencia = calcularDiferenciaMeses(fechaActual, ultimaConexion);

            actualizarFelicidadMascota(usuario.getMascota(), horasDiferencia, diasDiferencia);
            actualizarPesoMascota(usuario.getMascota(), mesesDiferencia);

        } catch (Exception e) {
            // Manejar errores
           JOptionPane.showMessageDialog(null,"Error al actualizar estadísticas de la mascota: ");
        }
    }

    private int calcularDiferenciaHoras(String fechaActual, String ultimaConexion) {
        int horaActual = Integer.parseInt(fechaActual.substring(11, 13));
        int horaUltimaConexion = Integer.parseInt(ultimaConexion.substring(11, 13));
        return horaActual - horaUltimaConexion;
    }

    private int calcularDiferenciaDias(String fechaActual, String ultimaConexion) {
        int diaActual = Integer.parseInt(fechaActual.substring(0, 2));
        int diaUltimaConexion = Integer.parseInt(ultimaConexion.substring(0, 2));
        return diaActual - diaUltimaConexion;
    }

    private int calcularDiferenciaMeses(String fechaActual, String ultimaConexion) {
        int mesActual = Integer.parseInt(fechaActual.substring(3, 5));
        int mesUltimaConexion = Integer.parseInt(ultimaConexion.substring(3, 5));
        return mesActual - mesUltimaConexion;
    }

    private void actualizarFelicidadMascota(Tamagochi mascota, int horasDiferencia, int diasDiferencia) {
        if (horasDiferencia > 0) {
            mascota.setFelicidad(mascota.getFelicidad() - horasDiferencia);
            JOptionPane.showMessageDialog(null, mascota.getNombre() + " está triste porque no ha comido mucho.");
        }

        if (diasDiferencia > 0) {
            mascota.setFelicidad(mascota.getFelicidad() - (diasDiferencia * 2));
        }
        
        if (mascota.getNecesidadBano() >= 5) {
            mascota.irAlBano();
            JOptionPane.showMessageDialog(null, mascota.getNombre() + " tiene que ir al baño.");
        }
    }

    private void actualizarPesoMascota(Tamagochi mascota, int mesesDiferencia) {
        if (mesesDiferencia > 0) {
            if (mesesDiferencia >= 9) {
                mascota.setVida(0);
                JOptionPane.showMessageDialog(null, "Tu mascota ha muerto.");
            } else {
                mascota.setPeso(mascota.getPeso() - (mesesDiferencia * 1.8));
            }
        }
    }

}
