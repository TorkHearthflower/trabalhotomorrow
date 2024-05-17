package com.example;

public class Produto {
    private  String nome;
        private  float preco;
        private int qtdEstoque;
    
        public Produto(String nome, float preco, int qtdEstoque) {
            this.nome = nome;
            this.preco = preco;
            this.qtdEstoque = qtdEstoque;
        }
    
        public Produto(String nome, float preco) {
            this.nome = nome;
            this.preco = preco;
        }
    
        public void entradaEstoque (int entradaEstoque){
            qtdEstoque =+ entradaEstoque;
        }
        public void saidaEstoque (int saidaEstoque){
            qtdEstoque =- saidaEstoque;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public float getPreco() {
            return preco;
        }
    
        public void setPreco(float preco) {
            this.preco = preco;
        }
    
        public int getQtdEstoque() {
            return qtdEstoque;
        }
    
        public void setQtdEstoque(int qtdEstoque) {
            this.qtdEstoque = qtdEstoque;
        }
    }
  

