class name{
    int method (int a ,int b){
        int d = 8;
        System.out.println(d);
        return a+b;
    }
    int factorial (int b){
        if(b == 1) {
           return 1;
        }
        return b * factorial(b-1);
    }
}
public class java_cat1 {
    public static void main(String[] args) {
        int d = 6;
        name cs = new name();
        System.out.println(cs.method(5,7));
        System.out.println(d);
         System.out.println(cs.factorial(5));
        }
    }


//for (int k = 0; k < arr1.length; k++) {
//        arr3[k] = (arr1[k]-arr2[k]);
//        System.out.print(arr3[k]);
//        }


//for(int i =0;i<5;i++){
//        arr3[i] = arr1[i];
//        System.out.println(arr3[i]);
//        }




//    int[] arr1 = {1, 2, 3, 4, 5};
//    int[] arr2 = {2, 3, 4, 5, 6};
//    int[] arr3 = new int[5];
//        for (int i = 0; i < 5; i++) {
//        arr3[i] = arr1[i];
//        arr3[5] = 0;
//        arr3[i+6] = arr2[i];
//        }
//        for(int i = 0;i<11;i+=2){
//        System.out.print(arr3[i] + " ");
//        }





