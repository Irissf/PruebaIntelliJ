public class LambdaPractice {

    private Integer codigo;
    private String moneda;
    private String descripcion;
    private float valor;

    public LambdaPractice(Integer codigo, String moneda, String descripcion, float valor) {
        this.codigo = codigo;
        this.moneda = moneda;
        this.descripcion = descripcion;
        this.valor = valor;
    }



    //region gettersSetters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    //endregion
}
