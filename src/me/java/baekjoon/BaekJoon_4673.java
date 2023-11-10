package me.java.baekjoon;

public class BaekJoon_4673 {
    static int checkNum(int n) {
        int sum = n;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        boolean[] check = new boolean[10000];
        for (int i = 1; i <= 10000; i++) {
            int n = checkNum(i);
            if (n <= 10000) check[n - 1] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            if(!check[i]) sb.append(i+1).append("\n");
        }
        System.out.println(sb);
    }
}
