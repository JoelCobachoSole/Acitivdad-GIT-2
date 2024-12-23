package actividad2;

public class matriz_inicial {

	public static void main(String[] args) {
		Random random = new Random();
        int[][] matriz = new int[5][5];

        // Generar la matriz de números aleatorios
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        // Mostrar la matriz en la consola
        System.out.println("Matriz generada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "");
            }
            System.out.println();
        }
    }
}
