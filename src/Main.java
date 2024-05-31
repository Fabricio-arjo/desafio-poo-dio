import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);



        Dev devDeveloper = new Dev();
        devDeveloper.setNome("Fabrício");
        devDeveloper.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fabrício: "+devDeveloper.getConteudosInscritos());
        devDeveloper.progredir();
        devDeveloper.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Fabrício: "+devDeveloper.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Fabrício: "+devDeveloper.getConteudosConcluidos());
        System.out.println("XP: "+devDeveloper.calcularTotalXP());

        System.out.println("-----------");

        Dev devZe = new Dev();
        devZe.setNome("José");
        devZe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos José: "+devZe.getConteudosInscritos());
        devZe.progredir();
        devZe.progredir();
        devZe.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos José: "+devZe.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos José: "+devZe.getConteudosConcluidos());
        System.out.println("XP: "+devZe.calcularTotalXP());

    }
}
