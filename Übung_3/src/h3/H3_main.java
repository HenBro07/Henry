package h3;

public class H3_main {
	int max;
	int fix;
	int wartend;
	boolean istVoll;
	public void programm () {
		if (max > fix) {
			if (wartend > 0) {
				int frei = max - fix;
				if (frei >= wartend) {
					fix += wartend;
					wartend = 0;
				}
				else {
					fix = max;
					wartend -= frei;
				}
			}
		}
		if (fix == max) {
			istVoll = true;
		}
	}
}
