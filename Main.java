package Complejidad_203453_203720_203722;

public class Main {
  public static void main(String[] args) {
    Complejidad c = new Complejidad();

    int iteraciones = 20;
    int resultados[][] = new int[iteraciones][iteraciones];
    // int pantalla[][] = new int[36][36];

    // El acomodo de los for es para que las figuras al imprimirse no se dupliquen
    for (int espacios = 0; espacios <= 5; espacios++) {
      int n = (espacios + 1) * 1;
      resultados[espacios][0] = n;
      resultados[espacios][1] = c.cuadratica(n);
    }
    imprimir(resultados);

    for (int espacios = 0; espacios < iteraciones; espacios++) {// Se mantiene el anterior ciclo
      int n = (espacios + 1) * 1;
      resultados[espacios][0] = n;
      resultados[espacios][1] = c.lineal(n);
    }
    imprimir(resultados);

    for (int espacios = 0; espacios < iteraciones; espacios++) {// Se mantiene el anterior ciclo
      int n = (espacios + 1) * 100;
      resultados[espacios][0] = n;
      resultados[espacios][1] = c.log(n);
    }
    imprimir(resultados);

  }

  private static void imprimir(int[][] resultado) {
    int pantalla[][] = new int[36][36];
    /*
     * Se crea un objeto arreglo en el cual a tráves de un ciclo for se pasan los
     * datos que se encontraban en las filas a las columnas y de esta manera se
     * pueda logar mostrar una figura girada 90° grados a comparación de la figura
     * original
     */

    for (int espacios = 0; espacios < resultado.length; espacios++) {
      int cont = 0;// Variable que guardará los datos en la columna
      for (int veces = 0; veces < resultado[espacios][1]; veces++) {
        pantalla[espacios][cont] = 1;
        cont++;
      }
    }

    // Este ciclo es para mostrar los datos guardadosa en el anterior ciclo ya con
    // la forma de la figura buuscada

    for (int i = resultado.length - 1; i >= 0; i--) {// Filas
      for (int j = 0; j < resultado.length; j++) {// Columnas
        System.out.print(" ");
        if (pantalla[j][i] == 1) {// La condición es que sea igual a 1 ya que es el dato que se guardo en el
                                  // espacio en la linea 42 del código
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    System.out.println("\n\n");// Busca dar espacios entre las figuras
  }

}
