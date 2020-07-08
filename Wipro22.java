class Wipro22{
 public static void main(String[] args){
  int[] arr={20,300,220,500,0};
  int max=arr[0];
  int min=arr[0];
  for(int i=1;i<arr.length;i++){
     if(max<arr[i]){max=arr[i];}
     if(min>arr[i]){min=arr[i];}
  }
  System.out.println("max="+max+" min="+min);
 }
}