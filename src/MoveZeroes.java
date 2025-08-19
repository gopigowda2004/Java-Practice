public class MoveZeroes {
   public static void main(String[] args) {
    int[] arr={0,3,1,0,4,6};
         int insertpos=0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[insertpos]=arr[i];
                insertpos++;
            }
         }
         while(insertpos<arr.length){
            arr[insertpos]=0;
            insertpos++;
         }
            }
        }
    
   

