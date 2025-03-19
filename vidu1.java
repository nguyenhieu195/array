package vidu;

import java.util.Scanner;

public class vidu1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int s = 0;
            for(int j = 0; j <= n; j++){
                s += Math.pow(2, j);
                System.out.println(a + b * s);
            }
        }
        in.close();
    }
}
