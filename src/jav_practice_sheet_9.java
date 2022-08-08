class cylinder {
    private int radius;
    private int height;


    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public cylinder(int h, int r) {
        height = h;
        radius = r;
    }
}
    class rectangle23{
       private  int length;
       private  int breadth;
       public rectangle23(int l,int b){
           length = l;
           breadth = b;
       }

    }
class sphere  {
    private int radius;
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
//    public sphere(int r) {
//        radius = r;
//    }
     public double surfacearea () {
        return 4*Math.PI*radius*radius;
    }
    public double volume (){
        return (4/3)*Math.PI*radius*radius*radius;
    }

}
public class jav_practice_sheet_9 {
    public static void main(String[] args) {
    cylinder sa = new cylinder(5,6);
    rectangle23 ra = new rectangle23(4,6);
    sphere s = new sphere();
       sa.setRadius(6);
       sa.setHeight(7);
       s.setRadius(6);
       // we can use 3.14 or pi value as math.PI to get more accurate values....
        System.out.println(2*3.14* sa.getRadius()* sa.getHeight()+2*3.14* sa.getRadius()* sa.getRadius());
        System.out.println(3.14* sa.getRadius()* sa.getRadius()* sa.getHeight());
        System.out.println(s.surfacearea());
        System.out.println(s.volume());
    }
}
