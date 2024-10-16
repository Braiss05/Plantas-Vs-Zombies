package proyectobrais.model;

public class Guerra {

    // Método para iniciar la guerra entre zombies y plantas
    public void iniciarGuerra(Tablero tablero) {
        for (int i = 0; i < tablero.getFilas(); i++) {  // Iterar sobre cada fila del tablero
            for (int j = 0; j < tablero.getColumnas(); j++) {  // Iterar sobre cada columna
                Object entidad = tablero.getEntidad(i, j);  // Obtener lo que hay en cada celda del tablero

                // Si la entidad es una planta, verificamos si puede atacar
                if (entidad instanceof Planta) {
                    Planta planta = (Planta) entidad;

                    // Verificar si la planta puede atacar (ej. Lanzaguisantes)
                    if (planta.getDamage() > 0) {
                        // Revisar si hay un zombie en la misma fila
                        for (int k = j + 1; k < tablero.getColumnas(); k++) {
                            Object entidadEnemiga = tablero.getEntidad(i, k);
                            if (entidadEnemiga instanceof Zombie) {
                                Zombie zombie = (Zombie) entidadEnemiga;

                                // Planta ataca al zombie
                                zombie.reducirVida(planta.getDamage());
                                System.out.println(planta.getNombre() + " ha atacado a " + zombie.getNombre() + " y le ha hecho " + planta.getDamage() + " de daño.");

                                // Si el zombie muere, lo eliminamos del tablero
                                if (zombie.getVida() <= 0) {
                                    System.out.println(zombie.getNombre() + " ha sido derrotado.");
                                    tablero.eliminarEntidad(i, k);  // Eliminar el zombie del tablero
                                }
                                break;  // Salir del bucle una vez que el ataque se ha realizado.
                            }
                        }
                    }
                }
            }
        }
    }
}