package entity;

public class Paciente {

  private String nome;
  private String email;
  private Integer cpf;
  private Long telefone;
  private PlanoDeSaude planoDeSaude;

  /**
   * @param nome
   * @param email
   * @param cpf
   * @param telefone
   * @param planoDeSaude
   */
  public Paciente(String nome, String email, Integer cpf, Long telefone,
      PlanoDeSaude planoDeSaude) {
    this.nome = nome;
    this.email = email;
    this.cpf = cpf;
    this.telefone = telefone;
    this.planoDeSaude = planoDeSaude;
  }

  /**
   * método para cadastrar um paciente
   */
  public void cadastrarPaciente() {
  }

  /**
   * método para editar um paciente
   */
  public void editarPaciente() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getCpf() {
    return cpf;
  }

  public void setCpf(Integer cpf) {
    this.cpf = cpf;
  }

  public Long getTelefone() {
    return telefone;
  }

  public void setTelefone(Long telefone) {
    this.telefone = telefone;
  }

  public PlanoDeSaude getPlanoDeSaude() {
    return planoDeSaude;
  }

  public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
    this.planoDeSaude = planoDeSaude;
  }
}
