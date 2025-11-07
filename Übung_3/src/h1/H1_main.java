package h1;

public class H1_main {
	double guthaben = 1;
	double monEingang = 2;
	int rating = 3;
	boolean warnhinweis = false;
	boolean negativ = true; 
	public void main () {
	if (guthaben < 0) {
		if (monEingang < 0) {
			if (guthaben < 0) {
				if (monEingang >= guthaben) {
					rating += 1;
				}
				else {
					if (rating < 0) {
						warnhinweis = true;
					}
					else {
						warnhinweis = false;
					}
					rating -= 1;
				}
			}
		}
		negativ = true;
	}
	else if (guthaben == 0){
		negativ = false;
		rating += 2;
	}
	else {
		rating += 3;
		negativ = false;
	}
	
}}
