    
package ajedrez_carlosromero;

public class ColorTablero {
    
  public static final String FONDO_NEGRO = "\u001B[40m";
  
   public static final String FONDO_ROJO = "\u001B[41m";
 
   public static final String FONDO_VERDE = "\u001B[42m";

   public static final String FONDO_AMARILLO = "\u001B[43m";

   public static final String FONDO_AZUL = "\u001B[44m";

   public static final String FONDO_MORADO = "\u001B[45m";

   public static final String FONDO_CYAN = "\u001B[46m";
   
   public static final String FONDO_BLANCO = "\u001B[47m";
   
   public static final String LETRA_NEGRO = "\u001B[30m";
  
   public static final String LETRA_ROJO = "\u001B[31m";
 
   public static final String LETRA_VERDE = "\u001B[32m";

   public static final String LETRA_AMARILLO = "\u001B[33m";

   public static final String LETRA_AZUL = "\u001B[34m";

   public static final String LETRA_MORADO = "\u001B[35m";

   public static final String LETRA_CYAN = "\u001B[36m";
   
   public static final String LETRA_BLANCO = "\u001B[37m";
   
   public static final String RESET = "\u001B[0m";

   public static String getStringInColor(String color, String txt){
     return color+txt;
   }
}
