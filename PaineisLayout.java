package Layout;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;

public class PaineisLayout extends JFrame {

	public PaineisLayout() {
		JPanel panel = new JPanel();
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout(2,2));
		
		
		//Cor dos quadrados e escritas
		JPanel norte = criarPanel(Color.MAGENTA,"Norte");
        JPanel leste = criarPanel(Color.YELLOW,"Leste");
        JPanel oeste = criarPanel(Color.PINK,"Oeste");
        JPanel sul = criarPanel(Color.WHITE ,"Sul");
        JPanel centro = criarPanel(Color.ORANGE,"Centro");
        
        //Painel 
        panel1.add(norte, BorderLayout.NORTH);
        panel1.add(leste, BorderLayout.EAST);
        panel1.add(oeste, BorderLayout.WEST);
        panel1.add(sul, BorderLayout.SOUTH);
        panel1.add(centro, BorderLayout.CENTER);
        
        JPanel panel2 = new JPanel();
        
        //Escrita na lateral
        JCheckBox check = createCheckBoxFlag("Norte", norte);
		check.setSelected(true);
		
		JCheckBox check2 = createCheckBoxFlag("Sul", sul);
		check2.setSelected(true);
		
		JCheckBox check3 = createCheckBoxFlag("Leste", leste);
		check2.setSelected(true);
		
		JCheckBox check4 = createCheckBoxFlag("Oeste", oeste);
		check2.setSelected(true);
		
		JCheckBox check5 = createCheckBoxFlag("Centro", centro);
		check2.setSelected(true);
		
		//Painel
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(check);
		panel2.add(check2);
		panel2.add(check3);
		panel2.add(check4);
		panel2.add(check5);
		panel.add(panel2);
		panel.add(panel1);
		add(panel);
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaineisLayout paineis = new PaineisLayout();
		paineis.setSize(300, 300);
		paineis.setResizable(false);
		paineis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		paineis.setVisible(true);
        
	}
	
	private static JCheckBox createCheckBoxFlag(String text, JPanel panel) {
		JCheckBox checkbox = new JCheckBox();
		checkbox.setText(text);
		checkbox.setSelected(true);
		
		checkbox.addActionListener(new ActionListener() {	
			public void ac0tionPerformed(ActionEvent e) {
				panel.setVisible(checkbox.isSelected());
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		return checkbox;
	}
	
	private static JPanel criarPanel(Color color, String texto) {
    	JPanel panel = new JPanel();
    	panel.setBackground(color);
    	panel.add(new JLabel(texto));
    	//Tamanho do painel
    	return panel;
    }

}
