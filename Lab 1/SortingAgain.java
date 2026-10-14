import java.io.*;
import java.util.StringTokenizer;

public class SortingAgain{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            int N = Integer.parseInt(br.readLine());

            long [] ID = new long[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                ID[j] = Long.parseLong(st.nextToken());
            }

            long[] marks = new long[N];
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                marks[j] = Long.parseLong(st.nextToken());
            }

            int min = 0;


            for(int k = 0; k<N; k++){
                int top = k;
                for(int j = k+1; j<N; j++){
                    if(marks[j]>marks[top]){
                        top = j;
                    }else if (marks[j] == marks[top]){
                        if(ID[top]>ID[j]){
                            top = j;
                        }
                    }
                }

                if(top!=k){
                    long temp = marks[k];
                    marks[k] = marks[top];
                    marks[top] = temp;
                    temp = ID[k];
                    ID[k] = ID[top];
                    ID[top] = temp;
                    min++;
                }

            }
            pw.println("Minimum swaps: " + min);
            for(int k = 0; k<N; k++){
                pw.println("ID: " + ID[k] + " Mark: " + marks[k]);
            }

        }
        pw.flush();
        br.close();
        
    }
}