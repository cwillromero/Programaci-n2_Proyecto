
package ajedrez_carlosromero;


public class Reina extends Piezas{

    public Reina() {
        super();
    }

    public Reina(String Nombre, int FilaA, int ColumnaA) {
        super(Nombre, FilaA, ColumnaA);
    }
    
    public Reina(String Nombre, int FilaA, int ColumnaA, int FilaB, int ColumnaB) {
        super(Nombre, FilaA, ColumnaA, FilaB, ColumnaB);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public boolean ValidaciondeMovimiento(String Nombre, int FilaA, int ColumnaA, int FilaB, int ColumnaB,Object[][] Tablero) {
        int x=0;
       if(Nombre=="♕"){
           if((FilaB-FilaA==ColumnaB-ColumnaA && ColumnaB-ColumnaA>0) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚" 
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                int v=ColumnaA;
                for (int i = FilaA+1; i < FilaB; i++) {
                    v=v+1;
                    if(Tablero[i][v]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }else if((FilaB-FilaA==ColumnaB-ColumnaA && ColumnaB-ColumnaA<0) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚" 
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
               int v=ColumnaA;
                for (int i = FilaA-1; i > FilaB; i--) {
                    v=v-1;
                    if(Tablero[i][v]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }
            else if((FilaB-FilaA==-(ColumnaB-ColumnaA) && ColumnaB-ColumnaA<0) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚" 
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
               int v=ColumnaA;
                for (int i = FilaA+1; i < FilaB; i++) {
                    v=v-1;
                    if(Tablero[i][v]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }
            else if((FilaB-FilaA==-(ColumnaB-ColumnaA) && ColumnaB-ColumnaA>0) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚" 
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
               int v=ColumnaA;
                for (int i = FilaA-1; i > FilaB; i--) {
                    v=v+1;
                    if(Tablero[i][v]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }
            else if((FilaB==FilaA && ColumnaB>ColumnaA) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚" 
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                for (int i = ColumnaA+1; i < ColumnaB; i++) {
                    if(Tablero[FilaA][i]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }
            else if((FilaB==FilaA && ColumnaB<ColumnaA) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚" 
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                for (int i = ColumnaB+1; i < ColumnaA; i++) {
                    if(Tablero[FilaA][i]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }
            else if((ColumnaB==ColumnaA && FilaB>FilaA) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚" 
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                for (int i = FilaA+1; i < FilaB; i++) {
                    if(Tablero[i][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }
            else if((ColumnaB==ColumnaA && FilaB<FilaA) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚" 
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                for (int i = FilaB+1; i < FilaA; i++) {
                    if(Tablero[i][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }
            else{
                x=2;
            } 
       }else{
          if((FilaB-FilaA==ColumnaB-ColumnaA && ColumnaB-ColumnaA>0) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                int v=ColumnaA;
                for (int i = FilaA+1; i < FilaB; i++) {
                    v=v+1;
                    if(Tablero[i][v]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }   
            }else if((FilaB-FilaA==ColumnaB-ColumnaA && ColumnaB-ColumnaA<0) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
               int v=ColumnaA;
                for (int i = FilaA-1; i > FilaB; i--) {
                    v=v-1;
                    if(Tablero[i][v]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }else if((FilaB-FilaA==-(ColumnaB-ColumnaA) && ColumnaB-ColumnaA<0) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
               int v=ColumnaA;
                for (int i = FilaA+1; i < FilaB; i++) {
                    v=v-1;
                    if(Tablero[i][v]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }else if((FilaB-FilaA==-(ColumnaB-ColumnaA) && ColumnaB-ColumnaA>0) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
               int v=ColumnaA;
                for (int i = FilaA-1; i > FilaB; i--) {
                    v=v+1;
                    if(Tablero[i][v]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }
            else if((FilaB==FilaA && ColumnaB>ColumnaA) && 
             (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                for (int i = ColumnaA+1; i < ColumnaB; i++) {
                    if(Tablero[FilaA][i]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }
            else if((FilaB==FilaA && ColumnaB<ColumnaA) && 
             (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                for (int i = ColumnaB+1; i < ColumnaA; i++) {
                    if(Tablero[FilaA][i]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }
            else if((ColumnaB==ColumnaA && FilaB>FilaA) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                for (int i = FilaA+1; i < FilaB; i++) {
                    if(Tablero[i][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }
            else if((ColumnaB==ColumnaA && FilaB<FilaA) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                for (int i = FilaB+1; i < FilaA; i++) {
                    if(Tablero[i][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }
                }
            }
            else{
                x=2;
            }
       }          
       if(x>0)
           return false;
       else
           return true;
    }

    @Override
    public boolean RodeadoB(String pieza, int fila, int columna, Object[][] tablero) {
        if (tablero[fila+1][columna-1]!="♜" && tablero[fila+1][columna-1]!="♟" && tablero[fila+1][columna-1]!="♞"
                && tablero[fila+1][columna-1]!="♝" && tablero[fila+1][columna-1]!="♛" && tablero[fila+1][columna-1]!="♚"
                &&tablero[fila+1][columna-1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                if(tablero[fila+1][columna+1]!="♜" && tablero[fila+1][columna+1]!="♟" && tablero[fila+1][columna+1]!="♞"
                    && tablero[fila+1][columna+1]!="♝" && tablero[fila+1][columna+1]!="♛" && tablero[fila+1][columna+1]!="♚"
                    &&tablero[fila+1][columna+1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                    if(tablero[fila-1][columna+1]!="♜" && tablero[fila-1][columna+1]!="♟" && tablero[fila-1][columna+1]!="♞"
                        && tablero[fila-1][columna+1]!="♝" && tablero[fila-1][columna+1]!="♛" && tablero[fila-1][columna+1]!="♚"
                        &&tablero[fila-1][columna+1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                        if(tablero[fila-1][columna-1]!="♜" && tablero[fila-1][columna-1]!="♟" && tablero[fila-1][columna-1]!="♞"
                            && tablero[fila-1][columna-1]!="♝" && tablero[fila-1][columna-1]!="♛" && tablero[fila-1][columna-1]!="♚"
                            &&tablero[fila-1][columna-1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                            if (tablero[fila+1][columna]!="♜" && tablero[fila+1][columna]!="♟" && tablero[fila+1][columna]!="♞"
                            && tablero[fila+1][columna]!="♝" && tablero[fila+1][columna]!="♛" && tablero[fila+1][columna]!="♚"
                            &&tablero[fila+1][columna]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                                if(tablero[fila-1][columna]!="♜" && tablero[fila-1][columna]!="♟" && tablero[fila-1][columna]!="♞"
                                    && tablero[fila-1][columna]!="♝" && tablero[fila-1][columna]!="♛" && tablero[fila-1][columna]!="♚"
                                    &&tablero[fila-1][columna]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                                    if(tablero[fila][columna+1]!="♜" && tablero[fila][columna+1]!="♟" && tablero[fila][columna+1]!="♞"
                                        && tablero[fila][columna+1]!="♝" && tablero[fila][columna+1]!="♛" && tablero[fila][columna+1]!="♚"
                                        &&tablero[fila][columna+1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                                        if(tablero[fila][columna-1]!="♜" && tablero[fila][columna-1]!="♟" && tablero[fila][columna-1]!="♞"
                                            && tablero[fila][columna-1]!="♝" && tablero[fila][columna-1]!="♛" && tablero[fila][columna-1]!="♚"
                                            &&tablero[fila][columna-1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        return true;
    }

    @Override
    public boolean RodeadoN(String pieza, int fila, int columna, Object[][] tablero) {
        if (tablero[fila+1][columna-1]!="♖" && tablero[fila+1][columna-1]!="♙" && tablero[fila+1][columna-1]!="♘"
                && tablero[fila+1][columna-1]!="♗" && tablero[fila+1][columna-1]!="♕" && tablero[fila+1][columna-1]!="♔"
                &&tablero[fila+1][columna-1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                if(tablero[fila+1][columna+1]!="♖" && tablero[fila+1][columna+1]!="♙" && tablero[fila+1][columna+1]!="♘"
                    && tablero[fila+1][columna+1]!="♗" && tablero[fila+1][columna+1]!="♕" && tablero[fila+1][columna+1]!="♔"
                    &&tablero[fila+1][columna+1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                    if(tablero[fila-1][columna+1]!="♖" && tablero[fila-1][columna+1]!="♙" && tablero[fila-1][columna+1]!="♘"
                        && tablero[fila-1][columna+1]!="♗" && tablero[fila-1][columna+1]!="♕" && tablero[fila-1][columna+1]!="♔"
                        &&tablero[fila-1][columna+1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                        if(tablero[fila-1][columna-1]!="♖" && tablero[fila-1][columna-1]!="♙" && tablero[fila-1][columna-1]!="♘"
                            && tablero[fila-1][columna-1]!="♗" && tablero[fila-1][columna-1]!="♕" && tablero[fila-1][columna-1]!="♔"
                            &&tablero[fila-1][columna-1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                                if (tablero[fila+1][columna]!="♖" && tablero[fila+1][columna]!="♙" && tablero[fila+1][columna]!="♘"
                                && tablero[fila+1][columna]!="♗" && tablero[fila+1][columna]!="♕" && tablero[fila+1][columna]!="♔"
                                &&tablero[fila+1][columna]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                                if(tablero[fila-1][columna]!="♖" && tablero[fila-1][columna]!="♙" && tablero[fila-1][columna]!="♘"
                                    && tablero[fila-1][columna]!="♗" && tablero[fila-1][columna]!="♕" && tablero[fila-1][columna]!="♔"
                                    &&tablero[fila-1][columna]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                                    if(tablero[fila][columna+1]!="♖" && tablero[fila][columna+1]!="♙" && tablero[fila][columna+1]!="♘"
                                        && tablero[fila][columna+1]!="♗" && tablero[fila][columna+1]!="♕" && tablero[fila][columna+1]!="♔"
                                        &&tablero[fila][columna+1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                                        if(tablero[fila][columna-1]!="♖" && tablero[fila][columna-1]!="♙" && tablero[fila][columna-1]!="♘"
                                            && tablero[fila][columna-1]!="♗" && tablero[fila][columna-1]!="♕" && tablero[fila][columna-1]!="♔"
                                            &&tablero[fila][columna-1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        return true;
    }
    
    
}
