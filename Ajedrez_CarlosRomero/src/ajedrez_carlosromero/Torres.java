
package ajedrez_carlosromero;

public class Torres extends Piezas{

    public Torres() {
        super();
    }

    public Torres(String Nombre, int FilaA, int ColumnaA) {
        super(Nombre, FilaA, ColumnaA);
    }

    public Torres(String Nombre, int FilaA, int ColumnaA, int FilaB, int ColumnaB) {
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
        if(Nombre=="♖"){
            if((FilaB==FilaA && ColumnaB!=ColumnaA)){
                if(ColumnaB>ColumnaA){
                    for (int i = ColumnaA+1; i < ColumnaB; i++) {
                        if (Tablero[FilaB][i]!=(ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                            x=x+1;
                        } 
                    }
                    if(Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
                                 || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"){
                    x=x+1;        
                    }
                }else{
                    for (int i = ColumnaA-1; i >= ColumnaB+1; i--) {
                        if (Tablero[FilaB][i]!=(ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                            x=x+1;
                        }
                    }
                    if(Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
                                 || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"){
                    x=x+1;        
                    }
                }
            }else if ((FilaB!=FilaA && ColumnaB==ColumnaA)){
                if(FilaB>FilaA){
                    for (int i = FilaA+1; i < FilaB; i++) {
                        if(Tablero[i][ColumnaB]!=(ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                            x=x+1;
                        }
                    }
                    if(Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
                                 || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"){
                    x=x+1;        
                    }
                }else{
                   for (int i = FilaA-1; i >=FilaB+1 ; i--) {
                        if(Tablero[i][ColumnaB]!=(ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                            x=x+1;
                        }
                    } 
                   if(Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
                                 || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"){
                    x=x+1;        
                    }
                }
            }else if((FilaB!=FilaA && ColumnaA!=ColumnaB) || (FilaB==FilaA && ColumnaA==ColumnaB)){
                x=2;
            }
        }else {
            if((FilaB==FilaA && ColumnaB!=ColumnaA)){
                if(ColumnaB>ColumnaA){
                    for (int i = ColumnaA+1; i < ColumnaB; i++) {
                        if (Tablero[FilaB][i]!=(ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                            x=x+1;
                        } 
                    }
                    if(Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
                                 || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚"){
                    x=x+1;        
                    }
                }else{
                    for (int i = ColumnaA-1; i >= ColumnaB+1; i--) {
                        if (Tablero[FilaB][i]!=(ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                            x=x+1;
                        }
                    }
                    if(Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
                                 || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚"){
                    x=x+1;        
                    }
                }
            }else if ((FilaB!=FilaA && ColumnaB==ColumnaA)){
                if(FilaB>FilaA){
                    for (int i = FilaA+1; i < FilaB; i++) {
                        if(Tablero[i][ColumnaB]!=(ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                            x=x+1;
                        }
                    }
                    if(Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
                                 || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚"){
                    x=x+1;        
                    }
                }else{
                   for (int i = FilaA-1; i >=FilaB+1 ; i--) {
                        if(Tablero[i][ColumnaB]!=(ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
                            x=x+1;
                        }
                    } 
                   if(Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
                                 || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚"){
                    x=x+1;        
                    }
                }
            }else if((FilaB!=FilaA && ColumnaA!=ColumnaB) || (FilaB==FilaA && ColumnaA==ColumnaB)){
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
        return true;
    }

    @Override
    public boolean RodeadoN(String pieza, int fila, int columna, Object[][] tablero) {
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
        return true;
    }
    
}
