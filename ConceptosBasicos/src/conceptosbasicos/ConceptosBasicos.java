package conceptosbasicos;

public class ConceptosBasicos {
   public static void main(String args[]) {

      String varBoolean = "12";

      int conversion = Integer.parseInt(varBoolean);

      System.out.println("Conversion: " + conversion);

      if (varBoolean == "") {
         System.out.println("True");
      } else {
         System.out.println("False");
      }

   }
}