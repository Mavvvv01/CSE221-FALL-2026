import java.io.*;
import java.util.*;

public class longestsubsum{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        int l = 0;
        int r = 0;
        long sum = 0;
        int max = 0;

        while(l<N && r<N){
            if(sum+arr[r] <=K){
                sum += arr[r];
                if(r-l+1 > max){
                    max = r-l+1;
                }
                r++;
            }else{
                sum-=arr[l];
                l++;
            }
        }
        pw.println(max);
        pw.flush();
        pw.close();
        br.close();
    }
}