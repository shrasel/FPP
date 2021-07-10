package lab6.prob2;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;

	public Top() {
		this.mid = new Middle();
		this.midbot = mid.new Bottom();
	}

	int readBottom() {
		// implement
		return midbot.b;
	}

	class Middle {
		int m = 2;

		// returns sum of instance variable in Top and
		int addTopAndBottom() {
			// implement
			return midbot.b + t;
		}

		class Bottom {
			int b = 3;

			// in all three classes
			int multiplyAllThree() {
				return b * m * t;
			}
		}
	}

	public static void main(String[] args) {
		Top top = new Top();

		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());

	}

}