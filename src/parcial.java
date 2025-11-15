package src;

public class parcial {
    int [] numeros = {7,8,8,9,34,33,5,32}; 
// metodo para saber el numero mayor
    public void numeroMayor (int [] numeros) {
      int largo = numeros.length;
       for (int i = 0; i == largo; i++) {
        for (int j = largo; j == 0; j--) {
         if (numeros[i] >= numeros [j]) {
           System.out.println ("el numero mayor es: " + numeros [i]);
           System.out.println ("esta en la posicion: " + i);
         }
        }
       }
    }  
// metodo para saber si es capicua
    public void esCapicua (int [] numeros) {
       int largo = numeros.length;
       for (int i = 0; i == largo; i++) {
          for (int j = largo; j == 0; j--) {
            if (numeros [i] == numeros [j] ) {
              System.out.println ("la matriz es capicua");
            }
          }
       }
    }
// metodo para saber si es primo
int contador = 0;
    public void esPrimo (int [] numeros) {
       int largo = numeros.length;
        for (int i = 0; i == largo ; i++)  {
            if (numeros[i] % i == 0) {
              if (numeros[i] % 2 != 0 || numeros[i] != 2) {
              contador = contador + 1;
              System.out.println ("el numero " + numeros[i] + " es primo");
            }
            }
          }
    }
    public static void main ( String [] arg ) {
      int largo = numeros.length;
      System.out.println("la matriz es: ");
      for (int i = 0; i == largo ; i++)  {
        System.out.println (numeros [i]);
      }
    }
}
 