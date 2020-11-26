package entity;

import java.math.BigDecimal;

public class Exame {

  private String nomeExame;
  private String preparoExame;
  private BigDecimal precoExame;
  private Consulta consulta;

  public Exame() {
  }

  /**
   * @param nomeExame
   * @param preparoExame
   * @param precoExame
   * @param consulta
   */
  public Exame(String nomeExame, String preparoExame, BigDecimal precoExame,
      Consulta consulta) {
    this.nomeExame = nomeExame;
    this.preparoExame = preparoExame;
    this.precoExame = precoExame;
    this.consulta = consulta;
  }

  /**
   * Método para cadastrar um exame
   */
  public void cadastrarExame() {
  }

  /**
   * étodo para editar um exame
   */
  public void editarExame() {
  }

  /**
   * método para agendar um exame
   */
  public void agendarExame() {
  }

  /**
   * método para remarcar um exame
   */
  public void remarcarExame() {
  }

  /**
   * método para consultar um exame
   */
  public void consultarExame() {
  }

  public String getNomeExame() {
    return nomeExame;
  }

  public void setNomeExame(String nomeExame) {
    this.nomeExame = nomeExame;
  }

  public String getPreparoExame() {
    return preparoExame;
  }

  public void setPreparoExame(String preparoExame) {
    this.preparoExame = preparoExame;
  }

  public BigDecimal getPrecoExame() {
    return precoExame;
  }

  public void setPrecoExame(BigDecimal precoExame) {
    this.precoExame = precoExame;
  }

  public Consulta getConsulta() {
    return consulta;
  }

  public void setConsulta(Consulta consulta) {
    this.consulta = consulta;
  }
}
