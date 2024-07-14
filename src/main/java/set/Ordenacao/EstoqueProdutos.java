package main.java.set.Ordenacao;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    
    private  Map<Long, Produto>estoqueProdutosMap;


    public EstoqueProdutos(){
        this.estoqueProdutosMap = new  HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod, new Produto(cod, nome, preco, quantidade));
    }

    public void  exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public  double calcularValorTotalEstoque(){
        double valorTotalEstoquee = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }


    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p : estoqueProdutosMap.values()){
            if (p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
    
    return  produtoMaisCaro;
}
}
