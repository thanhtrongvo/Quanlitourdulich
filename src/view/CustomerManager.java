package view;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import java.awt.CardLayout;
import controller.CustomerMngControl;
import controller.TourMngControl;

public class CustomerManager extends JFrame{
	
	private CardLayout cardLayout_Cus;
	private CardLayout cardLayout;
	private CardLayout cardLayoutEdit_ListCusDetail;
	
	private BorderLayout borderLayout;
	private JPanel pnlHeader;
	private JPanel pnlContent;
	private JLabel lblHeaderTitle;
	private JPanel pnlMenu;
	private JPanel pnlMenuTools;
	private JPanel pnlZoom;
	private JPanel pnlHome;
	private JPanel pnlSetting;
	private JLabel lblIconZoomOut;
	private JLabel lblIconZoomIn;
	private JLabel lblIconHome;
	private JLabel lblIconSetting;
	private JPanel pnlMenuDetail;
	private JPanel pnlLogo;
	private JPanel pnlMngList;
	private JPanel pnlBottom;
	private JScrollPane scrollMenuDeTail;
	private JPanel pnlListDetail;
	private JPanel pnlTourManager;
	private JPanel pnlCusManager;
	private JPanel pnlDesManager;
	private JPanel pnlBillManager;
	private JPanel pnlSerManager;
	private JPanel pnlHotelManager;
	private JPanel pnlAccManager;
	private JPanel pnlStatistical;
	private JPanel pnlExportExcel;
	private JLabel lblTourManager;
	private JLabel lblCusManager;
	private JLabel lblDesManager;
	private JLabel lblBillManager;
	private JLabel lblSerManager;
	private JLabel lblHotelManager;
	private JLabel lblAccManager;
	private JLabel lblStatistical;
	private JLabel lblExportExcel;
	private JPanel pnlMainContent;
	
	private JPanel pnlCusContent;
	private JPanel pnlCusContentTitle;
	private JLabel lblCusContentTitle;
	private JPanel pnlSearchCus;
	private JPanel pnlIconSrc_Txt;
	private JLabel lblSearchCus;
	private JTextField txtSearchCus;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_6;
	private JPanel pnlContentCusDetail;
	private JPanel pnlEdit_ListCus;
	private JPanel pnlbtnEdit_ListCus;
	private JButton btnEditCus;
	private JButton btnListCus;
	private JPanel pnlEdit_ListCusDetail;
	private JPanel pnlEditCus;
	private JScrollPane scrollFillInforCus;
	private JPanel pnlButtonCus;
	private JPanel pnlFillCus;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel pnlIdCus;
	private JLabel lblIdCus;
	private JTextField txtIdCus;
	private JPanel pnlNameCus;
	private JLabel lblNameCus;
	private JTextField txtNameCus;
	private JPanel pnlOldCus;
	private JLabel lblOldCus;
	private JTextField txtDay;
	private JLabel lblNewLabel;
	private JTextField txtMonth;
	private JLabel lblNewLabel_1;
	private JTextField txtYear;
	private JLabel lblFomatOld;
	private JPanel pnlGenderCus;
	private JLabel lblGenderCus;
	private ButtonGroup bgGenderCus;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JPanel pnlPhoneCus;
	private JLabel lblPhoneCus;
	private JTextField txtPhoneCus;
	private JPanel pnlAddressCus;
	private JLabel lblAddressCus;
	private JTextField txtAddressCus;
	private JButton btnAddCus;
	private JButton btnDeleteCus;
	private JPanel pnlListCus;
	private JTable table;
	
