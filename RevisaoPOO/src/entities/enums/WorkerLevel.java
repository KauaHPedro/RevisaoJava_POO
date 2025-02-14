package entities.enums;

public enum WorkerLevel {
	
	JUNIOR(1),
	MID_LEVEL(2),
	SENIOR(3);
	
	private final int codigo;
	
	WorkerLevel(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
        return codigo;
    }
	
	public static WorkerLevel converteCodigo(int codigo) {
		for (WorkerLevel level : WorkerLevel.values()) {
			if (level.codigo == codigo) {
				return level;
			}
		}
		return null;
	}

}
