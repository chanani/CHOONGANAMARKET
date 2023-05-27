package MyPage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InfoPannel extends JPanel{
	private JButton backBtn = new JButton("<");
	
	public InfoPannel() {
		setLayout(null);
		setBackground(Color.white);
		setSize(400, 600);

		JLabel lable = new JLabel("회원 정보");
		lable.setHorizontalAlignment(JLabel.LEFT);
		lable.setBounds(60, 20, 300, 30);
		add(lable);

		backBtn.setBounds(20, 20, 50, 50);
		setBtn(backBtn);
		backBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout layout = (CardLayout) getParent().getLayout();
				layout.show(getParent(), "MyMain");
			}
		});
		
		add(backBtn);

		setVisible(false);
	}
	
	private void setBtn(JButton btn) {
		btn.setHorizontalAlignment(JButton.LEFT);
		btn.setBorderPainted(false);
		btn.setContentAreaFilled(false); 
		btn.setFocusPainted(false);
	}
}
