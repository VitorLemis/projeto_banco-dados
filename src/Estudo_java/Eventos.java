package Estudo_java;

import javax.swing.JOptionPane;

import DAO.AcessoMysql;

public class Eventos {
	DadosUser dadosUser;
	VerificarDigitacao verificar;
	private int linhaAlteradas;
	Eventos() {
		dadosUser = new DadosUser();
		verificar = new VerificarDigitacao();
	}
	protected void jogar() {
		if (dadosUser.getNome() != null && dadosUser.getIdade() != 0) {
			
		}else {
			System.out.println("cadastrar user");
			MainWindow.btnComfirm.setVisible(true);
			MainWindow.text_cadastrarNome.setVisible(true);
			MainWindow.text_cadastrarIdade.setVisible(true);
			MainWindow.fieldCadastrarNome.setVisible(true);
			MainWindow.FieldCadastrarIdade.setVisible(true);
			verificar.verificar();
		}
	}
	protected void sair() {
		System.exit(0);
	}
	protected void comfirme() {
		if (AcessoMysql.getBancoDados()) {
			JOptionPane.showMessageDialog(null, "Usuario ja existente click em ok para entrar");
			MainWindow.btnComfirm.setVisible(false);
			MainWindow.text_cadastrarNome.setVisible(false);
			MainWindow.text_cadastrarIdade.setVisible(false);
			MainWindow.fieldCadastrarNome.setVisible(false);
			MainWindow.FieldCadastrarIdade.setVisible(false);
			verificar.interruptThread();
		}else {
			if (verificar.aprovardoIdade && verificar.aprovardoNome) {
				dadosUser.setNome(MainWindow.fieldCadastrarNome.getText());
				dadosUser.setIdade(Integer.parseInt(MainWindow.FieldCadastrarIdade.getText()));
				linhaAlteradas = AcessoMysql.setBancoDados(dadosUser.getNome(), dadosUser.getIdade());
				if (linhaAlteradas != 0) {
					MainWindow.btnComfirm.setVisible(false);
					MainWindow.text_cadastrarNome.setVisible(false);
					MainWindow.text_cadastrarIdade.setVisible(false);
					MainWindow.fieldCadastrarNome.setVisible(false);
					MainWindow.FieldCadastrarIdade.setVisible(false);
					verificar.interruptThread();
					JOptionPane.showMessageDialog(null, "Seu Dados Foram Salvos");
				}else {
					System.out.println("Nenhuma linha tabela adicionada !");
				}
			}else {
				JOptionPane.showMessageDialog(null, "Dados Invaliados !");
			}
		}
	}
}
