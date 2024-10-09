package proyectobrais;

import proyectobrais.model.Zombie;
import proyectobrais.model.Planta;

public class ProyectoBrais {

    public static void main(String[] args) {
       
        // ================== ZOMBIES =====================
        
        // Prueba del constructor por defecto
        Zombie z1 = new Zombie();  // Constructor por defecto con tipo "Común"
        z1.mostrarInfo();

        // Prueba del constructor paramétrico
        Zombie z2 = new Zombie("Zombie Yeti", 80, 15, 10, "Yeti");
        z2.mostrarInfo();

        // Prueba del constructor copia
        Zombie z3 = new Zombie(z2);
        z3.mostrarInfo();

        // Modificar atributos usando setters
        z1.setNombre("Zombie colgao");
        z1.setVida(50);
        z1.setDamage(5);
        z1.setVelocidad(2);
        z1.setTipo("Caminante");  // Modificamos el tipo de zombie
        z1.mostrarInfo();

        // Obtener el número total de zombies creados
        System.out.println("Numero total de zombies: " + Zombie.getNumeroTotalZombies());

        // ================== PLANTAS =====================
        
        // Prueba del constructor por defecto
        Planta p1 = new Planta();  // Constructor por defecto con tipo "Lanzaguisantes"
        p1.mostrarInfo();

        // Prueba del constructor paramétrico
        Planta p2 = new Planta("Girasol", 50, 0, "Girasol");
        p2.mostrarInfo();

        // Prueba del constructor copia
        Planta p3 = new Planta(p2);
        p3.mostrarInfo();

        // Modificar atributos usando setters
        p1.setNombre("Planta de Hielo");
        p1.setVida(80);
        p1.setDamage(20);
        p1.setTipo("Lanzaguisantes de Hielo");
        p1.mostrarInfo();

        // Obtener el número total de plantas creadas
        System.out.println("Numero total de plantas: " + Planta.getNumeroTotalPlantas());
    }
}
