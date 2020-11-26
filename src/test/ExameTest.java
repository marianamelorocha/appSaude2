package test;

import entity.Exame;
import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExameTest {

  @Test
  void testConstrutor() {

    Exame exame = new Exame();
    exame.setNomeExame("Exame de urina");
    exame.setPrecoExame(new BigDecimal("199.99"));
    exame.setPreparoExame("Jejum de 12 horas");

    Assertions.assertEquals(exame.getNomeExame(), "Exame de urina");
  }
}