import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}
