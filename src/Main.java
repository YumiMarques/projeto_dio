import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao(" Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMonique = new Dev();
        devMonique.setNome("Monique");
        devMonique.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Monique:" + devMonique.getConteudosInscritos());
        devMonique.progredir();
        devMonique.progredir();
        devMonique.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Monique:" + devMonique.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Monique:" + devMonique.getConteudosConcluidos());
        System.out.println("XP:" + devMonique.calcularTotalXp());

        System.out.println("-------");

        Dev devYuri = new Dev();
        devYuri.setNome("Yuri");
        devYuri.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Yuri:" + devYuri.getConteudosInscritos());
        devYuri.progredir();
        devYuri.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Yuri:" + devYuri.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Yuri:" + devYuri.getConteudosConcluidos());
        System.out.println("XP:" + devYuri.calcularTotalXp());

        System.out.println("-------");

        Dev devJessica = new Dev();
        devJessica.setNome("Jessica");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jessica:" + devJessica.getConteudosInscritos());
        devJessica.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jessica:" + devJessica.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jessica:" + devJessica.getConteudosConcluidos());
        System.out.println("XP:" + devJessica.calcularTotalXp());
    }
}
