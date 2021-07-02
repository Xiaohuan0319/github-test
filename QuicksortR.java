
/**
 * Write a description of QuicksortR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuicksortR {

    public  int[]A;
    public int size;


    public int partition( int[]A, int p, int r){

        int x=A[r];
        int i=p-1;

        for(int j=p; j<r; j++){
            if (A[j]<=x){
                i++;
                int t=A[i];
                A[i]=A[j];
                A[j]=t;
            }
        }
        int k=A[i+1];
        A[i+1]=A[r];
        A[r]=k;
        return i+1;
    }

    public void sort(int []A, int p, int r){

        if(p<r)

            {
                int q=partition(A, p, r);
                sort(A, p, q-1);
                sort(A,q+1, r);

            }

    }
    public String zerofill(int number, int length){
        String result =String.valueOf(number);
        int pad=length-result.length();
        while( pad>0)
            {result='0'+result;
                pad--;}
        return result;
    }}

}