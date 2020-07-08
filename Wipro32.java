import java.util.Scanner;

public class Wipro32{

    public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int[] arr=new int[3];
	    int[] brr=new int[3];
	    int[] mrr=new int[2];
	   System.out.println("Enter the elements in first array:");
	   int c=0;
	   for(int i=0;i<3;i++) {
		   arr[i] = sc.nextInt();
	   }
	   System.out.println("Enter the elements in second array:");
	   for(int i=0;i<3;i++) {
		    brr[i] = sc.nextInt();
	   }
	   mrr[0]=arr[1];
	   mrr[1]=brr[1];
	    for(int i=0;i<2;i++) {
		    System.out.println(mrr[i]);
	    }
    }
}
