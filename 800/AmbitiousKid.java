import java.util.*;
import java.io.*;


public class AmbitiousKid{
    public static void main(String[] args){
        FastReader fr=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        Solution sol=new Solution();

        int n=fr.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=fr.nextInt();
        }

        sol.solve(n,arr,out);
        out.close();
    }
}

class Solution{
    public void solve(int n,int[] arr,PrintWriter out) {
        int ans=(int)1e9;
        for(int i=0;i<n;i++){
            ans=Math.min(ans,Math.abs(arr[i]));
            if(ans==0) break;
        }
        out.println(ans);
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