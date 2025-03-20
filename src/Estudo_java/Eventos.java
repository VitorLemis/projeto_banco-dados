package Estudo_java;

import javax.swing.JOptionPane;

import DAO.AcessoMysql;
import DAO.conexao;

public class Eventos {
	DadosUser dadosUser;
	VerificarDigitacao verificar;
	Eventos() {
		dadosUser = new DadosUser();
		verificar = new VerificarDigitacao();
	}
	protected void jogar() {
		if (dadosUser.getNome() != null && dadosUser.getIdade() != 0) {
			System.out.println("jogar");
		}else {
			System.out.println("cadastrar user");
			verificar.verificar();
		}
	}
	protected void sair() {
		System.out.println("sair");
		System.exit(0);
	}
	protected void comfirme() {
		if (verificar.aprovardoIdade && verificar.aprovardoNome) {
			dadosUser.setNome(MainWindow.fieldCadastrarNome.getText());
			dadosUser.setIdade(Integer.parseInt(MainWindow.FieldCadastrarIdade.getText()));
			AcessoMysql.setBancoDados(dadosUser.getNome(), dadosUser.getIdade());
		}else {
			JOptionPane.showMessageDialog(null, "Dados Invaliados !");
		}
	}
}
