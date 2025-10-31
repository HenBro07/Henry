
public class H3_main {
	public void main() {
		int i = 1; 
		int j = 2;
		int k = 3;
		boolean temp1 = i > j;
		boolean temp2 = i > 200;
		boolean temp3 = j > 100;
		k = -10;
		if (temp1 && !temp2 && !temp3) {
			k = 1;
		}
		if (temp1 && temp2 && !temp3) {
			k = 2;
		}
		if (temp1 && temp2 && temp3) {
			k = 3;
		}
		if (!temp1 && !temp2 && !temp3) {
			k = 4;
		}
	}
}
