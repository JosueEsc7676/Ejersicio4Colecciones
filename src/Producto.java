public class Producto {
    private int id;
    private String codigo;
    private String nombre;
    private String marca;
    private double precio;

    // Constructor
    public Producto(int id, String nombre, String marca, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.codigo = generarCodigo(nombre, marca);
    }

    // Método para generar el código
    private String generarCodigo(String nombre, String marca) {
        String parteNombre = nombre.length() >= 3 ? nombre.substring(0, 3).toUpperCase() : nombre.toUpperCase();
        String parteMarca = marca.length() >= 2 ? marca.substring(0, 2).toUpperCase() : marca.toUpperCase();
        int numero = (int)(Math.random() * 900) + 100; // número de 3 dígitos (100-999)
        return parteNombre + parteMarca + numero;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCodigo() { return codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    // Mostrar datos
    @Override
    public String toString() {
        return "ID: " + id +
                ", Código: " + codigo +
                ", Nombre: " + nombre +
                ", Marca: " + marca +
                ", Precio: $" + precio;
    }
}

