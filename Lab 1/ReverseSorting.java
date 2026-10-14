import java.util.*;
import java.io.*;

public class ReverseSorting{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long [] arr = new long[n];
        for(int i = 0; i<n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        String [] moves = new String [n*n];
        int count = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-2; j++){
                if(arr[j]>arr[j+2]){
                    long temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2] = temp;

                    moves[count] = ((j+1) + " " + (j+3));
                    count++;
                }
            }
        }

        boolean check = true;
        for(int i = 0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                check = false;
                break;
            }
        }
        if(check){
            pw.println("YES");
            pw.println(count);
            for(int i = 0; i<count; i++){
                pw.println(moves[i]);
            }
        }else{
            pw.println("NO");
        }
        pw.flush();
        br.close();


    }
}