package Estudo_java;

import Color.Cor;
import Font.Fonts;

import java.awt.BorderLayout;

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
	}
	public void show() {
		janelaFrame.setTitle("JOGO DA VELHA");
		janelaFrame.setVisible(true);
		janelaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaFrame.setLocationRelativeTo(null);
		janelaFrame.setSize(700, 500);
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
		
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));
		panel2.setBackground(Cor.WHITE.getCor());
		panel2.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Cor.BLACK.getCor(), 1),
				BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		
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
