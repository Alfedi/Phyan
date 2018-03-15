package phyan;

import phyan.world.Ball;
import phyan.maths.*;
import java.lang.System;
public class HelloPhyan {
    int width = 40,height = 20;
    public static void main(String argv[]) {
        long millis,l_millis = System.currentTimeMillis();
        Ball b = new Ball("bola1",3,new Vector(10,10),new Vector(2,2));
        System.out.println(b.getData());
        while(b.getSpeed() > 0){
            millis = System.currentTimeMillis();
            b.step((int)(millis-l_millis));
            l_millis = System.currentTimeMillis();
            System.out.println(b.getPosition());
        }
    }
}
