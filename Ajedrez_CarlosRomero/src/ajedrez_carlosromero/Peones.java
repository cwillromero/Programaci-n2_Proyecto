
package ajedrez_carlosromero;

public class Peones extends Piezas{

    public Peones() {
        super();
    }

    public Peones(String Nombre, int FilaA, int ColumnaA) {
        super(Nombre, FilaA, ColumnaA);
    }
    
    public Peones(String Nombre, int FilaA, int ColumnaA, int FilaB, int ColumnaB) {
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
        if(Nombre.equals("♟")){
            if(FilaB>=FilaA){
                x=x+1;
            }else if((FilaB==FilaA-1) && ((ColumnaB==ColumnaA-1) || (ColumnaB==ColumnaA+1))){
                if(Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                    if(Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
                                 || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"){
                        x=0;
                    }else{
                        x=x+1;
                    }
                    
                }else{
                    x=x+1;
                }
            }else if(FilaA==7 && (FilaB==FilaA-1 || FilaB==FilaA-2) && ColumnaB==ColumnaA){
                if(FilaB==FilaA-1){
                    if(Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }else{
                        x=0;
                    }
                }else{
                    if(Tablero[FilaB-1][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO
                      || Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }else{
                        x=0;
                    }
                }
            }else if (FilaB!=FilaA && ColumnaB!=ColumnaA){
            x=x+1;
            }else if(FilaA-FilaB!=1 && ColumnaB==ColumnaA){
                x=x+1;
            }
        }else{
            if(FilaB<=FilaA){
                x=x+1;
            }else if((FilaB==FilaA+1) && ((ColumnaB==ColumnaA-1) || (ColumnaB==ColumnaA+1))){
                if(Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                    if(Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
                                 || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚"){
                        x=0;
                    }else{
                        x=x+1;
                    }
                    
                }else{
                    x=x+1;
                }
            }else if(FilaA==2 && (FilaB==FilaA+1 || FilaB==FilaA+2) && ColumnaB==ColumnaA){
                if(FilaB==FilaA+1){
                    if(Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }else{
                        x=0;
                    }
                }else{
                    if(Tablero[FilaB+1][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO
                      || Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO){
                        x=x+1;
                    }else{
                        x=0;
                    }
                }
            }else if (FilaB!=FilaA && ColumnaB!=ColumnaA){
            x=x+1;
            }else if(FilaB-FilaA!=1 && ColumnaB==ColumnaA){
                x=x+1;
            }
        }
        if(x>0)
            return false;
        else 
            return true;
    }

    @Override
    public boolean RodeadoB(String pieza, int fila, int columna, Object[][] tablero) {
        if(tablero[fila+1][columna]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO && ((tablero[fila+1][columna+1]!="♜" && tablero[fila+1][columna+1]!="♟" && tablero[fila+1][columna+1]!="♞"
            && tablero[fila+1][columna+1]!="♝" && tablero[fila+1][columna+1]!="♛" && tablero[fila+1][columna+1]!="♚" 
            && tablero[fila+1][columna+1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) && (tablero[fila+1][columna-1]!="♜" && tablero[fila+1][columna-1]!="♟" && tablero[fila+1][columna-1]!="♞"
            && tablero[fila+1][columna-1]!="♝" && tablero[fila+1][columna-1]!="♛" && tablero[fila+1][columna-1]!="♚" 
            && tablero[fila+1][columna-1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO))){
                return false;
            }else
                return true;
    }

    @Override
    public boolean RodeadoN(String pieza, int fila, int columna, Object[][] tablero) {
        if(tablero[fila-1][columna]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO && ((tablero[fila-1][columna+1]!="♖" && tablero[fila-1][columna+1]!="♙" && tablero[fila-1][columna+1]!="♘"
            && tablero[fila-1][columna+1]!="♗" && tablero[fila-1][columna+1]!="♕" && tablero[fila-1][columna+1]!="♔" 
            && tablero[fila-1][columna+1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) && (tablero[fila-1][columna-1]!="♖" && tablero[fila-1][columna-1]!="♙" && tablero[fila-1][columna-1]!="♘"
            && tablero[fila-1][columna-1]!="♗" && tablero[fila-1][columna-1]!="♕" && tablero[fila-1][columna-1]!="♔" 
            && tablero[fila-1][columna-1]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO))){
                return false;
            }else
                return true;
    }
    
    
}