	public CustomerManager(JPanel pnlZoom, JPanel pnlHome, JPanel pnlSetting, JLabel lblIconZoomOut, JLabel lblIconZoomIn,
			JLabel lblIconHome, JLabel lblIconSetting, JPanel pnlTourManager, JPanel pnlCusManager,
			JPanel pnlDesManager, JPanel pnlBillManager, JPanel pnlSerManager, JPanel pnlHotelManager,
			JPanel pnlAccManager, JPanel pnlStatistical, JPanel pnlExportExcel, JLabel lblTourManager,
			JLabel lblCusManager, JLabel lblDesManager, JLabel lblBillManager, JLabel lblSerManager,
			JLabel lblHotelManager, JLabel lblAccManager, JLabel lblStatistical, JLabel lblExportExcel,
			CardLayout cardLayout, CardLayout cardLayout_Cus, CardLayout cardLayoutEdit_ListCusDetail, JButton btnEditCus,
			JButton btnListCus, JPanel pnlEdit_ListCusDetail, JButton btnAddCus, JButton btnDeleteCus, JPanel pnlMainContent,
			JPanel pnlCusContent) {
		
		this.pnlZoom = pnlZoom;
		this.pnlHome = pnlHome;
		this.pnlSetting = pnlSetting;
		this.lblIconZoomOut = lblIconZoomOut;
		this.lblIconZoomIn = lblIconZoomIn;
		this.lblIconHome = lblIconHome;
		this.lblIconSetting = lblIconSetting;
		this.pnlTourManager = pnlTourManager;
		this.pnlCusManager = pnlCusManager;
		this.pnlDesManager = pnlDesManager;
		this.pnlBillManager = pnlBillManager;
		this.pnlSerManager = pnlSerManager;
		this.pnlHotelManager = pnlHotelManager;
		this.pnlAccManager = pnlAccManager;
		this.pnlStatistical = pnlStatistical;
		this.pnlExportExcel = pnlExportExcel;
		this.lblTourManager = lblTourManager;
		this.lblCusManager = lblCusManager;
		this.lblDesManager = lblDesManager;
		this.lblBillManager = lblBillManager;
		this.lblSerManager = lblSerManager;
		this.lblHotelManager = lblHotelManager;
		this.lblAccManager = lblAccManager;
		this.lblStatistical = lblStatistical;
		this.lblExportExcel = lblExportExcel;
		this.cardLayout = cardLayout;
		this.pnlMainContent = pnlMainContent;
		
		
		this.cardLayout_Cus = cardLayout_Cus;
		this.cardLayoutEdit_ListCusDetail = cardLayoutEdit_ListCusDetail;
		this.btnEditCus = btnEditCus;
		this.btnListCus = btnListCus;
		this.pnlEdit_ListCusDetail = pnlEdit_ListCusDetail;
		this.btnAddCus = btnAddCus;
		this.btnDeleteCus = btnDeleteCus;
		this.pnlCusContent = pnlCusContent;
	}
	
	public CardLayout getCardLayout() {
		return cardLayout;
	}
	
	public void setCardLayout(CardLayout cardLayout) {
		this.cardLayout = cardLayout;
	}

	public JPanel getPnlZoom() {
		return pnlZoom;
	}

	public void setPnlZoom(JPanel pnlZoom) {
		this.pnlZoom = pnlZoom;
	}

	public JLabel getLblIconZoomOut() {
		return lblIconZoomOut;
	}
	
	public void setLblIconZoomOut(JLabel lblIconZoomOut) {
		this.lblIconZoomOut = lblIconZoomOut;
	}

	public JLabel getLblIconZoomIn() {
		return lblIconZoomIn;
	}

	public void setLblIconZoomIn(JLabel lblIconZoomIn) {
		this.lblIconZoomIn = lblIconZoomIn;
	}

	public JPanel getPnlHome() {
		return pnlHome;
	}

	public void setPnlHome(JPanel pnlHome) {
		this.pnlHome = pnlHome;
	}

	public JPanel getPnlSetting() {
		return pnlSetting;
	}

	public void setPnlSetting(JPanel pnlSetting) {
		this.pnlSetting = pnlSetting;
	}

	public JLabel getLblIconHome() {
		return lblIconHome;
	}

	public void setLblIconHome(JLabel lblIconHome) {
		this.lblIconHome = lblIconHome;
	}

	public JLabel getLblIconSetting() {
		return lblIconSetting;
	}

	public void setLblIconSetting(JLabel lblIconSetting) {
		this.lblIconSetting = lblIconSetting;
	}

	public JPanel getPnlTourManager() {
		return pnlTourManager;
	}

	public void setPnlTourManager(JPanel pnlTourManager) {
		this.pnlTourManager = pnlTourManager;
	}

	public JPanel getPnlCusManager() {
		return pnlCusManager;
	}

	public void setPnlCusManager(JPanel pnlCusManager) {
		this.pnlCusManager = pnlCusManager;
	}

	public JPanel getPnlDesManager() {
		return pnlDesManager;
	}

	public void setPnlDesManager(JPanel pnlDesManager) {
		this.pnlDesManager = pnlDesManager;
	}

	public JPanel getPnlBillManager() {
		return pnlBillManager;
	}

	public void setPnlBillManager(JPanel pnlBillManager) {
		this.pnlBillManager = pnlBillManager;
	}

	public JPanel getPnlSerManager() {
		return pnlSerManager;
	}

	public void setPnlSerManager(JPanel pnlSerManager) {
		this.pnlSerManager = pnlSerManager;
	}

	public JPanel getPnlHotelManager() {
		return pnlHotelManager;
	}

