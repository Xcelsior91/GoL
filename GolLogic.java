public class GolLogic{
    int[][] field;
    int h,w;

    public GolLogic(int h, int w){
        this.h=h;
        this.w=w;
        field=new int[h][w];
        for(int i=0;i<h;i++){
	    for(int j=0;j<w;j++){
                field[i][j]=0;
            }
        }
    }

    public GolLogic(int[][] f){
        this.field=f;
        h=f.length;
        w=f[0].length;
    }
    
    public GolLogic(){
        new GolLogic(10,10);
    }

    private int countNeighbors(int c, int r){
        int n=0;
        if(c>0&&field[c-1][r]==1){
            n++;
        }
        if(c<w-1&&field[c+1][r]==1){
            n++;
        }
        if(r>0&&field[c][r-1]==1){
            n++;
        }
        if(r<h-1&&field[c][r+1]==1){
            n++;
        }
        
        return n;
    }
    
    private int simStepSingleCell(int c, int r){
        if(field[c][r]==1&&countNeighbors(c,r)!=3){
            return 0;
        }else if(field[c][r]==0&&countNeighbors(c,r)==3){
            return 1;
        }
    }
    
    private void simStepField(){
    	int[][] nField=new int[h][w];
    	for(int i=0; i<h;i++){
    	    for(int k=0;k<w;k++){
    	    	nField[i][k]=simStepSingleCell(k,i);
    	    }
    	}
    	field=nField;
    	
    }

}
