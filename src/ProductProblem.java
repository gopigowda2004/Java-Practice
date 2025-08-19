public class ProductProblem {
   public static void main(String[] args) {
    int nums;
    int n=nums.length;
    int[] ans=new int[n];

    int Left=1;
    for(int i=0;i<n;i++){
        ans[i]=Left;
        Left*=nums[i];

    }
    int Right=1;
    for(int i=n-1;i>=0;i--){
        ans[i] *=Right;
        Right*=nums[i];
    }

   }
}
