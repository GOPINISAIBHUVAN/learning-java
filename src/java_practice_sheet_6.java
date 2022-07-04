public class java_practice_sheet_6 {
    public static void main(String[] args) {
        // problem 1
//        float[] num = {45.5f,55.5f,33.5f,43.5f,32.5f};
//        float sum = 0;
//        for(int i = 0;i<num.length;i++){
//            sum = sum+num[i];
//        }
//        System.out.println(sum);

        //problem 2
//        float[] num = {45.5f,55.5f,33.5f,43.5f,32.5f};
//        float num1 = 43.5f;
//        boolean isinarray = false;
//        for(int i = 0;i<num.length;i++){
//           if( num1  == num[i] ){
//               isinarray = true;
//               break;
//           }
//        }
//        if(isinarray){
//            System.out.println("the value is present in the array");
//        }
//        else {
//            System.out.println("the value is not present in the array");
//        }

        //problem 3
//        float[] num = {45.5f, 55.5f, 33.5f, 43.5f, 32.5f};
//        float sum = 0;
//        for (float element : num) {
//            sum = sum + element;
//        }
//        System.out.println(sum);
//        float avg = (float) (sum / num.length);
//        System.out.println(avg);
//
//        //problem 4
//        int[][] mat1 = new int[2][3];
//        int[][] mat2 = new int[2][3];
//        mat1[0][0] = 23;
//        mat1[0][1] = 23;
//        mat1[0][2] = 23;
//        mat1[1][0] = 23;
//        mat1[1][1] = 23;
//        mat1[1][2] = 23;
//        mat2[0][0] = 23;
//        mat2[0][1] = 23;
//        mat2[0][2] = 23;
//        mat2[1][0] = 23;
//        mat2[1][1] = 23;
//        mat2[1][2] = 23;
//        int [][]mat3 = new int[2][3] ;
//        for(int i = 0;i<2;i++){
//            for(int j=0;j<3;j++){
//                mat3[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        for(int l=0;l<2;l++){
//            for(int k=0;k<3;k++) {
//                System.out.println(mat3[l][k]);
//            }
//        }

        // problem 5
        float[] num = {45.5f, 55.5f, 33.5f, 43.5f, 32.5f};
//        for(int i =num.length-1;i>=0;i--){
//            System.out.println(num[i]);
//        }
//        int l = num.length;
//        int n = Math.floorDiv(l,2);
//        float temp;
//        for(int i =0;i<n;i++){
//            temp = num[i] ;
//            num[i]=num[l-i-1];
//            num[l-i-1]= temp;
//        }
//        for(float element : num){
//            System.out.print(element);
//            System.out.print(" ");
//        }
        //problem 6
//        int [] arr = {3,6,7,8,1,2,12};
//        int max = 0;
//        for(int e : arr){
//            if(e>max){
//                max =e;
//            }
//        }
//        System.out.println("the value of maximum element is "+max);
//
//        //problem 7
//        int [] arr2 = {3,5,6,7,8,14,23};
//        int min = Integer.MAX_VALUE;
//        for(int f : arr2){
//            if(f<min){
//                min = f;
//            }
//        }
//        System.out.println("the value of minimum element is "+min);

        //problem 8
        int [] a = {4,5,6,7};
        boolean isSorted = true;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println(" the array is sorted");
        }
        else{
            System.out.println("the array is not sorted");
        }
    }
}
