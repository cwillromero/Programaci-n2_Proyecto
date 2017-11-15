
package ajedrez_carlosromero;

public abstract class Piezas {
    public String Nombre;
    public int FilaA;
    public int ColumnaA;
    public int FilaB;
    public int ColumnaB;
    public Object[][] Tablero=new Object[10][10];

    public Piezas() {
    }

    public Piezas(String Nombre, int FilaA, int ColumnaA) {
        this.Nombre = Nombre;
        this.FilaA = FilaA;
        this.ColumnaA = ColumnaA;
    }
    
    public Piezas(String Nombre, int FilaA, int ColumnaA, int FilaB, int ColumnaB) {
        this.Nombre = Nombre;
        this.FilaA = FilaA;
        this.ColumnaA = ColumnaA;
        this.FilaB = FilaB;
        this.ColumnaB = ColumnaB;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    public abstract boolean ValidaciondeMovimiento(String Nombre, int FilaA, int ColumnaA, int FilaB, int ColumnaB,Object[][] Tablero);
    
    public abstract boolean RodeadoB(String pieza,int fila, int columna, Object[][] tablero);
    
    public abstract boolean RodeadoN(String pieza,int fila, int columna, Object[][] tablero);
}
