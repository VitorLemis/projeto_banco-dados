package Estudo_java;
import Color.Cor;

public class VerificarDigitacao{
	private Thread thread;
	protected static boolean controler;
	protected static boolean aprovardoNome;
	protected static boolean aprovardoIdade;
	VerificarDigitacao() {
		aprovardoNome = false;
		aprovardoIdade = false;
		controler = true;
	}
	private int tamandoTextoNome() {
		//System.out.println("nome: " + MainWindow.fieldCadastrarNome.getText().length());
		if (MainWindow.fieldCadastrarNome.getText() != null) {
			return MainWindow.fieldCadastrarNome.getText().length();
		}else {
			return 0;
		}
	}
	private int[] tamandoTextoIdade() {
		//System.out.println("idade: " + MainWindow.FieldCadastrarIdade.getText().length());
		if (MainWindow.FieldCadastrarIdade.getText() != null && MainWindow.FieldCadastrarIdade.getText().length() != 0) {
			return new int[]{MainWindow.FieldCadastrarIdade.getText().length(),Integer.parseInt(MainWindow.FieldCadastrarIdade.getText())};
		}else {
			return new int[] {0, 0};
		}
	}
	private void setFieldNome(Boolean c) {
		if (c) {
			MainWindow.fieldCadastrarNome.setForeground(Cor.BLACK.getCor());
			aprovardoNome = true;
		}else {
			MainWindow.fieldCadastrarNome.setForeground(Cor.RED.getCor());
			aprovardoNome = false;
		}
	}
	private void setFieldIdade(Boolean c) {
		if (c) {
			MainWindow.FieldCadastrarIdade.setForeground(Cor.BLACK.getCor());
			aprovardoIdade = true;
		}else {
			MainWindow.FieldCadastrarIdade.setForeground(Cor.RED.getCor());
			aprovardoIdade = false;
		}
	}
	protected void verificar() {
		thread = new Thread(new Runnable() {
			public void run() {
				while(controler) {
					try {
						if (tamandoTextoNome() >= 4 && tamandoTextoNome() <= 30) {
							setFieldNome(true);
						}else {
							setFieldNome(false);
						}
						if (tamandoTextoIdade()[0] != 0 && tamandoTextoIdade()[1] >= 5) {
							setFieldIdade(true);
						}else {
							setFieldIdade(false);
						}
						thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
						System.out.printf("ERRO: %s",e.getMessage());
					}finally {
						System.out.println("-");
					}
				}
			}
		});
		thread.start();
	}
}
