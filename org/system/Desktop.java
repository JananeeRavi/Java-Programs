package org.system;

public class Desktop extends Computer {

	public void desktopSize() {

		System.out.println("notebook");
	}

	public static void main(String[] args) {
		
		Desktop d1 = new Desktop();
		d1.computerModel();
		d1.desktopSize();
	}

}
