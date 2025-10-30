import java.util.*;
import java.io.*;



public class CoverInWater{
    public static void main(String[] args){
        FastReader fr=new FastReader();
        PrintWriter out=new PrintWriter(System.out);

        int t=fr.nextInt();
        Solution sol=new Solution();

        while(t-- >0){
            int n=fr.nextInt();
            String s=fr.nextLine();
            sol.solve(n,s,out);
        }
        out.close();

    }
}

class Solution{
    public void solve(int n,String s,PrintWriter out){
        int c=0;
        int ans=0;

        for(int i=0;i<n;i++) {
            if (s.charAt(i) == '.') {
                c++;
            } else {
                if(c>=3){
                    ans=2;
                    c=0;
                    break;
                }
                ans+=addC(c);
                c = 0;
            }
        }
        if(c>=3){
            ans=2;
            c=0;
        }
        ans+=addC(c);
        out.println(ans);
    }

    public int addC(int c){
        if (c <= 1) {
            return c;
        }
        return 2;
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
                this.st=new StringTokenizer(this.br.readLine());
            }
            catch (IOException e){
                e.printStackTrace();
            }

        }
        return this.st.nextToken();
    }

    public int nextInt(){
        return Integer.parseInt(this.next());
    }

    public double nextDouble(){
        return Double.parseDouble(this.next());
    }

    public long nextLong(){
        return Long.parseLong(this.next());
    }

    public String nextLine(){
        String str="";

        try{
            str=br.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return str;
    }
}