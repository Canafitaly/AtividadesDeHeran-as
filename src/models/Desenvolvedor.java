package models;

public class Desenvolvedor extends Funcionario{
    private String linguagemprincipal;
    private double bonusporprojeto;

    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal()+this.bonusporprojeto;
    }

    public String getLinguagemprincipal() {
        return linguagemprincipal;
    }

    public void setLinguagemprincipal(String linguagemprincipal) {
        this.linguagemprincipal = linguagemprincipal;
    }

    public double getBonusporprojeto() {
        return bonusporprojeto;
    }

    public void setBonusporprojeto(double bonusporprojeto) {
        this.bonusporprojeto = bonusporprojeto;
    }
}
