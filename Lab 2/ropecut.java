import java.io.*;
import java.util.*;

public class ropecut{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        Long [] arr = new Long[n];
        long maxRope = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Long.parseLong(st.nextToken());
            if(arr[i]>maxRope){
                maxRope = arr[i];
            }
        }

        long low = 1;
        long high = maxRope;
        long ans = -1;

        while(low<=high){
            long mid = (low+high)/2;

            long totalpiece = 0;
            for(int i = 0; i<n; i++){
                totalpiece+= arr[i]/mid;
                if(totalpiece>=k){
                    break;
                }
            }

            if (totalpiece>=k){
                ans = mid;
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        pw.println(ans);
        pw.flush();
        pw.close();
        br.close();
    }
}