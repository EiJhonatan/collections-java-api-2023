package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrdenacaoPessoa {
 
    private List<Pessoa> pessoalList;

    public OrdenacaoPessoa(){
        this.pessoalList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoalList.add(new  Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoalList);
        Collection.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoalList);
        Collection.sort(pessoasPorAltura, new ComparatorPorAltura());
        return  pessoasPorAltura;
    }
}
