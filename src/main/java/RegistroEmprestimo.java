
/**
 * @author osmar
 * @version 1.0
 * @created 07-abr-2022 12:40:22
 */
public class RegistroEmprestimo {

    private RelatorioEmprestimos relatorioEmprestimos;
    private Emprestimo emprestimos;

    public RegistroEmprestimo(RelatorioEmprestimos relatorioEmprestimos, Emprestimo emprestimos) {
        this.relatorioEmprestimos = relatorioEmprestimos;
        this.emprestimos = emprestimos;
    }

    public RelatorioEmprestimos getRelatorioEmprestimos() {
        return relatorioEmprestimos;
    }

    public void setRelatorioEmprestimos(RelatorioEmprestimos relatorioEmprestimos) {
        this.relatorioEmprestimos = relatorioEmprestimos;
    }

    public Emprestimo getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(Emprestimo emprestimos) {
        this.emprestimos = emprestimos;
    }

    /**
     *
     * @param amigo
     * @param dvd
     */
    public void empresta(Amigo amigo, DVD dvd) {

    }

    public void finalize() throws Throwable {

    }
}//end RegistroEmprestimo
