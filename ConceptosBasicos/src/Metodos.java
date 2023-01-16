
public class Metodos {
   /**
    * @param args
    */
   public static void main(String args[]) {

      // ================================================================
      // ? Conversion de tipos
      // ================================================================

      String cadena = "12";
      int cadena_a_num = Integer.parseInt(cadena);
      System.out.println("Numero: " + cadena_a_num);

      int num = 23;
      var num_a_cadena = Integer.toString(num);
      var num_a_cadena2 = String.valueOf(num);
      System.out.println("Numero a cadena: " + num_a_cadena);
      System.out.println("Numero a cadena dos: " + num_a_cadena2);

      var varCharDecimal = (char) 33;
      System.out.println("Tipo inferido int a decimal unicode" + varCharDecimal);
      // ================================================================
      // ? ver el tipo de dato de una variable
      // ================================================================

      System.out.println("Tipo de dato: " + ((Object) num_a_cadena).getClass().getSimpleName());
      System.out.println("Tipo de dato dos: " + ((Object) num_a_cadena2).getClass().getSimpleName());

      // ================================================================
      // ? Métodos de Cadenas
      // ================================================================

      // Obtener un caracter en una cadena
      var caracterDeCadena = "Hola mundo".charAt(2);
      System.out.println("Caracter: " + caracterDeCadena);

   }
}
