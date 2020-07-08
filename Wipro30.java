import java.util.Scanner;

public class Wipro30{

    public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number of elements in array:");
	   int n=sc.nextInt();
	   int[] arr=new int[n];
	   System.out.println("Enter the elements in array:");
	   for(int i=0;i<n;i++){
	       arr[i]=sc.nextInt();
	       for(int j=i;j>0;j--){
	       	if(arr[j-1]%2==0  || arr[j]%2!=0){
	       		break;
	        }
		       int temp=arr[j];
		       arr[j]=arr[j-1];
		       arr[j-1]=temp;
	       }
       }
      for(int i=0;i<n;i++){
      	System.out.println(arr[i]);
      }
    }
}
