package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	
	
public TelaTimeThread() {/*Executa o que tem dentro no momento da abertura ou execução*/
	setTitle("Minha tela de time com Thread");
	setSize(new Dimension(260, 260));
	setLocationRelativeTo(null);
	setResizable(false);
	/*Primeira parte concluida*/
	
	
	
	
	/*Sempre sera o ultimo comando*/
	setVisible(true);/*Torna a tela visivel para o usuario*/
	}
	
	
}
