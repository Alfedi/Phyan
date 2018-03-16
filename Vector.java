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
    public Vector add(Vector v1, Vector v2) {
	return  new Vector(v1.x + v2.x, v1.y + v2.y);
    }
    // Multipliación de un número por el vector
    public Vector multnum (Vector v1, int n) {
	return new Vector(v1.x * n, v1.y * n);
    }
    // Porducto escalar de dos vectores
    public double escalar (Vector v1, Vector v2) {
	return ((v1.x * v2.x) + (v1.y * v2.y));
    }
    // Producto vectorial
    public Vector vectorial (Vector v1, Vector v2) {
	return new Vector(0, ((v1.x * v2.y) - (v2.x * v1.y)));
    }
    // Módulo de un vector
    public double modulo (Vector v1) {
	return (Math.sqrt(Math.pow(v1.x, 2) + Math.pow(v1.y, 2)));
    }
    // Normalización de un vector
    public Vector normalizar (Vector v1) {
	double aux = modulo(v1);
	return new Vector (v1.x / aux, v1.y / aux);
    }
}
