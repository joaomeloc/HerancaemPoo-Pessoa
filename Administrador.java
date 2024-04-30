class Administrador extends Empregado {
    private double ajudaDeCusto;

    // Construtor padrão
    public Administrador() {
    }

    // Construtor com nome, endereço, telefone, código do setor, salário base, imposto e ajuda de custo
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Redefinição do método calcularSalario
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    // Getters e Setters
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
