import java.io.*;
import java.util.*;

public class countnumbers{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<q; i++){
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            int low = 0;
            int high = n-1;
            int l = n;
            while(low<=high){
                int mid = (low+high)/2;
                if(arr[mid] >= left){
                    l = mid;
                    high = mid-1;
                }else if(arr[mid]<left){
                    low = mid+1;
                }
            }

            low = 0;
            high = n-1;
            int r = -1;
            while(low<=high){
                int mid = (low+high)/2;
                if(arr[mid]<=right){
                    r = mid;
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }

            if(l<=r){
                pw.println(r-l+1);
            }else{
                pw.println(0);
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}