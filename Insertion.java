package appasp;

/**
 *
 * @author vinicius
 */
public class Insertion {
    public int insertionSort(int[] array) {
        int conta = 0;
        for (int i = 0; i < array.length; i++) {
            conta++;
            int a = array[i];          
            for (int j = i - 1; j >= 0 && array[j] > a; j--) {
                array[j + 1] = array[j];
                array[j] = a;
                
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
