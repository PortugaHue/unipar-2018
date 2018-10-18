package strategy;

public class Main {
	
	/*
	 Regras:
		- O Desenvolvedor deve ter um imposto de 15% caso seu sal�rio seja maior que R$ 2000,00 e 10% caso contr�rio;
		- O Gerente deve ter um imposto de 20% caso seu sal�rio seja maior que R$ 3500,00 e 15% caso contr�rio;
		- O DBA deve ter um imposto de  de 15% caso seu sal�rio seja maior que R$ 2000,00 e 10% caso contr�rio;
	 */
	
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR, 2100);
		System.out.println(umFuncionario.calcularSalarioComImposto());

		Funcionario outroFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR, 1700);
		System.out.println(outroFuncionario.calcularSalarioComImposto());
	}
}