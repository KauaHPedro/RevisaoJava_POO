package entities.enums;

public enum Color {
	
	BLACK(1),
	BLUE(2),
	RED(3);
	
	private final int codigo;
	
	Color(int codigo) {
		this.codigo = codigo;
	}
	
	public static Color converteCodigo(int codigo) {
		for(Color cor : Color.values()) {
			if (cor.codigo == codigo) {
				return cor;
			}
		}
		return null;
	}

}
