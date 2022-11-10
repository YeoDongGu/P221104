package sdf;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int inp = 0;
      do {
         System.out.print("ASCII code =? ");
         inp = sc.nextInt();


         if (!(33 <= inp && inp <= 127)) {
            sc.close();
            break;
         }
         
         char c = (char) inp;

         System.out.println(c);
      } while (33 <= inp && inp <= 127);
   }
}