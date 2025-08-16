public class MinandMAx {
   public static void main(String[] args) {
    int[] arr={10,20,30,40,50,60};
    int min=arr[0];
    int max=arr.length-1;
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
                min=arr[i];
    }
            
            System.out.println("max element is :"+max+ "\n min element is:"+min);
        }
    }
   

