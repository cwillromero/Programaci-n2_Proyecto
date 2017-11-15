
package ajedrez_carlosromero;

public class Rey extends Piezas{

    public Rey() {
        super();
    }

    public Rey(String Nombre, int FilaA, int ColumnaA) {
        super(Nombre, FilaA, ColumnaA);
    }

    public Rey(String Nombre, int FilaA, int ColumnaA, int FilaB, int ColumnaB) {
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
        if (Nombre=="♔") {
            if(((FilaB==FilaA-1 || FilaB==FilaA+1) && ColumnaB==ColumnaA) || 
              ((ColumnaB==ColumnaA-1 || ColumnaB==ColumnaA+1) && FilaA==FilaB) ||
              (FilaB==FilaA-1 && ColumnaB==ColumnaA-1) || (FilaB==FilaA+1 && ColumnaB==ColumnaA+1)
              || (FilaB==FilaA+1 && ColumnaB==ColumnaA-1) || (FilaB==FilaA-1 && ColumnaB==ColumnaA+1)){
                if((Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
                    || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚" 
                    || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO))
                    x=0;
                else
                    x=x+1;
            }else{
                x=x+2;
            }
        }else{
            if(((FilaB==FilaA-1 || FilaB==FilaA+1) && ColumnaB==ColumnaA) || 
              ((ColumnaB==ColumnaA-1 || ColumnaB==ColumnaA+1) && FilaA==FilaB) ||
              (FilaB==FilaA-1 && ColumnaB==ColumnaA-1) || (FilaB==FilaA+1 && ColumnaB==ColumnaA+1)
              || (FilaB==FilaA+1 && ColumnaB==ColumnaA-1) || (FilaB==FilaA-1 && ColumnaB==ColumnaA+1)){
                if(Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
                || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
                    || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)
                    x=0;
                else
                    x=x+1;
            }else{
                x=x+2;
            }
        }
        if (x>0)
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
