import java.io.*;

public class OddorEven{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            long N = Long.parseLong(br.readLine());
            if(N%2==0){
                pw.println(N + " is an Even number.");
            }else{
                pw.println(N + " is an Odd number.");
            }
        }
        pw.flush();
        br.close();

    }
}