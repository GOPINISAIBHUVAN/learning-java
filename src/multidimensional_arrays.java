public class multidimensional_arrays {
    public static void main(String[] args) {
        int[][] flats = new int[3][3];
        flats[0][0]=001;
        flats[0][1]=002;
        flats[0][2]=003;
        flats[1][0]=101;
        flats[1][1]=102;
        flats[1][2]=103;
        flats[2][0]=201;
        flats[2][1]=202;
        flats[2][2]=203;
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.println(flats[i][j]);
            }
        }



    }
}
