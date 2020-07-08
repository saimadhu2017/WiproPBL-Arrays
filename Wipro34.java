public class Wipro34{

    public static void main(String[] args) {
    	try{
		    int[][] arr=new int[3][3];
		    int c=0;
		    for(int i=0;i<3;i++){
			    for(int j=0;j<3;j++){
				    arr[i][j]=Integer.parseInt(args[c]);
				    c++;
			    }
		    }
		    System.out.println("The given array is:");
		    for(int i=0;i<3;i++){
		    	for(int j=0;j<3;j++){
		    		System.out.print(arr[i][j]+" ");
			    }
		    	System.out.println();
		    }
		    int max=arr[0][0];
		    for(int i=0;i<3;i++){
			    for(int j=0;j<3;j++){
				    if(max<arr[i][j]){max=arr[i][j];}
			    }
		    }
		    System.out.println("The biggest number in the given array is "+max);

	    }catch (Exception e){
		    System.out.println("Please enter 9 integer numbers");
	    }


    }
}
