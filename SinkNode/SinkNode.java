public class SinkNode {
    public static void main(String []args){
        int Adj_Matrix[][]={
            {0,1,1,0,1},
            {0,0,0,1,0},
            {0,0,0,1,1},
            {0,0,0,0,0},
            {0,0,0,0,0}
        };
        int zero_count=0;
        int sink_count=0;
        for(int i=0;i<Adj_Matrix.length;i++){
            zero_count=0;
            for(int j=0;j<Adj_Matrix.length;j++){
                if(Adj_Matrix[i][j]==0){
                    zero_count++;
                }
            }
            if(zero_count==Adj_Matrix.length){
                System.out.println("Sink Node = "+ (char)(65+i));
                sink_count++;
            }
        }
        System.out.println("Number of sink nodes: "+sink_count);
    }
}
