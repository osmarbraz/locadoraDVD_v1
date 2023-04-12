
/**
 * @author osmar
 * @version 1.0
 * @created 07-abr-2022 12:40:10
 */
public class Amigo extends Pessoa {

    private long numTelefone;
    private String email;
    private String endereco;
    private FaixaEtaria faixaEtaria;

    public Amigo(String nome, long numTelefone, String email, String endereco, FaixaEtaria faixaEtaria) {
        super(nome);
        this.numTelefone = numTelefone;
        this.email = email;
        this.endereco = endereco;
        this.faixaEtaria = faixaEtaria;
    }

    public long getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(long numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public FaixaEtaria getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }
}//end Amigo
