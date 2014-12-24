package ch06_properties;

import java.util.Properties;

public class Props {
	private static final String DEPARTURE = "departure";
	private static final String DURATION = "duration";
	private static final String INTERVAL = "interval";
	int checkInterval;
	int monitorTime;
	int departureOffset;

	public void getTimes(Properties props) throws Exception {
		String valueString;
		int value;

		value = getProperty(props, INTERVAL);
		checkInterval = value;

		value = getProperty(props, DURATION);
		checkWithInterval(value, DURATION);
		monitorTime = value;

		value = getProperty(props, DEPARTURE);
		checkWithInterval(value, DEPARTURE);
		departureOffset = value;
	}

	private void checkWithInterval(int value, String propertyName) throws MissingPropertiesException {
		if ((value % checkInterval) != 0) {
			throw new MissingPropertiesException(propertyName+" % checkInterval");
		}
	}

	private int getProperty(Properties props, String propertyName) throws MissingPropertiesException {
		String valueString;
		int value;
		valueString = props.getProperty(propertyName);
		if (valueString == null) {
			throw new MissingPropertiesException(propertyName);
		}
		value = Integer.parseInt(valueString);
		if (value <= 0) {
			throw new MissingPropertiesException(propertyName+" > 0");
		}
		return value;
	}
	
	// ....
}
