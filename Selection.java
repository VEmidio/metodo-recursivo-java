package appasp;

public class Selection {

    public int selectionSort(int[] v) {
        int conta = 0;
        int i, j;
        int min, temp;
        for (i = 0; i < v.length - 1; i++) {
            min = i;
            for (j = i + 1; j < v.length; j++) {
                if (v[j] < v[min]) {
                    min = j;
                }
                conta++;
            }
            temp = v[i];
            v[i] = v[min];
            v[min] = temp;
            

        }
        return conta;
    }

    public void print(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
