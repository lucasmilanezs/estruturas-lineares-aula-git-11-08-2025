import java.util.Arrays;

public class vetor {
    private int[] elementos;
    private int tamanho;

    public vetor(int capacidade) {
        elementos = new int[capacidade];
        tamanho = 0;
    }

    public static void addElemento(int elemento) {
        if (tamanho == elementos.length) {
            int novaCap = Math.max(1, elementos.length * 2);
            elementos = Arrays.copyOf(elementos, novaCap);
        }
        elementos[tamanho++] = elemento;
    }

    public boolean remover(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == valor) {
                elementos[i] = 0;
                return true;
            }
        }
        return false;
    }

    public int getElemento(int index) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == index) {
                return elementos[i];
            }
        }
        return index;
    }

    public static int getTamanho() {
        return tamanho;
    };


}
