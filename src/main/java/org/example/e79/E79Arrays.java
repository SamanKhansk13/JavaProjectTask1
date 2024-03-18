package org.example.e79;

public class E79Arrays {
  //  public static void main(int[][] args) {
        public static void main(int[][] args) {
        //please write the code from here
        int[][] array={
                {1,1,2},
                {3,1,2},
                {3,5,3},
                {0,1,2}
        };

int[] arrayNew=new int[4];
//      FIRST METHOD
//outer loop >> rows
//        for (int i=0;i<4;i++){
//            int sum=0;
//            // inner loop >> column elements
//            for (int j=0; j<3; j++){
//               sum=sum+ array[i][j];
//            }
//            arrayNew[i]=sum;
//        }
// SECOND METHOD
            int sum=0;
            for (int i=0;i< array.length;i++){  // rows
                for (int j=0;j<array[i].length;j++){   // array[i].length >> number of columns, complete row elements
                    sum=sum+array[i][j];
                }
                arrayNew[i]=sum;
                sum=0;
            }
       for (int n:arrayNew){
           System.out.println(n);
       }


                  }
    }

