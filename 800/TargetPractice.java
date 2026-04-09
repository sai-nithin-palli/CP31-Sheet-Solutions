import java.util.*;
import java.io.*;

public class TargetPractice{
    public static void main(String[] args){
        FastReader fr=new FastReader();
        Solution sol=new Solution();
        PrintWriter out=new PrintWriter(System.out);

        int t=fr.nextInt();

        while(t-- >0){
            int n=10;
            String[] arr=new String[10];

            for(int i=0;i<n;i++){
                String s=fr.nextLine();
                arr[i]=s;
            }
            sol.solve(n,arr,out);
        }
        out.close();
    }
}

class Solution{
    public void solve(int n,String[] arr,PrintWriter out) {
        int ans=0;
        for(int i=0;i<n;i++){
            String s1=arr[i];
            int idx1=i;
            if(i>=5){
                idx1=9-i;
            }
            for(int j=0;j<n;j++){
                if(s1.charAt(j)=='X'){

                    int idx2=j;
                    if(j>=5) idx2=9-j;
                    //out.println("i -->"+i+"  j--->"+j);
                    //out.println("idx1 -->"+idx1+"  idx2--->"+idx2+"  Math.min(idx1,idx2)--> "+Math.min(idx1,idx2));
                    ans+=Math.min(idx1,idx2)+1;
                }
            }
        }
        out.println(ans);
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