package com.example.stringencryption.leetcode;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBitst(423432432));
    }

    public static int reverseBits(int n) {
        if (n == 0) return 0;

        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            if ((n & 1) == 1) result++;
            n >>= 1;
        }
        return result;
    }

    public static int reverseBitss(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            //this is used to find least significant digit (lsb)
            // 00000010100101000001111010011100 & 1 = 00000010100101000001111010011100<- lsb =0
            int lsb = n & 1;

            // soo, left shift of lsb lsb<<(31-i) so our 1st position zero will swaped with 31-i.so on...
            int revLsb = lsb << (31 - i);
            // store the revLsb in our result variable
            res = res | revLsb;

            // right sift of n , one time ans soo on...
            n = n >> 1;
        }
        return res;
    }

    public static int reverseBitst(int n)
    {
        int i , reverse = 0 ;
        for( i = 0 ; i < 32 ; i++ )
        {
            reverse = reverse << 1 ;
            if( ( n & 1 ) == 1 )
            {
                reverse = reverse | 1 ;
            }
            n = n >> 1 ;
        }
        return reverse ;
    }
}
