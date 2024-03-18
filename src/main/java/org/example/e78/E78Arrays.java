package org.example.e78;

public class E78Arrays {
    public static void main(int[][] args) {
        //write the code from here
        int[][] inputArray={
                {-1, -2, -3},
                {-1, -2, 0}
        };
        int sum=0;
        for (int i=0;i<2;i++){
            for (int j=0; j<3; j++){
                sum+=inputArray[i][j];
            }

        }
        System.out.println(sum);
    }
}
