
/**
 * @author osmar
 * @version 1.0
 * @created 07-abr-2022 12:40:23
 */
public class RelatorioEmprestimos {

    private RegistroEmprestimo registroEmprestimo[];

    public RelatorioEmprestimos(RegistroEmprestimo[] registroEmprestimo) {
        this.registroEmprestimo = registroEmprestimo;
    }

    public RegistroEmprestimo[] getRegistroEmprestimo() {
        return registroEmprestimo;
    }

    public void setRegistroEmprestimo(RegistroEmprestimo[] registroEmprestimo) {
        this.registroEmprestimo = registroEmprestimo;
    }

    /**
     *
     */
    public void imprimeRelatorio() {

    }

    /**
     *
     * @throws Throwable
     */
    @Override
    public void finalize() throws Throwable {

        super.finalize();

    }
}//end RelatorioEmprestimos