	public void setPnlHotelManager(JPanel pnlHotelManager) {
		this.pnlHotelManager = pnlHotelManager;
	}

	public JPanel getPnlAccManager() {
		return pnlAccManager;
	}

	public void setPnlAccManager(JPanel pnlAccManager) {
		this.pnlAccManager = pnlAccManager;
	}

	public JPanel getPnlStatistical() {
		return pnlStatistical;
	}

	public void setPnlStatistical(JPanel pnlStatistical) {
		this.pnlStatistical = pnlStatistical;
	}

	public JPanel getPnlExportExcel() {
		return pnlExportExcel;
	}

	public void setPnlExportExcel(JPanel pnlExportExcel) {
		this.pnlExportExcel = pnlExportExcel;
	}

	public JLabel getLblTourManager() {
		return lblTourManager;
	}

	public void setLblTourManager(JLabel lblTourManager) {
		this.lblTourManager = lblTourManager;
	}

	public JLabel getLblCusManager() {
		return lblCusManager;
	}

	public void setLblCusManager(JLabel lblCusManager) {
		this.lblCusManager = lblCusManager;
	}

	public JLabel getLblDesManager() {
		return lblDesManager;
	}

	public void setLblDesManager(JLabel lblDesManager) {
		this.lblDesManager = lblDesManager;
	}

	public JLabel getLblBillManager() {
		return lblBillManager;
	}

	public void setLblBillManager(JLabel lblBillManager) {
		this.lblBillManager = lblBillManager;
	}

	public JLabel getLblSerManager() {
		return lblSerManager;
	}

	public void setLblSerManager(JLabel lblSerManager) {
		this.lblSerManager = lblSerManager;
	}

	public JLabel getLblHotelManager() {
		return lblHotelManager;
	}

	public void setLblHotelManager(JLabel lblHotelManager) {
		this.lblHotelManager = lblHotelManager;
	}

	public JLabel getLblAccManager() {
		return lblAccManager;
	}

	public void setLblAccManager(JLabel lblAccManager) {
		this.lblAccManager = lblAccManager;
	}

	public JLabel getLblStatistical() {
		return lblStatistical;
	}

	public void setLblStatistical(JLabel lblStatistical) {
		this.lblStatistical = lblStatistical;
	}

	public JLabel getLblExportExcel() {
		return lblExportExcel;
	}

	public void setLblExportExcel(JLabel lblExportExcel) {
		this.lblExportExcel = lblExportExcel;
	}

	public JPanel getPnlMainContent() {
		return pnlMainContent;
	}

	public void setPnlMainContent(JPanel pnlMainContent) {
		this.pnlMainContent = pnlMainContent;
	}

	public CardLayout getCardLayout_Cus() {
		return cardLayout_Cus;
	}

	public void setCardLayout_Cus(CardLayout cardLayout_Cus) {
		this.cardLayout_Cus = cardLayout_Cus;
	}

	public CardLayout getCardLayoutEdit_ListCusDetail() {
		return cardLayoutEdit_ListCusDetail;
	}

	public void setCardLayoutEdit_ListCusDetail(CardLayout cardLayoutEdit_ListCusDetail) {
		this.cardLayoutEdit_ListCusDetail = cardLayoutEdit_ListCusDetail;
	}

	public JButton getBtnEditCus() {
		return btnEditCus;
	}

	public void setBtnEditCus(JButton btnEditCus) {
		this.btnEditCus = btnEditCus;
	}

	public JButton getBtnListCus() {
		return btnListCus;
	}

	public void setBtnListCus(JButton btnListCus) {
		this.btnListCus = btnListCus;
	}

	public JPanel getPnlEdit_ListCusDetail() {
		return pnlEdit_ListCusDetail;
	}

	public void setPnlEdit_ListCusDetail(JPanel pnlEdit_ListCusDetail) {
		this.pnlEdit_ListCusDetail = pnlEdit_ListCusDetail;
	}

	public JButton getBtnAddCus() {
		return btnAddCus;
	}

	public void setBtnAddCus(JButton btnAddCus) {
		this.btnAddCus = btnAddCus;
	}

	public JButton getBtnDeleteCus() {
		return btnDeleteCus;
	}

	public void setBtnDeleteCus(JButton btnDeleteCus) {
		this.btnDeleteCus = btnDeleteCus;
	}

	public JPanel getPnlCusContent() {
		return pnlCusContent;
	}

	public void setPnlCusContent(JPanel pnlCusContent) {
		this.pnlCusContent = pnlCusContent;
	}

	public CustomerManager() {
		init_CusManager();
		cardLayoutEdit_ListCusDetail = (CardLayout)(pnlEdit_ListCusDetail.getLayout());
		
	}
	
