package Font;
import java.awt.Font;

public enum Fonts {
	FONT_1(new Font("Corrier new", Font.BOLD, 20)),
	FONT_2(new Font("Arial", Font.ITALIC | Font.BOLD, 20)),
	FONT_3(new Font("Monospace", Font.PLAIN, 15));
	
	private final Font font;
	Fonts(Font font) {
		this.font = font;
	}
	public Font getFont() {
		return this.font;
	}
}
