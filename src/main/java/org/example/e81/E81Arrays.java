package org.example.e81;

public class E81Arrays {
    public static void main(int[][] args) {
        //write the code from here
int[][] inputArray={{-5, -2, -3, 7}, {1, -5, -2, 2}, {1, -2, 3, -4}};

int sum=0;
for (int i=0;i<inputArray.length; i=i+2){

    for (int j=0; j<inputArray[i].length; j=j+2){
        sum=sum+inputArray[i][j];
    }

}
        System.out.println(sum);

    }
}
