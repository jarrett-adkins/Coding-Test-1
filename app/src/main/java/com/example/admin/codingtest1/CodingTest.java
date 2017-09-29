package com.example.admin.codingtest1;

/**
 * Created by Admin on 9/29/2017.
 */

public class CodingTest {

    public static void main( String[] args ) {
        System.out.println( palindrome( "abcde" ) );
        System.out.println( palindrome( "aabaa" ) );
        System.out.println( palindrome( "aabaab" ) );
        System.out.println( palindrome( "aabbccbbaa" ) );
        System.out.println();
        System.out.println( mostOccurrence( new int [] {1,1,1,2,3,4} ));
        System.out.println( mostOccurrence( new int [] {1,2,2,3,4,5,5,5} ));
        System.out.println( mostOccurrence( new int[] {1,2,1,3,1,4,1,5} ));
        System.out.println( mostOccurrence( new int[] {1,7,7,7} ));
        System.out.println();
        System.out.println( armstrong( 153 ) );

    }

    private static boolean palindrome( String s ) {
        for( int i = 0; i < s.length(); i++ ) {

            if( s.charAt(i) != s.charAt( s.length() - 1 - i ) )
                return false;
        }

        return true;
    }

    private static int mostOccurrence(int[] arr ) {

        int[] countArr = new int[ arr.length ];
        int highestCount = arr[0];
        int answer = 0;

        for( int i = 0; i < arr.length; i ++ ) {
            int count = 0;
            for( int j = 0; j < arr.length; j++ ){
                if( arr[j] == arr[i] )
                    count++;
            }

            countArr[i] = count;

            if( highestCount < countArr[i] ) {
                highestCount = countArr[i];
                answer = arr[i];
            }
        }

        return answer;
    }

    private static boolean armstrong( int num ) {
        String param = String.valueOf( num );
        char[] charDigits = param.toCharArray();
        int[] digits = new int[ charDigits.length ];

        for( int i = 0; i < charDigits.length; i++ ) {
            digits[i] = charDigits[i] - '0';//new Integer.parseInt( charDigits[i] );
        }

        int sumOfPowers = 0;

        for( int i = 0; i < digits.length; i++ )
            sumOfPowers += Math.pow( digits[i], digits.length );

        return sumOfPowers == num;
    }
}
