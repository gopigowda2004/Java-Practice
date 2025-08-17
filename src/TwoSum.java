public class TwoSum {
   public static void main(String[] args) {
    int[] arr={2,7,4,6,8};
    int target=10;
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
          if(arr[i]+arr[j]==target){
            System.out.println("pair found "+arr[i]+" and "+arr[j]+"="+target);
          }
      }
    }
   }
}
