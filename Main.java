public class Main {
  public static void main(String[] args) {
      Complejidad c = new Complejidad();
      int ejecuciones = 20;
      int resultados[][] = new int[ejecuciones][ejecuciones];

      for (int renglon = 0; renglon < ejecuciones; renglon++) {
          int n = (renglon + 1) * 1;
          resultados[renglon][0] = n;
          resultados[renglon][1] = c.lineal(n);
      }
      imprimir(resultados);

      for (int renglon=0; renglon < ejecuciones; renglon++) {
          int n = (renglon + 1) *1; 
          resultados[renglon][0] = n;
          resultados[renglon][1] =c.cuadratica(n);
      } 
      imprimir(resultados);

      for (int renglon = 0; renglon < ejecuciones; renglon++) {
          int n = (renglon +1) * 100;
          resultados[renglon][0] = n;
          resultados[renglon][1] = c.log(n);
      }
      imprimir(resultados);
  }

   private static void imprimir(int[][] resultado) {
       for (int i = 0; i < resultado.length; i++) {
           for (int j = resultado[i][1]; j < resultado.length; j++) {
               System.out.print(" ");
           }
           for (int k = 0; k < resultado[i][1]; k++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
}