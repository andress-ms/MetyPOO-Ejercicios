package modelos;

public class Estudiante {

    private String CIF;
    private String nombre;
    private String apellido;
    private String asignatura;
    private int primerCorte;
    private int segundoCorte;
    private int tercerCorte;

    public Estudiante() {
    }

    public Estudiante(String inputCIF, String nombre, String apellido, String asignatura, int primerCorte, int segundoCorte, int tercerCorte) {
        this.CIF = inputCIF;
        this.nombre = nombre;
        this.apellido = apellido;
        this.asignatura = asignatura;
        this.primerCorte = primerCorte;
        this.segundoCorte = segundoCorte;
        this.tercerCorte = tercerCorte;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getPrimerCorte() {
        return primerCorte;
    }

    public void setPrimerCorte(int primerCorte) {
        this.primerCorte = primerCorte;
    }

    public int getSegundoCorte() {
        return segundoCorte;
    }

    public void setSegundoCorte(int segundoCorte) {
        this.segundoCorte = segundoCorte;
    }

    public int getTercerCorte() {
        return tercerCorte;
    }

    public void setTercerCorte(int tercerCorte) {
        this.tercerCorte = tercerCorte;
    }







}
