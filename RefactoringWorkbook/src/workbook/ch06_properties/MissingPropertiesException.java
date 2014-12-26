package workbook.ch06_properties;


public class MissingPropertiesException extends Exception {
	private static final long serialVersionUID = 1L;

	public MissingPropertiesException(String string) {
		super(string);
	}
}
