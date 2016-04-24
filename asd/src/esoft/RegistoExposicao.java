/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esoft;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PRenato
 */
public class RegistoExposicao {

    Exposicao e;
    List<Exposicao> listaExposicoes;

    public Exposicao novaExposicao() {
        e = new Exposicao();
        return e;
    }

    public void validaExposicao(Exposicao e) {
        e.valida();
    }

    public void registaExposicao(Exposicao e) {
        validaExposicao(e);
        listaExposicoes.add(e);
    }

    public List<Exposicao> getListaExposicoes(Organizador o) {
        List<Exposicao> listaEfetiva = new ArrayList();
        for (Exposicao e : listaExposicoes) {
            for (Organizador org : e.getListaOrganizadores().getListaOrganizadores()) {//o 2º getListaOrganizadores é o objeto lista que contem as instancias
                if (o.equals(org)) {
                    listaEfetiva.add(e);
                }
            }
        }
        return listaEfetiva;
    }
}
