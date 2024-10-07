/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectobrais;

/**
 *
 * @author 34648
 */
public class ProyectoBrais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Prueba del constructor por defecto
        Zombie z1 = new Zombie();  // Ahora este constructor funcionará
        z1.mostrarInfo();

        // Prueba del constructor paramétrico
        Zombie z2 = new Zombie("Zombie Yeti", 80, 15, 10);
        z2.mostrarInfo();

        // Prueba del constructor copia
        Zombie z3 = new Zombie(z2);
        z3.mostrarInfo();

        // Modificar atributos usando setters
        z1.setNombre("Zombie colgao");
        z1.setVida(50);
        z1.setDamage(5);
        z1.setVelocidad(2);
        z1.mostrarInfo();

        // Obtener el número total de zombies creados
        System.out.println("Numero total de zombies: " + Zombie.getNumeroTotalZombies());
    }
    
}
