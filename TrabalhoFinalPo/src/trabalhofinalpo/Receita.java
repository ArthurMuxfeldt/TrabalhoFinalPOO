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
public class Receita extends Lancamento {

    private TipoReceita tipoReceita;

    public Receita(double valor, String descricao, Date data) {
        super(valor, descricao, data);
        this.tipoReceita = tipoReceita;
    }

    public TipoReceita getTipoReceita() {
        return tipoReceita;
    }

    public void setTipoReceita(TipoReceita tipoReceita) {
        if (tipoReceita == null) {
            throw new IllegalArgumentException("O tipo da receita não pode ser nulo.");
        }
        this.tipoReceita = tipoReceita;
    }

    @Override
    public double calcularTotalLancamento() {

        return super.calcularTotalLancamento();
    }

}
