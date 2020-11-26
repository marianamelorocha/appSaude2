package entity;

public class PlanoDeSaude {

  private String nomePlano;

  /**
   * @param nomePlano
   */
  public PlanoDeSaude(String nomePlano) {
    this.nomePlano = nomePlano;
  }

  /**
   * método para cadastrar um plano
   */
  public void cadastrarPlano() {
  }

  /**
   * método para excluir um plano
   */
  public void excluirPlano() {
  }

  /**
   * método para autorizar uma consulta
   */
  public void autorizarConsulta() {
  }

  /**
   * método para autorizar um exame
   */
  public void autorizarExame() {
  }

  public String getNomePlano() {
    return nomePlano;
  }

  public void setNomePlano(String nomePlano) {
    this.nomePlano = nomePlano;
  }
}
