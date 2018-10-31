package appasp;

/**
 *
 * @author vinicius
 */
public class Bucket {
    public int bucketsort(int[] a) {
         int conta = 0;
         int maxVal = maior(a);
         int [] bucket=new int[maxVal];
 
      for (int i=0; i<bucket.length; i++) {
         bucket[i]=0;
      }
 
      for (int i=0; i<a.length; i++) {
         bucket[a[i]]++;
      }
 
      int outPos=0;
      for (int i=0; i<bucket.length; i++) {
         for (int j=0; j<bucket[i]; j++) {
            a[outPos++]=i;
            conta++;
         }
      }
      return conta;
   }
     public static int maior(int [] vetor) {
        int maior =0;
        for (int i = 0; i <= vetor.length - 1; i++) {

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            
        }
        return maior + 1;
    }
     public void print(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
