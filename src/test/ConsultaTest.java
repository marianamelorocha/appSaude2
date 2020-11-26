package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import entity.Consulta;
import entity.Especialidade;
import entity.Paciente;
import entity.PlanoDeSaude;
import entity.Profissional;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ConsultaTest {

  @Test
  void testeConsultaConstrutor() {

    String nomeDoMedico = "App Saude";
    String nomeDoPlano = "Plano de Saude A";

    Especialidade esp1 = new Especialidade("Cardiologista");
    Especialidade esp2 = new Especialidade("Pediatra");
    Profissional profissional = new Profissional(nomeDoMedico, "Rua A", 31975551111L,
        Arrays.asList(esp1, esp2));

    PlanoDeSaude planoDeSaude = new PlanoDeSaude(nomeDoPlano);
    Paciente paciente = new Paciente("Aluno", "aluno@gmail.com", 00011100012, 31975552222L,
        planoDeSaude);

    Consulta consulta = new Consulta(LocalDateTime.now(), new BigDecimal("99.99"), paciente,
        planoDeSaude, profissional);

    assertEquals(consulta.getProfissional().getNomeProfissional(), nomeDoMedico);
    assertEquals(consulta.getPrecoConsulta(), new BigDecimal("99.99"));
    assertEquals(consulta.getPlanoDeSaude().getNomePlano(), nomeDoPlano);

  }
}