package proyectobrais.model;

public class Planta {

    private String nombre;
    private int vida;
    private int damage;
    private String tipo;
    private EstadoPlanta estado;  // Atributo para el estado de la planta
    
    private static int numeroTotalPlantas = 0;

    // Constructor paramétrico
    public Planta(String nombre, int vida, int damage, String tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.damage = damage;
        this.tipo = tipo;
        this.estado = EstadoPlanta.VIVA;  // Por defecto, la planta está viva
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
        // Cambiar el estado según la vida
        if (this.vida <= 0) {
            this.vida = 0;  // Asegurarse de que la vida no sea negativa
            this.estado = EstadoPlanta.MUERTA;
        }
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

    public EstadoPlanta getEstado() {
        return estado;
    }

    public static int getNumeroTotalPlantas() {
        return numeroTotalPlantas;
    }

    // Método para mostrar la información de la planta
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Vida: " + vida + ", Damage: " + damage + ", Tipo: " + tipo + ", Estado: " + estado);
    }
}
