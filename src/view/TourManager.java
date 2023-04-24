package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import controller.TourMngControl;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import java.awt.CardLayout;

public class TourManager extends JFrame {
	
	private CardLayout cardLayout_Tour;
	private CardLayout cardLayout;
	private CardLayout cardLayoutEdit_ListTourDetail;
	private JPanel pnlZoom;
	private JPanel pnlHome;
	private JPanel pnlSetting;
	private JLabel lblIconZoomOut;
	private JLabel lblIconZoomIn;
	private JLabel lblIconHome;
	private JLabel lblIconSetting;
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
	private JPanel pnlTourContent;
	private JPanel pnlTourContentTitle;
	private JLabel lblTourContentTitle;
	private JPanel pnlSearchTour;
	private JPanel pnlIconSrc_Txt;
	private JLabel lblSearchTour;
	private JTextField txtSearchTour;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_6;
	private JPanel pnlContentTourDetail;
	private JPanel pnlEdit_ListTour;
	private JPanel pnlbtnEdit_ListTour;
	private JButton btnEditTour;
	private JButton btnListTour;
	private JPanel pnlEdit_ListTourDetail;
	private JPanel pnlEditTour;
	private JScrollPane scrollFillInforTour;
	private JPanel pnlButtonTour;
	private JPanel pnlFillTour;
	private JPanel pnlIdTour;
	private JLabel lblIdTour;
	private JTextField txtIdTour;
	private JPanel pnlNameTour;
	private JLabel lblNameTour;
	private JTextField txtNameTour;
	private JPanel pnlAreaTour;
	private JLabel lblAreaTour;
	private JComboBox cbBoxArea;
	private JPanel pnlNumOfDay;
	private JLabel lblNumOfDay;
	private JComboBox cbBoxNumOfDay;
	private JPanel pnlNumOfPeople;
	private JLabel lblNumOfPeople;
	private JComboBox cbBoxNumOfPeople;
	private JButton btnAddTour;
	private JButton btnDeleteTour;
	private JPanel pnlListTour;
	private JTable table;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;

