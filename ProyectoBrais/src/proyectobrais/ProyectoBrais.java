package proyectobrais;

import proyectobrais.model.*;
import java.util.List;

public class ProyectoBrais {

    public static void main(String[] args) {

        // ================== INICIALIZAR RECURSOS =====================
        Recursos recursos = new Recursos(100.0);  // Dinero inicial
        System.out.println("Dinero inicial: " + recursos.getDinero());

        System.out.println("\n================== ZOMBIES =====================\n");

        // ================== ZOMBIES =====================

        // Prueba del constructor por defecto
        Zombie z1 = new Zombie();  // Constructor por defecto con tipo "Común"
        z1.mostrarInfo();

        System.out.println(); // Salto de línea para separación

        // Prueba del constructor paramétrico
        Zombie z2 = new Zombie("Zombie Yeti", 80, 15, 10, "Yeti");
        z2.mostrarInfo();

        System.out.println(); // Salto de línea para separación

        // Prueba del constructor copia
        Zombie z3 = new Zombie(z2);
        z3.mostrarInfo();

        System.out.println(); // Salto de línea para separación

        // Modificar atributos usando setters
        z1.setNombre("Zombie colgao");
        z1.setVida(50);
        z1.setDamage(5);
        z1.setVelocidad(2);
        z1.setTipo("Caminante");  // Modificamos el tipo de zombie
        z1.mostrarInfo();

        System.out.println(); // Salto de línea para separación

        // Obtener el número total de zombies creados
        System.out.println("Numero total de zombies: " + Zombie.getNumeroTotalZombies());

        System.out.println("\n================== GENERACIÓN ALEATORIA DE ZOMBIES =====================\n");

        // Generar una lista aleatoria de zombies
        List<Zombie> zombiesAleatorios = recursos.generarZombiesAleatorios(3);  // Generamos 3 zombies aleatorios
        for (Zombie z : zombiesAleatorios) {
            z.mostrarInfo();
            System.out.println();  // Separar cada zombie
        }

        System.out.println("\n================== PLANTAS =====================\n");

        // ================== PLANTAS =====================

        // Prueba del constructor por defecto
        Planta p1 = new Planta();  // Constructor por defecto con tipo "Lanzaguisantes"
        p1.mostrarInfo();

        System.out.println(); // Salto de línea para separación

        // Prueba del constructor paramétrico
        Planta p2 = new Planta("Girasol", 50, 0, "Girasol");
        p2.mostrarInfo();

        System.out.println(); // Salto de línea para separación

        // Prueba del constructor copia
        Planta p3 = new Planta(p2);
        p3.mostrarInfo();

        System.out.println(); // Salto de línea para separación

        // Modificar atributos usando setters
        p1.setNombre("Planta de Hielo");
        p1.setVida(80);
        p1.setDamage(20);
        p1.setTipo("Lanzaguisantes de Hielo");
        p1.mostrarInfo();

        System.out.println(); // Salto de línea para separación

        // Obtener el número total de plantas creadas
        System.out.println("Numero total de plantas: " + Planta.getNumeroTotalPlantas());

        System.out.println("\n================== GENERACIÓN ALEATORIA DE PLANTAS =====================\n");

        // Generar una lista aleatoria de plantas con costos
        List<Planta> plantasAleatorias = recursos.generarPlantasAleatorias(3);  // Generamos 3 plantas aleatorias
        for (Planta planta : plantasAleatorias) {
            planta.mostrarInfo();
            double costo = recursos.calcularCostoPlanta(planta);
            System.out.println("Costo de la planta: " + costo + " monedas");
            System.out.println();  // Separar cada planta

            // Intentamos comprar la planta
            if (recursos.gastarDinero(costo)) {
                System.out.println("Se compró la planta " + planta.getNombre() + ". Dinero restante: " + recursos.getDinero());
            } else {
                System.out.println("No se pudo comprar la planta " + planta.getNombre());
            }

            System.out.println();  // Separación de compra
        }

        System.out.println("\n================== RECURSOS =====================\n");

        // Añadir dinero por matar un zombie
        recursos.addDinero(30);
        System.out.println("Dinero después de matar un zombie: " + recursos.getDinero());

        System.out.println("\n================== TABLERO =====================\n");

        // ================== INICIALIZAR TABLERO =====================
        Tablero tablero = new Tablero(5, 5);  // Crear un tablero de 5x5
        tablero.mostrarTablero();  // Mostrar el estado inicial del tablero

        // Colocar algunas plantas y zombies en el tablero
        tablero.colocarPlanta(p1, 2, 2);
        tablero.colocarPlanta(p2, 3, 3);
        tablero.colocarZombie(z1, 2, 4);
        tablero.colocarZombie(z2, 3, 4);

        tablero.mostrarTablero();  // Mostrar el estado del tablero con plantas y zombies

        System.out.println("\n================== MOVIMIENTO ZOMBIES =====================\n");

        // Simular el movimiento de los zombies en el tablero
        tablero.moverZombies();
        tablero.mostrarTablero();  // Mostrar el tablero tras el movimiento de los zombies

        // Comprobación de entidades y eliminación
        System.out.println("\n================== INTERACCIONES =====================\n");

        // Ver si hay una entidad en una posición específica
        Object entidad = tablero.getEntidad(2, 2);  // Planta en (2, 2)
        if (entidad instanceof Planta) {
            Planta plantaAtacada = (Planta) entidad;
            System.out.println("Planta en (2, 2): " + plantaAtacada.getNombre());
        }

        // Eliminar la planta en (2, 2) como ejemplo
        tablero.eliminarEntidad(2, 2);
        tablero.mostrarTablero();  // Mostrar el tablero tras la eliminación
    }
}
