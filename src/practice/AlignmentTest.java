package practice;

public class AlignmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Label{
	
	public enum Alignment{
		LEFT, RIGHT, CENTER
	}
	
	String text;
	Alignment alignment = Alignment.LEFT;
	
	public Label(String text, Alignment al) {
		this.text = text;
		this.alignment = al;
	}
	
	public Alignment getAlignment() {
		return alignment;
	}
	
	public void setAlignment(Alignment alignment) {
		switch(alignment) {
		case LEFT:
		case CENTER:
		case RIGHT:
			this.alignment = alignment;
			return;
		}
		
		throw new IllegalArgumentException("improper alignment"+ alignment);
	}
	
	
	
}
