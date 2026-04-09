import java.io.*;
import java.util.*;

public class UnitedWeStand{
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
        StringBuilder sbB=new StringBuilder();
        StringBuilder sbC=new StringBuilder();
        Arrays.sort(arr);

        if(arr[0]==arr[n-1]){
            out.println("-1");
        }
        else{
            sbB.append(arr[0]);
            sbB.append(" ");
            boolean flag=true;
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i-1] && flag){
                    sbB.append(arr[i]);
                    sbB.append(" ");
                }
                else{
                    flag=false;
                    sbC.append(arr[i]).append(" ");
                }
            }
           // sbB.deleteCharAt(sbB.length()-1);
            //sbC.deleteCharAt(sbC.length()-1);

            out.println(sbB.toString().split(" ").length+" "+sbC.toString().split(" ").length);
            out.println(sbB.toString());
            out.println(sbC.toString());
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