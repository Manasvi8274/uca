package questions;

import java.util.Scanner;

public class plane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] tickets = new String[n][2];
        for (int i=0;i<n;i++){
            tickets[i][0] = sc.next();
            tickets[i][1] = sc.next();
        }
        
    }
}
