package MyPage;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePannel extends JFrame {
	
	private Font f1,f2;
	static private JPanel home = new JPanel();
	
	private JButton LikeBtn = new JButton("❤️ 찜 목록");
	private JButton SellBtn = new JButton("📃 판매 내역");
	private JButton BuyBtn = new JButton("👜 구매 내역");
	private JButton FinancialBtn = new JButton("📕 가계부");
	private JButton AccountBtn = new JButton("⚙️ 회원정보 수정");
	
	Color color = new Color(0,0,0,0);
	
	public HomePannel() {
		homeFrame();
		setpanel();
	}

	public void homeFrame() { // 프레임 생성하는 메서드
		setTitle("중앙 마켓"); // 프레임 이름
		setLayout(null);
		setSize(500, 500); // 크기 설정
		setLocationRelativeTo(null); //화면 가운데에 배치
		// 프레임을 닫았을 때, 메모리에서 제거되도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true); //프레임이 보이도록 설정
	}

	public void setpanel() {
		home.setBackground(color);
		
		JLabel Name = new JLabel("닉네임");
		f2 = new Font("Times", Font.BOLD,25);
		Name.setFont(f2);
		Name.setHorizontalAlignment(JLabel.LEFT);
		Name.setBounds(40, 30, 300, 30);
		add(Name);
		
		// 버튼의 위치설정
		LikeBtn.setBounds(30, 150, 150, 30);
		SellBtn.setBounds(30, 210, 150, 30);
		BuyBtn.setBounds(30, 270, 150, 30);
		FinancialBtn.setBounds(30, 330, 150, 30);
		AccountBtn.setBounds(30, 390, 150, 30);
		// 패널의 위치설정
		home.setBounds(0, 0, 500, 500);
		// 레이아웃 설정
		home.setLayout(null);
		add(home); // 프레임에 패널을 추가
		
		setBtn(LikeBtn);
		setBtn(SellBtn);
		setBtn(BuyBtn);
		setBtn(FinancialBtn);
		setBtn(AccountBtn);
		
		//패널에 버튼 추가
		home.add(LikeBtn);
		home.add(SellBtn);
		home.add(BuyBtn);
		home.add(FinancialBtn);
		home.add(AccountBtn);
	}
	
	// 버튼 세부설정
	public void setBtn(JButton btn) {
		f1 = new Font("Helvetica", Font.PLAIN,15);
		btn.setFont(f1);
		btn.setHorizontalAlignment(JButton.LEFT);
		btn.setBorderPainted(false);
		btn.setContentAreaFilled(false); 
		btn.setFocusPainted(false);
	}
}
