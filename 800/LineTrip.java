import java.io.*;
import java.util.*;

public class LineTrip{


    public static void main(String[] args){
        FastReader fr=new FastReader();
        PrintWriter pw=new PrintWriter(System.out);

        Solution sol=new Solution();
        int t=fr.nextInteger();
        while(t-- >0){
            int n=fr.nextInteger();
            int x=fr.nextInteger();
            int[] gasStations=new int[n];
            for(int i=0;i<n;i++){
                gasStations[i]=fr.nextInteger();
            }
            sol.solve( n, x,gasStations,pw);
        }
        pw.close();
    }


}

class Solution{
    public void solve(int n,int endPoint,int[] gasStations,PrintWriter pw){
        int ans=0;
        for(int i=0;i<n;i++){
            if(i==0) {
                ans = Math.max(gasStations[0], ans);
            }
            else{
                ans=Math.max(ans,gasStations[i]-gasStations[i-1]);
            }
            if(i==n-1){
                ans=Math.max(ans,(endPoint-gasStations[i])*2);
            }
        }
        pw.println(ans);
    }
}


class FastReader{
    StringTokenizer st;
    BufferedReader br;
    FastReader(){
        br=new BufferedReader(new InputStreamReader(System.in));
    }

    public String next(){
        while(st==null || !st.hasMoreElements()){
            try{
                st=new StringTokenizer(br.readLine());
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInteger(){
        return Integer.parseInt(next());
    }

    public long nextLong(){
        return Long.valueOf(next());
    }
    public String nextLine(){
        String s="";
        try{
            s=br.readLine();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return s;
    }
}