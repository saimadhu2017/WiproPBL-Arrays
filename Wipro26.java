import java.util.*;
import java.io.*;
class Wipro26{
 public static void main(String[] args){
    Scanner scn = new Scanner (System.in);
    System.out.print("Enter no. of elements you want in array:");
    int n = scn.nextInt();
    int array[] = new int[n];
                System.out.println("Enter all the elements:");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = scn.nextInt();
		}
  Arrays.sort(array);
  for(int i=0;i<array.length;i++){
   System.out.print(array[i]+" ");
  }
 }
}