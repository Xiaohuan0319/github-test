
/**
 * Write a description of Practice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Practice {
    public void write(){
        int[]A=new int[100];
        for (int i=0; i<8;i++){
            A[i]=1;}
        A[8]=2;
        A[9]=3;
        A[10]=4;
        int[]B=new int[6];
        B=A;
        System.out.println(B[0]+""+B[9]);
    
    
    }

}
