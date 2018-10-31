package appasp;

 

/**
 *
 * @author vinicius
 */
public class Heap {
    int conta = 0;
      public void heapSort(int[] v) {
        
         buildMaxHeap(v);
        int n = v.length;

        for (int i = v.length - 1; i > 0; i--) {
            swap(v, i, 0);
            maxHeapify(v, 0, --n);
            
        }
        
    }

    public void buildMaxHeap(int[] v) {
        for (int i = v.length / 2 - 1; i >= 0; i--)
            maxHeapify(v, i, v.length);

    }

     public void maxHeapify(int[] vetor, int pos, int tamanhoDoVetor){
         

         int max = 2 * pos + 1, right = max + 1;  
         if (max < tamanhoDoVetor){  
             conta++;  

             if (right < tamanhoDoVetor && vetor[max] < vetor[right])  
                 max = right;

             if (vetor[max] > vetor[pos]){  
                 swap(vetor, max, pos);  
                 maxHeapify(vetor, max, tamanhoDoVetor);  
             }  
         }  
     }

    public static void swap(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }   
    public void print(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
