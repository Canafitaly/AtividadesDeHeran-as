import models.*;
void main() {
    Funcionario funcionario=new Funcionario();

    funcionario.setCpf("12038231923");
    funcionario.setNome("Pão");
    funcionario.setSalariobase(900d);

    System.out.println("funcionario1:"+"\n"+funcionario.getNome()+"\n"+funcionario.getCpf()+"\n"+funcionario.calcularSalarioTotal()+"\n");



    Funcionario funcionario2=new Funcionario();

    funcionario2.setCpf("12033242343");
    funcionario2.setNome("Pãozinho");
    funcionario2.setSalariobase(500d);

    System.out.println("funcionario2:"+"\n"+funcionario2.getNome()+"\n"+funcionario2.getCpf()+"\n"+funcionario2.calcularSalarioTotal()+"\n");


    Funcionario funcionario3=new Funcionario();

    funcionario3.setCpf("12033242343");
    funcionario3.setNome("Fances");
    funcionario3.setSalariobase(500d);

    System.out.println("funcionario3:"+"\n"+funcionario3.getNome()+"\n"+funcionario3.getCpf()+"\n"+funcionario3.calcularSalarioTotal()+"\n");

    Gerente gerente= new Gerente();

    gerente.setCpf("12033242343");
    gerente.setNome("Douglas");
    gerente.setDepartamento("Da rolha");
    gerente.setBonificacao(0.5d);
    gerente.setSalariobase(1800d);


    System.out.println("Primeiro Gerente:"+"\n"+gerente.getNome()+"\n"+gerente.getCpf()+"\n"+gerente.getDepartamento()+"\n"+gerente.getBonificacao()+"\n"+gerente.calcularSalarioTotal()+"\n");

    Gerente gerente2= new Gerente();

    gerente2.setCpf("492341342848230");
    gerente2.setNome("Macator");
    gerente2.setDepartamento("dounots");
    gerente2.setBonificacao(0.78d);
    gerente2.setSalariobase(1100d);

    System.out.println("segundo gerente:"+"\n"+gerente2.getNome()+"\n"+gerente2.getCpf()+"\n"+gerente2.getDepartamento()+"\n"+gerente2.getBonificacao()+"\n"+gerente2.calcularSalarioTotal()+"\n");

    Desenvolvedor desenvolvedor =new Desenvolvedor();

    desenvolvedor.setCpf("166666666");
    desenvolvedor.setNome("Coiso");
    desenvolvedor.setSalariobase(1000d);
    desenvolvedor.setBonusporprojeto(400);
    desenvolvedor.setLinguagemprincipal("java, PHP e C#");

    System.out.println("Desenvolvedor:"+"\n"+desenvolvedor.getNome()+"\n"+desenvolvedor.getCpf()+"\n"+desenvolvedor.getLinguagemprincipal()+"\n"+desenvolvedor.getBonusporprojeto()+"\n"+gerente.calcularSalarioTotal()+"\n");

}
