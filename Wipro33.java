import java.util.Scanner;

public class Wipro33{

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
            try{
               int[][] arr=new int[2][2];
	    arr[0][0]=Integer.parseInt(args[0]);
	    arr[0][1]=Integer.parseInt(args[1]);
	    arr[1][0]=Integer.parseInt(args[2]);
	    arr[1][1]=Integer.parseInt(args[3]);
	    System.out.println("The given array is:");
	    for(int i=0;i<2;i++){
	    	for(int j=0;j<2;j++){
	    		System.out.print(arr[i][j]+" ");
		    }
	    	System.out.println();
	    }
	    System.out.println("The Reverse of above array is:");
	    for(int i=1;i>=0;i--){
	    	for(int j=1;j>=0;j--){
	    		System.out.print(arr[i][j]+" ");
		    }
	    	System.out.println();
	    }
           }catch(Exception e){
            System.out.println("Please enter 4 integer numbers");
            }
	    
    }
}
