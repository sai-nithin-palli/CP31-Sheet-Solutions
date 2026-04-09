import java.util.*;
import java.io.*;

public class DontTryToCount{
    public static void main(String[] args){
        FastReader fr=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        Solution sol=new Solution();

        int t=fr.nextInt();

        while(t-- >0){
            int n=fr.nextInt();
            int m=fr.nextInt();

            String x=fr.nextLine();
            String s=fr.nextLine();

            sol.solve(n,x,m,s,out);
        }
        out.close();
    }

}

class Solution{
    void solve(int n,String x,int m,String s,PrintWriter out){
        for(int i=0;i<=5;i++){
            if(x.contains(s)){
                out.println(i);
                return;
            }
            x=x+x;
        }
        out.println("-1");
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