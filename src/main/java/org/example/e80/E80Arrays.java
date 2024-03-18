package org.example.e80;

public class E80Arrays {
   public static void main(int[] args) {
        // please write code from here
 // public static void main(String[] args) {
        int[] array={1,-5,2,-3,80,54,-8,-33,-51,0};
int count=0;
        for (int i=0;i< array.length;i++){
            if(array[i]%2!=0 && array[i]<0){
                count++;
            }
        }
      System.out.print(count);
  }

}
