import java.util.*;
import java.io.*;

public class GameWithInteger{
    public static void main(String[] args){
        FastReader fr=new FastReader();
        Solution sol=new Solution();
        PrintWriter out=new PrintWriter(System.out);

        int t=fr.nextInt();
        while(t-- >0){
            int n=fr.nextInt();
            sol.solve(n,out);
        }
        out.close();
    }
}

class Solution{
    public void solve(int n,PrintWriter out){
        if(((n-1) %3==0) || ((n+1)%3==0)){
            out.println("First");
        }
        else{
            out.println("Second");
        }
    }
}

class FastReader{
    StringTokenizer st;
    BufferedReader br;
    FastReader(){
        br=new BufferedReader(new InputStreamReader(System.in));
    }

    String next(){
        while(st==null || !st.hasMoreElements()){
            try{
                st=new StringTokenizer(br.readLine());
                break;
            }
            catch(IOException e){
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