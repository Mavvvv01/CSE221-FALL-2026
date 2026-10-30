import java.io.*;
import java.util.*;

public class arraysplit{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long [] arr = new long[N];
        long left = 0;
        long right = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            long s = Long.parseLong(st.nextToken());
            if(s>left){
                left = s;
            }
            arr[i] = s;
            right+=s;
        }

        long ans = right;

        while(left<=right){
            long mid = (left+right)/2;

            int count = 1;
            long current = 0;

            for(int i = 0; i<N; i++){
                if(current+arr[i] <= mid){
                    current+=arr[i];
                }else{
                    count++;
                    current = arr[i];
                }
            }

            if(count<=K){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        pw.println(ans);
        pw.flush();
        pw.close();
        br.close();
    }
}