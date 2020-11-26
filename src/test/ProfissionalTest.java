package test;

import entity.Especialidade;
import entity.Profissional;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProfissionalTest {

  @Test
  void testConstrutor() {

    String nomeDoProfissional = "App Saude";
    String nomeDaEspecialidade = "Pediatra";

    Especialidade esp1 = new Especialidade("Pediatra");
    Profissional profissional = new Profissional(nomeDoProfissional, "Rua A", 31975551111L,
        Arrays.asList(esp1));

    Assertions.assertEquals(profissional.getNomeProfissional(), nomeDoProfissional);
    Assertions.assertEquals(profissional.getLsEspecialidade().get(0).getNomeEspecialidade(),
        nomeDaEspecialidade);

  }
}
