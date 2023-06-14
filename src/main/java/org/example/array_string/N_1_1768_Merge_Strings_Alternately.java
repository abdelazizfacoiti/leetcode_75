package org.example.array_string;

public class N_1_1768_Merge_Strings_Alternately {
    public static String mergeAlternately(String word1, String word2) {
        int wl1 = word1.length();
        int wl2 = word2.length();
        StringBuilder res = new StringBuilder();
        for (int i=0;i<Math.max(wl1,wl2);i++){
            if(i<wl1) res.append(word1.charAt(i));
            if(i<wl2) res.append(word2.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
    }
}
