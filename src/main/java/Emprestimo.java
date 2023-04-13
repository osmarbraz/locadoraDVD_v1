
import java.util.Date;

/**
 * @author osmar
 * @version 1.0
 * @created 07-abr-2022 12:40:16
 */
public class Emprestimo {

    private Date dataEmprestimo;
    private Date dataDevolver;
    private DVD dvd;

    public Emprestimo(Date dataEmprestimo, Date dataDevolver, DVD dvd) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolver = dataDevolver;
        this.dvd = dvd;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolver() {
        return dataDevolver;
    }

    public void setDataDevolver(Date dataDevolver) {
        this.dataDevolver = dataDevolver;
    }

    public DVD getDvd() {
        return dvd;
    }

    public void setDvd(DVD dvd) {
        this.dvd = dvd;
    }

    /**
     *
     * @throws Throwable
     */
    @Override
    public void finalize() throws Throwable {

        super.finalize();

    }
}//end Emprestimo
