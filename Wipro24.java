class Wipro24{
 public static void main(String[] args){
  int[] arr=new int[26];
  int j=65;
  for(int i=0;i<26;i++){arr[i]=j;j++;}
  for(int i=0;i<26;i++){System.out.println((char)arr[i]);}
 }
}