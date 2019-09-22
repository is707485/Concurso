import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.*;

/**
 *
 * @author Luis
 */
public class JavaApplication77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]x = {1,3,2};
        System.out.println(MoveCounter(x,x.length));
    }
    public static int MoveCounter(int[] x,int n){
        int moves=0;
        int[] notHash=new int[n];
        for(int c=0;c<x.length;c++){
            notHash[x[c]-1]=c+1;
        }
        int r=0;
        for(int c=0;c<notHash.length;c++){
            if(((notHash[c]+r)-(c+1))>0){
                moves+=(notHash[c]+r)-(c+1);
                r++;
            }
        }
        return moves;
    }
}
    
