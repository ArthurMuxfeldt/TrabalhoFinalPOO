package TrabalhoFinalPo;

 
import java.util.Date;

public class Lancamento {

    double valor;
    private int id;
    private String descricao;
    private Date data;


    public Lancamento(double valor, String descricao, Date data) {
        setValor(valor);
        setDescricao(descricao);
        setData(data);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor não pode ser menor ou igual a 0");
        }
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser nula ou em branco");
        }
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        if (data == null) {
            throw new IllegalArgumentException("Data não pode ser nula");
        }
        this.data = data;
    }

    public double calcularTotalLancamento() {
        return valor;
    } 
    public boolean TipoLancamento(TipoLancamento TipoLancamento) {
    
    if (TipoLancamento == TipoLancamento.DESPESA) {
        return false; 
    }
    return true; 
}
}