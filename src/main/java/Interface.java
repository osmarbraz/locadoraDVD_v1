
/**
 * @author osmar
 * @version 1.0
 * @created 07-abr-2022 12:40:19
 */
public class Interface {

    public RelatorioEmprestimos relatorioEmprestimos;

    public Interface(RelatorioEmprestimos relatorioEmprestimos) {
        this.relatorioEmprestimos = relatorioEmprestimos;
    }

    public RelatorioEmprestimos getRelatorioEmprestimos() {
        return relatorioEmprestimos;
    }

    public void setRelatorioEmprestimos(RelatorioEmprestimos relatorioEmprestimos) {
        this.relatorioEmprestimos = relatorioEmprestimos;
    }

    /**
     *
     * @param string
     */
    public void imprime(String string) {

    }

    public void imprimeMenu() {

    }

    public DVD leDVD() {
        return null;
    }

    public Amigo leAmigo() {
        return null;
    }

    public void leEmprestimo() {

    }

    /**
     *
     * @param amigo
     * @param dvd
     */
    public void alteraFaixaEtaria(Amigo amigo, DVD dvd) {

    }

    /**
     *
     * @throws Throwable
     */
    @Override
    public void finalize() throws Throwable {

        super.finalize();

    }
}//end Interface
