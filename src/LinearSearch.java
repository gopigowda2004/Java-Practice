public class LinearSearch {
  public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
       int target=40;
       boolean found=false;
          for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found in index:"+i);
                found=true;
                break;
            }
        }
            if(!found){
                System.out.println("Not Found");

            }
        }
          }   
  