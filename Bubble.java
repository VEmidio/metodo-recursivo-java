package appasp;

public class Bubble {

    


    public int bubbleSort(int v[]) {
        int conta = 0;
        for (int i = v.length; i >= 1; i--) {
            
            for (int j = 1; j < i; j++) {
                conta++;
                if (v[j - 1] > v[j]) {
                    
                    int aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                    
                }
            }

        }
        
        return conta;
    }
   
}
