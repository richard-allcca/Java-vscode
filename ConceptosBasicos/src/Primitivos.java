public class Primitivos {
   public static void main(String args[]) {
      /*
       * tipos primitivos enteros:
       * byte(8) maximo -128, maximo 127,
       * short(16) maximo -32768, maximo 32767,
       * int(32) maximo -2147483648, maximo 2147483647,
       * long(64) maximo -9223372036854775808, maximo 9223372036854775807,
       * float(32) maximo 3.4028235E38, minimo 1.4E-45,
       * double(64) maximo 1.7976931348623157E308, minimo 4.9E-324,
       * char(16) maximo 65535,
       * boolean(1) true o false,
       */

      // ? Tipos de datos y tamaños
      // https://docs.oracle.com/cd/E19253-01/819-6957/chp-typeopexpr-2/index.html

      System.out.println("Byte:");
      System.out.println("byte minimo: " + Byte.MIN_VALUE);
      System.out.println("byte maximo: " + Byte.MAX_VALUE);

      System.out.println("Short:");
      System.out.println("short minimo: " + Short.MIN_VALUE);
      System.out.println("short maximo: " + Short.MAX_VALUE);

      System.out.println("Integer:");
      System.out.println("int minimo: " + Integer.MIN_VALUE);
      System.out.println("int maximo: " + Integer.MAX_VALUE);

      System.out.println("Long:");
      System.out.println("long minimo: " + Long.MIN_VALUE);
      System.out.println("long maximo: " + Long.MAX_VALUE);

      System.out.println("Float:");
      System.out.println("float minimo: " + Float.MIN_VALUE);
      System.out.println("float maximo: " + Float.MAX_VALUE);

      System.out.println("Double:");
      System.out.println("double minimo: " + Double.MIN_VALUE);
      System.out.println("double maximo: " + Double.MAX_VALUE);

   }
}
