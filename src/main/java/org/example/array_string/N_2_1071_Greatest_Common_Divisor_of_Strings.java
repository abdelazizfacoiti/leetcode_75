package org.example.array_string;

public class N_2_1071_Greatest_Common_Divisor_Of_Strings {
    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
    public String gcdOfStrings(String str1, String str2) {
        int min = Math.min(str1.length(), str2.length());
        int max = Math.max(str1.length(), str2.length());
        if(!(str1+str2).equals(str2+str1)) return "";
        StringBuilder res = new StringBuilder();
        res.append(str1.charAt(0));
        for(int i=1;i<Math.min(str1.length(),str2.length());i++){
            if (str1.charAt(i) == str2.charAt(i)  && i <= gcd(min,max))
                res.append(str1.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {

    }
}
