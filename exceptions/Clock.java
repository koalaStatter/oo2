package exceptions;

public class Clock {
	private int minutes;
	private int hours;
	

	public Clock(int minutes, int hours) throws WrongTimeException {
		setMinutes(minutes);
		this.hours = hours;
	}

	public void setMinutes(int minutes) throws WrongTimeException {
		if (minutes<0 || minutes>59) {
			throw new WrongTimeException();
		}
		this.minutes = minutes;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
