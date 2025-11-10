import java.util.*;
import java.io.*;

public class SequenceGame{
    public static void main(String[] args){
        Solution sol=new Solution();
        PrintWriter out=new PrintWriter(System.out);
        FastReader fr=new FastReader();

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
        StringBuilder sb=new StringBuilder();
        int cnt=1;
        sb.append(arr[0]);
        sb.append(" ");
        for(int i=1;i<arr.length;i++){
            sb.append(arr[i]);
            sb.append(" ");
            if(arr[i-1]>arr[i]){
                cnt++;
                sb.append(arr[i]);
                sb.append(" ");
            }

            cnt++;
        }
        out.println(cnt);
        sb.deleteCharAt(sb.length()-1);
        out.println(sb.toString());
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