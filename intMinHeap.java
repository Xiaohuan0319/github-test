
/**
 * Write a description of intMinHeap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.*;
import java.util.Collections.*;

public class intMinHeap {
    private int cap;
    private int []A;
    private int size;
    private int right(int i){
        return 2*i+2;}
    private int left(int i){
        return 2*i+1;}
    private int parent(int i){
        return (i-1)/2;}
        

    public intMinHeap(int cap){
     this.cap=cap;
     A=new int[this.cap];
     size=0;}
     
    public void swap(int i, int k){
        int t=A[i];
        A[i]=A[k];
        A[k]=t;}
        
     
  private int minOf3(int i, int j, int s){
        int min=Integer.MAX_VALUE;
       
        if(i>=0&&i<=size-1)
        { min=Math.min(A[i],min);}
        if(j>=0&&j<=size-1)
        {min=Math.min(A[j],min);}
         if(s>=0&&s<=size-1)
         {min=Math.min(A[s],min);}
         if(min==A[i])
         return i;
         else if(min==A[j])
         return j;
         else if(min==A[s])
         return s;
         else{
          System.out.println("Out of Bound");
             return 0;}
    }
    


    public void Heapify(int p){
        System.out.println("ify"+p);
      
        int n=minOf3(p,left(p),right(p));
        
            if(p==n)
            return;
            else
            {swap(p,n);
            Heapify(n);}
	}


    
private void buildHeap(int[]A){
        for (int i=size/2-1;i>=0;i--)
        {Heapify(i);}
    }
        
public int[] Heapsort(){
        int sizeP=size;
        int[]temp=new int[size];
        int[]sorted=new int [cap];
        sorted=A;
    for (int i=0; i<=size-1; i++)
        {temp[i]=A[i];}
        A=temp;
        
    for(int k=size-1; k>0;k--)
    { swap(0,k);
        size--;
        Heapify(0);
    }
    size=sizeP;
     temp=A;
     A=sorted;
     return temp;
    }
        
    public void decreasekey (int i, int k){
        if(A[i]>=k)
         {A[i]=k;}
        while(i>0&&A[parent(i)]>A[i])
        {swap(i,parent(i));
            i=parent(i);}
        }
        
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==cap;}
        
    public boolean Heapinsert(int k){
        
        if (isFull())
        {return false; }
        else {
           
            size=size+1;
            A[size-1]=k+1;
            decreasekey(size-1,k);
            return true;
        }
       
    }

    public int minimum (){
        if(!isEmpty())
        return A[0];
        else 
        {return 0;}
    }
    public int extractMin(){
       if(!isEmpty()){
       int min=A[0];
       A[0]=A[size-1];
       size--;
       Heapify(0);
       return min;}
       else 
       {return 0;}
     }   
     
    public String toString()
          {String s="heap size"+" "+size+":";
           for (int i=0; i<size-1;i++)
            {s=s +A[i]+",";}
            s=s+A[size-1];
            return s;
            }
      public void print(int[]temp){
          System.out.println("sorted array :"+Arrays.toString(temp));
        }
          
    
    public void main(){
        intMinHeap H=new intMinHeap(240000);
        import
        if(key>0){
        if(H.Heapinsert(key)==true)
        System.out.println("insert"+ " "+key);}
        if(key==0)
        {
         System.out.println(H.toString());
        }
        if (key==-1)
         {int min=H.extractMin();
         System.out.println("The min is"+" "+min);
        }
        if(key==-2){
        
        H.print(H.Heapsort());
        }     
        
}
}
}

