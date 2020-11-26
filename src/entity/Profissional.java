package entity;

import java.util.List;

public class Profissional {

  private String nomeProfissional;
  private String endereco;
  private Long telefoneProfissional;
  private List<Especialidade> lsEspecialidade;

  /**
   * @param nomeProfissional
   * @param endereco
   * @param telefoneProfissional
   * @param lsEspecialidade
   */
  public Profissional(String nomeProfissional, String endereco, Long telefoneProfissional,
      List<Especialidade> lsEspecialidade) {
    this.nomeProfissional = nomeProfissional;
    this.endereco = endereco;
    this.telefoneProfissional = telefoneProfissional;
    this.lsEspecialidade = lsEspecialidade;
  }

  /**
   * método para cadastrar um profissional
   */
  public void cadastrarProfissional() {
  }

  /**
   * método para editar um profissional
   */
  public void editarProfissional() {
  }

  /**
   * método para excluir um profissional
   */
  public void excluirProfissional() {
  }

  /**
   * método para consultar um profissional
   */
  public void consultarProfissional() {
  }

  public String getNomeProfissional() {
    return nomeProfissional;
  }

  public void setNomeProfissional(String nomeProfissional) {
    this.nomeProfissional = nomeProfissional;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Long getTelefoneProfissional() {
    return telefoneProfissional;
  }

  public void setTelefoneProfissional(Long telefoneProfissional) {
    this.telefoneProfissional = telefoneProfissional;
  }

  public List<Especialidade> getLsEspecialidade() {
    return lsEspecialidade;
  }

  public void setLsEspecialidade(List<Especialidade> lsEspecialidade) {
    this.lsEspecialidade = lsEspecialidade;
  }
}
