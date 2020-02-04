import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        String b= sc.nextLine();

        BigInteger aBig = new BigInteger(a);
        BigInteger bBig = new BigInteger(b);
        System.out.println(aBig.add(bBig));
        System.out.println(aBig.multiply(bBig));

    }
}

