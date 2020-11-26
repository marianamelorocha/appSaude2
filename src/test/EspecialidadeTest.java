package test;

import entity.Especialidade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EspecialidadeTest {

  @Test
  void testEspecialidadeConstrutor() {

    String expectedNomeEspecialidade = "Cardiologista";
    Especialidade esp1 = new Especialidade(expectedNomeEspecialidade);

    Assertions.assertEquals(esp1.getNomeEspecialidade(), expectedNomeEspecialidade);
  }
}