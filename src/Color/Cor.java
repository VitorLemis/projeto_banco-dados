package Color;
import java.awt.Color;

public enum Cor {
	WHITE(Color.WHITE),
	BLACK(Color.BLACK);
	
	private final Color cor;
	Cor(Color cor) {
		this.cor = cor;
	}
	public Color getCor() {
		return this.cor;
	}
}
