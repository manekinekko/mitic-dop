package JDBC.fr.ifsic.epicerie;

public class InitEpicerieException extends Exception {
	String mess =null;

	public InitEpicerieException(String message) {
		this.mess = message;
	}
	
	public String getMessage() {
		return mess;
	}

}
