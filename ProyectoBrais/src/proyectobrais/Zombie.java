package proyectobrais;

public class Zombie {
    
    private String nombre;
    private int vida;
    private int damage;
    private int velocidad;
    private String tipo;  // Nuevo atributo tipo de zombie
    
    private static int numeroTotalZombies = 0;
    
    // Constructor paramétrico
    public Zombie(String nombre, int vida, int damage, int velocidad, String tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.damage = damage;
        this.velocidad = velocidad;
        this.tipo = tipo;
        numeroTotalZombies++;  // Incrementamos el contador al crear un nuevo zombie
    }

    // Constructor por defecto 
    public Zombie() {
        this("Zombie por defecto", 100, 10, 5, "Comun");  // Valores por defecto y tipo "Común"
    }
    
    // Constructor copia 
    public Zombie(Zombie otroZombie) {
        this(otroZombie.nombre, otroZombie.vida, otroZombie.damage, otroZombie.velocidad, otroZombie.tipo);
    }
    
    // Getters y Setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método para obtener el número total de zombies creados
    public static int getNumeroTotalZombies() {
        return numeroTotalZombies;
    }
    
    // Método para mostrar la información del zombie
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Vida: " + vida + ", Damage: " + damage + 
                           ", Velocidad: " + velocidad + ", Tipo: " + tipo);
    }
}
