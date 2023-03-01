public class Main {
	public static void main(final String[] args) {
		final One one = new Two();

	}
}

class One {
	public One() {
		aa();
		bb();
	}

	private void aa() {
		System.out.println("aa One");
	}

	void bb() {
		System.out.println("bb One");
	}

}

class Two extends One {
	public void aa() {
		System.out.println("aa Two");
	}

	@Override
	public void bb() {
		System.out.println("bb Two");
	}
}