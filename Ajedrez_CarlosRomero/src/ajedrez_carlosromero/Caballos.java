
package ajedrez_carlosromero;


public class Caballos extends Piezas {

    public Caballos() {
        super();
    }

    public Caballos(String Nombre, int FilaA, int ColumnaA) {
        super(Nombre, FilaA, ColumnaA);
    }
    
    public Caballos(String Nombre, int FilaA, int ColumnaA, int FilaB, int ColumnaB) {
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
        try{
        int x=0;
        if(Nombre.equals("♘")){
            if ((FilaB-FilaA==1 && ColumnaB-ColumnaA==2) && 
           (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            }else if((FilaB-FilaA==-1 && ColumnaB-ColumnaA==2) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            }
            else if((FilaB-FilaA==1 && ColumnaB-ColumnaA==-2) && 
           (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            } 
            else if((FilaB-FilaA==-1 && ColumnaB-ColumnaA==-2) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            } 
            else if((FilaB-FilaA==2 && ColumnaB-ColumnaA==1) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            }
            else if((FilaB-FilaA==-2 && ColumnaB-ColumnaA==1) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            }
            else if((FilaB-FilaA==2 && ColumnaB-ColumnaA==-1) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            }
            else if((FilaB-FilaA==-2 && ColumnaB-ColumnaA==-1) && 
            (Tablero[FilaB][ColumnaB]=="♜" || Tablero[FilaB][ColumnaB]=="♟" || Tablero[FilaB][ColumnaB]=="♞"
            || Tablero[FilaB][ColumnaB]=="♝" || Tablero[FilaB][ColumnaB]=="♛" || Tablero[FilaB][ColumnaB]=="♚"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            }
            else{
                x=x+1;
            }
        }else{
            if ((FilaB-FilaA==1 && ColumnaB-ColumnaA==2) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            }else if((FilaB-FilaA==-1 && ColumnaB-ColumnaA==2) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            }
            else if((FilaB-FilaA==1 && ColumnaB-ColumnaA==-2) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            } 
            else if((FilaB-FilaA==-1 && ColumnaB-ColumnaA==-2) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            }
            else if((FilaB-FilaA==2 && ColumnaB-ColumnaA==1) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            }
            else if((FilaB-FilaA==-2 && ColumnaB-ColumnaA==1) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            }
            else if((FilaB-FilaA==2 && ColumnaB-ColumnaA==-1) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            }
            else if((FilaB-FilaA==-2 && ColumnaB-ColumnaA==-1) && 
            (Tablero[FilaB][ColumnaB]=="♖" || Tablero[FilaB][ColumnaB]=="♙" || Tablero[FilaB][ColumnaB]=="♘"
            || Tablero[FilaB][ColumnaB]=="♗" || Tablero[FilaB][ColumnaB]=="♕" || Tablero[FilaB][ColumnaB]=="♔"
            || Tablero[FilaB][ColumnaB]==ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
                x=0;
            }
            else{
                x=x+1;
            }
        }
        if(x>0)
            return false;
        else 
            return true;
        }catch(Exception e){
            return true;
        }
    }

    @Override
    public boolean RodeadoB(String pieza, int fila, int columna, Object[][] tablero) {
            return true;
    }

    @Override
    public boolean RodeadoN(String pieza, int fila, int columna, Object[][] tablero) {
//        boolean a=true,b=true,c=true,d=true,e=true,f=true,g=true,h=true;
//        if ((FilaB-FilaA==1 && ColumnaB-ColumnaA==2) && 
//           (Tablero[FilaB][ColumnaB]!="♖" && Tablero[FilaB][ColumnaB]!="♙" && Tablero[FilaB][ColumnaB]!="♘"
//            && Tablero[FilaB][ColumnaB]!="♗" && Tablero[FilaB][ColumnaB]!="♕" && Tablero[FilaB][ColumnaB]!="♔"
//            && Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
//                a=false;
//            }else if((FilaB-FilaA==-1 && ColumnaB-ColumnaA==2) && 
//            (Tablero[FilaB][ColumnaB]!="♖" && Tablero[FilaB][ColumnaB]!="♙" && Tablero[FilaB][ColumnaB]!="♘"
//            && Tablero[FilaB][ColumnaB]!="♗" && Tablero[FilaB][ColumnaB]!="♕" && Tablero[FilaB][ColumnaB]!="♔"
//            && Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
//                b=false;
//            }
//            else if((FilaB-FilaA==1 && ColumnaB-ColumnaA==-2) && 
//           (Tablero[FilaB][ColumnaB]!="♖" && Tablero[FilaB][ColumnaB]!="♙" && Tablero[FilaB][ColumnaB]!="♘"
//            && Tablero[FilaB][ColumnaB]!="♗" && Tablero[FilaB][ColumnaB]!="♕" && Tablero[FilaB][ColumnaB]!="♔"
//            && Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
//                c=false;
//            } 
//            else if((FilaB-FilaA==-1 && ColumnaB-ColumnaA==-2) && 
//            (Tablero[FilaB][ColumnaB]!="♖" && Tablero[FilaB][ColumnaB]!="♙" && Tablero[FilaB][ColumnaB]!="♘"
//            && Tablero[FilaB][ColumnaB]!="♗" && Tablero[FilaB][ColumnaB]!="♕" && Tablero[FilaB][ColumnaB]!="♔"
//            && Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
//               d=false;
//            } 
//            else if((FilaB-FilaA==2 && ColumnaB-ColumnaA==1) && 
//            (Tablero[FilaB][ColumnaB]!="♖" && Tablero[FilaB][ColumnaB]!="♙" && Tablero[FilaB][ColumnaB]!="♘"
//            && Tablero[FilaB][ColumnaB]!="♗" && Tablero[FilaB][ColumnaB]!="♕" && Tablero[FilaB][ColumnaB]!="♔"
//            && Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO)){
//                e=false;
//            }
//            else if((FilaB-FilaA==-2 && ColumnaB-ColumnaA==1) && 
//            (Tablero[FilaB][ColumnaB]!="♖" && Tablero[FilaB][ColumnaB]!="♙" && Tablero[FilaB][ColumnaB]!="♘"
//            && Tablero[FilaB][ColumnaB]!="♗" && Tablero[FilaB][ColumnaB]!="♕" && Tablero[FilaB][ColumnaB]!="♔"
//            && Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
//                f=false;
//            }
//            else if((FilaB-FilaA==2 && ColumnaB-ColumnaA==-1) && 
//            (Tablero[FilaB][ColumnaB]!="♖" && Tablero[FilaB][ColumnaB]!="♙" && Tablero[FilaB][ColumnaB]!="♘"
//            && Tablero[FilaB][ColumnaB]!="♗" && Tablero[FilaB][ColumnaB]!="♕" && Tablero[FilaB][ColumnaB]!="♔"
//            && Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
//                g=false;
//            }
//            else if((FilaB-FilaA==-2 && ColumnaB-ColumnaA==-1) && 
//            (Tablero[FilaB][ColumnaB]!="♖" && Tablero[FilaB][ColumnaB]!="♙" && Tablero[FilaB][ColumnaB]!="♘"
//            && Tablero[FilaB][ColumnaB]!="♗" && Tablero[FilaB][ColumnaB]!="♕" && Tablero[FilaB][ColumnaB]!="♔"
//            && Tablero[FilaB][ColumnaB]!=ColorTablero.LETRA_BLANCO+"➖"+ColorTablero.LETRA_NEGRO) ){
//                h=false;
//            }
//        if((ColumnaB<=6 && ColumnaB>=3) &&(FilaB<=6 && FilaB>=3)){
//            if(a==false && b==false && c==false && d==false && e==false && f==false && g==false && h==false){
//            return false;
//        }
//        else if(ColumnaB<3 && FilaB){
//                
//        }
//        if(a==false && b==false && c==false && d==false && e==false && f==false && g==false && h==false){
//            return false;
//        }else
            return true;
    }
    
    
}
