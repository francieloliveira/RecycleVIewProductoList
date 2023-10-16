package com.example.recycleviewproductolist;

import android.widget.ImageView;

public class Produto {

    private String nome;
    private String descricao;
    private float valor;
    private int imagem;

    public Produto(String nome, String descricao, float valor, int imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.imagem = imagem;
    }

    public Produto() {
    }

    public Produto(String nomeProduto, String descricaoProduto, float valor) {
        this.nome = nomeProduto;
        this.descricao = descricaoProduto;
        this.valor = valor;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }




    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
