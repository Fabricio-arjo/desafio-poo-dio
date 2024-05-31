package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {

    private String nome;

    //Obs: Usar Set paar garantir que só hajam objetos únicos.
    //Obs: Usar LinkedHashSet pois a ordem é importante.
    private Set<Conteudo> conteudosInscritos =  new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos =  new LinkedHashSet<>();

   public void inscreverBootcamp(Bootcamp bootcamp){
        //Adicionando todos os conteúdos do bootcamp dentro do Set conteúdos inscritos.
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        //Adicionar Devs inscritos ao bootcamp. This faz referência ao parâmetro objeto bootcamp
        bootcamp.getDevsInscritos().add(this);
   }

   public void progredir(){
       //Pega o primeiro conteúdo
       Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
       if (conteudo.isPresent()){
           //Pegar os conteúdos incritos e coloca dentro dos conteúdos concluídos.
           this.conteudosConcluidos.add(conteudo.get());
           //Pegar os conteúdos concluídos e remove dos conteúdos inscritos.
           this.conteudosInscritos.remove(conteudo.get());
       }else {
           System.err.println("Você não está matriculado em nenhum conteúdo");
       }
   }

   public double calcularTotalXP(){
       //Pegar XP de cada conteúdo e somar.
        return  this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
   }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }



   //Equals e hashcode porque estamos utilizando Hashs
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
