package UCA.SEM5.JAVA;

import java.util.*;

public class longest_sub {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        if (s.length() <= 2) {
            System.out.println("ANSWER = " + s.length());
        } else {
            int k = 2;
            int ans = 0;
            int ptr1 = 0;
            int ptr2 = 0;
            Map<Character, Integer> map = new HashMap<>();
            while (ptr1 < s.length() && ptr2 < s.length()) {
                map.put(s.charAt(ptr2), map.getOrDefault(s.charAt(ptr2), 0) + 1);
                while (map.size() > k) {
                    map.put(s.charAt(ptr1), map.get(s.charAt(ptr1))-1);
                    if (map.get(s.charAt(ptr1)) == 0) {
                        map.remove(s.charAt(ptr1));
                    }
                    ptr1++;
                }
                ans = Math.max(ans, ptr2 - ptr1 + 1);
                ptr2++;
            }
            System.out.println("ANSWER = " + ans);
        }
    }
}
