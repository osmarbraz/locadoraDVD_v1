
/**
 * @author osmar
 * @version 1.0
 * @created 07-abr-2022 12:40:20
 */
public class Main {

    public RegistroEmprestimo registroEmprestimo;
    public Interface interfac;
    public CadastroAmigo cadastroAmigo;
    public CadastroDVD cadastroDVD;

    public Main(RegistroEmprestimo registroEmprestimo, Interface interfac, CadastroAmigo cadastroAmigo, CadastroDVD cadastroDVD) {
        this.registroEmprestimo = registroEmprestimo;
        this.interfac = interfac;
        this.cadastroAmigo = cadastroAmigo;
        this.cadastroDVD = cadastroDVD;
    }

    public void cadastraAmigos() {

    }

    public void cadastraDVDs() {

    }

    public void registraEmprestimos() {

    }

    /**
     *
     * @throws Throwable
     */
    @Override
    public void finalize() throws Throwable {

        super.finalize();

    }
}//end Main
