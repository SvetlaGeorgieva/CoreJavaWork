package com.hackbulgaria.corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Problems2Impl implements Problems2 {

    @Override
    public boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isPrime(int N) {
        if (N < 0) {
            N *= -1;
        }
        if (N == 1) {
            return false;
        } else {
            if (N == 2) {
                return true;
            } else {
                int count = 0;
                double range = Math.sqrt(N) + 1;

                for (int i = 1; i <= range; i++) {
                    if (N % i == 0) {
                        count += 1;
                    }
                }

                if (count > 1) {    
                    return false;
                }
                return true;
            }
        }
    }

    @Override
    public int min(int... array) {
        int min = array[0];
        for (int element : array) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }

    @Override
    public int kthMin(int k, int[] array) {
        Arrays.sort(array);
        return array[k-1];
    }

    @Override
    public float getAverage(int[] array) {
        Arrays.sort(array);
        float sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        } 
        return sum/array.length;
    }

    @Override
    public long getSmallestMultiple(int upperBound) {
        /*
         (1) -> = 1
             i=2, res=1 2-1 = 1 -> *2=2
                 i=3, res=2 3-2 = 1 -> *3=6
                    i=4, res=6 6-4=2 -> *2 = 12
                       (12;5) 12-5=7?,  -> *5=60
                           (60;6) -> (10;1) -> = 60
                               (60;7) -> *7 = 420
                                   (420;8) -> (70;1) -> =420
                                       (420;9) -> (140;3) -> *3 = 1260
         */
        // TODO 
        long result = 1;
        for (int i = 2; i <= upperBound; i++) {
//            System.out.println(i);
            if (i > result) {
                result *= i;
            } else {
                long q = i; // 4
                long p = result; // 6
                while (q != 0) {
                    long temp = q; // 4
                    q = p % q; // 2
                    p = temp; // 4
//                    System.out.println(p);
                }
                result *= p;
//                System.out.println(result);
            }
        }
//        System.out.println(result);
        return result;
    }

    @Override
    public long getLargestPalindrome(long N) {
        long result = N-1;
        for (long i = N-1; i >=0; i--) {
            long reverse = 0;
            long n = i;
            while( n != 0 )
            {
                reverse = reverse * 10;
                reverse = reverse + n%10;
                n = n/10;
            }
            if(i - reverse == 0) {
                return i;
            }
        }
        return result;
    }

    @Override
    public int[] histogram(short[][] image) {
        int[] array = new int[255];
        for (int i=0; i< image.length; i++) {
            for (int j=0; j< image[i].length; j++) {
                int index = image[i][j];
                array[index] += 1;
            }            
        }
        return array;
    }

    @Override
    public long doubleFac(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *=i;
        }
        n = result;
        result = 1;
        for (int i = 1; i <= n; i++) {
            result *=i;
        }
        return result;
    }

    @Override
    public long kthFac(int k, int n) {
        long p = n;
        for (int j = 1; j <= k; j++) {
            long result = 1;
            for (int i = 1; i <= p; i++) {
                result *= i;
            }
            p = result;
        }
        return p;
    }

    @Override
    public int getOddOccurrence(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = result^array[i];
        }
        return result;
    }

    @Override
    /* Function to calculate x raised to the power y in O(logn)*/
    public long pow(int a, int b) {
        if (b == 0)
            return 1;
        long temp = pow(a, b / 2);
        if (b % 2 == 0)
            return temp * temp;
        else
            return a * temp * temp;
    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maxSpan(int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean canBalance(int[] array) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseMe(String argument) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String copyEveryChar(String input, int k) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseEveryWord(String arg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isPalindrome(String argument) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isPalindrome(int number) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getPalindromeLength(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String decodeURL(String input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sumOfNumbers(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        // TODO Auto-generated method stub
        return false;
    }

}
