

import phyan.maths.*;

public class Ball {
  // Otros "atributos":
  // color
  // "bote" (capacidad de rebote)
  // material
    double masa = 0.1;// 0-1
    double rozamiento = 0.01;//0-1
    double r;
    String name;
    Vector position;
    Vector speed;
    public double getSpeed(){
        return speed.magnitude();
    }
    public String getPosition(){
        return "x: "+this.position.getX()+", y: "+this.position.getY();
    }
    private Ball(){

    }
    public Ball(String name, double r, Vector position, Vector speed){
        this.position = position;
        this.speed = speed;
        this.r = r;
    }
    public void step (int time_ms){
        this.position = this.position.add(this.speed.mult(time_ms/1000.0));
        this.speed.sub(new Vector (0.1,0.1));
        this.speed.setX(this.speed.getX()<0?0:this.speed.getX());

    }
    public String getData(){
        return "name: "+this.name+"\nradious: "+this.r;
    }

}
