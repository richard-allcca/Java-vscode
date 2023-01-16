
public class Cadenas {
   /**
    * @param args
    */
   public static void main(String args[]) {

      // ================================================================
      // "Char" Se puede usar caracter normal pero támbien "unicode" y "decimales"
      // ================================================================

      // NOTE - estos ejemplos imprimen el "!" en 3 formatos, para un solo caracter
      // usa commilas simples

      char caracter = '!';
      System.out.println("Caracter: " + caracter);

      // con código Unicode
      char varChar = '\u0021';
      System.out.println("Caracter Unicode: " + varChar);

      // con su valor decimal
      char varCharDecimal = 33;
      System.out.println("Código decimal: " + varCharDecimal);

   }
}