	public void init_CusManager() {
//		Manager manager = new Manager();
//		manager.init_Manager();
//		ActionListener actionListener = new CustomerMngControl(this);
//		getPnlMainContent().setLayout(new CardLayout(0, 0));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		setLocationRelativeTo(null);
		
		// MouseListener and ActionListener
		MouseListener mouseListener = new CustomerMngControl(this);
		ActionListener actionListener = new CustomerMngControl(this);
		
		borderLayout = new BorderLayout();	
		getContentPane().setLayout(borderLayout);
		
		// Create pnlHeader at NORTH
		pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(33, 150, 243));
		getContentPane().add(pnlHeader, BorderLayout.NORTH);
		pnlHeader.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
		
		// Create pnlContent at CENTER
		pnlContent = new JPanel();
		getContentPane().add(pnlContent, BorderLayout.CENTER);
		
		// Create title into pnlHeader
		lblHeaderTitle = new JLabel("Quản Lí Tour Du Lịch");
		lblHeaderTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		pnlHeader.add(lblHeaderTitle);
		pnlContent.setLayout(new BorderLayout(0, 0));
		
		// Create pnlMenu at WEST
		pnlMenu= new JPanel();
		pnlContent.add(pnlMenu, BorderLayout.WEST);
		pnlMenu.setLayout(new BorderLayout());

		// Create pnlMenuTools at WEST into pnlMenu
		pnlMenuTools = new JPanel();
		pnlMenuTools.setBackground(new Color(33, 150, 243));
		pnlMenuTools.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnlMenuTools.setPreferredSize(new Dimension(50, 10));
		pnlMenu.add(pnlMenuTools, BorderLayout.WEST);
		pnlMenuTools.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		// Create pnlZoom, pnlHome, pnlSetting into pnlMenuTools
		pnlZoom = new JPanel();
		pnlZoom.setBackground(new Color(33, 150, 243));
		pnlZoom.setPreferredSize(new Dimension(50, 33));
		pnlZoom.setLayout(null);
		pnlMenuTools.add(pnlZoom);
		
		pnlHome = new JPanel();
		pnlHome.setBackground(new Color(33, 150, 243));
		pnlHome.setPreferredSize(new Dimension(50, 33));
		pnlMenuTools.add(pnlHome);
		
		pnlSetting = new JPanel();
		pnlSetting.setBackground(new Color(33, 150, 243));
		pnlSetting.setPreferredSize(new Dimension(50, 33));
		pnlMenuTools.add(pnlSetting);
		pnlSetting.setLayout(null);
		