	public TourManager(JPanel pnlZoom, JPanel pnlHome, JPanel pnlSetting, JLabel lblIconZoomOut, JLabel lblIconZoomIn,
			JLabel lblIconHome, JLabel lblIconSetting, JPanel pnlTourManager, JPanel pnlCusManager,
			JPanel pnlDesManager, JPanel pnlBillManager, JPanel pnlSerManager, JPanel pnlHotelManager,
			JPanel pnlAccManager, JPanel pnlStatistical, JPanel pnlExportExcel, JLabel lblTourManager,
			JLabel lblCusManager, JLabel lblDesManager, JLabel lblBillManager, JLabel lblSerManager,
			JLabel lblHotelManager, JLabel lblAccManager, JLabel lblStatistical, JLabel lblExportExcel,
			CardLayout cardLayout, CardLayout cardLayout_Tour, CardLayout cardLayoutEdit_ListTourDetail, JButton btnEditTour,
			JButton btnListTour, JPanel pnlEdit_ListTourDetail, JButton btnAddTour, JButton btnDeleteTour, JPanel pnlMainContent,
			JPanel pnlTourContent) {
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
		this.cardLayout_Tour = cardLayout_Tour;
		this.cardLayoutEdit_ListTourDetail = cardLayoutEdit_ListTourDetail;
		this.btnEditTour = btnEditTour;
		this.btnListTour = btnListTour;
		this.pnlEdit_ListTourDetail = pnlEdit_ListTourDetail;
		this.btnAddTour = btnAddTour;
		this.btnDeleteTour = btnDeleteTour;
		this.pnlTourContent = pnlTourContent;
		
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

	public CardLayout getCardLayout_Tour() {
		return cardLayout_Tour;
	}
	
	public void setCardLayout_Tour(CardLayout cardLayout_Tour) {
		this.cardLayout_Tour = cardLayout_Tour;
	}
	
	public CardLayout getCardLayoutEdit_ListTourDetail() {
		return cardLayoutEdit_ListTourDetail;
	}

	public void setCardLayoutEdit_ListTourDetail(CardLayout cardLayoutEdit_ListTourDetail) {
		this.cardLayoutEdit_ListTourDetail = cardLayoutEdit_ListTourDetail;
	}

	public JButton getBtnEditTour() {
		return btnEditTour;
	}

	public void setBtnEditTour(JButton btnEditTour) {
		this.btnEditTour = btnEditTour;
	}

	public JButton getBtnListTour() {
		return btnListTour;
	}

	public void setBtnListTour(JButton btnListTour) {
		this.btnListTour = btnListTour;
	}

	public JPanel getPnlEdit_ListTourDetail() {
		return pnlEdit_ListTourDetail;
	}

	public void setPnlEdit_ListTourDetail(JPanel pnlEdit_ListTourDetail) {
		this.pnlEdit_ListTourDetail = pnlEdit_ListTourDetail;
	}

	public JButton getBtnAddTour() {
		return btnAddTour;
	}

	public void setBtnAddTour(JButton btnAddTour) {
		this.btnAddTour = btnAddTour;
	}

	public JButton getBtnDeleteTour() {
		return btnDeleteTour;
	}

	public void setBtnDeleteTour(JButton btnDeleteTour) {
		this.btnDeleteTour = btnDeleteTour;
	}

	public JPanel getPnlTourContent() {
		return pnlTourContent;
	}

	public void setPnlTourContent(JPanel pnlTourContent) {
		this.pnlTourContent = pnlTourContent;
	}

	public TourManager() {
		//init_TourManager();
		cardLayoutEdit_ListTourDetail = (CardLayout)(pnlEdit_ListTourDetail.getLayout());
	}
	
	public void init_TourManager() {
		
		// MouseListener and ActionListener
		ActionListener actionListener = new TourMngControl(this);
		
		// ------------------------------ Create pnlTourContent ------------------------------
		pnlTourContent = new JPanel();
		getPnlMainContent().add(pnlTourContent, "pnlTourContent");
		pnlTourContent.setLayout(new BorderLayout(0, 0));	
		
		// Create pnlTourContentTitle into pnlTourContent at NORTH to contain lblTourContentTitle and pnlSearchTour
		pnlTourContentTitle = new JPanel();
		pnlTourContentTitle.setPreferredSize(new Dimension(10, 125));
		pnlTourContent.add(pnlTourContentTitle, BorderLayout.NORTH);
		pnlTourContentTitle.setLayout(new BorderLayout(0, 0));
		
		lblTourContentTitle = new JLabel("Tour Manager");
		lblTourContentTitle.setPreferredSize(new Dimension(200, 50));
		lblTourContentTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTourContentTitle.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		pnlTourContentTitle.add(lblTourContentTitle, BorderLayout.NORTH);
		
		pnlSearchTour = new JPanel();
		pnlSearchTour.setPreferredSize(new Dimension(10, 60));
		pnlTourContentTitle.add(pnlSearchTour, BorderLayout.CENTER);
		pnlSearchTour.setLayout(new BorderLayout(0, 0));
		
		// Create pnlIconSrc_Txt into pnlSearchTour to contain lblSearchTour and txtSearchTour
		pnlIconSrc_Txt = new JPanel();
		pnlSearchTour.add(pnlIconSrc_Txt, BorderLayout.CENTER);
		pnlIconSrc_Txt.setLayout(new BorderLayout(0, 0));	
		
		lblSearchTour = new JLabel("");
		lblSearchTour.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("search.png"))));
		lblSearchTour.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlIconSrc_Txt.add(lblSearchTour, BorderLayout.WEST);
		
		txtSearchTour = new JTextField();
		txtSearchTour.setPreferredSize(new Dimension(7, 32));
		pnlIconSrc_Txt.add(txtSearchTour);
		txtSearchTour.setColumns(40);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 20));
		pnlSearchTour.add(panel, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 20));
		pnlSearchTour.add(panel_1, BorderLayout.SOUTH);
		
		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(200, 10));
		pnlSearchTour.add(panel_2, BorderLayout.EAST);
		
		panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(200, 10));
		pnlSearchTour.add(panel_6, BorderLayout.WEST);
		
		pnlContentTourDetail = new JPanel();
		pnlTourContent.add(pnlContentTourDetail, BorderLayout.CENTER);
		pnlContentTourDetail.setLayout(new BorderLayout(0, 0));
		
		// Create pnlEdit_ListTour into pnlContentTourDetail to contain pnlbtnEdit_ListTour at CENTER and pnlEdit_ListTourDetail at CENTER
		pnlEdit_ListTour = new JPanel();
		pnlContentTourDetail.add(pnlEdit_ListTour, BorderLayout.CENTER);
		pnlEdit_ListTour.setLayout(new BorderLayout(0, 0));
		
		pnlbtnEdit_ListTour = new JPanel();
		pnlbtnEdit_ListTour.setPreferredSize(new Dimension(10, 50));
		pnlEdit_ListTour.add(pnlbtnEdit_ListTour, BorderLayout.NORTH);
		pnlbtnEdit_ListTour.setLayout(new BoxLayout(pnlbtnEdit_ListTour, BoxLayout.X_AXIS));
		
		btnEditTour = new JButton("Edit Tour");
		btnEditTour.setContentAreaFilled(false);
		btnEditTour.setFocusPainted(false);
		btnEditTour.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlbtnEdit_ListTour.add(btnEditTour);
		btnEditTour.addActionListener(actionListener);
			
		btnListTour = new JButton("List Tour");
		btnListTour.setContentAreaFilled(false);
		btnListTour.setFocusPainted(false);
		btnListTour.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlbtnEdit_ListTour.add(btnListTour);
		btnListTour.addActionListener(actionListener);
		
		// Create pnlEdit_ListTourDetail into pnlEdit_ListTour to contain pnlEditTour and pnlListTour
		pnlEdit_ListTourDetail = new JPanel();
		pnlEdit_ListTour.add(pnlEdit_ListTourDetail, BorderLayout.CENTER);
		pnlEdit_ListTourDetail.setLayout(new CardLayout(0, 0));
		
		// Create pnlEditTour into pnlEdit_ListTourDetail
		pnlEditTour = new JPanel();
		pnlEdit_ListTourDetail.add(pnlEditTour, "pnlEditTour");
		pnlEditTour.setLayout(new BorderLayout(0, 0));
		
		scrollFillInforTour = new JScrollPane();
		scrollFillInforTour.setBorder(new TitledBorder(null, "Edit Tour", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlEditTour.add(scrollFillInforTour, BorderLayout.CENTER);
		
		pnlFillTour = new JPanel();
		pnlFillTour.setBorder(null);
		scrollFillInforTour.setViewportView(pnlFillTour);
		pnlFillTour.setLayout(new GridLayout(7, 1, 0, 0));
		
		pnlIdTour = new JPanel();
		pnlIdTour.setPreferredSize(new Dimension(320, 35));
		pnlFillTour.add(pnlIdTour);
		pnlIdTour.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblIdTour = new JLabel("ID");
		lblIdTour.setPreferredSize(new Dimension(125, 25));
		pnlIdTour.add(lblIdTour);
		
		txtIdTour = new JTextField();
		txtIdTour.setPreferredSize(new Dimension(100, 25));
		pnlIdTour.add(txtIdTour);
		txtIdTour.setColumns(20);
		
		pnlNameTour = new JPanel();
		pnlNameTour.setPreferredSize(new Dimension(320, 35));
		pnlFillTour.add(pnlNameTour);
		pnlNameTour.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNameTour = new JLabel("Name");
		lblNameTour.setPreferredSize(new Dimension(125, 25));
		pnlNameTour.add(lblNameTour);
		
		txtNameTour = new JTextField();
		txtNameTour.setPreferredSize(new Dimension(100, 25));
		txtNameTour.setColumns(20);
		pnlNameTour.add(txtNameTour);
		
		pnlAreaTour = new JPanel();
		pnlAreaTour.setPreferredSize(new Dimension(320, 35));
		pnlFillTour.add(pnlAreaTour);
		pnlAreaTour.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
		lblAreaTour = new JLabel("Area");
		lblAreaTour.setPreferredSize(new Dimension(125, 25));
		pnlAreaTour.add(lblAreaTour);
		
		cbBoxArea = new JComboBox();
		cbBoxArea.setPreferredSize(new Dimension(225, 25));
		cbBoxArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbBoxArea.setModel(new DefaultComboBoxModel(new String[] {"Miền Bắc", "Miền Trung", "Miền Nam"}));
		pnlAreaTour.add(cbBoxArea);
		
		pnlNumOfDay = new JPanel();
		pnlNumOfDay.setPreferredSize(new Dimension(320, 35));
		pnlFillTour.add(pnlNumOfDay);
		pnlNumOfDay.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNumOfDay = new JLabel("Number of days");
		lblNumOfDay.setPreferredSize(new Dimension(125, 25));
		pnlNumOfDay.add(lblNumOfDay);
		
		cbBoxNumOfDay = new JComboBox();
		cbBoxNumOfDay.setPreferredSize(new Dimension(225, 25));
		cbBoxNumOfDay.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbBoxNumOfDay.setModel(new DefaultComboBoxModel(new String[] {"2 Ngày 1 Đêm", "2 Ngày 2 Đêm", "3 Ngày 2 Đêm" , "3 Ngày 3 Đêm" , "4 Ngày 3 Đêm"}));
		pnlNumOfDay.add(cbBoxNumOfDay);
		
		pnlNumOfPeople = new JPanel();
		pnlNumOfPeople.setPreferredSize(new Dimension(320, 35));
		pnlFillTour.add(pnlNumOfPeople);
		pnlNumOfPeople.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNumOfPeople = new JLabel("Number of peoples");
		lblNumOfPeople.setPreferredSize(new Dimension(125, 25));
		pnlNumOfPeople.add(lblNumOfPeople);
		
		cbBoxNumOfPeople = new JComboBox();
		cbBoxNumOfPeople.setPreferredSize(new Dimension(225, 25));
		cbBoxNumOfPeople.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbBoxNumOfPeople.setModel(new DefaultComboBoxModel(new String[] {"29", "35", "45" , "50"}));
		pnlNumOfPeople.add(cbBoxNumOfPeople);
		
		pnlButtonTour = new JPanel();
		pnlButtonTour.setBorder(null);
		pnlButtonTour.setPreferredSize(new Dimension(10, 40));
		pnlEditTour.add(pnlButtonTour, BorderLayout.SOUTH);
		pnlButtonTour.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAddTour = new JButton("Add");
		btnAddTour.setPreferredSize(new Dimension(100, 25));
		pnlButtonTour.add(btnAddTour);	
		
		btnDeleteTour = new JButton("Delete");
		btnDeleteTour.setPreferredSize(new Dimension(100, 25));
		pnlButtonTour.add(btnDeleteTour);
		
		// Create pnlListTour
		pnlListTour = new JPanel();
		pnlListTour.setBackground(new Color(255, 255, 255));
		pnlEdit_ListTourDetail.add(pnlListTour, "pnlListTour");
		pnlListTour.setLayout(new BorderLayout(0, 0));
		
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
		pnlListTour.add(table, BorderLayout.CENTER);
	
		panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(50, 10));
		pnlContentTourDetail.add(panel_3, BorderLayout.EAST);
		
		panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(50, 10));
		pnlContentTourDetail.add(panel_4, BorderLayout.WEST);
		
		panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(10, 60));
		pnlContentTourDetail.add(panel_5, BorderLayout.SOUTH);
			
	}
	
	
}
