import java.util.Scanner;

public class EvenorOdd {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number");
    int num=sc.nextInt();

    if(num%2==0){
        System.out.println("You Entered Number is Even");
    }else{
        System.out.println("You entered number is Odd");
    }

  }
}
