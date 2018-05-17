import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import br.unipar.dao.PessoaDAO;
import br.unipar.domain.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa pes = new Pessoa();
		pes.setPrimeiroNome("Renato");
		pes.setUltimoNome("Alterado");
		pes.setDataNascimento(new Date());
		pes.setAltura(1.9);
		
		PessoaDAO dao = new PessoaDAO();
		try {
			pes = dao.salvar(pes);
			
			JOptionPane.showMessageDialog(null, 
					"Pessoa "+pes.getCodigo()+" salva com sucesso.");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		System.out.println("CONSULTANDO PESSOAS");
		System.out.println("---------------------");
		
		List<Pessoa> pessoas = dao.buscarTodos();
		for (Pessoa p : pessoas) {
			System.out.println("Codigo: "+p.getCodigo()
								+" Nome: "+p.getPrimeiroNome());
			System.out.println("---------------------");
		}
		
		System.out.println("CONSULTANDO PESSOA POR CODIGO");
		Pessoa pessoaConsulta = dao.buscarPorCodigo(1L);
		System.out.println("Nome: "+pessoaConsulta.getPrimeiroNome());
		
		System.out.println("CONSULTANDO PESSOA POR NOME");
		List<Pessoa> pessoas2 = dao.buscarPorNome("ato");
		for (Pessoa p : pessoas2) {
			System.out.println("Codigo: "+p.getCodigo()
								+" Nome: "+p.getPrimeiroNome());
			System.out.println("---------------------");
		}
		
		System.exit(0);
	}

}
