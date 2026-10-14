import java.io.*;

public class Calculator{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
          String [] segment = br.readLine().split(" ");
          long a = Long.parseLong(segment[1]);
          long b = Long.parseLong(segment[3]);
          String o = segment[2];
          if(o.equals("+")){
            pw.println(a+b);
          }else if(o.equals("-")){
            pw.println(a-b);
          }else if(o.equals("*")){
            pw.println(a*b);
          }else if(o.equals("/")){
            pw.println((double)a/(double)b);
          }else if(o.equals("%")){
            pw.println(a%b);       
          }else if(o.equals("&")){
            pw.println(a&b);
          }else if(o.equals("|")){
            pw.println(a | b);
          }else if(o.equals("^")){
            pw.println(a^b);
          }else if(o.equals("<<")){
            pw.println(a<<b);
          }else if(o.equals(">>")){
            pw.println(a>>b);
          }
        }
        pw.flush();
    }
}