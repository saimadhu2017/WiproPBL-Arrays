import java.util.Scanner;

public class Wipro31{

    public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number of elements in array:");
	   int n=sc.nextInt();
	   int[] arr=new int[n];
	   System.out.println("Enter the elements in array:");
	   int c=0;
	   for(int i=0;i<n;i++) {
		   arr[i] = sc.nextInt();
		   if(arr[i]==1 || arr[i]==4){
		   	c=c+1;
		   }
	   }
	   if(c==n){System.out.println(true);}
	   else{System.out.println(false);}
    }
}
