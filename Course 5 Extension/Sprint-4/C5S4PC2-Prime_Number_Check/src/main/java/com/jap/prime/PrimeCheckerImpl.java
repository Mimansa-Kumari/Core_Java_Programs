package com.jap.prime;
public class PrimeCheckerImpl {
    public boolean primeNumberCheck(int n)
    {
        PrimeChecker primeChecker = number -> {
            // write the logic here to check is a number is prime or not
            int count = 0;
            if (number==0 || number==1)
            {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count=1;
                    break;
                }
            }
            if (count == 0) {
                return true;
            }
            else
            {
             return false;
            }
        };
        return (primeChecker.isPrimeNumber(n));
    }
    public static void main(String[] args) {
        PrimeCheckerImpl p = new PrimeCheckerImpl();
        System.out.println(p.primeNumberCheck(6));
    }
}
