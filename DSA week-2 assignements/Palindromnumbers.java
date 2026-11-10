import java.util.Scanner;

public class Palindromnumbers {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 System.out.println("Enter the N:");
   int n = sc.nextInt();
   for (int i = 1; i < n; i++) {
    int original = i;
    int num = i;
    int reverse = 0;

      while (num > 0) {
       int digit = num % 10;
       reverse = reverse * 10 + digit;
         num = num / 10;
  }

     if (original == reverse) {
     System.out.print(original + " ");
  }
  }
  }
  }