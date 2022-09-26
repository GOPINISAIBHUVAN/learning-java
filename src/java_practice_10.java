class circle10{
    public int radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder10 extends circle10{
    cylinder10(){

    }
    int height ;
    public double area(){
      return  Math.PI*this.radius*this.radius*this.height;
    }
}


public class java_practice_10 {
    public static void main(String[] args) {
cylinder10 cj = new cylinder10();
        System.out.println(cj.area());
    }
}
