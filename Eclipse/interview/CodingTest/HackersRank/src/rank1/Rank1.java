package rank1;

import java.util.Scanner;

public class Rank1 {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
           if(N<=5 || N>=20){
             if(N%2==0) {
            System.out.print("Not Weird");
             }else {
                 System.out.print("Weird"); 
             }
           }
            if(N>5 && N<20){
              if(N%2==0)
            System.out.print("Weird");
            }
    }
            
}
