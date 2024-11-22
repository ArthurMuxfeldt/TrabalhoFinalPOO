/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinalPo;

 
import java.util.Date;

/**
 *
 * @author jpssa
 */
public class Despesa extends Lancamento {

    private double juros;
    private TipoDespesa tipoDespesa;

    public Despesa(double juros, TipoDespesa tipoDespesa, double valor, String descricao, Date data) {
        super(valor, descricao, data);
        this.juros = juros;
        this.tipoDespesa = tipoDespesa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        if (juros <=0 ) {
            throw new IllegalArgumentException("Juros não pode ser nulo ou menor que zero.");
        }
        this.juros = juros;
    }

    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        if (tipoDespesa == null) {
            throw new IllegalArgumentException("A despesa precisa ser preenchida.");
        }
        this.tipoDespesa = tipoDespesa;
    }

    public double calcularTotalLancamento() {
        return valor;        
    }
  
}

