import java.io.*;
import java.util.*;

public class twosum{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        long[]arr = new long[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        int l = 0;
        int r = N-1;
        boolean check = false;
        while(l<r){
            if(arr[l]+arr[r] == S){
                check = true;
                pw.println((l+1) + " " + (r+1));
                break;
            }else if(arr[l] + arr[r]>S){
                r--;
            }else if(arr[l]+arr[r]<S){
                l++;
            }
        }
        if(!check){
            pw.println(-1);
        }
        pw.flush();
        pw.close();
        br.close();
    }
}