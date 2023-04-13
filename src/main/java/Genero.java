
/**
 * @author osmar
 * @version 1.0
 * @created 07-abr-2022 12:40:18
 */
public class Genero {

    private String descricao;

    public Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     *
     * @throws Throwable
     */
    @Override
    public void finalize() throws Throwable {

        super.finalize();

    }
}//end Genero
