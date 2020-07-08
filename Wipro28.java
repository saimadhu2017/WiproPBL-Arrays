import java.util.Scanner;

public class Wipro28{

    public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number of elements in array:");
	   int n=sc.nextInt();
	   int[] arr=new int[n];
	   System.out.println("Enter the elements in array:");
	   for(int i=0;i<n;i++){
	       arr[i]=sc.nextInt();
       }
	   int sum=0,sumss=0,c=0;
	   for(int i=0;i<n;i++){
	   	sum=sum+arr[i];
	   	if(arr[i]==6){
	   		for(int j=i;j<n;j++){
	   			sumss=sumss+arr[j];
	   			if(arr[j]==7){c=1;break;}
		    }
	    }
	   }
	   if(c==1){System.out.println(sum-sumss);}
	   else{System.out.println(sum);}

    }
}
