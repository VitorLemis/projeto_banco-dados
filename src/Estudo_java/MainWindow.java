package Estudo_java;

import Color.Cor;
import Font.Fonts;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class MainWindow {
	ActionListenerEvent eventos;
	private JFrame janelaFrame;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JLabel titulo;
	protected static JButton btnJogar;
	protected static JButton btnSair;
	protected static JButton btnComfirm;
	protected static JLabel text_cadastrarNome;
	protected static JLabel text_cadastrarIdade;
	protected static TextField  fieldCadastrarNome;
	protected static TextField FieldCadastrarIdade;
	
	MainWindow() {
		eventos =  new ActionListenerEvent();
		janelaFrame = new JFrame();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		titulo = new JLabel();
		btnJogar = new JButton();
		btnSair = new JButton();
		btnComfirm = new JButton();
		text_cadastrarIdade = new JLabel();
		text_cadastrarNome = new JLabel();
		fieldCadastrarNome = new TextField();
		FieldCadastrarIdade = new TextField();
	}
	public void show() {
		janelaFrame.setTitle("JOGO DA VELHA");
		janelaFrame.setVisible(true);
		janelaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaFrame.setLocationRelativeTo(null);
		janelaFrame.setSize(700, 500);
		janelaFrame.setResizable(false);
		janelaFrame.setLayout(new BorderLayout());
		
		titulo.setText("JOGO DA VELHA");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(Fonts.FONT_3.getFont());
		titulo.setOpaque(true);
		titulo.setBackground(Cor.WHITE.getCor());
		titulo.setForeground(Cor.BLACK.getCor());
		
		btnJogar.setText("JOGAR");
		btnJogar.setFocusPainted(false);
		btnJogar.setBackground(Cor.WHITE.getCor());
		btnJogar.setForeground(Cor.BLACK.getCor());
		btnJogar.setFont(Fonts.FONT_3.getFont());
		btnJogar.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Cor.BLACK.getCor(), 1),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		btnJogar.setHorizontalAlignment(SwingConstants.CENTER);
		btnJogar.addActionListener(eventos);
		
		btnSair.setText("SAIR");
		btnSair.setFocusPainted(false);
		btnSair.setBackground(Cor.WHITE.getCor());
		btnSair.setForeground(Cor.BLACK.getCor());
		btnSair.setFont(Fonts.FONT_3.getFont());
		btnSair.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Cor.BLACK.getCor(), 1),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		btnSair.setHorizontalAlignment(SwingConstants.CENTER);
		btnSair.addActionListener(eventos);
		
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
		panel1.setBackground(Cor.WHITE.getCor());
		panel1.setBorder(BorderFactory.createEmptyBorder(50, 30, 0, 30));
		panel1.add(btnJogar);
		panel1.add(Box.createVerticalStrut(10));
		panel1.add(btnSair);
		
		text_cadastrarNome.setText("CADASTRAR NOME");
		text_cadastrarNome.setHorizontalAlignment(SwingConstants.CENTER);
		text_cadastrarNome.setFont(Fonts.FONT_3.getFont());
		text_cadastrarNome.setOpaque(true);
		text_cadastrarNome.setBackground(Cor.WHITE.getCor());
		text_cadastrarNome.setForeground(Cor.BLACK.getCor());
		
		fieldCadastrarNome.setBackground(Cor.WHITE.getCor());
		fieldCadastrarNome.setFont(Fonts.FONT_2.getFont());
		fieldCadastrarNome.setMaximumSize(new Dimension(400, 20));
		fieldCadastrarNome.setForeground(Cor.BLACK.getCor());
		
		text_cadastrarIdade.setText("CADASTRAR IDADE");
		text_cadastrarIdade.setHorizontalAlignment(SwingConstants.CENTER);
		text_cadastrarIdade.setFont(Fonts.FONT_3.getFont());
		text_cadastrarIdade.setOpaque(true);
		text_cadastrarIdade.setBackground(Cor.WHITE.getCor());
		text_cadastrarIdade.setForeground(Cor.BLACK.getCor());
		
		FieldCadastrarIdade.setBackground(Cor.WHITE.getCor());
		FieldCadastrarIdade.setFont(Fonts.FONT_2.getFont());
		FieldCadastrarIdade.setMaximumSize(new Dimension(400, 20));
		FieldCadastrarIdade.setForeground(Cor.BLACK.getCor());
		
		btnComfirm.setText("Comfirmar");
		btnComfirm.setFocusPainted(false);
		btnComfirm.setBackground(Cor.WHITE.getCor());
		btnComfirm.setForeground(Cor.BLACK.getCor());
		btnComfirm.setFont(Fonts.FONT_3.getFont());
		btnComfirm.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Cor.BLACK.getCor(), 1),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		btnComfirm.setHorizontalAlignment(SwingConstants.CENTER);
		btnComfirm.addActionListener(eventos);
		
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));
		panel2.setBackground(Cor.WHITE.getCor());
		panel2.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Cor.BLACK.getCor(), 1),
				BorderFactory.createEmptyBorder(30, 30, 30, 30)));
		panel2.add(text_cadastrarNome);
		panel2.add(fieldCadastrarNome);
		panel2.add(Box.createVerticalStrut(20));
		panel2.add(text_cadastrarIdade);
		panel2.add(FieldCadastrarIdade);
		panel2.add(Box.createVerticalStrut(20));
		panel2.add(btnComfirm);
		
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.PAGE_AXIS));
		panel3.setBackground(Cor.WHITE.getCor());
		panel3.add(Box.createHorizontalStrut(30));
		
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.PAGE_AXIS));
		panel4.setBackground(Cor.WHITE.getCor());
		panel4.add(Box.createVerticalStrut(30));
		
		janelaFrame.getContentPane().add(titulo, BorderLayout.NORTH);
		janelaFrame.getContentPane().add(panel1, BorderLayout.WEST);
		janelaFrame.getContentPane().add(panel2, BorderLayout.CENTER);
		janelaFrame.getContentPane().add(panel3, BorderLayout.EAST);
		janelaFrame.getContentPane().add(panel4, BorderLayout.SOUTH);
	}
}
