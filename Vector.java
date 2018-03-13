package phyan.maths;

public class Vector {
  // AH: de momento no me preocupo aún por la visibilidad.
  double x;
  double y;
  // AH: no quiero un constructor por defecto.
  private Vector() {
  }
  // AH: para construir un vector espero coordenadas cartesianas.
  public Vector(double x,
                double y) {
    this.x = x;
    this.y = y;
  }
  // TODO: necesito operaciones de suma
  // multiplicación, rotación, etc.

  // AH: operación de suma de vectores, devuelve un nuevo vector
  public Vector add(Vector v) {
    // TODO: a completar, de momento sólo para compilar
    return null;
  }
}
