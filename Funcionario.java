public class Funcionario {
    private String anoContratacao;
    private String nomeCompleto;
    private double salario;

    public Funcionario(String anoContratacao, String nomeCompleto, double salario) {
        this.anoContratacao = anoContratacao;
        this.nomeCompleto = nomeCompleto;
        this.salario = salario >= 1518.00 ? salario : 1518.00; 
    }

    public String getAnoContratacao() {
        return anoContratacao;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double novoSalario) {
        if (novoSalario >= 1518.00 && novoSalario > this.salario) {
            this.salario = novoSalario;
        }
    }

    @Override
    public String toString() {
        return "Nome Completo do Funcionário: " +nomeCompleto+
               "\nAno de Contratação: " +anoContratacao+
               "\nSalário: R$ " +String.format("%.2f", salario);
    }
}
