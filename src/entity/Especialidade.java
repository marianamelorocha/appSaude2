package entity;

import java.util.List;

public class Especialidade {

  private String nomeEspecialidade;
  private List<Profissional> lsProfissional;

  /**
   * @param nomeEspecialidade
   */
  public Especialidade(String nomeEspecialidade) {
    this.nomeEspecialidade = nomeEspecialidade;
  }

  /**
   * Método para cadastrar uma especialidade
   */
  public void cadastrarEspecialidade() {
  }

  /**
   * Método para consultar uma especialidade
   */
  public void consultarEspecialidade() {
  }

  public String getNomeEspecialidade() {
    return nomeEspecialidade;
  }

  public void setNomeEspecialidade(String nomeEspecialidade) {
    this.nomeEspecialidade = nomeEspecialidade;
  }

  public List<Profissional> getLsProfissional() {
    return lsProfissional;
  }

  public void setLsProfissional(List<Profissional> lsProfissional) {
    this.lsProfissional = lsProfissional;
  }
}
