package appasp;

/**
 *
 * @author vinicius
 */

public class Quick {
    int conta = 0;
     public void quickSort(int[] vetor, int inicio, int fim) {
           
           if (inicio < fim) {
                    conta++; 
                    int posicaoPivo = separar(vetor, inicio, fim);
                    quickSort(vetor, inicio, posicaoPivo - 1);
                    quickSort(vetor, posicaoPivo + 1, fim);
                    
           }
           
       }
  
       public int separar(int[] vetor, int inicio, int fim) {
             
           int pivo = vetor[inicio];
             int i = inicio + 1, f = fim;
             while (i <= f) {
                    if (vetor[i] <= pivo){
                        conta++;
                           i++;
                    }else if (pivo < vetor[f]){
                        conta++;
                        f--;
                    }else {
                        conta++;
                           int troca = vetor[i];
                           vetor[i] = vetor[f];
                           vetor[f] = troca;
                           i++;
                           f--;
                    }
                    
                    
             }
             vetor[inicio] = vetor[f];
             vetor[f] = pivo;
             return f;
       }
       public void print(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
