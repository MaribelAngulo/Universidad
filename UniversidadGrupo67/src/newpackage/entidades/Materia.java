package newpackage.entidades;


public class Materia {
    
    private int intIdMateria;
    private String strNombre;
    private int  datAnio;
    private boolean booEstado;

    public Materia() {
    }

    public Materia(String strNombre, int datAnio, boolean booEstado) {
        this.strNombre = strNombre;
        this.datAnio = datAnio;
        this.booEstado = booEstado;
    }

    public int getIntIdMateria() {
        return intIdMateria;
    }

    public void setIntIdMateria(int intIdMateria) {
        this.intIdMateria = intIdMateria;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public int getDatAnio() {
        return datAnio;
    }

    public void setDatAnio(int datAnio) {
        this.datAnio = datAnio;
    }

    public boolean isBooEstado() {
        return booEstado;
    }

    public void setBooEstado(boolean booEstado) {
        this.booEstado = booEstado;
    }

    @Override
    public String toString() {
        return "Materia{" + "intIdMateria=" + intIdMateria + ", strNombre=" + strNombre + ", datAnio=" + datAnio + ", booEstado=" + booEstado + '}';
    }
    
    
}
