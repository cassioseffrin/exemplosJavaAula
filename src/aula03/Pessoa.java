package aula03;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;
 

/**
 * 
 * @author cassioseffrin
 */
public class Pessoa implements Serializable, Comparator<Pessoa> {

    private Integer codigo;
    private String nome;
    private Date dataNascimento;
    private String sexo;
    private String cpf;
    private String endereco;
    
    private String carro="gol";
    
    
    public String obs="teste";
    
    public static int tipoObjeto;
    
    
    public static final long serialVersionUID = 7590493038443485120L;

    public Pessoa(Integer codigo, String nome,
            Date dataNascimento, String sexo, String cpf,
            String endereco
    ) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Pessoa(String nome) {
        this.nome=nome;

    }

    public Pessoa() {
    }

    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public java.util.Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(java.util.Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " CPF:" + getCpf()  + " Endereco: "+getEndereco();
    }

    /**
     * Método que calcula a idade com base da nada de nascimento.
     *
     * @return retorna um valor inteiro representando a data de nascimento.
     */
    public int getIdade() {
        Date atual = new Date();
        int idade;
        int anoAtual = atual.getYear() + 1900; //comentario
        int anoNasc = getDataNascimento().getYear();
        idade = anoAtual - anoNasc;
        int mesAtual = atual.getMonth();
        int mesNasc = getDataNascimento().getMonth();
        int diaAtual = atual.getDate();
        int diaNasc = getDataNascimento().getDate();
        if (mesNasc > mesAtual) {
            idade = idade - 1;
        } else if (diaNasc >= diaAtual) {
            idade--;
        }
        return idade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
   public static Pessoa getPessoaPorNome(ArrayList<Pessoa> lstPes, String nome ) {
    for(Pessoa pessoa : lstPes) {
        if(pessoa.getNome().equals(nome)) {
            return pessoa;
        }
    }
    return null;
    
    
    
    
    
}

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getNome() .compareTo(o2.getNome());
    }

}
