import java.io.*;
import java.util.*;

public class twosumrev{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        long [] arr1 = new long[N];
        long [] arr2 = new long[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr1[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++){
            arr2[i] = Long.parseLong(st.nextToken());
        }

        long min = Long.MAX_VALUE;
        int l = 0;
        int r = M-1;
        String s = "";
        while(l<N && r>=0){
            long c = Math.abs(arr1[l] + arr2[r] - K);
            if(arr1[l] + arr2[r] == K){
                s = (l+1) + " " + (r+1);
                break;
            }else if(arr1[l] + arr2[r]>K){
                if(c<min){
                    s = (l+1) + " " + (r+1);
                    min = c;
                }  
                r--;
            }else if(arr1[l] + arr2[r] <K){
                if(c<min){
                    s = (l+1 ) + " " + (r+1);
                    min = c;
                }
                l++;
            }
        }

        pw.println(s);
        pw.flush();
        pw.close();
        br.close();
    }
}