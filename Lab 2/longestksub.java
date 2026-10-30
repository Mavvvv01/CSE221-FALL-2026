import java.io.*;
import java.util.*;

public class longestksub{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int [] arr = new int[N];
        int [] farr = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int l = 0;
        int max = 0;
        int distinct = 0;

        for(int r = 0; r<N; r++){
            if(farr[arr[r]]==0){
                distinct++;
            }
            farr[arr[r]]++;

            while(distinct>K){
                farr[arr[l]]--;
                if(farr[arr[l]] == 0){
                    distinct--;
                }
                l++;
            }
            max = Math.max(max, r-l+1);
        }
        pw.print(max);
        pw.flush();
        pw.close();
        br.close();
    }
}