
/**
 * @author osmar
 * @version 1.0
 * @created 07-abr-2022 12:40:17
 */
public class FaixaEtaria {

    private int de;
    private int ate;

    public FaixaEtaria(int de, int ate) {
        this.de = de;
        this.ate = ate;
    }

    public int getDe() {
        return de;
    }

    public void setDe(int de) {
        this.de = de;
    }

    public int getAte() {
        return ate;
    }

    public void setAte(int ate) {
        this.ate = ate;
    }

    /**
     *
     * @param faixaEtaria
     * @return
     */
    public boolean ehAbaixo(FaixaEtaria faixaEtaria) {
        return false;
    }

    /**
     *
     * @throws Throwable
     */
    @Override
    public void finalize() throws Throwable {

        super.finalize();

    }
}//end FaixaEtaria
