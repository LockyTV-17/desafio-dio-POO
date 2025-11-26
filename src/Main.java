
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descicao do curso de java");
        curso1.setCargahoraria(8);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descicao mentoria java");
        mentoria1.setData(LocalDate.now());

        Curso curso2 = new Curso();    
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descicao do curso de js");
        curso2.setCargahoraria(6);

        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLuan = new Dev();
        devLuan.setNome("Luan");
        devLuan.increverBootCamp(bootcamp);
        
        Dev devMaicon = new Dev();
        devMaicon.setNome("Maicon");
        devMaicon.increverBootCamp(bootcamp);

        System.out.println(" Nome: "+devLuan.getNome()+" Conteudos Inscritos" +devLuan.getConteudosInscritos());
        devLuan.progredir();
        devLuan.progredir();
        System.out.println(" Nome: "+devLuan.getNome()+" Conteudos Inscritos" +devLuan.getConteudosInscritos());
        System.out.println(" Nome: "+devLuan.getNome()+" Conteudos Concluidos" +devLuan.getConteudosConcluidos()+"\n");
        System.out.println("XP geral: "+devLuan.cacularTotalXp());


        System.out.println(" Nome: "+devMaicon.getNome()+" Conteudos Inscritos" + devMaicon.getConteudosInscritos());
        devMaicon.progredir();
        System.out.println(" Nome: "+devMaicon.getNome()+" Conteudos Inscritos" + devMaicon.getConteudosInscritos());
        System.out.println(" Nome: "+devMaicon.getNome()+" Conteudos Concluidos" + devMaicon.getConteudosConcluidos());
        System.out.println("XP geral: "+devMaicon.cacularTotalXp());
   

    }
}
        // Curso curso1 = new Curso();
        // Mentoria mentoria1 = new Mentoria();
        // Curso curso2 = new Curso();
        


        // curso2.setTitulo("Curso js");
        // curso2.setDescricao("Descicao do curso de js");
        // curso2.setCargahoraria(6);

        // mentoria1.setTitulo("mentoria java");
        // mentoria1.setDescricao("descicao mentoria java");
        // mentoria1.setData(LocalDate.now());

        //System.out.println(curso2+"\n"+curso1+"\n"+mentoria1);