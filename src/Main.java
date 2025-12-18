import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
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

        Dev dev1 = new Dev();
        Dev dev2 = new Dev();
        dev1.setNome("Camila");
        dev2.setNome("João");

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Dev1: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Dev1: " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Dev2: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Dev2: " + dev2.getConteudosConcluidos());


        dev1.progredir();
        dev2.progredir();

        System.out.println("Conteúdos Inscritos Dev1: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Dev1: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        System.out.println("Conteúdos Inscritos Dev2: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Dev2: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
