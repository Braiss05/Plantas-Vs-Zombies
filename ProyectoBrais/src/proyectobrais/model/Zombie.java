package proyectobrais.model;

public class Zombie {
    private String nombre;
    private int vida;
    private int damage;
    private int velocidad;
    private String tipo;
    private static int numeroTotalZombies = 0;

    // Constructor por defecto
    public Zombie() {
        this.nombre = "Zombie Común";
        this.vida = 100;
        this.damage = 10;
        this.velocidad = 1;
        this.tipo = "Común";
        numeroTotalZombies++;
    }

    // Constructor paramétrico
    public Zombie(String nombre, int vida, int damage, int velocidad, String tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.damage = damage;
        this.velocidad = velocidad;
        this.tipo = tipo;
        numeroTotalZombies++;
    }

    // Constructor copia
    public Zombie(Zombie otro) {
        this.nombre = otro.nombre;
        this.vida = otro.vida;
        this.damage = otro.damage;
        this.velocidad = otro.velocidad;
        this.tipo = otro.tipo;
        numeroTotalZombies++;
    }

    // Métodos getters y setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getDamage() {
        return damage;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public static int getNumeroTotalZombies() {
        return numeroTotalZombies;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Vida: " + vida + ", Daño: " + damage + ", Velocidad: " + velocidad + ", Tipo: " + tipo);
    }

    // Método para reducir la vida del zombie
    public void reducirVida(int damage) {
        this.vida -= damage;
        if (this.vida < 0) {
            this.vida = 0;  // Asegurarse de que la vida no sea negativa
        }
    }
}
