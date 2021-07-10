package lab6.prob1;

public class MyTable {

	private Entry[] entries = new Entry[26];

	public String get(char c) {

		if (entries[returnIndex(c)] != null)
			return entries[returnIndex(c)].getEntryOf(c);
		else
			return "NULL";
	}

	public Entry[] getEntries() {
		return entries;
	}

	public void setEntries(Entry[] entries) {
		this.entries = entries;
	}

	public void add(char c, String s) {

		entries[returnIndex(c)] = new Entry(s, c);
	}

	public static int returnIndex(char c) {
		return Integer.valueOf(c) - 97;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < 26; i++)
			if (entries[i] != null) {
				str.append(entries[i].toString());
				str.append("\n");

			}
		return str.toString();
	}

	private class Entry {
		private char ch;
		private String str;

		Entry(String str, char ch) {

			this.ch = ch;
			this.str = str;

		}

		public String getEntryOf(char ind) {
			if (this.ch == ind)
				return this.str;
			else
				return "NULL";
		}

		public char getIndex() {
			return ch;
		}

		public String getName() {
			return str;
		}

		@Override
		public String toString() {
			return getIndex() + "->" + getName();
		}
	}
}
