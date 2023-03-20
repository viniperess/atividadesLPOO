package model;

public class Aluno {
    private Integer id;
    private Integer Cpf;
    private String nome;
    private String sobrenome;
    private String email;

    public Aluno(Integer id, Integer cpf, String nome, String sobrenome, String email) {
        this.id = id;
        Cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public Aluno() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCpf() {
        return Cpf;
    }

    public void setCpf(Integer cpf) {
        Cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nAluno{" +
                "id=" + id +
                ", Cpf=" + Cpf +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
