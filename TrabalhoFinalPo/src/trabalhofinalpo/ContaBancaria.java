/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinalpo;

import java.util.ArrayList;

/**
 *
 * @author tuclo jpssa
 */

public class ContaBancaria {
    
    private ArrayList<Lancamento> lancamentos = new ArrayList<>();

    public ArrayList<Lancamento> getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(ArrayList<Lancamento> lancamentos) {
        this.lancamentos = lancamentos;
    }

    public void incluirLancamento(Lancamento lancamento) {
        if (lancamento == null) {
            throw new IllegalArgumentException("O Lancamento nao pode ser nulo.");
        }
        lancamentos.add(lancamento);
    }
    
}