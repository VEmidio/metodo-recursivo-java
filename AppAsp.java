package appasp;



import java.util.Random;

public class AppAsp {
    
    public static void main(String[] args) {
        Bubble bubble = new Bubble();
        Bucket bucket = new Bucket();
        Count count = new Count();
        Heap heap = new Heap();
        Insertion insertion = new Insertion();
        Quick quick = new Quick();
        Radix radix = new Radix();
        Selection selection = new Selection();
        Merge merge = new Merge();
        
        
//============================ vetor5================================


        int vetor5[] = new int[5];
        int auxVetor5[] = new int[vetor5.length];
        
        random(vetor5);
        
        quick.quickSort(vetor5, 0, vetor5.length-1);
        merge.mergeSort(vetor5, auxVetor5, 0, vetor5.length-1);
        heap.heapSort(vetor5);
        
        //radix.print(vetor5);
        System.out.println("============================");
        System.out.println("Número de trocas dos vetores \n" + 
                "com 5 posições: \n"+
        "Bubble:" + bubble.bubbleSort(vetor5)+"\n"+
        "Bucket: " + bucket.bucketsort(vetor5)+"\n"+
        "Count: " + count.ordena(vetor5)+"\n"+
        "Heap: " + heap.conta+"\n"+
        "Insertion: " + insertion.insertionSort(vetor5)+"\n"+
        "Quick:" + quick.conta+"\n"+ 
        "Radixquick: " + radix.radixSort(vetor5)+"\n"+
        "Selection: "+ selection.selectionSort(vetor5)+"\n"+
        "Merge: " + merge.conta );
        
        System.out.println("============================");
        System.out.println("");
        
       
//============================ vetor10================================
        
        
        int vetor10[] = new int[10];
        int auxVetor10[] = new int[vetor10.length];
        
        random(vetor10);
        
        quick.quickSort(vetor10, 0, vetor10.length-1);
        merge.mergeSort(vetor10, auxVetor10, 0, vetor10.length-1);
        heap.heapSort(vetor10);
        
        // radix.print(vetor10);
        System.out.println("============================");
        System.out.println("Número de trocas dos vetores \n" + 
                "com 10 posições: \n"+
        "Bubble:" + bubble.bubbleSort(vetor10)+"\n"+
        "Bucket: " + bucket.bucketsort(vetor10)+"\n"+
        "Count: " + count.ordena(vetor10)+"\n"+
        "Heap: " + heap.conta+"\n"+
        "Insertion: " + insertion.insertionSort(vetor10)+"\n"+
        "Quick:" + quick.conta+"\n"+
        "Radixquick: " + radix.radixSort(vetor10)+"\n"+
        "Selection: "+ selection.selectionSort(vetor10)+"\n"+
        "Merge: " + merge.conta );
        System.out.println("============================");
        System.out.println("");


//============================ vetor50================================


        int vetor50[] = new int[50];
        int auxVetor50[] = new int[vetor50.length];
        
        random(vetor50);
        
        quick.quickSort(vetor50, 0, vetor50.length-1);
        merge.mergeSort(vetor50, auxVetor50, 0, vetor50.length-1);
        heap.heapSort(vetor50);
        
        System.out.println("============================");
        System.out.println("Número de trocas dos vetores \n" + 
                "com 50 posições: \n"+
        "Bubble:" + bubble.bubbleSort(vetor50)+"\n"+
        "Bucket: " + bucket.bucketsort(vetor50)+"\n"+
        "Count: " + count.ordena(vetor50)+"\n"+
        "Heap: " + heap.conta+"\n"+
        "Insertion: " + insertion.insertionSort(vetor50)+"\n"+
        "Quick: " + quick.conta+"\n"+
        "Radixquick: " + radix.radixSort(vetor50)+"\n"+
        "Selection: "+ selection.selectionSort(vetor50)+"\n"+
        "Merge: " + merge.conta );
        System.out.println("============================");
        System.out.println("");
        

//============================ vetor100================================
        

        int vetor100[] = new int[100];
        int auxVetor100[] = new int[vetor100.length];
        
        random(vetor100);
        
        quick.quickSort(vetor100, 0, vetor100.length-1);
        merge.mergeSort(vetor100, auxVetor100, 0, vetor100.length-1);
        heap.heapSort(vetor100);
        
        System.out.println("============================");
        System.out.println("Número de trocas dos vetores \n" + 
                "com 100 posições: \n"+
        "Bubble:" + bubble.bubbleSort(vetor100)+"\n"+
        "Bucket: " + bucket.bucketsort(vetor100)+"\n"+
        "Count: " + count.ordena(vetor100)+"\n"+
        "Heap: " + heap.conta+"\n"+
        "Insertion: " + insertion.insertionSort(vetor100)+"\n"+
        "Quick: " + quick.conta+"\n"+
        "Radixquick: " + radix.radixSort(vetor100)+"\n"+
        "Selection: "+ selection.selectionSort(vetor100)+"\n"+
        "Merge: " + merge.conta );
        System.out.println("============================");
        System.out.println("");

//============================ vetor1000================================


        int vetor1000[] = new int[1000];
        int auxVetor1000[] = new int[vetor1000.length];
        
        random(vetor1000);
        
        quick.quickSort(vetor1000, 0, vetor1000.length-1);
        merge.mergeSort(vetor1000, auxVetor1000, 0, vetor1000.length-1);
        heap.heapSort(vetor1000);
        
        System.out.println("============================");
        System.out.println("Número de trocas dos vetores \n" + 
                "com 1000 posições: \n"+
        "Bubble:" + bubble.bubbleSort(vetor1000)+"\n"+
        "Bucket: " + bucket.bucketsort(vetor1000)+"\n"+
        "Count: " + count.ordena(vetor1000)+"\n"+
        "Heap: " + heap.conta+"\n"+
        "Insertion: " + insertion.insertionSort(vetor1000)+"\n"+
        "Quick: " + quick.conta+"\n"+
        "Radixquick: " + radix.radixSort(vetor1000)+"\n"+
        "Selection: "+ selection.selectionSort(vetor1000)+"\n"+
        "Merge: " + merge.conta );
        System.out.println("============================");
        System.out.println("");
        
        
//============================ vetor10000================================


        int vetor10000[] = new int[10000];
        int auxVetor10000[] = new int[vetor10000.length];
        
        random(vetor10000);
        
        quick.quickSort(vetor10000, 0, vetor10000.length-1);
        merge.mergeSort(vetor10000, auxVetor10000, 0, vetor10000.length-1);
        heap.heapSort(vetor10000);
        
        System.out.println("============================");
        System.out.println("Número de trocas dos vetores \n" + 
                "com 10000 posições: \n"+
        "Bubble:" + bubble.bubbleSort(vetor10000)+"\n"+
        "Bucket: " + bucket.bucketsort(vetor10000)+"\n"+
        "Count: " + count.ordena(vetor10000)+"\n"+
        "Heap: " + heap.conta+"\n"+
        "Insertion: " + insertion.insertionSort(vetor10000)+"\n"+
        "Quick: " + quick.conta+"\n"+
        "Radixquick: " + radix.radixSort(vetor10000)+"\n"+
        "Selection: "+ selection.selectionSort(vetor10000)+"\n"+
        "Merge: " + merge.conta );
        System.out.println("============================");
        System.out.println("");
        
    }
     public static int[] random(int[] v) {
        Random gerador = new Random();

        for (int i = 0; i < v.length;) {
            v[i] = gerador.nextInt(50000);
            i++;
        }

        return v;

    }
     
    
}
