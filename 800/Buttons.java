import java.io.*;
import java.util.*;

public class Buttons{
    public static void main(String[] args){
        Solution sol=new Solution();
        PrintWriter out=new PrintWriter(System.out);
        FastReader fr=new FastReader();

        int t=fr.nextInt();
        while(t-- >0){
            int n=3;
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
        int shareOfCtoAnna=(arr[2]/2)+(arr[2]%2);
        int ShareOfCtoKatie=arr[2]-shareOfCtoAnna;
        if(arr[0]+shareOfCtoAnna>arr[1]+ShareOfCtoKatie){
            out.println("First");
        }
        else{
            out.println("Second");
        }
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