package phyan.maths;

public class Vector {
    // AH: de momento no me preocupo aún por la visibilidad.
    double x;
    double y;
    // AH: no quiero un constructor por defecto.
    private Vector() {
    }
    // AH: para construir un vector espero coordenadas cartesianas.
    public Vector(double x, double y) {
	this.x = x;
	this.y = y;
    }   
    // AH: operación de suma de vectores, devuelve un nuevo vector
    public Vector add(Vector v1) {
	return new Vector(this.x+ v1.x, this.y + v1.x);
    }
    // Multipliación de un número por el vector
    public Vector multnum (int n) {
	return new Vector(this.x * n, this.y * n);
    }
    // División del vector por un número
    public Vector divnum (int n) {
	return new Vector(this.x / n, this.y / n);
    }
    // Producto escalar de dos vectores
    public double escalar (Vector v1) {
	return ((this.x * v1.x) + (this.y * v1.y));
    }
    // Producto vectorial
    public Vector vectorial (Vector v1) {
	return new Vector(0, ((this.x * v1.y) - (v1.x * this.y)));
    }
    // Módulo de un vector
    public double modulo () {
	return (Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)));
    }
    // Normalización de un vector
    public Vector normalizar () {
	double aux = modulo();  // Revisar esto :/
	return new Vector (this.x / aux, this.y / aux);
    }
    public String toString() {
	return "(" + this.x + ", " + this.y + ")";
    }
}
