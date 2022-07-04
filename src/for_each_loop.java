public class for_each_loop {
    public static void main(String[] args) {
        int[] mark ={67,98,78,56,100};
        System.out.println(mark.length);
        for (int i =(mark.length-1);i>=0;i--){
            System.out.println(mark[i]);
        }
        // for each loop
        for(int element : mark){
            System.out.println(element);
        }


    }
}
