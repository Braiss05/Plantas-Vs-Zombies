package proyectobrais.model;

public class Zombie {
    private String nombre;
    private int vida;
    private int damage;
    private int velocidad;
    private String tipo;
    private static int numeroTotalZombies = 0;

    // Constructor paramétrico
    public Zombie(String nombre, int vida, int damage, int velocidad, String tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.damage = damage;
        this.velocidad = velocidad;
        this.tipo = tipo;
        numeroTotalZombies++;
    }

    // Constructor por defecto
    public Zombie() {
        this("Zombie común", 100, 10, 1, "Común");
    }

    // Constructor copia
    public Zombie(Zombie otroZombie) {
        this(otroZombie.nombre, otroZombie.vida, otroZombie.damage, otroZombie.velocidad, otroZombie.tipo);
    }

    // Getters y setters
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

    // Método para reducir la vida del zombie
    public void reducirVida(int cantidad) {
        this.vida -= cantidad;
        System.out.println(nombre + " ha recibido " + cantidad + " de daño. Vida restante: " + vida);
    }

    public void mostrarInfo() {
        System.out.println("Zombie: " + nombre + ", Vida: " + vida + ", Daño: " + damage + ", Velocidad: " + velocidad + ", Tipo: " + tipo);
    }

    public static int getNumeroTotalZombies() {
        return numeroTotalZombies;
    }
}
