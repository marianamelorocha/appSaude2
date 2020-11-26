package test;

import entity.PlanoDeSaude;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlanoDeSaudeTest {

  @Test
  void testConstrutor() {

    String nomeDoPlano = UUID.randomUUID().toString();
    PlanoDeSaude planoDeSaude = new PlanoDeSaude(nomeDoPlano);

    Assertions.assertEquals(planoDeSaude.getNomePlano(), nomeDoPlano);
  }
}