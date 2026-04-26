import models.*;
void main() {
    Funcionario funcionario=new Funcionario();

    funcionario.setCpf("12038231923");
    funcionario.setNome("Pão");
    funcionario.setSalariobase(900d);

    System.out.println("funcionario1: "+"\n"+"nome: "+funcionario.getNome()+"\n"+"CPF: "+funcionario.getCpf()+"\n"+"Salario: "+funcionario.calcularSalarioTotal()+"\n");



    Funcionario funcionario2=new Funcionario();

    funcionario2.setCpf("12033242343");
    funcionario2.setNome("Pãozinho");
    funcionario2.setSalariobase(500d);

    System.out.println("funcionario2: "+"\n"+"nome: "+funcionario2.getNome()+"\n"+"CPF: "+funcionario2.getCpf()+"\n"+"Salario: "+funcionario2.calcularSalarioTotal()+"\n");


    Funcionario funcionario3=new Funcionario();

    funcionario3.setCpf("12033242343");
    funcionario3.setNome("Fances");
    funcionario3.setSalariobase(500d);

    System.out.println("funcionario3:"+"\n"+"nome: "+funcionario3.getNome()+"\n"+"CPF: "+funcionario3.getCpf()+"\n"+"Salario total: "+funcionario3.calcularSalarioTotal()+"\n");

    Gerente gerente= new Gerente();

    gerente.setCpf("12033242343");
    gerente.setNome("Douglas");
    gerente.setDepartamento("Da rolha");
    gerente.setBonificacao(0.5d);
    gerente.setSalariobase(1800d);


    System.out.println("Primeiro Gerente: "+"\n"+"nome: "+gerente.getNome()+"\n"+"CPF: "+gerente.getCpf()+"\n"+"Departamento: "+gerente.getDepartamento()+"\n"+"Bonificação: "+gerente.getBonificacao()+"\n"+"salario total: "+gerente.calcularSalarioTotal()+"\n");

    Gerente gerente2= new Gerente();

    gerente2.setCpf("492341342848230");
    gerente2.setNome("Macator");
    gerente2.setDepartamento("dounots");
    gerente2.setBonificacao(0.78d);
    gerente2.setSalariobase(1100d);

    System.out.println("segundo gerente: "+"\n"+"nome: "+gerente2.getNome()+"\n"+"CPF: "+gerente2.getCpf()+"\n"+"Departamento: "+gerente2.getDepartamento()+"\n"+"Bonificação: "+gerente2.getBonificacao()+"\n"+"Calcular salario: "+gerente2.calcularSalarioTotal()+"\n");

    Desenvolvedor desenvolvedor =new Desenvolvedor();

    desenvolvedor.setCpf("166666666");
    desenvolvedor.setNome("Coiso");
    desenvolvedor.setSalariobase(1000d);
    desenvolvedor.setBonusporprojeto(400);
    desenvolvedor.setLinguagemprincipal("java, PHP e C#");

    System.out.println("Desenvolvedor: "+"\n"+"nome: "+desenvolvedor.getNome()+"\n"+"CPF: "+desenvolvedor.getCpf()+"\n"+"Linguagem: "+desenvolvedor.getLinguagemprincipal()+"\n"+"Bonuns por projeto: "+desenvolvedor.getBonusporprojeto()+"\n"+"Calcular salario: "+gerente.calcularSalarioTotal()+"\n");

}
