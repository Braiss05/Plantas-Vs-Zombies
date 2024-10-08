package proyectobrais;

public class ProyectoBrais {

    public static void main(String[] args) {
       
        // Prueba del constructor por defecto
        Zombie z1 = new Zombie(); 
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
    }
}
