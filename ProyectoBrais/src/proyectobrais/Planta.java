package proyectobrais;

public class Planta {
    
    private String nombre;
    private int vida;
    private int damage;
    private String tipo;  
    
    private static int numeroTotalPlantas = 0;  
    
    // Constructor paramétrico
    public Planta(String nombre, int vida, int damage, String tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.damage = damage;
        this.tipo = tipo;
        numeroTotalPlantas++;  
    }

    // Constructor por defecto
    public Planta() {
        this("Planta por defecto", 100, 10, "Lanzaguisantes");  
    }
    
    // Constructor copia
    public Planta(Planta otraPlanta) {
        this(otraPlanta.nombre, otraPlanta.vida, otraPlanta.damage, otraPlanta.tipo);
    }
    
    // Gets y Sets
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    // Método para obtener el número total de plantas creadas
    public static int getNumeroTotalPlantas() {
        return numeroTotalPlantas;
    }
    
    // Método para mostrar la información de la planta
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Vida: " + vida + ", Damage: " + damage + ", Tipo: " + tipo);
    }
}
