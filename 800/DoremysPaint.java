import java.util.*;
import java.io.*;

public class DoremysPaint{
    public static void main(String[] args){
        FastReader fr=new FastReader();
        Solution sol=new Solution();
        PrintWriter out=new PrintWriter(System.out);

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
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.putIfAbsent(arr[i],0);
            hm.put(arr[i],hm.get(arr[i])+1);
            if(hm.size()>2){
                out.println("No");
                return;
            }
        }

        int[] count=new int[2];
        int idx=0;
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            count[idx++]=e.getValue();
        }
        if(Math.abs(count[0]-count[1])>1){
            if(hm.size()==1){
                out.println("Yes");
            }
            else out.println("No");
            return;
        }
        out.println("Yes");
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