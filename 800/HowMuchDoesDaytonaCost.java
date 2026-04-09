import java.util.*;
import java.io.*;

public class HowMuchDoesDaytonaCost{
    public static void main(String[] args){
        FastReader fr=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        Solution sol=new Solution();

        int t=fr.nextInt();

        while(t-- >0){
            int n=fr.nextInt();
            int k=fr.nextInt();

            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=fr.nextInt();

            }
            sol.solve(n,arr,k,out);
        }
        out.close();
    }

}
//
class Solution{
    void solve(int n,int[] arr,int k,PrintWriter out){
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                out.println("YES");
                return;
            }
        }
        out.println("NO");
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