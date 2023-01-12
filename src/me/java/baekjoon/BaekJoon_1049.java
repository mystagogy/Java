package me.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_1049 {
    private static int N,M;
    private static int[] set;
    private static int[] per;
    private static int sum;
    private static int setMin, Min;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        set = new int[M];
        per = new int[M];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            set[i] = Integer.parseInt(st.nextToken());
            per[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(set);
        Arrays.sort(per);

        setMin = set[0];
        Min = per[0];

        sum = Math.min(((N/6)+1)*setMin, N*Min);
        sum = Math.min(sum, ((N/6))*setMin + (N%6)*Min);

        System.out.println(sum);

    }
}
