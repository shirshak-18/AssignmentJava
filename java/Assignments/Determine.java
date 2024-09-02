package Assignments;

import java.math.BigInteger;

public class Determine {
    public static void main(String []args){
            int a=105;
            if (a%2==0){
                System.out.println("Even");
    
            }
            else{
                System.out.println("Odd");
            }
            for(int i =1;i<=a;i++){
               if(a%i == 0){
                System.out.print(i+",");
               }
            }
            System.out.println();
            BigInteger ans = BigInteger.ONE;
            for(int i=1;i<=a;i++){
                ans = ans.multiply(BigInteger.valueOf(i));
                
            }
            System.out.print(ans);
        }
}
