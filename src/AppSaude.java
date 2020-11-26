import entity.Consulta;
import entity.Especialidade;
import entity.Exame;
import entity.Paciente;
import entity.PlanoDeSaude;
import entity.Profissional;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AppSaude {

  public static void main(String[] args) {

    Especialidade esp1 = new Especialidade("Cardiologista");
    Especialidade esp2 = new Especialidade("Pediatra");
    Profissional profissional = new Profissional("App Saude", "Rua A", 31975551111L,
        Arrays.asList(esp1, esp2));

    PlanoDeSaude planoDeSaude = new PlanoDeSaude("Plano A");
    Paciente paciente = new Paciente("Aluno", "aluno@gmail.com", 00011100012, 31975552222L,
        planoDeSaude);

    Consulta consulta = new Consulta();
    consulta.setAgendamento(LocalDateTime.now());
    consulta.setProfissional(profissional);
    consulta.setPaciente(paciente);
    consulta.setPlanoDeSaude(planoDeSaude);
    consulta.setPrecoConsulta(new BigDecimal("99.99"));

    Exame exame1 = new Exame();
    exame1.setNomeExame("Exame de Sangue");
    exame1.setConsulta(consulta);
    exame1.setPrecoExame(new BigDecimal("299.99"));
    exame1.setPreparoExame("Jejum de 8 horas");

    Exame exame2 = new Exame();
    exame2.setNomeExame("Exame de urina");
    exame2.setConsulta(consulta);
    exame2.setPrecoExame(new BigDecimal("199.99"));
    exame2.setPreparoExame("Jejum de 12 horas");

    //consulta.setLsExames(Arrays.asList(exame1, exame2));

    System.out.println("Consulta   : " + consulta.getAgendamento()
        .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    System.out.println("Paciente   : " + consulta.getPaciente().getNome());
    System.out.println("Plano      : " + consulta.getPaciente().getPlanoDeSaude().getNomePlano());
    System.out.println("Medico     : " + consulta.getProfissional().getNomeProfissional());
    System.out.println("M. Espec.  : " + consulta.getProfissional().getLsEspecialidade().stream()
        .map(Especialidade::getNomeEspecialidade).collect(Collectors.joining(", ")));

//    System.out.println("Exames     : " + consulta.getLsExames().stream()
//        .map(Exame::getNomeExame).collect(Collectors.joining(", ")));
  }
}

