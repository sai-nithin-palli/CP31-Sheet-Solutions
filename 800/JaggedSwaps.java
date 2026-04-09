import java.util.*;
import java.io.*;

public class JaggedSwaps{
    public static void main(String[] args){
        FastReader fr=new FastReader();
        Solution sol=new Solution();
        PrintWriter out=new PrintWriter(System.out);

        int t=fr.nextInt();

        while(t-- >0){
            int n=fr.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=fr.nextInt();
            }
            sol.solve(n,arr,out);
        }
        out.close();
    }
}

class Solution{
    public void solve(int n,int[] arr,PrintWriter out) {
        int chnaged=0;

        for(int j=n;j>=0;j--){
            for(int i=1;i<j-1;i++) {
                if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                out.println("No");
                return;
            }
        }
        out.println("Yes");
        return;
    }
}

class FastReader{
    StringTokenizer st;
    BufferedReader br;

    public FastReader(){
        br=new BufferedReader(new InputStreamReader(System.in));
    }

    String next(){
        while(st==null || !st.hasMoreElements()){
            try{
                st=new StringTokenizer(br.readLine());
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt(){
        return Integer.parseInt(next());
    }

    long nextLong(){
        return Long.parseLong(next());
    }

    double nextDouble(){
        return Double.parseDouble(next());
    }

    String nextLine(){
        String str="";
        try{
            str=br.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return str;
    }

}