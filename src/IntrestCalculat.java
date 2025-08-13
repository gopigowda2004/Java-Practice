import java.util.Scanner;

public class IntrestCalculat {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Principle:");
    int p=sc.nextInt();
    System.out.println("Enter Rate:");
    int R=sc.nextInt();
    System.out.println("Enter Time:");
    int T=sc.nextInt();

    int SI=p*R*T;
    int f=SI/100;
    System.out.println(f);

  }
}
