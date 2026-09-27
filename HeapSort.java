public class HeapSort {

    public static void heapSort(int[] vetor) {

        int n = vetor.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(vetor, n, i);
        }

        for (int i = n - 1; i > 0; i--) {

            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;

            heapify(vetor, i, 0);
        }
    }

    public static void heapify(int[] vetor, int n, int i) {

        int maior = i;

        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && vetor[esquerda] > vetor[maior]) {
            maior = esquerda;
        }

        if (direita < n && vetor[direita] > vetor[maior]) {
            maior = direita;
        }

        if (maior != i) {

            int temp = vetor[i];
            vetor[i] = vetor[maior];
            vetor[maior] = temp;

            heapify(vetor, n, maior);
        }
    }

    public static void main(String[] args) {

        int[] vetor = {10, 3, 7, 1, 9, 4, 6};

        heapSort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
