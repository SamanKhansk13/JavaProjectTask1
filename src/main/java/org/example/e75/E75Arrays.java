package org.example.e75;

public class E75Arrays {
    public static void main(double[][] args) {
      //WRITE THE CODE FROM HERE PLEASE
    double [][] inputArray={
            {1.4,2.0,3.3,2.0},
            {4.0,1.5,6.1,1.0},
            {1.2,3.1,4.0,1.6}
    };

        for (int i=0;i<3;i++){
            for (int j=0; j<4; j++){
                System.out.print(inputArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}

