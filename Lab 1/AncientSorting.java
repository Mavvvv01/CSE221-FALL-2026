import java.util.*;
import java.io.*;

public class AncientSorting{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long [] arr = new long[n];
        for(int i = 0; i<n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                if(arr[j]>arr[j+1] && (((arr[j]%2==0) && (arr[j+1]%2==0))||((arr[j]%2!=0) && (arr[j+1]%2!=0)))){
                    long temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i<n; i++){
            pw.print(arr[i] + " ");
        }
        pw.flush();
        br.close();

    }
}