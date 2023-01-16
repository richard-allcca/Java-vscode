
import java.util.Scanner;

public class Notas {
   public static void main(String args[]) {

      // ================================================================
      // SECTION - Tipos Primitivos
      // ================================================================
      int entero = 10;
      String cadena = "cadena";

      System.out.println(entero);
      System.out.println(cadena);

      // ================================================================
      // SECTION - Var: Inferencia de tipos en Java (Auto-Tipo) usando var
      // ================================================================

      var inferenciaCadena = "cadena de inferencia";
      var inferenciaEntero = 20;

      System.out.println("inferencia de String con var: " + inferenciaCadena);
      System.out.println("Inferencia de int con var: " + inferenciaEntero);

      // ================================================================
      // SECTION - Concatenación de cadenas
      // ================================================================

      var usuario = "Richard";
      var password = " contraseña";
      var unionDeCadenas = "Unión de cadenas" + usuario + password;

      System.out.println(unionDeCadenas);

      // ================================================================
      // SECTION - Caracteres especiales
      // ================================================================

      var caracterEspecial = "salto de linea \n";
      var tabulador = "Tabulador";
      var retroceso = "Retroceso";
      var escapeCaracter = "Comillas simples";

      System.out.println("Nueva linea: \n" + caracterEspecial);
      System.out.println("Tabulador: \t" + tabulador);
      System.out.println("Retroceso: \b" + retroceso);
      System.out.println("Escape de comillas: \'" + escapeCaracter + "\'");

      // ================================================================
      // SECTION - Scanner (importar la clase Scanner) puede reutilizarse
      // ================================================================
      // se puede leer la consola con todos los tipos de datos disponibles

      System.out.println("Ingresa un nombre para tu usuario");
      Scanner consola = new Scanner(System.in);
      var nombreUsuario = consola.nextLine();// nextLine() lee una cadena de texto ingresada por teclado
      // var nombreUsuario = consola.nextInt();// nextInt() lee un entero ingresado

      System.out.println("Bienvenid@: " + nombreUsuario);
   }
}
