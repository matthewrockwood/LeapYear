import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputYear;
      boolean isLeapYear;
      
      isLeapYear = false;
      inputYear = scnr.nextInt();
      
      if ((inputYear % 4 ==0)&& (inputYear %100 != 0)|| (inputYear % 400 ==0)) {
         System.out.println(inputYear + " - leap year");
      }
      
      else {
         System.out.println(inputYear + " - not a leap year");
   }
   }
}
