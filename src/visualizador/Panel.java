package visualizador;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Panel extends JPanel {
	private static final long serialVersionUID = -6313969776795988484L;

	public Panel() {
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		Color[][] lienzo = Main2.lienzo;

		int borderWidth = Math.max(2, Main2.TAM_CELDA / 10);

		g2d.setStroke(new BasicStroke(borderWidth));

		for (int i = 0; i < lienzo.length; i++) {
			for (int j = 0; j < lienzo.length; j++) {
				g2d.setColor(lienzo[i][j]);
				g2d.fillRect(borderWidth / 2 + Main2.TAM_CELDA * i, borderWidth / 2 + Main2.TAM_CELDA * j,
						Main2.TAM_CELDA, Main2.TAM_CELDA);
				g2d.setColor(Color.BLACK);
				g2d.drawRect(borderWidth / 2 + Main2.TAM_CELDA * i, borderWidth / 2 + Main2.TAM_CELDA * j,
						Main2.TAM_CELDA, Main2.TAM_CELDA);
			}
		}

	}

	@Override
	public Dimension getPreferredSize() {
		int borderWidth = Math.max(2, Main2.TAM_CELDA / 10);

		return new Dimension(Main2.ANCHO_MAX_PANTALLA + borderWidth, Main2.ANCHO_MAX_PANTALLA + borderWidth);
	}
}