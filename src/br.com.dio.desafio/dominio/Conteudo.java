package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    //Obs: Classses abstratas só podem ser instanciadas pelas classes filhas.

    protected  static  final double XP_PADRAO =  10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXP();


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
