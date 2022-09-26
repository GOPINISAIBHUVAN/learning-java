class hari1{
    int gopi(){
        System.out.println(1+2);
        int a = 1 ;
        return a;
    }

}
class gopii extends hari1{
    int krishna(){
        //System.out.println(2+3);
        return 2+3;
    }
}
public class inheritance_hari{
    public static void main(String args[]){
        hari1 hr = new hari1();
        gopii gr = new gopii();
        //hr.gopi();
        System.out.println(hr.gopi());
        //gr.krishna();

    }
}