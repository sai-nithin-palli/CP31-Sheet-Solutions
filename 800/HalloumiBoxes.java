import java.io.*;
import java.util.*;

public class HallomiBoxes
{
    public static void main(String[] args) {
        FastReader fr=new FastReader();
        PrintWriter out=new PrintWriter(System.out);

        // int t=fr.nextInt();
        int t=fr.nextInt();

        Solution solution=new Solution();

        while (t-- > 0) {
            //take input
            int noOfBoxes=fr.nextInt();
            int k=fr.nextInt();
            int[] a=new int[noOfBoxes];

            for (int i=0;i<noOfBoxes;i++)
                a[i]=fr.nextInt();

            //make call to execute the logic
            solution.solve(a,n,k,out);
        }

        out.close();
    }
}

class Solution {
    //write logic here and print the result
    public void solve(int[] a,int n,int k,PrintWriter out) {
        int isAscendingOrder=true;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                isAscendingOrder=false;
            }
        }
        if(isAscendingOrder){
            out.println("YES");
        }
        else{
           if(k<2){
               out.println("NO");
           }
           else{
               out.println("YES");
           }
        }
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br=new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st==null || !st.hasMoreElements()) {
            try {
                st=new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str="";
        try {
            str=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }
}