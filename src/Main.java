import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descicao do curso de java");
        curso1.setCargahoraria(8);

     

        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descicao do curso de js");
        curso2.setCargahoraria(6);

        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descicao mentoria java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso2+"\n"+curso1+"\n"+mentoria1);
    }
}
