package visualizador;

import javax.swing.JFrame;

public class Frame extends JFrame {
	private static final long serialVersionUID = 5313051202295035309L;

	Panel panel;

	public Frame() {
		panel = new Panel();
		getContentPane().add(panel);

		pack();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}