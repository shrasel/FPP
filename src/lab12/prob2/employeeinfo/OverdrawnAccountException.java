package lab12.prob2.employeeinfo;

public class OverdrawnAccountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OverdrawnAccountException() {
		super();
	}

	public OverdrawnAccountException(String msg) {
		super(msg);
	}

	public OverdrawnAccountException(Throwable t) {
		super(t);
	}

}
