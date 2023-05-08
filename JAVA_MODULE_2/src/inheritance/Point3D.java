package inheritance;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public void Point3D() {
    };

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    };

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        setX(x);
        setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),getZ()};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                " x= " + getX() +
                " y= " + getY() +
                " z= " + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D staPoint3D = new Point3D(3.9f,5.9f,7.8f);
        System.out.println(staPoint3D);
        staPoint3D.setXYZ(10,9,11);
        System.out.println(staPoint3D);
    }
}

