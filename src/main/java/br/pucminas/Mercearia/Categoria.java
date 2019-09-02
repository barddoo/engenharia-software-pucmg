package br.pucminas.Mercearia;

/**
 * Bebidas, 33% Comida, 18% Material de limpeza, 25%
 */
public enum Categoria {
    COMIDA("Comida", 0.33), BEBIDA("Bebida", 0.18), MATERIALLIMPEZA("Material de Limpeza", 0.25);

    private String descricao;
    private double imposto;

    Categoria(String descricao, double imposto) {
        this.descricao = descricao;
        this.imposto = (imposto / 100);
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the imposto
     */
    public double getImposto() {
        return imposto;
    }
}
