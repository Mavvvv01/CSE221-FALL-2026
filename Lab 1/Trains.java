import java.io.*;

public class Trains {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];
        String [] name = new String [n];
        String [] time = new String [n];

        for(int i = 0; i<n; i++){
            arr[i] = br.readLine();
            String[]  parts = arr[i].split(" ");
            name[i] = parts[0];
            time[i] = parts[parts.length-1];
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                int compare = name[j].compareTo(name[j+1]);
                if(compare>0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    temp = name[j];
                    name[j] = name[j+1];
                    name[j+1] = temp;

                    temp = time[j];
                    time[j] = time[j+1];
                    time[j+1] = temp;
                }else if(compare==0){
                    int tcomp = time[j].compareTo(time[j+1]);
                    if(tcomp<0){
                        String temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;

                        temp = name[j];
                        name[j] = name[j+1];
                        name[j+1] = temp;

                        temp = time[j];
                        time[j] = time[j+1];
                        time[j+1] = temp;
                    }
                    
                }
            }
        }

        for(int i = 0; i<n;i++){
            pw.println(arr[i]);
        }
        pw.flush();
        br.close();

    }
}