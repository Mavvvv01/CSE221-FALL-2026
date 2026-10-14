import java.io.*;

public class FastSum{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            long n = Long.parseLong(br.readLine());
            pw.println(n*(n+1)/2);
        }
        pw.flush();
        br.close();
    }
    
}