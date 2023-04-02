package twopoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
두 수의 합
 */
public class B3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.println(0);
            return;
        }

        int arr[] = new int[N];
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int X = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int start = 0;
        int end = N - 1;
        int cnt = 0;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == X) {
                start++;
                answer++;
            } else if (sum < X) {
                start++;
            } else {
                end--;
            }

        }
        System.out.println(answer);

    }
}
