package models;

public class Gerente extends Funcionario{
    private String departamento;
    private double bonificacao;

    @Override
    public double calcularSalarioTotal() {
        double a=super.calcularSalarioTotal();
        a=a+(a*this.bonificacao);
        return a;
    }



    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
