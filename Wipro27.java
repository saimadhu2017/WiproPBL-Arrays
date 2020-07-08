import java.util.Scanner;
class Wipro27{
 public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number of elements in array:");
	   int n=sc.nextInt();
	   int[] arr=new int[n];
	   int[] brr=new int[n];
	   System.out.println("Enter the elements in array:");
	   for(int i=0;i<n;i++){
	       arr[i]=sc.nextInt();
           }
	   int lb=0,ib=0;
	   for(int i=0;i<n;i++){
	   	int c=0;
	   	for(int j=0;j<lb;j++){
	   		if(arr[i]==brr[j]){
	   			c=1;
	   			break;
		        }
	        }
	   	if(c==0){brr[ib]=arr[i];ib=ib+1;lb=lb+1;}
	   }
	   for(int i=0;i<lb;i++){
	   	System.out.println(brr[i]);
	   }
 }
}