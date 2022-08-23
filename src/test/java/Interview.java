import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Interview {
        public static void main(String[] args) {
            // reverse number using while loop

                int input ;
                do{
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("1)Continue\n2)Exit");
                        input = scanner.nextInt();
                }while (input!=2);

                int number = 1234, reverse = 0;
                while(number != 0)
                {
                        int remainder = number % 10;
                        reverse = reverse * 10 + remainder;
                        number = number/10;

                }

               int sum = reverse + reverse;
                System.out.println("The reverse of the given number is: " + reverse + " sum is "+ sum);
//---------------------------------------------------------------------------------------------------------------------------------------------
// reverse number and get sum of multiplication  of number "1234" = is 24;
// and reverse is 4321 .
                int num = 1234;
                String rev = "";
                int multi = 1;
                while (num!=0){
                        int digit = num%10;
                        multi *= digit; // i multiply the 1 * 4
                        num /= 10 ;
                        rev += digit;
                }
                System.out.println(multi);
                System.out.println(rev);
    //--------------------------------------------------------------------------------------------------------------------------------------
// find the prime number
//
//                        int i, number, count = 0;
//
//                        int sc = 0;
//                        number = sc;
//
//
//
//
//                        for (i = 2; i <= number/2; i++)
//                        {
//                                if(number % i == 0)
//                                {
//                                        count++;
//                                        break;
//                                }
//                        }
//                        if(count == 0 && number != 1 )
//                        {
//                                System.out.println( number + " is a Prime");
//                        }
//                        else
//                        {
//                                System.out.println(number + " is Not");
//                        }
//------------------------------------------------------------------------------------------------------------------------

// find the prime number between 1 - 100
//
//                        int startingPoint =0;
//                        int endingPoint =110;
//
//                        for(int i = startingPoint; startingPoint<=endingPoint;startingPoint++){
//                            boolean isPrime = true;
//                                for (int k=2;k<startingPoint;k++){
//                                        if(startingPoint%k==0){
//                                            isPrime=false;
//                                            break;
//                                        }
//
//                                        }
//                                if ( isPrime&&startingPoint!=1){
//          optional  line ------->       if(isPrime&&startingPoint !=0) {
//                                        System.out.println(startingPoint + " is Prime number");
//                                    }
//                                }
//
//                                }
//
//
//-----------------------------------------------------------------------------------------------------------------------
//
            int cat = 20;
            int dog = 10;
            int rabbit =5 ;


            String results = (cat > dog )? "true": rabbit>dog ?"also true" :"false"; // --> condition is true.  yes!




            System.out.println(results);//--yes

        }



                }








