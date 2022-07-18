class square1{
    private float radius;
    private float area;
    private float perimeter;
    public void setArea(float n ){
        area = n;
    }
    public void setRadius(int n ){
        radius = n;
    }
    public void setPerimeter(int n ){
        perimeter = n;
    }

    public float getArea() {

        return radius*radius*3.14f;
    }

    public float getPerimeter() {
        return 4*3.14f*radius;
    }

    public float getRadius() {
        return radius;
    }
}
public class access_modifers {
    public static void main(String[] args) {
square1 table = new square1();
table.setRadius(5);
        System.out.println(table.getArea());
        System.out.println(table.getPerimeter());
    }
}
