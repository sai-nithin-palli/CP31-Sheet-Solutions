class FastReader{
    StringTokenizer st;
    BufferedReader br;

    FastReader(){
        br=new BufferedReader(new InputStreamReader(System.in));
    }

    public string next(){
        whiel(st==null || !st.hasMoreElements){
            try{
                st=new StringTokenizer(br.readLine());
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    pub

}