package MyPage;

import javax.swing.SwingUtilities;

public class MainClass {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MyFrame my = new MyFrame();
				my.setVisible(true);
			}
		});
	}

}
