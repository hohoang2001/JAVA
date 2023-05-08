package inheritance;

public class MoveablePoint extends Point{
    private float xspeed;
    private float yspeed;

    public MoveablePoint(){

    }
    public MoveablePoint(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }
    public void setSpeed(float Xspeed, float Yspeed){
        this.xspeed = Xspeed;
        this.yspeed = Yspeed;
    }
    public float[] getSpeed(){
        return new float[] {getXspeed(), getYspeed()};
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xspeed=" + xspeed +
                ", yspeed=" + yspeed +
                '}';
    }
    public void move(){
       setX(getX()+ xspeed);
       setY(getY()+ yspeed);
    }

    public static void main(String[] args) {
        MoveablePoint move = new MoveablePoint(5.0f,6.0f,9.0f,10.0f);
        System.out.println(move.toString());

    }



}
