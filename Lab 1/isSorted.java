import java.util.*;
import java.io.*;
public class isSorted{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        long N = Long.parseLong(br.readLine());
        for(int i = 0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long [] arr = new long[n];
            boolean check = true;
            long prev = -1;
            for(int j = 0; j<n; j++){
                long s = Long.parseLong(st.nextToken());
                if(s<prev){
                    check =false;
                }
                arr[j] = s;
                prev = s;
            }
            if(check == false){
                pw.println("NO");
            }else{
                pw.println("YES");
            }           

        }
        pw.flush();
        br.close();
    }
}