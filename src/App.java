import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Bootcamp Java!");
        curso1.setDescricao("O Bootcamp Back-end Java é uma capacitação 100% online e gratuita!");
        curso1.setCargaHoraria(60);

        curso2.setTitulo("Bootcamp Python!");
        curso2.setDescricao("O Bootcamp Back-end Python é uma capacitação 100% online e gratuita!");
        curso2.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("");
        mentoria1.setData(LocalDate.now());

        mentoria2.setTitulo("Mentoria Python");
        mentoria2.setDescricao("");
        mentoria2.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Dev");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Bootcamps Inscritos Ana:" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");
        System.out.println("Bootcamps Inscritos Ana:" + devAna.getConteudosInscritos());
        System.out.println("Bootcamps Concluídos Ana:" + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devAna.calcularTotalXp());

        System.out.println("-------");

        Dev devRicardo = new Dev();
        devRicardo.setNome("Ricardo");
        devRicardo.inscreverBootcamp(bootcamp);
        System.out.println("Bootcamps Inscritos Ricardo:" + devRicardo.getConteudosInscritos());
        devRicardo.progredir();
        devRicardo.progredir();
        devRicardo.progredir();
        System.out.println("-");
        System.out.println("Bootcamps Inscritos Ricardo:" + devRicardo.getConteudosInscritos());
        System.out.println("Bootcamps Concluidos Ricardo:" + devRicardo.getConteudosConcluidos());
        System.out.println("XP:" + devRicardo.calcularTotalXp());

    }
}
