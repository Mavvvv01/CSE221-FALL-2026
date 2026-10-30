import java.io.*;
import java.util.*;

public class bsortedlist{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        int N = Integer.parseInt(br.readLine());
        int [] arr1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        int[] arr = new int[N+M];

        int i1 = 0;
        int i2 = 0;
        int i = 0;
        while(i1<N && i2<M){
            if(arr1[i1]<=arr2[i2]){
                arr[i] = arr1[i1];
                i++;
                i1++;
            }else{
                arr[i] = arr2[i2];
                i++;
                i2++;
            }
        }

        if(i1!=N){
            for(int j = i1; j<N; j++){
                arr[i] = arr1[j];
                i++;
            }
        }

        if(i2!=M){
            for(int j = i2; j<M; j++){
                arr[i] = arr2[j];
                i++;
            }
        }

        for(int j = 0; j<arr.length; j++){
            pw.print(arr[j] + " ");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}