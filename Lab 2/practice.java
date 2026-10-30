import java.util.*;
import java.io.*;


public class practice{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long left = 0;
        long right = 0;
        long[]arr = new long[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Long.parseLong(st.nextToken());
            if(arr[i]>left){
                left = arr[i];
            }
            right+=arr[i];
        
        }
        long ans = -1;
        int count = 1;
        long current = 0;
        while(left<=right){
            long mid = (left+right)/2;
            
            for(int i = 0; i<n; i++){
                if(current+arr[i] <=mid){
                    current+=arr[i];
                }else{
                    count++;
                    current = arr[i];
                }
            }

            if(count<=k){
                ans = mid;
                right=mid+1;
            }else{
                left=mid+1;
            }
        }
        pw.println(ans);

        pw.flush();
        pw.close();
        br.close();
    }
}