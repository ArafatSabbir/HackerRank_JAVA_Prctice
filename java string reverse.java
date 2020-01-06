import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String myString=sc.next();
        
        String myReversed = new StringBuilder(myString).reverse().toString();
        System.out.println(myString.equals(myReversed) ? "Yes" : "No");
        
    }
}