		// Create lblIconZoom into pnlZoom
		lblIconZoomOut = new JLabel("", JLabel.CENTER);
		lblIconZoomOut.setBounds(0, 0, 50, 33);
		lblIconZoomOut.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("zoomout.png"))));
		lblIconZoomOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIconZoomOut.addMouseListener(mouseListener);
		pnlZoom.add(lblIconZoomOut);
		
		// Create lblIconHome into pnlHome
		lblIconHome = new JLabel("", JLabel.CENTER);
		lblIconHome.setBounds(0, 0, 50, 33);
		lblIconHome.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("home.png"))));
		lblIconHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIconHome.addMouseListener(mouseListener);
		pnlHome.add(lblIconHome);
		
		// Create lblIconSetting into pnlSetting
		lblIconSetting = new JLabel("", JLabel.CENTER);
		lblIconSetting.setBounds(0, 0, 50, 33);
		lblIconSetting.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("settings.png"))));
		lblIconSetting.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIconSetting.addMouseListener(mouseListener);
		pnlSetting.add(lblIconSetting);
		
		// Create pnlMenuDetail into pnlMenu
		pnlMenuDetail = new JPanel();
		pnlMenuDetail.setBackground(new Color(255, 255, 255));
		pnlMenuDetail.setPreferredSize(new Dimension(222, 10));
		pnlMenu.add(pnlMenuDetail, BorderLayout.CENTER);
		pnlMenuDetail.setLayout(new BorderLayout());
		
		//Create pnlLogo into pnlMenuDetail at NORTH
		pnlLogo = new JPanel();
		pnlLogo.setBackground(new Color(66, 165, 243));
		pnlLogo.setPreferredSize(new Dimension(10, 150));
		pnlMenuDetail.add(pnlLogo, BorderLayout.NORTH);
		
		//Create pnlMngList into pnlMenuDetail at CENTER
		pnlMngList = new JPanel();
		pnlMngList.setAutoscrolls(true);
		pnlMngList.setBackground(new Color(255, 255, 255));
		pnlMenuDetail.add(pnlMngList, BorderLayout.CENTER);
		pnlMngList.setLayout(new BorderLayout(0, 0));
		
		//Create pnlBottom into pnlMenuDetail at SOUTH
		pnlBottom = new JPanel();
		pnlBottom.setBackground(new Color(66, 165, 243));
		pnlBottom.setPreferredSize(new Dimension(10, 65));
		pnlMngList.add(pnlBottom, BorderLayout.SOUTH);
		
		//Create scrollMenuDeTail into pnlMngList at CENTER
		scrollMenuDeTail = new JScrollPane();
		scrollMenuDeTail.setBorder(null);
		pnlMngList.add(scrollMenuDeTail, BorderLayout.CENTER);
		
		//Create pnlListDetail into scrollMenuDeTail
		pnlListDetail = new JPanel();
		pnlListDetail.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollMenuDeTail.setViewportView(pnlListDetail);
		pnlListDetail.setLayout(new GridLayout(9, 1, 0, 0));
	
		/* 
		Create pnlTourManager, pnlCusManager, pnlStaffManager, pnlBillManager, pnlSerManager,
		pnlHotelManager, pnlVehManager, pnlAccManager, pnlStatisticalManager into pnlListDetail
		*/ 
		pnlTourManager = new JPanel();
		pnlTourManager.setBounds(0, 3, 172, 34);
		pnlTourManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlTourManager);
		pnlTourManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlCusManager = new JPanel();
		pnlCusManager.setBounds(0, 3, 172, 34);
		pnlCusManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlCusManager);
		pnlCusManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlDesManager = new JPanel();
		pnlDesManager.setBounds(0, 3, 172, 34);
		pnlDesManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlDesManager);
		pnlDesManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlBillManager = new JPanel();
		pnlBillManager.setBounds(0, 3, 172, 34);
		pnlBillManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlBillManager);
		pnlBillManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlSerManager = new JPanel();
		pnlSerManager.setBounds(0, 3, 172, 34);
		pnlSerManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlSerManager);
		pnlSerManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlHotelManager = new JPanel();
		pnlHotelManager.setBounds(0, 3, 172, 34);
		pnlHotelManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlHotelManager);
		pnlHotelManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlAccManager = new JPanel();
		pnlAccManager.setBounds(0, 3, 172, 34);
		pnlAccManager.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlAccManager);
		pnlAccManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlStatistical = new JPanel();
		pnlStatistical.setBounds(0, 3, 172, 34);
		pnlStatistical.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlStatistical);
		pnlStatistical.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlExportExcel = new JPanel();
		pnlExportExcel.setBounds(0, 3, 172, 34);
		pnlExportExcel.setBackground(new Color(66, 165, 243));
		pnlListDetail.add(pnlExportExcel);
		pnlExportExcel.setLayout(new GridLayout(0, 1, 0, 0));
	
		
		lblTourManager = new JLabel("   Tour Manager");
		lblTourManager.setPreferredSize(new Dimension(76, 40));
		lblTourManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("travel.png"))));
		lblTourManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTourManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlTourManager.add(lblTourManager);
		lblTourManager.addMouseListener(mouseListener);
		
		lblCusManager = new JLabel("   Customer Manager");
		lblCusManager.setPreferredSize(new Dimension(76, 40));
		lblCusManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("customer.png"))));
		lblCusManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCusManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlCusManager.add(lblCusManager);
		lblCusManager.addMouseListener(mouseListener);
		
		lblDesManager = new JLabel("   Tourist attraction");
		lblDesManager.setPreferredSize(new Dimension(76, 40));
		lblDesManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("destination.png"))));
		lblDesManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlDesManager.add(lblDesManager);
		lblDesManager.addMouseListener(mouseListener);
		
		lblBillManager = new JLabel("   Bill Manager");
		lblBillManager.setPreferredSize(new Dimension(76, 40));
		lblBillManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("ticket.png"))));
		lblBillManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBillManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlBillManager.add(lblBillManager);
		lblBillManager.addMouseListener(mouseListener);
		
		lblSerManager = new JLabel("   Service Manager");
		lblSerManager.setPreferredSize(new Dimension(76, 40));
		lblSerManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("service.png"))));
		lblSerManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSerManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlSerManager.add(lblSerManager);
		lblSerManager.addMouseListener(mouseListener);
		
		lblHotelManager = new JLabel("   Hotel Manager");
		lblHotelManager.setPreferredSize(new Dimension(76, 40));
		lblHotelManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("hotel.png"))));
		lblHotelManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHotelManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlHotelManager.add(lblHotelManager);
		lblHotelManager.addMouseListener(mouseListener);
		
		lblAccManager = new JLabel("   Account Manager");
		lblAccManager.setPreferredSize(new Dimension(76, 40));
		lblAccManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("account.png"))));
		lblAccManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlAccManager.add(lblAccManager);
		lblAccManager.addMouseListener(mouseListener);
		
		lblStatistical = new JLabel("   Statistical");
		lblStatistical.setPreferredSize(new Dimension(76, 40));
		lblStatistical.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("statistical.png"))));
		lblStatistical.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStatistical.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlStatistical.add(lblStatistical);
		lblStatistical.addMouseListener(mouseListener);	
		
		lblExportExcel = new JLabel("  Export Excel");
		lblExportExcel.setPreferredSize(new Dimension(76, 40));
		lblExportExcel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("excel.png"))));
		lblExportExcel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblExportExcel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlExportExcel.add(lblExportExcel);
		lblExportExcel.addMouseListener(mouseListener);
		
		/* 
		Create pnlMainContent to contain pnlTourContent, pnlCusContent, pnlStaffContent, pnlBillContent,
		pnlSerContent, pnlHotelContent, pnlVehContent, pnlAccContent, pnlStatisticalContent
		*/
		pnlMainContent = new JPanel();
		pnlContent.add(pnlMainContent, BorderLayout.CENTER);
		pnlMainContent.setLayout(new CardLayout(0, 0));
		
		// ------------------------------ Create pnlCusContent ------------------------------
		pnlCusContent = new JPanel();
		getPnlMainContent().add(pnlCusContent, "pnlCusContent");
		pnlCusContent.setLayout(new BorderLayout(0, 0));	
		
		pnlCusContentTitle = new JPanel();
		pnlCusContentTitle.setPreferredSize(new Dimension(10, 125));
		pnlCusContent.add(pnlCusContentTitle, BorderLayout.NORTH);
		pnlCusContentTitle.setLayout(new BorderLayout(0, 0));
		
		lblCusContentTitle = new JLabel("Customer Manager");
		lblCusContentTitle.setPreferredSize(new Dimension(200, 50));
		lblCusContentTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblCusContentTitle.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		pnlCusContentTitle.add(lblCusContentTitle, BorderLayout.NORTH);
		
		pnlSearchCus = new JPanel();
		pnlSearchCus.setPreferredSize(new Dimension(10, 60));
		pnlCusContentTitle.add(pnlSearchCus, BorderLayout.CENTER);
		pnlSearchCus.setLayout(new BorderLayout(0, 0));
		
		pnlIconSrc_Txt = new JPanel();
		pnlSearchCus.add(pnlIconSrc_Txt, BorderLayout.CENTER);
		pnlIconSrc_Txt.setLayout(new BorderLayout(0, 0));	
		
		lblSearchCus = new JLabel("");
		lblSearchCus.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("search.png"))));
		lblSearchCus.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlIconSrc_Txt.add(lblSearchCus, BorderLayout.WEST);
		
		txtSearchCus = new JTextField();
		txtSearchCus.setPreferredSize(new Dimension(7, 32));
		pnlIconSrc_Txt.add(txtSearchCus);
		txtSearchCus.setColumns(40);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 20));
		pnlSearchCus.add(panel, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 20));
		pnlSearchCus.add(panel_1, BorderLayout.SOUTH);
		
		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(200, 10));
		pnlSearchCus.add(panel_2, BorderLayout.EAST);
		
		panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(200, 10));
		pnlSearchCus.add(panel_6, BorderLayout.WEST);
		
		pnlContentCusDetail = new JPanel();
		pnlCusContent.add(pnlContentCusDetail, BorderLayout.CENTER);
		pnlContentCusDetail.setLayout(new BorderLayout(0, 0));
		
		pnlEdit_ListCus = new JPanel();
		pnlContentCusDetail.add(pnlEdit_ListCus, BorderLayout.CENTER);
		pnlEdit_ListCus.setLayout(new BorderLayout(0, 0));
		
		pnlbtnEdit_ListCus = new JPanel();
		pnlbtnEdit_ListCus.setPreferredSize(new Dimension(10, 50));
		pnlEdit_ListCus.add(pnlbtnEdit_ListCus, BorderLayout.NORTH);
		pnlbtnEdit_ListCus.setLayout(new BoxLayout(pnlbtnEdit_ListCus, BoxLayout.X_AXIS));
		
		btnEditCus = new JButton("Edit Customer");
		btnEditCus.setContentAreaFilled(false);
		btnEditCus.setFocusPainted(false);
		btnEditCus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlbtnEdit_ListCus.add(btnEditCus);
		btnEditCus.addActionListener(actionListener);
			
		btnListCus= new JButton("List Customer");
		btnListCus.setContentAreaFilled(false);
		btnListCus.setFocusPainted(false);
		btnListCus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlbtnEdit_ListCus.add(btnListCus);
		btnListCus.addActionListener(actionListener);
		
		pnlEdit_ListCusDetail = new JPanel();
		pnlEdit_ListCus.add(pnlEdit_ListCusDetail, BorderLayout.CENTER);
		pnlEdit_ListCusDetail.setLayout(new CardLayout(0, 0));
		
		pnlEditCus = new JPanel();
		pnlEdit_ListCusDetail.add(pnlEditCus, "pnlEditCus");
		pnlEditCus.setLayout(new BorderLayout(0, 0));
		
		scrollFillInforCus = new JScrollPane();
		scrollFillInforCus.setBorder(new TitledBorder(null, "Edit Customer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlEditCus.add(scrollFillInforCus, BorderLayout.CENTER);
		
		pnlFillCus = new JPanel();
		pnlFillCus.setBorder(null);
		scrollFillInforCus.setViewportView(pnlFillCus);
		pnlFillCus.setLayout(new GridLayout(6, 1, 0, 0));
		
		pnlIdCus = new JPanel();
		pnlIdCus.setPreferredSize(new Dimension(320, 35));
		pnlFillCus.add(pnlIdCus);
		pnlIdCus.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblIdCus = new JLabel("ID");
		lblIdCus.setPreferredSize(new Dimension(125, 25));
		pnlIdCus.add(lblIdCus);
		
		txtIdCus = new JTextField();
		txtIdCus.setPreferredSize(new Dimension(100, 25));
		pnlIdCus.add(txtIdCus);
		txtIdCus.setColumns(20);
		
		pnlNameCus = new JPanel();
		pnlNameCus.setPreferredSize(new Dimension(320, 35));
		pnlFillCus.add(pnlNameCus);
		pnlNameCus.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNameCus = new JLabel("Name");
		lblNameCus.setPreferredSize(new Dimension(125, 25));
		pnlNameCus.add(lblNameCus);
		
		txtNameCus = new JTextField();
		txtNameCus.setPreferredSize(new Dimension(100, 25));
		txtNameCus.setColumns(20);
		pnlNameCus.add(txtNameCus);
		
		pnlOldCus = new JPanel();
		pnlOldCus.setPreferredSize(new Dimension(320, 35));
		pnlFillCus.add(pnlOldCus);
		pnlOldCus.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblOldCus = new JLabel("Date of birth");
		lblOldCus.setPreferredSize(new Dimension(125, 25));
		pnlOldCus.add(lblOldCus);
		
		txtDay = new JTextField();
		txtDay.setPreferredSize(new Dimension(100, 25));
		txtDay.setColumns(2);
		pnlOldCus.add(txtDay);
		
		lblNewLabel = new JLabel("/");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		pnlOldCus.add(lblNewLabel);
		
		txtMonth = new JTextField();
		txtMonth.setPreferredSize(new Dimension(100, 25));
		txtMonth.setColumns(2);
		pnlOldCus.add(txtMonth);
		
		lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		pnlOldCus.add(lblNewLabel_1);
		
		txtYear = new JTextField();
		txtYear.setPreferredSize(new Dimension(100, 25));
		txtYear.setColumns(5);
		pnlOldCus.add(txtYear);
		
		lblFomatOld = new JLabel("(dd/mm/yyyy)");
		lblFomatOld.setPreferredSize(new Dimension(77, 25));
		lblFomatOld.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pnlOldCus.add(lblFomatOld);
		
		pnlGenderCus = new JPanel();
		pnlGenderCus.setPreferredSize(new Dimension(320, 35));
		pnlFillCus.add(pnlGenderCus);
		pnlGenderCus.setLayout(new FlowLayout(FlowLayout.CENTER, 35, 5));
		
		lblGenderCus = new JLabel("Gender");
		lblGenderCus.setBounds(32, 11, 60, 25);
		lblGenderCus.setPreferredSize(new Dimension(91, 25));
		pnlGenderCus.add(lblGenderCus);
		
		bgGenderCus = new ButtonGroup();
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnMale.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnMale.setFocusPainted(false);
		rdbtnMale.setPreferredSize(new Dimension(110, 25));
		pnlGenderCus.add(rdbtnMale);
		bgGenderCus.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnFemale.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnFemale.setFocusPainted(false);
		rdbtnFemale.setBounds(220, 11, 82, 25);
		rdbtnFemale.setPreferredSize(new Dimension(83, 25));
		pnlGenderCus.add(rdbtnFemale);
		bgGenderCus.add(rdbtnFemale);
			
		pnlPhoneCus = new JPanel();
		pnlPhoneCus.setPreferredSize(new Dimension(320, 35));
		pnlFillCus.add(pnlPhoneCus);
		pnlPhoneCus.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblPhoneCus = new JLabel("Phone");
		lblPhoneCus.setPreferredSize(new Dimension(125, 25));
		pnlPhoneCus.add(lblPhoneCus);
		
		txtPhoneCus = new JTextField();
		txtPhoneCus.setPreferredSize(new Dimension(100, 25));
		txtPhoneCus.setColumns(20);
		pnlPhoneCus.add(txtPhoneCus);
		
		pnlAddressCus = new JPanel();
		pnlAddressCus.setPreferredSize(new Dimension(320, 35));
		pnlFillCus.add(pnlAddressCus);
		pnlAddressCus.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblAddressCus = new JLabel("Address");
		lblAddressCus.setPreferredSize(new Dimension(125, 25));
		pnlAddressCus.add(lblAddressCus);
		
		txtAddressCus = new JTextField();
		txtAddressCus.setPreferredSize(new Dimension(100, 25));
		txtAddressCus.setColumns(20);
		pnlAddressCus.add(txtAddressCus);
		
		pnlButtonCus = new JPanel();
		pnlButtonCus.setBorder(null);
		pnlButtonCus.setPreferredSize(new Dimension(10, 40));
		pnlEditCus.add(pnlButtonCus, BorderLayout.SOUTH);
		pnlButtonCus.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAddCus = new JButton("Add");
		btnAddCus.setPreferredSize(new Dimension(100, 25));
		pnlButtonCus.add(btnAddCus);	
		
		btnDeleteCus = new JButton("Delete");
		btnDeleteCus.setPreferredSize(new Dimension(100, 25));
		pnlButtonCus.add(btnDeleteCus);
		
		pnlListCus = new JPanel();
		pnlListCus.setBackground(new Color(255, 255, 255));
		pnlEdit_ListCusDetail.add(pnlListCus, "pnlListCus");
		pnlListCus.setLayout(new BorderLayout(0, 0));
		
		Object [][] data = {
				{"111", "Nha Trang", "Miền Trung", "20", "20"},
				{"111", "Nha Trang", "Miền Trung", "20", "20"},
				{"111", "Nha Trang", "Miền Trung", "20", "20"},
				{"111", "Nha Trang", "Miền Trung", "20", "20"},
				{"111", "Nha Trang", "Miền Trung", "20", "20"},
				{"111", "Nha Trang", "Miền Trung", "20", "20"},
				{"111", "Nha Trang", "Miền Trung", "20", "20"},
				{"111", "Nha Trang", "Miền Trung", "20", "20"},
				{"111", "Nha Trang", "Miền Trung", "20", "20"}
		};
		
		String [] items = {"ID", "Name", "Area", "Number of days", "Number of peoples"};
		table = new JTable(data,items);
		pnlListCus.add(table, BorderLayout.CENTER);
		
		panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(50, 10));
		pnlContentCusDetail.add(panel_3, BorderLayout.EAST);
		
		panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(50, 10));
		pnlContentCusDetail.add(panel_4, BorderLayout.WEST);
		
		panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(10, 60));
		pnlContentCusDetail.add(panel_5, BorderLayout.SOUTH);
		
	}
	
	// ZoomOutMenu function to make hidden pnlMenuDetail
	public void ZoomOutMenu() {
		MouseListener mouseListener = new CustomerMngControl(this);
		lblIconZoomIn = new JLabel("", JLabel.CENTER);
		lblIconZoomIn.setBounds(0, 0, 50, 33);
		lblIconZoomIn.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("zoomin.png"))));
		lblIconZoomIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIconZoomIn.addMouseListener(mouseListener);
		pnlZoom.add(lblIconZoomIn);
		pnlMenuDetail.setVisible(false);
		lblIconZoomOut.setVisible(false);
		lblIconZoomIn.setVisible(true);
	}
				
	// ZoomInMenu function to make show pnlMenuDetail
	public void ZoomInMenu() {
		pnlMenuDetail.setVisible(true);
		lblIconZoomOut.setVisible(true);
		lblIconZoomIn.setVisible(false);	
	}
	
	public void show_TourManager() {
		pnlContent.setVisible(true);
	}
}
