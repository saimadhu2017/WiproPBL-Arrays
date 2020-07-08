class Wipro23{
 public static void main(String[] args){
  int[] arr={1,2,3,4,5};
  int num=2;
  int j=0;
  for(int i=0;i<arr.length;i++){
   if(num==arr[i]){
     j=1;
     System.out.println(i);
     break;
   }
  }
  if(j==0){
    System.out.println(-1);
  }
 }
}