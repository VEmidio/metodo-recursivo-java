package appasp;

public class Merge {
    static int conta = 0;
    public static int[] mergeSort(int vetor[], int[] aux, int inicio, int fim) {

        if (inicio < fim) {
            conta++;
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, aux, inicio, meio);
            mergeSort(vetor, aux, meio + 1, fim);
            intercalar(vetor, aux, inicio, meio, fim);
        }

        return vetor;
    }

    private static int intercalar(int[] vetor, int[] w, int inicio, int meio, int fim) {
        for (int k = inicio; k <= fim; k++) {
            w[k] = vetor[k];
           
        }
        int i = inicio;
        int j = meio + 1;
        for (int k = inicio; k <= fim; k++) {
            
            if (i > meio) {
                conta++;
                vetor[k] = w[j++];
            } else if (j > fim) {
//                conta++;
                vetor[k] = w[i++];
            } else if (w[i] < w[j]) {
  //              conta++;
                vetor[k] = w[i++];
            } else {
    //            conta++;
                vetor[k] = w[j++];
            }
        }
        return conta;
    }
    public void print(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
