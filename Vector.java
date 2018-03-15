package phyan.maths;
import java.lang.Math.*;

/**
*Class Vector represents 2D Vector
*/
public class Vector{
    double x;
    double y;

    private Vector(){

    }

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }
    /**
     *X getter
     *@return returns x component
     */
    public double getX(){
        return this.x;
    }
    /**
     *Y getter.
     *@return returns y component
     */
    public double getY(){
        return this.y;
    }
    /**
     *X setter.
     *@param x new x position(double)
     */
    public void setX(double x){
        this.x = x;
    }
    /**
     *Y setter.
     *@param y new y position(double)
     */
    public void setY(double y){
        this.y = y;
    }
    /**
     *Add another Vector.
     *@param v Vector added
     *@return returns a new Vector.
     */
    public Vector add (Vector v){
        return new Vector(this.x + v.x, this.y + v.y);
    }
    /**
     *substracts another Vector
     *@param v Vector that is substracted
     *@return returns a new Vector
     */
    public Vector sub(Vector v){
        return new Vector(this.x - v.x, this.y - v.y);
    }
    /**
     *Multiply by another Vector
     *@param v multiplying Vector
     *@return returns a new Vector
     */
    public Vector mult(Vector v){
        return new Vector(this.x * v.x, this.y * v.y);
    }
    /**
     *Multiply by number
     *@param n Vector multiplied by this int
     *@return returns a new Vector
     */
    public Vector mult(int n){
        return new Vector(this.x * n, this.y * n);
    }
    /**
     *Multiply by number
     *@param v Vector multiplied by this double
     *@return returns a new Vector
     */
    public Vector mult(double v){
        return new Vector(this.x * v, this.y * v);
    }
    /**
     *Normalize Vector v
     *@return returns a new Vector
     */
    public Vector normalize(){
        return new Vector(this.x / Math.sqrt(this.x * this.x + this.y * this.y),
                          this.y / Math.sqrt(this.x * this.x + this.y * this.y));
    }
    /**
     *Makes the dot product
     *@param v Makes the dot product with the given vector
     *@return returns a double
     */
    public double dotProduct(Vector v){
        return  this.x*v.x+this.y*v.y;
    }
    /**
     *calculates magnitude
     *@return returns a double
     */
    public double magnitude(){
        return  this.x*this.x+this.y*this.y;
    }

}
