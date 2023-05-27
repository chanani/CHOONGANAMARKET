package MyPage;

import java.awt.CardLayout;

import javax.swing.*;

public class MyFrame extends JFrame{
	
	private MyHomeVO vo = new MyHomeDAO().getHome("AAA");
	
	public MyFrame() {
		setSize(400, 600);
		setLocationRelativeTo(null); // 화면 가운데에서 뜨도록 설정
		setResizable(false); // 사이즈 조절 불가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HomePanel home = new HomePanel(vo);
		LikePanel like = new LikePanel();
		SellPanel sell = new SellPanel();
		BuyPanel buy = new BuyPanel();
		InfoPannel info = new InfoPannel();
		
		getContentPane().setLayout(new CardLayout());
		getContentPane().add(home, "MyMain");
		getContentPane().add(like, "Like");
		getContentPane().add(sell, "Sell");
		getContentPane().add(buy, "Buy");
		getContentPane().add(info, "Info");
		
		
		CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
		cardLayout.show(getContentPane(), "MyMain");
	}
	
}
