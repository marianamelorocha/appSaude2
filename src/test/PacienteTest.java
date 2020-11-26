package test;

import entity.Paciente;
import entity.PlanoDeSaude;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PacienteTest {

  @Test
  void testConstrutor() {

    String nomeDoPaciente = UUID.randomUUID().toString();
    Integer cpf = 00011100012;

    PlanoDeSaude planoDeSaude = new PlanoDeSaude("Plano A");
    Paciente paciente = new Paciente(nomeDoPaciente, "aluno@gmail.com", cpf, 31975552222L,
        planoDeSaude);

    Assertions.assertEquals(paciente.getNome(), nomeDoPaciente);
    Assertions.assertEquals(paciente.getCpf(), cpf);
  }
}