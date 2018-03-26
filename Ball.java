package phyan.world;

import phyan.maths.Vector;

public class Ball {
    // We use a Vector to represent the position in space (meters)
    Vector position;
    // We use a Vector to represent the speed: the length represents m/s.
    Vector speed;
    
    // Otros "atributos":
    // radio
    // color
    // "bote" (capacidad de rebote)
    // material
    // masa
    // rozamiento
    // nombre
    // aceleración (no está claro que esto sea una propiedad de la bola)

    void step(int milliseconds) {
	// AH: la nueva posición depende de la velocidad y el tiempo en el
	// que se aplica esa velocidad
	// TODO: hace falta sacar el espacio desde la velocidad
	this.position = this.position.add(speed);
  }
}
