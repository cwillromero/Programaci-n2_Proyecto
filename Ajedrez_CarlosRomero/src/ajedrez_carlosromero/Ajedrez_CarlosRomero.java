
package ajedrez_carlosromero;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ajedrez_CarlosRomero {
    static Object[][] tablero=new Object[10][10];
    static ArrayList<Piezas> piezas=new ArrayList();
    static Peones Peon=new Peones();
    static Torres Torre=new Torres();
    static Caballos Caballo=new Caballos();
    static Alfiles Alfil=new Alfiles();
    static Reina Reina=new Reina();
    static Rey Rey=new Rey();
    static Icono I=new Icono();
    public static void main(String[] args) {
        I.Bienvenido();
        String Gana="";
        TableroOriginal();
//        tablero[4][1]="♚";
//        tablero[6][6]="♚";
//       
//        tablero[8][5]="♝";
        Impresion(tablero,tablero.length-1,0);
        while (!Gana.equals("JAQUEMATE")) {
            try{
            if(Jaquemate()==true){
             break;
             }
            System.out.println(ColorTablero.FONDO_VERDE+ColorTablero.LETRA_BLANCO+"Turno Piezas Blancas:"
            +ColorTablero.RESET);
             MovimientoBlanco();
            if(Jaquemate()==true){
            break;
            }
            System.out.println(ColorTablero.FONDO_ROJO+ColorTablero.LETRA_BLANCO+"Turno Piezas Negras:"
            +ColorTablero.RESET);
            MovimientoNegro();
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error!", "Error", 0);
            }
            
        }
        I.Fin();
    }
    
    public static void TableroOriginal(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                //Peones Negros
            piezas.add(new Peones("♙",2,1)); tablero[2][1]=((Peones)piezas.get(piezas.size()-1)).getNombre(); 
            piezas.add(new Peones("♙",2,2)); tablero[2][2]=((Peones)piezas.get(piezas.size()-1)).getNombre();  
            piezas.add(new Peones("♙",2,3)); tablero[2][3]=((Peones)piezas.get(piezas.size()-1)).getNombre();  
            piezas.add(new Peones("♙",2,4)); tablero[2][4]=((Peones)piezas.get(piezas.size()-1)).getNombre();  
            piezas.add(new Peones("♙",2,5)); tablero[2][5]=((Peones)piezas.get(piezas.size()-1)).getNombre(); 
            piezas.add(new Peones("♙",2,6)); tablero[2][6]=((Peones)piezas.get(piezas.size()-1)).getNombre();  
            piezas.add(new Peones("♙",2,7)); tablero[2][7]=((Peones)piezas.get(piezas.size()-1)).getNombre();  
            piezas.add(new Peones("♙",2,8)); tablero[2][8]=((Peones)piezas.get(piezas.size()-1)).getNombre(); 
            //Peones Blancos
            piezas.add(new Peones("♟",7,1)); tablero[7][1]=((Peones)piezas.get(piezas.size()-1)).getNombre();  
            piezas.add(new Peones("♟",7,2)); tablero[7][2]=((Peones)piezas.get(piezas.size()-1)).getNombre(); 
            piezas.add(new Peones("♟",7,3)); tablero[7][3]=((Peones)piezas.get(piezas.size()-1)).getNombre();  
            piezas.add(new Peones("♟",7,4)); tablero[7][4]=((Peones)piezas.get(piezas.size()-1)).getNombre(); 
            piezas.add(new Peones("♟",7,5)); tablero[7][5]=((Peones)piezas.get(piezas.size()-1)).getNombre();  
            piezas.add(new Peones("♟",7,6)); tablero[7][6]=((Peones)piezas.get(piezas.size()-1)).getNombre(); 
            piezas.add(new Peones("♟",7,7)); tablero[7][7]=((Peones)piezas.get(piezas.size()-1)).getNombre(); 
            piezas.add(new Peones("♟",7,8)); tablero[7][8]=((Peones)piezas.get(piezas.size()-1)).getNombre(); 
            //Torres Blancas
            piezas.add(new Torres("♖",1,1)); tablero[1][1]=((Torres)piezas.get(piezas.size()-1)).getNombre(); 
            piezas.add(new Torres("♖",1,8)); tablero[1][8]=((Torres)piezas.get(piezas.size()-1)).getNombre(); 
            //Torres Negras
            piezas.add(new Torres("♜",8,1)); tablero[8][1]=((Torres)piezas.get(piezas.size()-1)).getNombre(); 
            piezas.add(new Torres("♜",8,8)); tablero[8][8]=((Torres)piezas.get(piezas.size()-1)).getNombre();
            //Rey y Reina Blanco
            piezas.add(new Rey("♔",1,5)); tablero[1][5]=((Rey)piezas.get(piezas.size()-1)).getNombre();
            piezas.add(new Reina("♕",1,4)); tablero[1][4]=((Reina)piezas.get(piezas.size()-1)).getNombre();
            //Rey y Reina Negro
            piezas.add(new Rey("♚",8,5)); tablero[8][5]=((Rey)piezas.get(piezas.size()-1)).getNombre();
            piezas.add(new Reina("♛",8,4)); tablero[8][4]=((Reina)piezas.get(piezas.size()-1)).getNombre();
            //Caballos Blancos
            piezas.add(new Caballos("♘",1,2)); tablero[1][2]=((Caballos)piezas.get(piezas.size()-1)).getNombre(); 
            piezas.add(new Caballos("♘",1,7)); tablero[1][7]=((Caballos)piezas.get(piezas.size()-1)).getNombre();
            //Caballos Negros
            piezas.add(new Caballos("♞",8,2)); tablero[8][2]=((Caballos)piezas.get(piezas.size()-1)).getNombre(); 
            piezas.add(new Caballos("♞",8,7)); tablero[8][7]=((Caballos)piezas.get(piezas.size()-1)).getNombre();
            //Alfiles Blancos
            piezas.add(new Alfiles("♗",1,3)); tablero[1][3]=((Alfiles)piezas.get(piezas.size()-1)).getNombre();  
            piezas.add(new Alfiles("♗",1,6)); tablero[1][6]=((Alfiles)piezas.get(piezas.size()-1)).getNombre();  
            //Alfiles Negros
            piezas.add(new Alfiles("♝",8,3)); tablero[8][3]=((Alfiles)piezas.get(piezas.size()-1)).getNombre(); 
            piezas.add(new Alfiles("♝",8,6)); tablero[8][6]=((Alfiles)piezas.get(piezas.size()-1)).getNombre(); 
                if(i==0 || i==(tablero.length-1)){
                    tablero[i][9]="";
                    tablero[i][8]="❘🅷";
                    tablero[i][7]="❘🅶";
                    tablero[i][6]="❘🅵";
                    tablero[i][5]="❘🅴";
                    tablero[i][4]="❘🅳";
                    tablero[i][3]="❘🅲";
                    tablero[i][2]="❘🅱";
                    tablero[i][1]="❘🅰";
                    tablero[i][0]="";

                }else if ((j==0 || j==(tablero.length-1))) {
                    tablero[i][j]=""+i;
                }else{
                    tablero[i][j]=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO;
                }
            }
        }
    }
    
    public static void Impresion(Object t[][], int filas, int columnas){
        String X=ColorTablero.getStringInColor(ColorTablero.FONDO_CYAN, ""+t[filas][columnas]);
        //Este String se imprime de un color dado 
        if (filas == 0 && columnas == t.length-1) {
            //Evalucion de la fila 0 y columna 0
            if (((filas%2==0 && columnas%2==0) || (filas%2!=0 && columnas%2!=0)) && ((columnas>0 && columnas<9) && (filas>0 && filas<9))) {
                System.out.println(X+" \u001B[0m");
            }else{
            System.out.println( t[filas][columnas] +" ");
            }
            System.out.println("");
        } else {
            if (columnas == t.length-1) {   
                if (((filas%2!=0 && columnas%2!=0) || (filas%2==0 && columnas%2==0)) && ((columnas>0 && columnas<9) && (filas>0 && filas<9))) {
                System.out.println(X+" \u001B[0m");
                }else{
                System.out.println( t[filas][columnas] +" ");
                } 
                Impresion(t, filas-1, 0);
            } else {
                if (((filas%2!=0 && columnas%2!=0) || (filas%2==0 && columnas%2==0)) && ((columnas>0 && columnas<9) && (filas>0 && filas<9))) {
                System.out.print(X+" \u001B[0m");
                }else{
                System.out.print( t[filas][columnas] +" ");
                } 
                Impresion(t, filas, columnas+1);
            }
        }      
    }
    
    public static boolean MovimientoBlanco(){
        boolean Valido=false;
        String pieza="";
        String col="";
        int columna=0;
        int fila=0;
        while(Valido==false){
            String Posicion=JOptionPane.showInputDialog("Turno Piezas Blancas.\nIngrese la posición de la pieza:","2,A");
            while(Posicion.length()!=3 || (Posicion.charAt(1)!=',') || (Posicion.charAt(0)!='1' && Posicion.charAt(0)!='2'
                    && Posicion.charAt(0)!='3' && Posicion.charAt(0)!='4' && Posicion.charAt(0)!='5'
                    && Posicion.charAt(0)!='6' && Posicion.charAt(0)!='7' && Posicion.charAt(0)!='8'
                    && Posicion.charAt(0)!='8') || ((Posicion.charAt(2)!='A' && Posicion.charAt(2)!='a') 
                    && (Posicion.charAt(2)!='B' && Posicion.charAt(2)!='b') 
                    && (Posicion.charAt(2)!='C' && Posicion.charAt(2)!='c')
                    && (Posicion.charAt(2)!='D' && Posicion.charAt(2)!='d')
                    && (Posicion.charAt(2)!='E' && Posicion.charAt(2)!='e')
                    && (Posicion.charAt(2)!='F' && Posicion.charAt(2)!='f')
                    && (Posicion.charAt(2)!='G' && Posicion.charAt(2)!='g')
                    && (Posicion.charAt(2)!='H' && Posicion.charAt(2)!='h'))){
                Posicion=JOptionPane.showInputDialog("Dato Incorrecto!\nTurno Piezas Blancas.\nIngrese la posición de la pieza:","2,A");
            }
            String[] Pos=Posicion.split(",");        
            fila=Integer.parseInt(Pos[0]); 
            col=Pos[1];
            if(Pos[1].equals("A") || Pos[1].equals("a")){
                columna=1;
            }else if(Pos[1].equals("B") || Pos[1].equals("b")){
               columna=2;
            }else if(Pos[1].equals("C") || Pos[1].equals("c")){
               columna=3;
            }else if(Pos[1].equals("D") || Pos[1].equals("d")){
               columna=4;
            }else if(Pos[1].equals("E") || Pos[1].equals("e")){
               columna=5;
            }else if(Pos[1].equals("F") || Pos[1].equals("f")){
               columna=6;
            }else if(Pos[1].equals("G") || Pos[1].equals("g")){
               columna=7;
            }else if(Pos[1].equals("H") || Pos[1].equals("h")){
               columna=8;
            }
            if(tablero[fila][columna].equals("♙")){
               Valido=true;  
               pieza="♙ Peón";
            }else if(tablero[fila][columna].equals("♖")){
                Valido=true; 
                pieza="♖ Torre";
            }else if(tablero[fila][columna].equals("♘")){
                Valido=true; 
                pieza="♘ Caballo";
            }else if(tablero[fila][columna].equals("♗")){
                Valido=true; 
                pieza="♗ Alfil";
            }else if(tablero[fila][columna].equals("♕")){
                Valido=true;
                pieza="♕ Reina";
            }else if (tablero[fila][columna].equals("♔")){
                Valido=true; 
                pieza="♔ Rey";
            }else{
                JOptionPane.showMessageDialog(null, "En esa Posición no hay Ninguna Pieza Blanca!  ", "Movimiento Inválido", 0);                
            }
        }
        boolean T = RodeadoBlanco(pieza,fila,columna);
        if(T==false){
         JOptionPane.showMessageDialog(null, "Esa Pieza no se puede mover!!  ", "Movimiento Inválido", 0); 
         MovimientoBlanco();
         return false;
        }
        System.out.println("Posición elegida: " +fila+","+col);
        System.out.println("Pieza Elegida: "+pieza);
        
        //Nueva Posicion
        boolean Valido2=false;
        String pieza2="";
        String col2="";
        int columna2=0;
        int fila2=0;
        while(Valido2==false){
            String Posicion2=JOptionPane.showInputDialog("Turno Piezas Blancas.\nIngrese la nueva posición de la pieza:","3,A");
            while(Posicion2.length()!=3 || (Posicion2.charAt(1)!=',') || (Posicion2.charAt(0)!='1' && Posicion2.charAt(0)!='2'
                    && Posicion2.charAt(0)!='3' && Posicion2.charAt(0)!='4' && Posicion2.charAt(0)!='5'
                    && Posicion2.charAt(0)!='6' && Posicion2.charAt(0)!='7' && Posicion2.charAt(0)!='8'
                    && Posicion2.charAt(0)!='8') || ((Posicion2.charAt(2)!='A' && Posicion2.charAt(2)!='a') 
                    && (Posicion2.charAt(2)!='B' && Posicion2.charAt(2)!='b') 
                    && (Posicion2.charAt(2)!='C' && Posicion2.charAt(2)!='c')
                    && (Posicion2.charAt(2)!='D' && Posicion2.charAt(2)!='d')
                    && (Posicion2.charAt(2)!='E' && Posicion2.charAt(2)!='e')
                    && (Posicion2.charAt(2)!='F' && Posicion2.charAt(2)!='f')
                    && (Posicion2.charAt(2)!='G' && Posicion2.charAt(2)!='g')
                    && (Posicion2.charAt(2)!='H' && Posicion2.charAt(2)!='h'))){
                Posicion2=JOptionPane.showInputDialog("Dato Incorrecto!\nTurno Piezas Blancas.\nIngrese la nueva posición de la pieza:","3,A");
            }
            String[] Pos2=Posicion2.split(",");        
            fila2=Integer.parseInt(Pos2[0]); 
            col2=Pos2[1];
            if(Pos2[1].equals("A") || Pos2[1].equals("a")){
                columna2=1;
            }else if(Pos2[1].equals("B") || Pos2[1].equals("b")){
               columna2=2;
            }else if(Pos2[1].equals("C") || Pos2[1].equals("c")){
               columna2=3;
            }else if(Pos2[1].equals("D") || Pos2[1].equals("d")){
               columna2=4;
            }else if(Pos2[1].equals("E") || Pos2[1].equals("e")){
               columna2=5;
            }else if(Pos2[1].equals("F") || Pos2[1].equals("f")){
               columna2=6;
            }else if(Pos2[1].equals("G") || Pos2[1].equals("g")){
               columna2=7;
            }else if(Pos2[1].equals("H") || Pos2[1].equals("h")){
               columna2=8;
            }
            Valido2=true;
            //-----------------------------------PIEZAS MOVIMINETOS!------------------------------------
            //Peon
            if(tablero[fila][columna]=="♙"){
                boolean c=Peon.ValidaciondeMovimiento("♙", fila, columna, fila2, columna2, tablero);
                if(c==true)
                Valido2=true;
                else
                Valido2=false;
            }
            //Torre
            if(tablero[fila][columna]=="♖"){
                boolean c=Torre.ValidaciondeMovimiento("♖", fila, columna, fila2, columna2, tablero);
                if(c==true)
                Valido2=true;
                else
                Valido2=false;
            }
            //Rey
            if(tablero[fila][columna]=="♔"){
                boolean c=Rey.ValidaciondeMovimiento("♔", fila, columna, fila2, columna2, tablero);
                if(c==true)
                Valido2=true;
                else
                Valido2=false;
            }
            //Alfil
            if(tablero[fila][columna]=="♗"){
                boolean c=Alfil.ValidaciondeMovimiento("♗", fila, columna, fila2, columna2, tablero);
                if(c==true)
                Valido2=true;
                else
                Valido2=false;
            }
            //Reina
            if(tablero[fila][columna]=="♕"){
                boolean c=Reina.ValidaciondeMovimiento("♕", fila, columna, fila2, columna2, tablero);
                if(c==true)
                Valido2=true;
                else
                Valido2=false;
            }
            //Caballo
            if(tablero[fila][columna]=="♘"){
                boolean c=Caballo.ValidaciondeMovimiento("♘", fila, columna, fila2, columna2, tablero);
                if(c==true)
                Valido2=true;
                else
                Valido2=false;
            }
            if(Valido2==false)
                JOptionPane.showMessageDialog(null, "No se Puede Mover Pieza Blanca!  ", "Movimiento Inválido", 0); 
        }
        tablero[fila2][columna2]=tablero[fila][columna];
        tablero[fila][columna]= ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO;
        System.out.println(pieza + " se movió a: " + fila2+","+col2);
        System.out.println("");
        for (int i = 1; i < 9; i++) {
            if(tablero[8][i].equals("♙")){
            I.Corona();
            Coronar("♙",8,i);
           }
        }
        JaqueBlanco();
        Impresion(tablero,tablero.length-1,0);
        return true;
    }
    
    public static boolean MovimientoNegro(){
        boolean Valido=false;
        String pieza = "";
        String col="";
        int columna=0;
        int fila=0;
        while(Valido==false){
            String Posicion=JOptionPane.showInputDialog("Turno Piezas Negras.\nIngrese la posición de la pieza:","7,A");
            while(Posicion.length()!=3 || (Posicion.charAt(1)!=',') || (Posicion.charAt(0)!='1' && Posicion.charAt(0)!='2'
                    && Posicion.charAt(0)!='3' && Posicion.charAt(0)!='4' && Posicion.charAt(0)!='5'
                    && Posicion.charAt(0)!='6' && Posicion.charAt(0)!='7' && Posicion.charAt(0)!='8'
                    && Posicion.charAt(0)!='8') || ((Posicion.charAt(2)!='A' && Posicion.charAt(2)!='a') 
                    && (Posicion.charAt(2)!='B' && Posicion.charAt(2)!='b') 
                    && (Posicion.charAt(2)!='C' && Posicion.charAt(2)!='c')
                    && (Posicion.charAt(2)!='D' && Posicion.charAt(2)!='d')
                    && (Posicion.charAt(2)!='E' && Posicion.charAt(2)!='e')
                    && (Posicion.charAt(2)!='F' && Posicion.charAt(2)!='f')
                    && (Posicion.charAt(2)!='G' && Posicion.charAt(2)!='g')
                    && (Posicion.charAt(2)!='H' && Posicion.charAt(2)!='h'))){
                Posicion=JOptionPane.showInputDialog("Dato Incorrecto!\nTurno Piezas Negras.\nIngrese la posición de la pieza:","7,A");
            }
            String[] Pos=Posicion.split(",");        
            fila=Integer.parseInt(Pos[0]); 
            col=Pos[1];
            if(Pos[1].equals("A") || Pos[1].equals("a")){
                columna=1;
            }else if(Pos[1].equals("B") || Pos[1].equals("b")){
               columna=2;
            }else if(Pos[1].equals("C") || Pos[1].equals("c")){
               columna=3;
            }else if(Pos[1].equals("D") || Pos[1].equals("d")){
               columna=4;
            }else if(Pos[1].equals("E") || Pos[1].equals("e")){
               columna=5;
            }else if(Pos[1].equals("F") || Pos[1].equals("f")){
               columna=6;
            }else if(Pos[1].equals("G") || Pos[1].equals("g")){
               columna=7;
            }else if(Pos[1].equals("H") || Pos[1].equals("h")){
               columna=8;
            }
            if(tablero[fila][columna].equals("♟")){
               Valido=true;  
               pieza="♟ Peón";
            }else if(tablero[fila][columna].equals("♜")){
                Valido=true; 
                pieza="♜ Torre";
            }else if(tablero[fila][columna].equals("♞")){
                Valido=true; 
                pieza="♞ Caballo";
            }else if(tablero[fila][columna].equals("♝")){
                Valido=true; 
                pieza="♝ Alfil";
            }else if(tablero[fila][columna].equals("♛")){
                Valido=true;
                pieza="♛ Reina";
            }else if (tablero[fila][columna].equals("♚")){
                Valido=true; 
                pieza="♚ Rey";
            }else{
                JOptionPane.showMessageDialog(null, "En esa Posición no hay Ninguna Pieza Negra!  ", "Movimiento Inválido", 0);                
            }
        }       
        //______________________________________Para ver Si está rodeado_______________________
        boolean T = RodeadoNegro(pieza,fila,columna);
        if(T==false){
         JOptionPane.showMessageDialog(null, "Esa Pieza no se puede mover!!  ", "Movimiento Inválido", 0); 
         MovimientoNegro();
         return false;
        }
        System.out.println("Posición Elegida: " +fila+","+col);
        System.out.println("Pieza Elegida: "+pieza);
        //Nueva Posicion
        boolean Valido2=false;
        String pieza2="";
        String col2="";
        int columna2=0;
        int fila2=0;
        while(Valido2==false){
            String Posicion2=JOptionPane.showInputDialog("Turno Piezas Negras.\nIngrese la nueva posición de la pieza:","6,A");
            while(Posicion2.length()!=3 || (Posicion2.charAt(1)!=',') || (Posicion2.charAt(0)!='1' && Posicion2.charAt(0)!='2'
                    && Posicion2.charAt(0)!='3' && Posicion2.charAt(0)!='4' && Posicion2.charAt(0)!='5'
                    && Posicion2.charAt(0)!='6' && Posicion2.charAt(0)!='7' && Posicion2.charAt(0)!='8'
                    && Posicion2.charAt(0)!='8') || ((Posicion2.charAt(2)!='A' && Posicion2.charAt(2)!='a') 
                    && (Posicion2.charAt(2)!='B' && Posicion2.charAt(2)!='b') 
                    && (Posicion2.charAt(2)!='C' && Posicion2.charAt(2)!='c')
                    && (Posicion2.charAt(2)!='D' && Posicion2.charAt(2)!='d')
                    && (Posicion2.charAt(2)!='E' && Posicion2.charAt(2)!='e')
                    && (Posicion2.charAt(2)!='F' && Posicion2.charAt(2)!='f')
                    && (Posicion2.charAt(2)!='G' && Posicion2.charAt(2)!='g')
                    && (Posicion2.charAt(2)!='H' && Posicion2.charAt(2)!='h'))){
                Posicion2=JOptionPane.showInputDialog("Dato Incorrecto!\nTurno Piezas Negras.\nIngrese la nueva posición de la pieza:","6,A");
            }
            String[] Pos2=Posicion2.split(",");        
            fila2=Integer.parseInt(Pos2[0]); 
            col2=Pos2[1];
            if(Pos2[1].equals("A") || Pos2[1].equals("a")){
                columna2=1;
            }else if(Pos2[1].equals("B") || Pos2[1].equals("b")){
               columna2=2;
            }else if(Pos2[1].equals("C") || Pos2[1].equals("c")){
               columna2=3;
            }else if(Pos2[1].equals("D") || Pos2[1].equals("d")){
               columna2=4;
            }else if(Pos2[1].equals("E") || Pos2[1].equals("e")){
               columna2=5;
            }else if(Pos2[1].equals("F") || Pos2[1].equals("f")){
               columna2=6;
            }else if(Pos2[1].equals("G") || Pos2[1].equals("g")){
               columna2=7;
            }else if(Pos2[1].equals("H") || Pos2[1].equals("h")){
               columna2=8;
            }
            Valido2=true;
            //-----------------------------------PIEZAS MOVIMINETOS!------------------------------------
            //Peon
            if(tablero[fila][columna]=="♟"){
                boolean c=Peon.ValidaciondeMovimiento("♟", fila, columna, fila2, columna2, tablero);
                if(c==true)
                Valido2=true;
                else
                Valido2=false;
            }
            //Torre
            if(tablero[fila][columna]=="♜"){
                boolean c=Torre.ValidaciondeMovimiento("♜", fila, columna, fila2, columna2, tablero);
                if(c==true)
                Valido2=true;
                else
                Valido2=false;
            }
            //Rey
            if(tablero[fila][columna]=="♚"){
                boolean c=Rey.ValidaciondeMovimiento("♚", fila, columna, fila2, columna2, tablero);
                if(c==true)
                Valido2=true;
                else
                Valido2=false;
            }
            //Alfil
            if(tablero[fila][columna]=="♝"){
                boolean c=Alfil.ValidaciondeMovimiento("♝", fila, columna, fila2, columna2, tablero);
                if(c==true)
                Valido2=true;
                else
                Valido2=false;
            }
            //Reina
            if(tablero[fila][columna]=="♛"){
                boolean c=Reina.ValidaciondeMovimiento("♛", fila, columna, fila2, columna2, tablero);
                if(c==true)
                Valido2=true;
                else
                Valido2=false;
            }
            //Caballo
            if(tablero[fila][columna]=="♞"){
                boolean c=Caballo.ValidaciondeMovimiento("♞", fila, columna, fila2, columna2, tablero);
                if(c==true)
                Valido2=true;
                else
                Valido2=false;
            }
            if(Valido2==false)
                JOptionPane.showMessageDialog(null, "No se Puede Mover Pieza Negra!  ", "Movimiento Inválido", 0); 
        }
        tablero[fila2][columna2]=tablero[fila][columna];
        tablero[fila][columna]= ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO;
        System.out.println(pieza + " se movió a: " + fila2+","+col2);
        System.out.println("");
        for (int i = 1; i < 9; i++) {
                if(tablero[1][i].equals("♟")){
                I.Corona();
                Coronar("♟",1,i);
               }
        }
        JaqueNegro();
        Impresion(tablero,tablero.length-1,0);
        return true;
    }
    
    public static boolean RodeadoNegro(String pieza,int fila, int columna){
        boolean v=true;
        if(pieza.contains("♟")){
            v=Peon.RodeadoN(pieza, fila, columna, tablero);
        }else if(pieza.contains("♜")){
            v=Torre.RodeadoN(pieza, fila, columna, tablero);
        }else if(pieza.contains("♝")){
            v=Reina.RodeadoN(pieza, fila, columna, tablero);
        }else if(pieza.contains("♛")){
            v=Rey.RodeadoN(pieza, fila, columna, tablero);
        }else if(pieza.contains("♚")){
            v=Alfil.RodeadoN(pieza, fila, columna, tablero);
        }else if(pieza.contains("♞")){
            v=Caballo.RodeadoN(pieza, fila, columna, tablero);
        }
        return v; 
    }
    
    public static boolean RodeadoBlanco(String pieza,int fila, int columna){
        boolean v=true;
        if(pieza.contains("♙")){
            v=Peon.RodeadoB(pieza, fila, columna, tablero);
        }else if(pieza.contains("♖")){
            v=Torre.RodeadoB(pieza, fila, columna, tablero);
        }else if(pieza.contains("♕")){
            v=Reina.RodeadoB(pieza, fila, columna, tablero);
        }else if(pieza.contains("♔")){    
            v=Rey.RodeadoB(pieza, fila, columna, tablero);
        }else if(pieza.contains("♗")){
            v=Alfil.RodeadoB(pieza, fila, columna, tablero);
        }else if(pieza.contains("♘")){
            v=Caballo.RodeadoB(pieza, fila, columna, tablero);
        }
        return v;  
    }
    
    public static boolean Jaquemate(){
        try{
        boolean v=false;
        String j="";
        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                j+=""+tablero[i][k];
            }
        }
        if(!j.contains("♔")){
            I.JaqueMateNegro();
            return true;
        }
        else if(!j.contains("♚")){
            I.JaqueMateBlanco();
            return true;
        }
        }catch(Exception e){
        return false;
        }
        return false;
    }
    
    public static boolean Coronar(String N, int F, int Co){
        if(N=="♟"){
            int c=0,r=0,t=0,a=0,C=0;
            for (int i = 1; i < 9; i++) {
                for (int j = 1; j < 9; j++) {
                  if(tablero[i][j]=="♜"){
                      t=t+1;
                  }
                  if(tablero[i][j]=="♞"){
                      c=c+1;
                  }
                  if(tablero[i][j]=="♝"){
                      a=a+1;
                  }
                  if(tablero[i][j]=="♛"){
                      C=C+1;
                  }   
                }
            }
            String[] S={"♜ Torre","♞ Caballo","♝ Alfil","♛ Reina","♟ Peón"};
            String P="";
            P=(String) JOptionPane.showInputDialog(null, "Elija La Pieza Con que Desea Cambiar:","Corona!",3, null, S, S[0]);
            if(t==2 && P.equals(S[0])){
               JOptionPane.showMessageDialog(null, "No ha Perdido Esa Pieza!", "Corona", 0);
               Coronar(N,F,Co);
               return false;
            }
            if(c==2 && P.equals(S[1])){
               JOptionPane.showMessageDialog(null, "No ha Perdido Esa Pieza!", "Corona", 0);
               Coronar(N,F,Co);
               return false;
            }
            if(a==2 && P.equals(S[2])){
               JOptionPane.showMessageDialog(null, "No ha Perdido Esa Pieza!", "Corona", 0); 
               Coronar(N,F,Co);
               return false;
            }
            if(C==1 && P.equals(S[3])){
               JOptionPane.showMessageDialog(null, "No ha Perdido Esa Pieza!", "Corona", 0);
               Coronar(N,F,Co);
               return false;
            }
            if(P==S[0])
            tablero[F][Co]="♜";
            if(P==S[1])
            tablero[F][Co]="♞";
            if(P==S[2])
            tablero[F][Co]="♝";
            if(P==S[3])
            tablero[F][Co]="♛";
            if(P==S[4])
            tablero[F][Co]="♟";
        }else{
            int c=0,r=0,t=0,a=0,C=0;
            for (int i = 1; i < 9; i++) {
                for (int j = 1; j < 9; j++) {
                  if(tablero[i][j]=="♖"){
                      t=t+1;
                  }
                  if(tablero[i][j]=="♘"){
                      c=c+1;
                  }
                  if(tablero[i][j]=="♗"){
                      a=a+1;
                  }
                  if(tablero[i][j]=="♕"){
                      C=C+1;
                  }   
                }
            }
            String[] S={"♖ Torre","♘ Caballo","♗ Alfil","♕ Reina","♙ Peón"};
            String P="";
            P=(String) JOptionPane.showInputDialog(null, "Elija La Pieza Con que Desea Cambiar:","Corona!",3, null, S, S[0]);
            if(t==2 && P.equals(S[0])){
               JOptionPane.showMessageDialog(null, "No ha Perdido Esa Pieza!", "Corona", 0);
               Coronar(N,F,Co);
               return false;
            }
            if(c==2 && P.equals(S[1])){
               JOptionPane.showMessageDialog(null, "No ha Perdido Esa Pieza!", "Corona", 0);
               Coronar(N,F,Co);
               return false;
            }
            if(a==2 && P.equals(S[2])){
               JOptionPane.showMessageDialog(null, "No ha Perdido Esa Pieza!", "Corona", 0); 
               Coronar(N,F,Co);
               return false;
            }
            if(C==1 && P.equals(S[3])){
               JOptionPane.showMessageDialog(null, "No ha Perdido Esa Pieza!", "Corona", 0);
               Coronar(N,F,Co);
               return false;
            }
            if(P==S[0])
            tablero[F][Co]="♖";
            if(P==S[1])
            tablero[F][Co]="♘";
            if(P==S[2])
            tablero[F][Co]="♗";
            if(P==S[3])
            tablero[F][Co]="♕";
            if(P==S[4])
            tablero[F][Co]="♙";
        }
        return true;
    }
    
    public static boolean JaqueNegro(){
        try{
        int f=0, c=0;
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if(tablero[i][j]=="♔"){
                    f=i;
                    c=j;
                }
            }
        }
        //System.out.println(f+" , "+c);
        //_____________Jaque a Rey Blanco Por Peon Y Reina____________
        if((tablero[f+1][c+1]=="♟" || tablero[f+1][c-1]=="♟") || (tablero[f+1][c+1]=="♛" || tablero[f+1][c-1]=="♛")
                || (tablero[f+1][c+1]=="♚" || tablero[f+1][c-1]=="♚")){
            I.Jaque();
        }
        //_____________Jaque a Rey Blanco Por Torre y Reina ____________
        for (int i = c+1; i < 8; i++) {
            if(tablero[c][i]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[c][i]=="♜"  || tablero[c][i]=="♛"){
                    I.Jaque();
                }
                i=9;
            }
        }
        for (int i = c-1; i >= 1; i--) {
            if(tablero[c][i]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[c][i]=="♜" || tablero[c][i]=="♛"){
                    I.Jaque();
                }
                i=0;
            }
        }
        for (int i = f-1; i >= 1; i--) {
            if(tablero[i][f]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[i][f]=="♜" || tablero[i][f]=="♛"){
                    I.Jaque();
                }
                i=0;
            }
        }
        for (int i = f+1; i < 8; i++) {
            if(tablero[i][f]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[i][f]=="♜"  || tablero[i][f]=="♛"){
                    I.Jaque();
                }
                i=9;
            }
        }
        //_____________Jaque a Rey Blanco Por Alfil y Reina ____________
        int x=c;
        for (int i = f+1; i < 8; i++) {
            x=x+1;
            if(tablero[i][x]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[i][x]=="♝" || tablero[i][x]=="♛"){
                    I.Jaque();
                }
                i=9;
            }
        }
        x=c;
        for (int i = f+1; i < 8; i++) {
            x=x-1;
            if(tablero[i][x]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[i][x]=="♝" || tablero[i][x]=="♛"){
                    I.Jaque();
                }
                i=9;
            }
        }
        x=c;
        for (int i = f-1; i >= 1; i--) {
            x=x+1;
            if(tablero[i][x]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[i][x]=="♝" || tablero[i][x]=="♛"){
                    I.Jaque();
                }
                i=0;
            }
        }
        x=c;
        for (int i = f-1; i >= 1; i--) {
            x=x-1;
            if(tablero[i][x]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[i][x]=="♝" || tablero[i][x]=="♛"){
                    I.Jaque();
                }
                i=0;
            }
        }
        //_____________Jaque a Rey Blanco Por Rey  ____________
       if((tablero[f+1][c]=="♚" || tablero[f-1][c]=="♚") || (tablero[f-1][c+1]=="♚" || tablero[f-1][c-1]=="♚") || (tablero[f][c-1]=="♚" || tablero[f][c+1]=="♚")){
           I.Jaque();
       }
        }catch(Exception e){
            return false;
        }
        return false;
    }
    
    public static boolean JaqueBlanco(){
        try{
        int f=0, c=0;
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if(tablero[i][j]=="♚"){
                    f=i;
                    c=j;
                }
            }
        }
        //System.out.println(f+" , "+c);
        //_____________Jaque a Rey Blanco Por Peon Y Reina____________
        if((tablero[f-1][c+1]=="♙" || tablero[f-1][c-1]=="♙") || (tablero[f-1][c+1]=="♕" || tablero[f-1][c-1]=="♕")
                || (tablero[f-1][c+1]=="♔" || tablero[f-1][c-1]=="♔")){
            I.Jaque();
        }
        //_____________Jaque a Rey Blanco Por Torre y Reina ____________
        for (int i = c+1; i < 8; i++) {
            if(tablero[c][i]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[c][i]=="♖"  || tablero[c][i]=="♕"){
                    I.Jaque();
                }
                i=9;
            }
        }
        for (int i = c-1; i >= 1; i--) {
            if(tablero[c][i]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[c][i]=="♖" || tablero[c][i]=="♕"){
                    I.Jaque();
                }
                i=0;
            }
        }
        for (int i = f-1; i >= 1; i--) {
            if(tablero[i][f]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[i][f]=="♖" || tablero[i][f]=="♕"){
                    I.Jaque();
                }
                i=0;
            }
        }
        for (int i = f+1; i < 8; i++) {
            if(tablero[i][f]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[i][f]=="♖"  || tablero[i][f]=="♕"){
                    I.Jaque();
                }
                i=9;
            }
        }
        //_____________Jaque a Rey Blanco Por Alfil y Reina ____________
        int x=c;
        for (int i = f+1; i < 8; i++) {
            x=x+1;
            if(tablero[i][x]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[i][x]=="♗" || tablero[i][x]=="♕"){
                    I.Jaque();
                }
                i=9;
            }
        }
        x=c;
        for (int i = f+1; i < 8; i++) {
            x=x-1;
            if(tablero[i][x]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[i][x]=="♗" || tablero[i][x]=="♕"){
                    I.Jaque();
                }
                i=9;
            }
        }
        x=c;
        for (int i = f-1; i >= 1; i--) {
            x=x+1;
            if(tablero[i][x]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[i][x]=="♗" || tablero[i][x]=="♕"){
                    I.Jaque();
                }
                i=0;
            }
        }
        x=c;
        for (int i = f-1; i >= 1; i--) {
            x=x-1;
            if(tablero[i][x]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                if(tablero[i][x]=="♗" || tablero[i][x]=="♕"){
                    I.Jaque();
                }
                i=0;
            }
        }
        //_____________Jaque a Rey Blanco Por Rey  ____________
       if((tablero[f+1][c]=="♔" || tablero[f-1][c]=="♔") || (tablero[f+1][c+1]=="♔" || tablero[f+1][c-1]=="♔") || (tablero[f][c-1]=="♔" || tablero[f][c+1]=="♔")){
           I.Jaque();
       }
       //_____________Jaque a Rey Blanco Caballo  ____________
        }catch(Exception e){
        return false;
        }
        return false;
    }
    
}
