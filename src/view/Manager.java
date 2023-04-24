package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import controller.ManagerControl;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.CardLayout;
import java.awt.Insets;
import javax.swing.border.EtchedBorder;
import com.toedter.calendar.JDateChooser;



public class Manager extends JFrame {
	
	private CardLayout cardLayout;
	private CardLayout cardLayoutEdit_ListTourDetail;
	private CardLayout cardLayoutEdit_ListCusDetail;
	private CardLayout cardLayoutEdit_ListDesDetail;
	private CardLayout cardLayoutEdit_ListBillDetail;
	private CardLayout cardLayoutEdit_ListSerDetail;
	private CardLayout cardLayoutEdit_ListHotelDetail;
	private CardLayout cardLayoutEdit_ListAccDetail;
	private CardLayout cardLayoutEdit_ListStatisticalDetail;
	private CardLayout cardLayoutEdit_ListExportExcelDetail;
	
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
	private JButton btnListTour;
	private JPanel pnlEdit_ListTourDetail;
	private JPanel pnlEditTour;
	private JScrollPane scrollFillInforTour;
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
	private JPanel pnlNumOfPeople;
	private JLabel lblNumOfPeople;
	private JComboBox cbBoxNumOfPeople;
	private JPanel pnlButtonTour;
	private JButton btnAddTour;
	private JButton btnDeleteTour;
	private JPanel pnlListTour;
	private JTable table;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel pnlCusContent;
	private JPanel pnlCusContentTitle;
	private JLabel lblCusContentTitle;
	private JPanel pnlSearchCus;
	private JLabel lblSearchCus;
	private JTextField txtSearchCus;
	private JPanel pnlContentCusDetail;
	private JPanel pnlEdit_ListCus;
	private JPanel pnlbtnEdit_ListCus;
	private JButton btnEditCus;
	private JButton btnListCus;
	private JPanel pnlEdit_ListCusDetail;
	private JPanel pnlEditCus;
	private JScrollPane scrollFillInforCus;
	private JPanel pnlFillCus;
	private JPanel pnlIdCus;
	private JLabel lblIdCus;
	private JTextField txtIdCus;
	private JPanel pnlNameCus;
	private JLabel lblNameCus;
	private JTextField txtNameCus;
	private JPanel pnlOldCus;
	private JLabel lblOldCus;
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
	private JPanel pnlButtonCus;
	private JButton btnAddCus;
	private JButton btnDeleteCus;
	private JPanel pnlListCus;
	private JPanel pnlDesContent;
	private JPanel pnlBillContent;
	private JPanel pnlSerContent;
	private JPanel pnlHotelContent;
	private JPanel pnlAccContent;
	private JPanel pnlStatisticalContent;
	private JPanel pnlExportExcelContent;
	private JPanel pnlHotelContentTitle;
	private JLabel lblHotelContentTitle;
	private JPanel pnlSearchHotel;
	private JLabel lblSearchHotel;
	private JTextField txtSearchHotel;
	private JPanel pnlContentHotelDetail;
	private JPanel pnlEdit_ListHotel;
	private JPanel pnlbtnEdit_ListHotel;
	private JButton btnEditHotel;
	private JButton btnListHotel;
	private JPanel pnlEdit_ListHotelDetail;
	private JPanel pnlEditHotel;
	private JScrollPane scrollFillInforHotel;
	private JPanel pnlFillHotel;
	private JPanel pnlIdHotel;
	private JLabel lblIdHotel;
	private JTextField txtIdHotel;
	private JPanel pnlNameHotel;
	private JLabel lblNameHotel;
	private JTextField txtNameHotel;
	private JPanel pnlButtonHotel;
	private JButton btnAddHotel;
	private JButton btnDeleteHotel;
	private JPanel pnlListHotel;
	private JPanel pnlNumOfRoomHotel;
	private JLabel lblNumOfRoomHotel;
	private JTextField txtNumOfRoomHotel;
	private JPanel pnlPriceHotel;
	private JLabel lblPriceHotel;
	private JTextField txtPriceHotel;
	private JPanel pnlPhoneHotel;
	private JLabel lblPhoneHotel;
	private JTextField txtPhoneHotel;
	private JPanel pnlEmailHotel;
	private JLabel lblEmailCus;
	private JTextField txtEmailCus;
	private JPanel pnlAddressHotel;
	private JLabel lblAddressHotel;
	private JTextField txtAddressHotel;
	private JPanel pnlAccContentTitle;
	private JLabel lblAccContentTitle;
	private JPanel pnlSearchAcc;
	private JLabel lblSearchAcc;
	private JTextField txtSearchAcc;
	private JPanel pnlContentAccDetail;
	private JPanel pnlEdit_ListAcc;
	private JPanel pnlbtnEdit_ListAcc;
	private JButton btnEditAcc;
	private JButton btnListAcc;
	private JPanel pnlEdit_ListAccDetail;
	private JPanel pnlEditAcc;
	private JScrollPane scrollFillInforAcc;
	private JPanel pnlFillAcc;
	private JPanel pnlIdAcc;
	private JLabel lblIdAcc;
	private JTextField txtIdAcc;
	private JPanel pnlUserNameAcc;
	private JLabel lblUserNameAcc;
	private JTextField txtUserNameAcc;
	private JPanel pnlPassAcc;
	private JLabel lblPassAcc;
	private JTextField txtPassAcc;
	private JPanel pnlIdCusAcc;
	private JLabel lblIdCusAcc;
	private JTextField txtIdCusAcc;
	private JPanel pnlPermissionAcc;
	private JLabel lblPermissionAcc;
	private JComboBox cbBoxPermissionAcc;
	private JPanel pnlButtonAcc;
	private JButton btnAddAcc;
	private JButton btnDeleteAcc;
	private JPanel pnlListAcc;
	private JButton btnEditTour;
	private JPanel pnlSerContentTitle;
	private JLabel lblSerContentTitle;
	private JPanel pnlSearchSer;
	private JTextField txtSearchSer;
	private JLabel lblSearchSer;
	private JPanel pnlContentSerDetail;
	private JPanel pnlEdit_ListSer;
	private JPanel pnlbtnEdit_ListSer;
	private JButton btnEditSer;
	private JButton btnListSer;
	private JPanel pnlEdit_ListSerDetail;
	private JPanel pnlEditSer;
	private JScrollPane scrollFillInforSer;
	private JPanel pnlFillSer;
	private JPanel pnlIdSer;
	private JLabel lblIdSer;
	private JTextField txtIdSer;
	private JPanel pnlNameSer;
	private JLabel lblNameSer;
	private JTextField txtNameSer;
	private JPanel pnlPriceSer;
	private JLabel lblPriceSer;
	private JTextField txtPriceSer;
	private JPanel pnlButtonSer;
	private JButton btnAddSer;
	private JButton btnDeleteSer;
	private JPanel pnlListSer;
	private JPanel pnlPriceTour;
	private JPanel pnlStartDay;
	private JPanel pnlEndDay;
	private JPanel pnlDepTour;
	private JLabel lblPriceTour;
	private JTextField txtPriceTour;
	private JLabel lblDepTour;
	private JTextField txtDepTour;
	private JDateChooser StartDay;
	private JLabel lblStartDay;
	private JLabel lblEndDay;
	private JDateChooser EndDay;
	private JDateChooser OldCus;
	private JPanel pnlBillContentTitle;
	private JLabel lblBillContentTitle;
	private JPanel pnlSearchBill;
	private JTextField txtSearchBill;
	private JLabel lblSearchBill;
	private JPanel pnlContentBillDetail;
	private JPanel pnlEdit_ListBill;
	private JPanel pnlbtnEdit_ListBill;
	private JButton btnEditBill;
	private JButton btnListBill;
	private JPanel pnlEdit_ListBillDetail;
	private JPanel pnlEditBill;
	private JScrollPane scrollFillInforBill;
	private JPanel pnlFillBill;
	private JPanel pnlIdBill;
	private JLabel lblIdBill;
	private JTextField txtIdBill;
	private JPanel pnlNumOfCus;
	private JLabel lblNumOfCus;
	private JTextField txtNumOfCus;
	private JPanel pnlBillCreateDate;
	private JLabel lblBillCreateDate;
	private JDateChooser BillCreateDate;
	private JPanel pnlListBill;
	private JPanel panel_7;
	private JPanel panel_8;
	private JLabel lblTotalPrice;
	private JTextField outputTotalPrice;
	private JPanel pnlButtonBill;
	private JButton btnAddBill;
	private JButton btnDeleteBill;

	
	public Manager(JPanel pnlZoom, JPanel pnlHome, JPanel pnlSetting, JLabel lblIconZoomOut, JLabel lblIconZoomIn,
			JLabel lblIconHome,JLabel lblIconSetting, JPanel pnlTourManager, JPanel pnlCusManager, JPanel pnlDesManager,
			JPanel pnlBillManager, JPanel pnlSerManager, JPanel pnlHotelManager, JPanel pnlAccManager, JPanel pnlStatistical,
			JPanel pnlExportExcel, JLabel lblTourManager, JLabel lblCusManager, JLabel lblDesManager, JLabel lblBillManager, 
			JLabel lblSerManager, JLabel lblHotelManager, JLabel lblAccManager, JLabel lblStatistical, JLabel lblExportExcel,
			CardLayout cardLayout, JPanel pnlMainContent, CardLayout cardLayoutEdit_ListTourDetail, CardLayout cardLayoutEdit_ListCusDetail,
			CardLayout cardLayoutEdit_ListDesDetail, CardLayout cardLayoutEdit_ListBillDetail, CardLayout cardLayoutEdit_ListSerDetail,
			CardLayout cardLayoutEdit_ListHotelDetail, CardLayout cardLayoutEdit_ListAccDetail, CardLayout cardLayoutEdit_ListStatisticalDetail,
			CardLayout cardLayoutEdit_ListExportExcelDetail, JButton btnEditTour, JButton btnListTour, JButton btnEditCus, JButton btnListCus,
			JPanel pnlEdit_ListTourDetail, JPanel pnlEdit_ListCusDetail, JButton btnEditHotel, JButton btnListHotel, JPanel pnlEdit_ListHotelDetail,
			JPanel pnlEdit_ListAccDetail, JButton btnEditAcc, JButton btnListAcc, JTextField txtSearchTour, JTextField txtSearchCus, 
			JTextField txtSearchHotel, JTextField txtSearchAcc, JButton btnEditSer, JButton btnListSer, JTextField txtSearchSer,
			JPanel pnlEdit_ListSerDetail, JButton btnEditBill, JButton btnListBill, JPanel pnlEdit_ListBillDetail, JTextField txtSearchBill) {
	
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
		this.cardLayoutEdit_ListTourDetail = cardLayoutEdit_ListTourDetail;
		this.cardLayoutEdit_ListCusDetail = cardLayoutEdit_ListCusDetail;
		this.cardLayoutEdit_ListDesDetail = cardLayoutEdit_ListDesDetail;
		this.cardLayoutEdit_ListBillDetail = cardLayoutEdit_ListBillDetail;
		this.cardLayoutEdit_ListSerDetail = cardLayoutEdit_ListSerDetail;
		this.cardLayoutEdit_ListHotelDetail = cardLayoutEdit_ListHotelDetail;
		this.cardLayoutEdit_ListAccDetail = cardLayoutEdit_ListAccDetail;
		this.cardLayoutEdit_ListStatisticalDetail = cardLayoutEdit_ListAccDetail;
		this.cardLayoutEdit_ListExportExcelDetail = cardLayoutEdit_ListExportExcelDetail;
		
		this.btnEditTour = btnEditTour;
		this.btnEditCus = btnEditCus;
		this.btnEditHotel = btnEditHotel;
		this.btnEditAcc = btnEditAcc;
		this.btnEditSer = btnEditSer;
		this.btnEditBill = btnEditBill;
		
		this.btnListTour = btnListTour;
		this.btnListCus = btnListCus;
		this.btnListHotel = btnListHotel;
		this.btnListAcc = btnListAcc;
		this.btnListBill = btnListBill;
		
		this.pnlEdit_ListTourDetail = pnlEdit_ListTourDetail;
		this.pnlEdit_ListCusDetail = pnlEdit_ListCusDetail;
		this.pnlEdit_ListHotelDetail = pnlEdit_ListHotelDetail;
		this.pnlEdit_ListAccDetail = pnlEdit_ListAccDetail;
		this.pnlEdit_ListSerDetail = pnlEdit_ListSerDetail;
		this.pnlEdit_ListBillDetail = pnlEdit_ListBillDetail;
		
		this.txtSearchTour = txtSearchTour;
		this.txtSearchCus = txtSearchCus;
		this.txtSearchHotel = txtSearchHotel;
		this.txtSearchAcc = txtSearchAcc;
		this.txtSearchSer = txtSearchSer;
		this.txtSearchBill = txtSearchBill;	
		
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
	
	public CardLayout getCardLayoutEdit_ListTourDetail() {
		return cardLayoutEdit_ListTourDetail;
	}

	public void setCardLayoutEdit_ListTourDetail(CardLayout cardLayoutEdit_ListTourDetail) {
		this.cardLayoutEdit_ListTourDetail = cardLayoutEdit_ListTourDetail;
	}

	public CardLayout getCardLayoutEdit_ListCusDetail() {
		return cardLayoutEdit_ListCusDetail;
	}

	public void setCardLayoutEdit_ListCusDetail(CardLayout cardLayoutEdit_ListCusDetail) {
		this.cardLayoutEdit_ListCusDetail = cardLayoutEdit_ListCusDetail;
	}

	public CardLayout getCardLayoutEdit_ListDesDetail() {
		return cardLayoutEdit_ListDesDetail;
	}

	public void setCardLayoutEdit_ListDesDetail(CardLayout cardLayoutEdit_ListDesDetail) {
		this.cardLayoutEdit_ListDesDetail = cardLayoutEdit_ListDesDetail;
	}

	public CardLayout getCardLayoutEdit_ListBillDetail() {
		return cardLayoutEdit_ListBillDetail;
	}

	public void setCardLayoutEdit_ListBillDetail(CardLayout cardLayoutEdit_ListBillDetail) {
		this.cardLayoutEdit_ListBillDetail = cardLayoutEdit_ListBillDetail;
	}

	public CardLayout getCardLayoutEdit_ListSerDetail() {
		return cardLayoutEdit_ListSerDetail;
	}

	public void setCardLayoutEdit_ListSerDetail(CardLayout cardLayoutEdit_ListSerDetail) {
		this.cardLayoutEdit_ListSerDetail = cardLayoutEdit_ListSerDetail;
	}

	public CardLayout getCardLayoutEdit_ListHotelDetail() {
		return cardLayoutEdit_ListHotelDetail;
	}

	public void setCardLayoutEdit_ListHotelDetail(CardLayout cardLayoutEdit_ListHotelDetail) {
		this.cardLayoutEdit_ListHotelDetail = cardLayoutEdit_ListHotelDetail;
	}

	public CardLayout getCardLayoutEdit_ListAccDetail() {
		return cardLayoutEdit_ListAccDetail;
	}

	public void setCardLayoutEdit_ListAccDetail(CardLayout cardLayoutEdit_ListAccDetail) {
		this.cardLayoutEdit_ListAccDetail = cardLayoutEdit_ListAccDetail;
	}

	public CardLayout getCardLayoutEdit_ListStatisticalDetail() {
		return cardLayoutEdit_ListStatisticalDetail;
	}

	public void setCardLayoutEdit_ListStatisticalDetail(CardLayout cardLayoutEdit_ListStatisticalDetail) {
		this.cardLayoutEdit_ListStatisticalDetail = cardLayoutEdit_ListStatisticalDetail;
	}

	public CardLayout getCardLayoutEdit_ListExportExcelDetail() {
		return cardLayoutEdit_ListExportExcelDetail;
	}

	public void setCardLayoutEdit_ListExportExcelDetail(CardLayout cardLayoutEdit_ListExportExcelDetail) {
		this.cardLayoutEdit_ListExportExcelDetail = cardLayoutEdit_ListExportExcelDetail;
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

	public JPanel getPnlEdit_ListTourDetail() {
		return pnlEdit_ListTourDetail;
	}

	public void setPnlEdit_ListTourDetail(JPanel pnlEdit_ListTourDetail) {
		this.pnlEdit_ListTourDetail = pnlEdit_ListTourDetail;
	}

	public JPanel getPnlEdit_ListCusDetail() {
		return pnlEdit_ListCusDetail;
	}

	public void setPnlEdit_ListCusDetail(JPanel pnlEdit_ListCusDetail) {
		this.pnlEdit_ListCusDetail = pnlEdit_ListCusDetail;
	}

	public JButton getBtnEditHotel() {
		return btnEditHotel;
	}

	public void setBtnEditHotel(JButton btnEditHotel) {
		this.btnEditHotel = btnEditHotel;
	}

	public JButton getBtnListHotel() {
		return btnListHotel;
	}

	public void setBtnListHotel(JButton btnListHotel) {
		this.btnListHotel = btnListHotel;
	}

	public JPanel getPnlEdit_ListHotelDetail() {
		return pnlEdit_ListHotelDetail;
	}

	public void setPnlEdit_ListHotelDetail(JPanel pnlEdit_ListHotelDetail) {
		this.pnlEdit_ListHotelDetail = pnlEdit_ListHotelDetail;
	}

	public JButton getBtnEditAcc() {
		return btnEditAcc;
	}

	public void setBtnEditAcc(JButton btnEditAcc) {
		this.btnEditAcc = btnEditAcc;
	}

	public JButton getBtnListAcc() {
		return btnListAcc;
	}

	public void setBtnListAcc(JButton btnListAcc) {
		this.btnListAcc = btnListAcc;
	}

	public JPanel getPnlEdit_ListAccDetail() {
		return pnlEdit_ListAccDetail;
	}

	public void setPnlEdit_ListAccDetail(JPanel pnlEdit_ListAccDetail) {
		this.pnlEdit_ListAccDetail = pnlEdit_ListAccDetail;
	}

	public JTextField getTxtSearchTour() {
		return txtSearchTour;
	}

	public void setTxtSearchTour(JTextField txtSearchTour) {
		this.txtSearchTour = txtSearchTour;
	}

	public JTextField getTxtSearchCus() {
		return txtSearchCus;
	}

	public void setTxtSearchCus(JTextField txtSearchCus) {
		this.txtSearchCus = txtSearchCus;
	}

	public JTextField getTxtSearchHotel() {
		return txtSearchHotel;
	}

	public void setTxtSearchHotel(JTextField txtSearchHotel) {
		this.txtSearchHotel = txtSearchHotel;
	}

	public JTextField getTxtSearchAcc() {
		return txtSearchAcc;
	}

	public void setTxtSearchAcc(JTextField txtSearchAcc) {
		this.txtSearchAcc = txtSearchAcc;
	}

	public JTextField getTxtSearchSer() {
		return txtSearchSer;
	}

	public void setTxtSearchSer(JTextField txtSearchSer) {
		this.txtSearchSer = txtSearchSer;
	}

	public JButton getBtnEditSer() {
		return btnEditSer;
	}

	public void setBtnEditSer(JButton btnEditSer) {
		this.btnEditSer = btnEditSer;
	}

	public JButton getBtnListSer() {
		return btnListSer;
	}

	public void setBtnListSer(JButton btnListSer) {
		this.btnListSer = btnListSer;
	}

	public JPanel getPnlEdit_ListSerDetail() {
		return pnlEdit_ListSerDetail;
	}

	public void setPnlEdit_ListSerDetail(JPanel pnlEdit_ListSerDetail) {
		this.pnlEdit_ListSerDetail = pnlEdit_ListSerDetail;
	}

	public JTextField getTxtSearchBill() {
		return txtSearchBill;
	}

	public void setTxtSearchBill(JTextField txtSearchBill) {
		this.txtSearchBill = txtSearchBill;
	}

	public JButton getBtnEditBill() {
		return btnEditBill;
	}

	public void setBtnEditBill(JButton btnEditBill) {
		this.btnEditBill = btnEditBill;
	}

	public JButton getBtnListBill() {
		return btnListBill;
	}

	public void setBtnListBill(JButton btnListBill) {
		this.btnListBill = btnListBill;
	}

	public JPanel getPnlEdit_ListBillDetail() {
		return pnlEdit_ListBillDetail;
	}

	public void setPnlEdit_ListBillDetail(JPanel pnlEdit_ListBillDetail) {
		this.pnlEdit_ListBillDetail = pnlEdit_ListBillDetail;
	}

	public Manager() {
//		EmpMgrModel empManagerModel = new EmpMgrModel();
		init_Manager();
		cardLayout = (CardLayout)(pnlMainContent.getLayout());
		cardLayoutEdit_ListTourDetail = (CardLayout)(pnlEdit_ListTourDetail.getLayout());
		cardLayoutEdit_ListCusDetail = (CardLayout)(pnlEdit_ListCusDetail.getLayout());
//		cardLayoutEdit_ListDesDetail = (CardLayout)(pnlEdit_ListDesDetail.getLayout());
		cardLayoutEdit_ListBillDetail = (CardLayout)(pnlEdit_ListBillDetail.getLayout());
		cardLayoutEdit_ListSerDetail = (CardLayout)(pnlEdit_ListSerDetail.getLayout());
		cardLayoutEdit_ListHotelDetail = (CardLayout)(pnlEdit_ListHotelDetail.getLayout());
		cardLayoutEdit_ListAccDetail = (CardLayout)(pnlEdit_ListAccDetail.getLayout());
//		cardLayoutEdit_ListStatisticalDetail = (CardLayout)(pnlEdit_ListStatisticalDetail.getLayout());
//		cardLayoutEdit_ListExportExcelDetail = (CardLayout)(pnlEdit_ListExportExcelDetail.getLayout());
		
//		addPlaceholderStyle(txtSearchTour);
//		addPlaceholderStyle(txtSearchCus);
//		addPlaceholderStyle(txtSearchHotel);
//		addPlaceholderStyle(txtSearchAcc);
//		addPlaceholderStyle(txtSearchSer);
//		addPlaceholderStyle(txtSearchBill);
		
	}
	
	public void init_Manager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		setLocationRelativeTo(null);
		
		// MouseListener and ActionListener
		MouseListener mouseListener = new ManagerControl(this);
		ActionListener actionListener = new ManagerControl(this);
		FocusListener focusListener = new ManagerControl(this);
	
		
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
		pnlBottom.setPreferredSize(new Dimension(10, 83));
		pnlMngList.add(pnlBottom, BorderLayout.SOUTH);
		
		//Create scrollMenuDeTail into pnlMngList at CENTER
		scrollMenuDeTail = new JScrollPane();
		scrollMenuDeTail.setBackground(new Color(66, 165, 243));
		scrollMenuDeTail.setBorder(null);
		pnlMngList.add(scrollMenuDeTail, BorderLayout.CENTER);
		
		//Create pnlListDetail into scrollMenuDeTail
		pnlListDetail = new JPanel();
		pnlListDetail.setBackground(new Color(66, 165, 243));
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
		lblTourManager.setPreferredSize(new Dimension(76, 41));
		lblTourManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("travel.png"))));
		lblTourManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTourManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlTourManager.add(lblTourManager);
		lblTourManager.addMouseListener(mouseListener);
		
		lblCusManager = new JLabel("   Customer Manager");
		lblCusManager.setPreferredSize(new Dimension(76, 41));
		lblCusManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("customer.png"))));
		lblCusManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCusManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlCusManager.add(lblCusManager);
		lblCusManager.addMouseListener(mouseListener);
		
		lblDesManager = new JLabel("   Tourist attraction");
		lblDesManager.setPreferredSize(new Dimension(76, 41));
		lblDesManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("destination.png"))));
		lblDesManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlDesManager.add(lblDesManager);
		lblDesManager.addMouseListener(mouseListener);
		
		lblBillManager = new JLabel("   Bill Manager");
		lblBillManager.setPreferredSize(new Dimension(76, 41));
		lblBillManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("ticket.png"))));
		lblBillManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBillManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlBillManager.add(lblBillManager);
		lblBillManager.addMouseListener(mouseListener);
		
		lblSerManager = new JLabel("   Service Manager");
		lblSerManager.setPreferredSize(new Dimension(76, 41));
		lblSerManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("service.png"))));
		lblSerManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSerManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlSerManager.add(lblSerManager);
		lblSerManager.addMouseListener(mouseListener);
		
		lblHotelManager = new JLabel("   Hotel Manager");
		lblHotelManager.setPreferredSize(new Dimension(76, 41));
		lblHotelManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("hotel.png"))));
		lblHotelManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHotelManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlHotelManager.add(lblHotelManager);
		lblHotelManager.addMouseListener(mouseListener);
		
		lblAccManager = new JLabel("   Account Manager");
		lblAccManager.setPreferredSize(new Dimension(76, 41));
		lblAccManager.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("account.png"))));
		lblAccManager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccManager.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlAccManager.add(lblAccManager);
		lblAccManager.addMouseListener(mouseListener);
		
		lblStatistical = new JLabel("   Statistical");
		lblStatistical.setPreferredSize(new Dimension(76, 41));
		lblStatistical.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("statistical.png"))));
		lblStatistical.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStatistical.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnlStatistical.add(lblStatistical);
		lblStatistical.addMouseListener(mouseListener);	
		
		lblExportExcel = new JLabel("  Export Excel");
		lblExportExcel.setPreferredSize(new Dimension(76, 41));
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
		
		// ------------------------------ Create pnlTourContent ------------------------------
		pnlTourContent = new JPanel();
		pnlMainContent.add(pnlTourContent, "pnlTourContent");
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
		
		txtSearchTour = new JTextField();
		txtSearchTour.setText("Search Tour");
		pnlIconSrc_Txt.add(txtSearchTour, BorderLayout.CENTER);
		txtSearchTour.setMargin(new Insets(2, 10, 2, 10));
		txtSearchTour.addFocusListener(focusListener);
		
		lblSearchTour = new JLabel("");
		lblSearchTour.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pnlIconSrc_Txt.add(lblSearchTour, BorderLayout.EAST);
		lblSearchTour.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("search.png"))));
		lblSearchTour.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 20));
		pnlSearchTour.add(panel, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 20));
		pnlSearchTour.add(panel_1, BorderLayout.SOUTH);
		
		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(250, 10));
		pnlSearchTour.add(panel_2, BorderLayout.EAST);
		
		panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(250, 10));
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
		pnlEditTour.add(scrollFillInforTour, BorderLayout.EAST);
		
		pnlFillTour = new JPanel();
		pnlFillTour.setBorder(null);
		scrollFillInforTour.setViewportView(pnlFillTour);
		pnlFillTour.setLayout(new GridLayout(5, 2, 0, 0));
		
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
		txtIdTour.setColumns(15);
		
		pnlNameTour = new JPanel();
		pnlNameTour.setPreferredSize(new Dimension(320, 35));
		pnlFillTour.add(pnlNameTour);
		pnlNameTour.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNameTour = new JLabel("Name");
		lblNameTour.setPreferredSize(new Dimension(125, 25));
		pnlNameTour.add(lblNameTour);
		
		txtNameTour = new JTextField();
		txtNameTour.setPreferredSize(new Dimension(100, 25));
		txtNameTour.setColumns(15);
		pnlNameTour.add(txtNameTour);
		
		pnlAreaTour = new JPanel();
		pnlAreaTour.setPreferredSize(new Dimension(320, 35));
		pnlFillTour.add(pnlAreaTour);
		pnlAreaTour.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
		lblAreaTour = new JLabel("Area");
		lblAreaTour.setPreferredSize(new Dimension(125, 25));
		pnlAreaTour.add(lblAreaTour);
		
		cbBoxArea = new JComboBox();
		cbBoxArea.setPreferredSize(new Dimension(166, 25));
		cbBoxArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbBoxArea.setModel(new DefaultComboBoxModel(new String[] {"Miền Bắc", "Miền Trung", "Miền Nam"}));
		pnlAreaTour.add(cbBoxArea);
		
		pnlNumOfPeople = new JPanel();
		pnlNumOfPeople.setPreferredSize(new Dimension(320, 35));
		pnlFillTour.add(pnlNumOfPeople);
		pnlNumOfPeople.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNumOfPeople = new JLabel("Number of peoples");
		lblNumOfPeople.setPreferredSize(new Dimension(125, 25));
		pnlNumOfPeople.add(lblNumOfPeople);
		
		cbBoxNumOfPeople = new JComboBox();
		cbBoxNumOfPeople.setPreferredSize(new Dimension(166, 25));
		cbBoxNumOfPeople.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbBoxNumOfPeople.setModel(new DefaultComboBoxModel(new String[] {"29", "35", "45" , "50"}));
		pnlNumOfPeople.add(cbBoxNumOfPeople);
		
		pnlPriceTour = new JPanel();
		pnlFillTour.add(pnlPriceTour);
		
		lblPriceTour = new JLabel("Price");
		lblPriceTour.setPreferredSize(new Dimension(125, 25));
		pnlPriceTour.add(lblPriceTour);
		
		txtPriceTour = new JTextField();
		txtPriceTour.setPreferredSize(new Dimension(100, 25));
		pnlPriceTour.add(txtPriceTour);
		txtPriceTour.setColumns(15);
		
		pnlStartDay = new JPanel();
		pnlFillTour.add(pnlStartDay);
		
		lblStartDay = new JLabel("Start day");
		lblStartDay.setPreferredSize(new Dimension(125, 25));
		pnlStartDay.add(lblStartDay);
		
		StartDay = new JDateChooser();
		StartDay.setPreferredSize(new Dimension(166, 25));
		pnlStartDay.add(StartDay);
		
		pnlEndDay = new JPanel();
		pnlFillTour.add(pnlEndDay);
		
		lblEndDay = new JLabel("End day");
		lblEndDay.setPreferredSize(new Dimension(125, 25));
		pnlEndDay.add(lblEndDay);
		
		EndDay = new JDateChooser();
		EndDay.setPreferredSize(new Dimension(166, 25));
		pnlEndDay.add(EndDay);
		
		pnlDepTour = new JPanel();
		pnlFillTour.add(pnlDepTour);
		
		lblDepTour = new JLabel("Departure");
		lblDepTour.setPreferredSize(new Dimension(125, 25));
		pnlDepTour.add(lblDepTour);
		
		txtDepTour = new JTextField();
		txtDepTour.setPreferredSize(new Dimension(100, 25));
		pnlDepTour.add(txtDepTour);
		txtDepTour.setColumns(15);
		
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
		pnlListTour.setBorder(new TitledBorder(null, "List Tour", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
		
		// ------------------------------ Create pnlCusContent ------------------------------
		pnlCusContent = new JPanel();
		pnlMainContent.add(pnlCusContent, "pnlCusContent");
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
		
		txtSearchCus = new JTextField();
		txtSearchCus.setText("Search Customer");
		pnlIconSrc_Txt.add(txtSearchCus, BorderLayout.CENTER);
		txtSearchCus.setMargin(new Insets(2, 10, 2, 10));
		txtSearchCus.addFocusListener(focusListener);
		
		lblSearchCus = new JLabel("");
		lblSearchCus.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pnlIconSrc_Txt.add(lblSearchCus, BorderLayout.EAST);
		lblSearchCus.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("search.png"))));
		lblSearchCus.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 20));
		pnlSearchCus.add(panel, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 20));
		pnlSearchCus.add(panel_1, BorderLayout.SOUTH);
		
		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(250, 10));
		pnlSearchCus.add(panel_2, BorderLayout.EAST);
		
		panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(250, 10));
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
		
		OldCus = new JDateChooser();
		OldCus.setPreferredSize(new Dimension(225, 25));
		pnlOldCus.add(OldCus);
		
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
		pnlListCus.setBorder(new TitledBorder(null, "List Customer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlListCus.setBackground(new Color(255, 255, 255));
		pnlEdit_ListCusDetail.add(pnlListCus, "pnlListCus");
		pnlListCus.setLayout(new BorderLayout(0, 0));
		
		Object [][] data1 = {
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
		
		String [] items1 = {"ID", "Name", "Area", "Number of days", "Number of peoples"};
		table = new JTable(data1,items1);
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
		
		// ------------------------------ Create pnlDesContent ------------------------------
		pnlDesContent = new JPanel();
		pnlMainContent.add(pnlDesContent, "pnlDesContent");
		pnlDesContent.setLayout(new BorderLayout(0, 0));
		
		
		
		// ------------------------------ Create pnlBillContent ------------------------------
		pnlBillContent = new JPanel();
		pnlMainContent.add(pnlBillContent, "pnlBillContent");
		pnlBillContent.setLayout(new BorderLayout(0, 0));
		
		pnlBillContentTitle = new JPanel();
		pnlBillContentTitle.setPreferredSize(new Dimension(10, 125));
		pnlBillContent.add(pnlBillContentTitle, BorderLayout.NORTH);
		pnlBillContentTitle.setLayout(new BorderLayout(0, 0));
		
		lblBillContentTitle = new JLabel("Bill Manager");
		lblBillContentTitle.setPreferredSize(new Dimension(200, 50));
		lblBillContentTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblBillContentTitle.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		pnlBillContentTitle.add(lblBillContentTitle, BorderLayout.NORTH);
		
		pnlSearchBill = new JPanel();
		pnlSearchBill.setPreferredSize(new Dimension(10, 60));
		pnlBillContentTitle.add(pnlSearchBill, BorderLayout.CENTER);
		pnlSearchBill.setLayout(new BorderLayout(0, 0));
		
		pnlIconSrc_Txt = new JPanel();
		pnlSearchBill.add(pnlIconSrc_Txt, BorderLayout.CENTER);
		pnlIconSrc_Txt.setLayout(new BorderLayout(0, 0));
		
		txtSearchBill = new JTextField();
		txtSearchBill.setText("Search Bill");
		pnlIconSrc_Txt.add(txtSearchBill, BorderLayout.CENTER);
		txtSearchBill.setMargin(new Insets(2, 10, 2, 10));
		txtSearchBill.addFocusListener(focusListener);
		
		lblSearchBill = new JLabel("");
		lblSearchBill.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pnlIconSrc_Txt.add(lblSearchBill, BorderLayout.EAST);
		lblSearchBill.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("search.png"))));
		lblSearchBill.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 20));
		pnlSearchBill.add(panel, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 20));
		pnlSearchBill.add(panel_1, BorderLayout.SOUTH);
		
		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(250, 10));
		pnlSearchBill.add(panel_2, BorderLayout.EAST);
		
		panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(250, 10));
		pnlSearchBill.add(panel_6, BorderLayout.WEST);
		
		pnlContentBillDetail = new JPanel();
		pnlBillContent.add(pnlContentBillDetail, BorderLayout.CENTER);
		pnlContentBillDetail.setLayout(new BorderLayout(0, 0));
		
		pnlEdit_ListBill = new JPanel();
		pnlContentBillDetail.add(pnlEdit_ListBill, BorderLayout.CENTER);
		pnlEdit_ListBill.setLayout(new BorderLayout(0, 0));
		
		pnlbtnEdit_ListBill = new JPanel();
		pnlbtnEdit_ListBill.setPreferredSize(new Dimension(10, 50));
		pnlEdit_ListBill.add(pnlbtnEdit_ListBill, BorderLayout.NORTH);
		pnlbtnEdit_ListBill.setLayout(new BoxLayout(pnlbtnEdit_ListBill, BoxLayout.X_AXIS));
		
		btnEditBill = new JButton("Edit Bill");
		btnEditBill.setContentAreaFilled(false);
		btnEditBill.setFocusPainted(false);
		btnEditBill.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlbtnEdit_ListBill.add(btnEditBill);
		btnEditBill.addActionListener(actionListener);
			
		btnListBill = new JButton("List Bill");
		btnListBill.setContentAreaFilled(false);
		btnListBill.setFocusPainted(false);
		btnListBill.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlbtnEdit_ListBill.add(btnListBill);
		btnListBill.addActionListener(actionListener);
		
		pnlEdit_ListBillDetail = new JPanel();
		pnlEdit_ListBill.add(pnlEdit_ListBillDetail, BorderLayout.CENTER);
		pnlEdit_ListBillDetail.setLayout(new CardLayout(0, 0));
		
		pnlEditBill = new JPanel();
		pnlEdit_ListBillDetail.add(pnlEditBill, "pnlEditBill");
		pnlEditBill.setLayout(new BorderLayout(0, 0));
		
		scrollFillInforBill = new JScrollPane();
		scrollFillInforBill.setBorder(new TitledBorder(null, "Edit Bill", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlEditBill.add(scrollFillInforBill, BorderLayout.CENTER);
		
		pnlFillBill = new JPanel();
		pnlFillBill.setBorder(null);
		scrollFillInforBill.setViewportView(pnlFillBill);
		pnlFillBill.setLayout(new GridLayout(7, 1, 0, 0));
		
		panel_7 = new JPanel();
		pnlFillBill.add(panel_7);
		
		pnlIdBill = new JPanel();
		pnlIdBill.setPreferredSize(new Dimension(320, 35));
		pnlFillBill.add(pnlIdBill);
		pnlIdBill.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblIdBill = new JLabel("ID Bill");
		lblIdBill.setPreferredSize(new Dimension(125, 25));
		pnlIdBill.add(lblIdBill);
		
		txtIdBill = new JTextField();
		txtIdBill.setPreferredSize(new Dimension(100, 25));
		pnlIdBill.add(txtIdBill);
		txtIdBill.setColumns(20);
		
		pnlNumOfCus = new JPanel();
		pnlNumOfCus.setPreferredSize(new Dimension(320, 35));
		pnlFillBill.add(pnlNumOfCus);
		pnlNumOfCus.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNumOfCus = new JLabel("Number of customers");
		lblNumOfCus.setPreferredSize(new Dimension(125, 25));
		pnlNumOfCus.add(lblNumOfCus);
		
		txtNumOfCus = new JTextField();
		txtNumOfCus.setPreferredSize(new Dimension(100, 25));
		txtNumOfCus.setColumns(20);
		pnlNumOfCus.add(txtNumOfCus);
		
		pnlBillCreateDate = new JPanel();
		pnlBillCreateDate.setPreferredSize(new Dimension(320, 35));
		pnlFillBill.add(pnlBillCreateDate);
		pnlBillCreateDate.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblBillCreateDate = new JLabel("Bill create date");
		lblBillCreateDate.setPreferredSize(new Dimension(125, 25));
		pnlBillCreateDate.add(lblBillCreateDate);
		
		BillCreateDate = new JDateChooser();
		BillCreateDate.setPreferredSize(new Dimension(225, 25));
		pnlBillCreateDate.add(BillCreateDate);
		
		panel_8 = new JPanel();
		pnlFillBill.add(panel_8);
		
		lblTotalPrice = new JLabel("Total Price");
		lblTotalPrice.setPreferredSize(new Dimension(125, 25));
		panel_8.add(lblTotalPrice);
		
		outputTotalPrice = new JTextField();
		outputTotalPrice.setPreferredSize(new Dimension(100, 25));
		outputTotalPrice.setColumns(20);
		panel_8.add(outputTotalPrice);
		
		pnlButtonBill = new JPanel();
		pnlButtonBill.setBorder(null);
		pnlButtonBill.setPreferredSize(new Dimension(10, 40));
		pnlEditBill.add(pnlButtonBill, BorderLayout.SOUTH);
		pnlButtonBill.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAddBill = new JButton("Add");
		btnAddBill.setPreferredSize(new Dimension(100, 25));
		pnlButtonBill.add(btnAddBill);	
		
		btnDeleteBill = new JButton("Delete");
		btnDeleteBill.setPreferredSize(new Dimension(100, 25));
		pnlButtonBill.add(btnDeleteBill);
		
		pnlListBill = new JPanel();
		pnlListBill.setBorder(new TitledBorder(null, "List Bill", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlListBill.setBackground(new Color(255, 255, 255));
		pnlEdit_ListBillDetail.add(pnlListBill, "pnlListBill");
		pnlListBill.setLayout(new BorderLayout(0, 0));
		
		Object [][] data3 = {
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
		
		String [] items3 = {"ID", "Name", "Area", "Number of days", "Number of peoples"};
		table = new JTable(data3,items3);
		pnlListBill.add(table, BorderLayout.CENTER);
		
		panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(50, 10));
		pnlContentBillDetail.add(panel_3, BorderLayout.EAST);
		
		panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(50, 10));
		pnlContentBillDetail.add(panel_4, BorderLayout.WEST);
		
		panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(10, 60));
		pnlContentBillDetail.add(panel_5, BorderLayout.SOUTH);
		
	
		// ------------------------------ Create pnlSerContent ------------------------------
		pnlSerContent = new JPanel();
		pnlMainContent.add(pnlSerContent, "pnlSerContent");
		pnlSerContent.setLayout(new BorderLayout(0, 0));
		
		pnlSerContentTitle = new JPanel();
		pnlSerContentTitle.setPreferredSize(new Dimension(10, 125));
		pnlSerContent.add(pnlSerContentTitle, BorderLayout.NORTH);
		pnlSerContentTitle.setLayout(new BorderLayout(0, 0));
		
		lblSerContentTitle = new JLabel("Service Manager");
		lblSerContentTitle.setPreferredSize(new Dimension(200, 50));
		lblSerContentTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSerContentTitle.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		pnlSerContentTitle.add(lblSerContentTitle, BorderLayout.NORTH);
		
		pnlSearchSer = new JPanel();
		pnlSearchSer.setPreferredSize(new Dimension(10, 60));
		pnlSerContentTitle.add(pnlSearchSer, BorderLayout.CENTER);
		pnlSearchSer.setLayout(new BorderLayout(0, 0));
		
		pnlIconSrc_Txt = new JPanel();
		pnlSearchSer.add(pnlIconSrc_Txt, BorderLayout.CENTER);
		pnlIconSrc_Txt.setLayout(new BorderLayout(0, 0));
		
		txtSearchSer = new JTextField();
		txtSearchSer.setText("Search Service");
		pnlIconSrc_Txt.add(txtSearchSer, BorderLayout.CENTER);
		txtSearchSer.setMargin(new Insets(2, 10, 2, 10));
		txtSearchSer.addFocusListener(focusListener);
		
		lblSearchSer = new JLabel("");
		lblSearchSer.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pnlIconSrc_Txt.add(lblSearchSer, BorderLayout.EAST);
		lblSearchSer.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("search.png"))));
		lblSearchSer.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 20));
		pnlSearchSer.add(panel, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 20));
		pnlSearchSer.add(panel_1, BorderLayout.SOUTH);
		
		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(250, 10));
		pnlSearchSer.add(panel_2, BorderLayout.EAST);
		
		panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(250, 10));
		pnlSearchSer.add(panel_6, BorderLayout.WEST);
		
		pnlContentSerDetail = new JPanel();
		pnlSerContent.add(pnlContentSerDetail, BorderLayout.CENTER);
		pnlContentSerDetail.setLayout(new BorderLayout(0, 0));
		
		pnlEdit_ListSer = new JPanel();
		pnlContentSerDetail.add(pnlEdit_ListSer, BorderLayout.CENTER);
		pnlEdit_ListSer.setLayout(new BorderLayout(0, 0));
		
		pnlbtnEdit_ListSer = new JPanel();
		pnlbtnEdit_ListSer.setPreferredSize(new Dimension(10, 50));
		pnlEdit_ListSer.add(pnlbtnEdit_ListSer, BorderLayout.NORTH);
		pnlbtnEdit_ListSer.setLayout(new BoxLayout(pnlbtnEdit_ListSer, BoxLayout.X_AXIS));
		
		btnEditSer = new JButton("Edit Service");
		btnEditSer.setContentAreaFilled(false);
		btnEditSer.setFocusPainted(false);
		btnEditSer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlbtnEdit_ListSer.add(btnEditSer);
		btnEditSer.addActionListener(actionListener);
			
		btnListSer = new JButton("List Service");
		btnListSer.setContentAreaFilled(false);
		btnListSer.setFocusPainted(false);
		btnListSer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlbtnEdit_ListSer.add(btnListSer);
		btnListSer.addActionListener(actionListener);
		
		pnlEdit_ListSerDetail = new JPanel();
		pnlEdit_ListSer.add(pnlEdit_ListSerDetail, BorderLayout.CENTER);
		pnlEdit_ListSerDetail.setLayout(new CardLayout(0, 0));
		
		pnlEditSer = new JPanel();
		pnlEdit_ListSerDetail.add(pnlEditSer, "pnlEditSer");
		pnlEditSer.setLayout(new BorderLayout(0, 0));
		
		scrollFillInforSer = new JScrollPane();
		scrollFillInforSer.setBorder(new TitledBorder(null, "Edit Service", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlEditSer.add(scrollFillInforSer, BorderLayout.CENTER);
		
		pnlFillSer = new JPanel();
		pnlFillSer.setBorder(null);
		scrollFillInforSer.setViewportView(pnlFillSer);
		pnlFillSer.setLayout(new GridLayout(7, 1, 0, 0));
		
		pnlIdSer = new JPanel();
		pnlIdSer.setPreferredSize(new Dimension(320, 35));
		pnlFillSer.add(pnlIdSer);
		pnlIdSer.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblIdSer = new JLabel("ID service");
		lblIdSer.setPreferredSize(new Dimension(125, 25));
		pnlIdSer.add(lblIdSer);
		
		txtIdSer = new JTextField();
		txtIdSer.setPreferredSize(new Dimension(100, 25));
		pnlIdSer.add(txtIdSer);
		txtIdSer.setColumns(20);
		
		pnlNameSer = new JPanel();
		pnlNameSer.setPreferredSize(new Dimension(320, 35));
		pnlFillSer.add(pnlNameSer);
		pnlNameSer.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNameSer = new JLabel("Service name");
		lblNameSer.setPreferredSize(new Dimension(125, 25));
		pnlNameSer.add(lblNameSer);
		
		txtNameSer = new JTextField();
		txtNameSer.setPreferredSize(new Dimension(100, 25));
		txtNameSer.setColumns(20);
		pnlNameSer.add(txtNameSer);
		
		pnlPriceSer = new JPanel();
		pnlPriceSer.setPreferredSize(new Dimension(320, 35));
		pnlFillSer.add(pnlPriceSer);
		pnlPriceSer.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblPriceSer = new JLabel("Price");
		lblPriceSer.setPreferredSize(new Dimension(125, 25));
		pnlPriceSer.add(lblPriceSer);
		
		txtPriceSer = new JTextField();
		txtPriceSer.setPreferredSize(new Dimension(100, 25));
		txtPriceSer.setColumns(20);
		pnlPriceSer.add(txtPriceSer);
		
		pnlButtonSer = new JPanel();
		pnlButtonSer.setBorder(null);
		pnlButtonSer.setPreferredSize(new Dimension(10, 40));
		pnlEditSer.add(pnlButtonSer, BorderLayout.SOUTH);
		pnlButtonSer.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAddSer = new JButton("Add");
		btnAddSer.setPreferredSize(new Dimension(100, 25));
		pnlButtonSer.add(btnAddSer);	
		
		btnDeleteSer = new JButton("Delete");
		btnDeleteSer.setPreferredSize(new Dimension(100, 25));
		pnlButtonSer.add(btnDeleteSer);
		
		pnlListSer = new JPanel();
		pnlListSer.setBorder(new TitledBorder(null, "List Service", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlListSer.setBackground(new Color(255, 255, 255));
		pnlEdit_ListSerDetail.add(pnlListSer, "pnlListSer");
		pnlListSer.setLayout(new BorderLayout(0, 0));
		
		Object [][] data4 = {
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
		
		String [] items4 = {"ID", "Name", "Area", "Number of days", "Number of peoples"};
		table = new JTable(data4,items4);
		pnlListSer.add(table, BorderLayout.CENTER);
		
		panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(50, 10));
		pnlContentSerDetail.add(panel_3, BorderLayout.EAST);
		
		panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(50, 10));
		pnlContentSerDetail.add(panel_4, BorderLayout.WEST);
		
		panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(10, 60));
		pnlContentSerDetail.add(panel_5, BorderLayout.SOUTH);
		
		// ------------------------------ Create pnlHotelContent ------------------------------
		pnlHotelContent = new JPanel();
		pnlMainContent.add(pnlHotelContent, "pnlHotelContent");
		pnlHotelContent.setLayout(new BorderLayout(0, 0));	
		
		pnlHotelContentTitle = new JPanel();
		pnlHotelContentTitle.setPreferredSize(new Dimension(10, 125));
		pnlHotelContent.add(pnlHotelContentTitle, BorderLayout.NORTH);
		pnlHotelContentTitle.setLayout(new BorderLayout(0, 0));
		
		lblHotelContentTitle = new JLabel("Hotel Manager");
		lblHotelContentTitle.setPreferredSize(new Dimension(200, 50));
		lblHotelContentTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelContentTitle.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		pnlHotelContentTitle.add(lblHotelContentTitle, BorderLayout.NORTH);
		
		pnlSearchHotel = new JPanel();
		pnlSearchHotel.setPreferredSize(new Dimension(10, 60));
		pnlHotelContentTitle.add(pnlSearchHotel, BorderLayout.CENTER);
		pnlSearchHotel.setLayout(new BorderLayout(0, 0));
		
		pnlIconSrc_Txt = new JPanel();
		pnlSearchHotel.add(pnlIconSrc_Txt, BorderLayout.CENTER);
		pnlIconSrc_Txt.setLayout(new BorderLayout(0, 0));
		
		txtSearchHotel = new JTextField();
		txtSearchHotel.setText("Search Hotel");
		pnlIconSrc_Txt.add(txtSearchHotel, BorderLayout.CENTER);
		txtSearchHotel.setMargin(new Insets(2, 10, 2, 10));
		txtSearchHotel.addFocusListener(focusListener);
		
		lblSearchHotel = new JLabel("");
		lblSearchHotel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pnlIconSrc_Txt.add(lblSearchHotel, BorderLayout.EAST);
		lblSearchHotel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("search.png"))));
		lblSearchHotel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 20));
		pnlSearchHotel.add(panel, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 20));
		pnlSearchHotel.add(panel_1, BorderLayout.SOUTH);
		
		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(250, 10));
		pnlSearchHotel.add(panel_2, BorderLayout.EAST);
		
		panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(250, 10));
		pnlSearchHotel.add(panel_6, BorderLayout.WEST);
		
		pnlContentHotelDetail = new JPanel();
		pnlHotelContent.add(pnlContentHotelDetail, BorderLayout.CENTER);
		pnlContentHotelDetail.setLayout(new BorderLayout(0, 0));
		
		pnlEdit_ListHotel = new JPanel();
		pnlContentHotelDetail.add(pnlEdit_ListHotel, BorderLayout.CENTER);
		pnlEdit_ListHotel.setLayout(new BorderLayout(0, 0));
		
		pnlbtnEdit_ListHotel = new JPanel();
		pnlbtnEdit_ListHotel.setPreferredSize(new Dimension(10, 50));
		pnlEdit_ListHotel.add(pnlbtnEdit_ListHotel, BorderLayout.NORTH);
		pnlbtnEdit_ListHotel.setLayout(new BoxLayout(pnlbtnEdit_ListHotel, BoxLayout.X_AXIS));
		
		btnEditHotel = new JButton("Edit Hotel");
		btnEditHotel.setContentAreaFilled(false);
		btnEditHotel.setFocusPainted(false);
		btnEditHotel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlbtnEdit_ListHotel.add(btnEditHotel);
		btnEditHotel.addActionListener(actionListener);
			
		btnListHotel = new JButton("List Hotel");
		btnListHotel.setContentAreaFilled(false);
		btnListHotel.setFocusPainted(false);
		btnListHotel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlbtnEdit_ListHotel.add(btnListHotel);
		btnListHotel.addActionListener(actionListener);
		
		pnlEdit_ListHotelDetail = new JPanel();
		pnlEdit_ListHotel.add(pnlEdit_ListHotelDetail, BorderLayout.CENTER);
		pnlEdit_ListHotelDetail.setLayout(new CardLayout(0, 0));
		
		pnlEditHotel = new JPanel();
		pnlEdit_ListHotelDetail.add(pnlEditHotel, "pnlEditHotel");
		pnlEditHotel.setLayout(new BorderLayout(0, 0));
		
		scrollFillInforHotel = new JScrollPane();
		scrollFillInforHotel.setBorder(new TitledBorder(null, "Edit Hotel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlEditHotel.add(scrollFillInforHotel, BorderLayout.CENTER);
		
		pnlFillHotel = new JPanel();
		pnlFillHotel.setBorder(null);
		scrollFillInforHotel.setViewportView(pnlFillHotel);
		pnlFillHotel.setLayout(new GridLayout(7, 1, 0, 0));
		
		pnlIdHotel = new JPanel();
		pnlIdHotel.setPreferredSize(new Dimension(320, 35));
		pnlFillHotel.add(pnlIdHotel);
		pnlIdHotel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblIdHotel = new JLabel("ID");
		lblIdHotel.setPreferredSize(new Dimension(125, 25));
		pnlIdHotel.add(lblIdHotel);
		
		txtIdHotel = new JTextField();
		txtIdHotel.setPreferredSize(new Dimension(100, 25));
		pnlIdHotel.add(txtIdHotel);
		txtIdHotel.setColumns(20);
		
		pnlNameHotel = new JPanel();
		pnlNameHotel.setPreferredSize(new Dimension(320, 35));
		pnlFillHotel.add(pnlNameHotel);
		pnlNameHotel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNameHotel = new JLabel("Name");
		lblNameHotel.setPreferredSize(new Dimension(125, 25));
		pnlNameHotel.add(lblNameHotel);
		
		txtNameHotel = new JTextField();
		txtNameHotel.setPreferredSize(new Dimension(100, 25));
		txtNameHotel.setColumns(20);
		pnlNameHotel.add(txtNameHotel);
		
		pnlNumOfRoomHotel = new JPanel();
		pnlNumOfRoomHotel.setPreferredSize(new Dimension(320, 35));
		pnlFillHotel.add(pnlNumOfRoomHotel);
		pnlNumOfRoomHotel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNumOfRoomHotel = new JLabel("Number of rooms");
		lblNumOfRoomHotel.setPreferredSize(new Dimension(125, 25));
		pnlNumOfRoomHotel.add(lblNumOfRoomHotel);
		
		txtNumOfRoomHotel = new JTextField();
		txtNumOfRoomHotel.setPreferredSize(new Dimension(100, 25));
		txtNumOfRoomHotel.setColumns(20);
		pnlNumOfRoomHotel.add(txtNumOfRoomHotel);
		
		pnlPriceHotel = new JPanel();
		pnlPriceHotel.setPreferredSize(new Dimension(320, 35));
		pnlFillHotel.add(pnlPriceHotel);
		pnlPriceHotel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblPriceHotel = new JLabel("Price");
		lblPriceHotel.setPreferredSize(new Dimension(125, 25));
		pnlPriceHotel.add(lblPriceHotel);
		
		txtPriceHotel = new JTextField();
		txtPriceHotel.setPreferredSize(new Dimension(100, 25));
		txtPriceHotel.setColumns(20);
		pnlPriceHotel.add(txtPriceHotel);
		
		pnlPhoneHotel= new JPanel();
		pnlPhoneHotel.setPreferredSize(new Dimension(320, 35));
		pnlFillHotel.add(pnlPhoneHotel);
		pnlPhoneHotel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblPhoneHotel = new JLabel("Phone");
		lblPhoneHotel.setPreferredSize(new Dimension(125, 25));
		pnlPhoneHotel.add(lblPhoneHotel);
		
		txtPhoneHotel = new JTextField();
		txtPhoneHotel.setPreferredSize(new Dimension(100, 25));
		txtPhoneHotel.setColumns(20);
		pnlPhoneHotel.add(txtPhoneHotel);
		
		pnlEmailHotel = new JPanel();
		pnlEmailHotel.setPreferredSize(new Dimension(320, 35));
		pnlFillHotel.add(pnlEmailHotel);
		pnlEmailHotel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblEmailCus = new JLabel("Email");
		lblEmailCus.setPreferredSize(new Dimension(125, 25));
		pnlEmailHotel.add(lblEmailCus);
		
		txtEmailCus = new JTextField();
		txtEmailCus.setPreferredSize(new Dimension(100, 25));
		txtEmailCus.setColumns(20);
		pnlEmailHotel.add(txtEmailCus);
		
		pnlAddressHotel = new JPanel();
		pnlAddressHotel.setPreferredSize(new Dimension(320, 35));
		pnlFillHotel.add(pnlAddressHotel);
		pnlAddressHotel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblAddressHotel = new JLabel("Address");
		lblAddressHotel.setPreferredSize(new Dimension(125, 25));
		pnlAddressHotel.add(lblAddressHotel);
		
		txtAddressHotel = new JTextField();
		txtAddressHotel.setPreferredSize(new Dimension(100, 25));
		txtAddressHotel.setColumns(20);
		pnlAddressHotel.add(txtAddressHotel);
		
		pnlButtonHotel = new JPanel();
		pnlButtonHotel.setBorder(null);
		pnlButtonHotel.setPreferredSize(new Dimension(10, 40));
		pnlEditHotel.add(pnlButtonHotel, BorderLayout.SOUTH);
		pnlButtonHotel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAddHotel = new JButton("Add");
		btnAddHotel.setPreferredSize(new Dimension(100, 25));
		pnlButtonHotel.add(btnAddHotel);	
		
		btnDeleteHotel = new JButton("Delete");
		btnDeleteHotel.setPreferredSize(new Dimension(100, 25));
		pnlButtonHotel.add(btnDeleteHotel);
		
		pnlListHotel = new JPanel();
		pnlListHotel.setBorder(new TitledBorder(null, "List Hotel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlListHotel.setBackground(new Color(255, 255, 255));
		pnlEdit_ListHotelDetail.add(pnlListHotel, "pnlListHotel");
		pnlListHotel.setLayout(new BorderLayout(0, 0));
		
		Object [][] data2 = {
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
		
		String [] items2 = {"ID", "Name", "Area", "Number of days", "Number of peoples"};
		table = new JTable(data2,items2);
		pnlListHotel.add(table, BorderLayout.CENTER);
		
		panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(50, 10));
		pnlContentHotelDetail.add(panel_3, BorderLayout.EAST);
		
		panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(50, 10));
		pnlContentHotelDetail.add(panel_4, BorderLayout.WEST);
		
		panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(10, 60));
		pnlContentHotelDetail.add(panel_5, BorderLayout.SOUTH);
		
		
		// ------------------------------ Create pnlAccContent ------------------------------
		pnlAccContent = new JPanel();
		pnlMainContent.add(pnlAccContent, "pnlAccContent");
		pnlAccContent.setLayout(new BorderLayout(0, 0));
		
		pnlAccContentTitle = new JPanel();
		pnlAccContentTitle.setPreferredSize(new Dimension(10, 125));
		pnlAccContent.add(pnlAccContentTitle, BorderLayout.NORTH);
		pnlAccContentTitle.setLayout(new BorderLayout(0, 0));
		
		lblAccContentTitle = new JLabel("Account Manager");
		lblAccContentTitle.setPreferredSize(new Dimension(200, 50));
		lblAccContentTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccContentTitle.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		pnlAccContentTitle.add(lblAccContentTitle, BorderLayout.NORTH);
		
		pnlSearchAcc = new JPanel();
		pnlSearchAcc.setPreferredSize(new Dimension(10, 60));
		pnlAccContentTitle.add(pnlSearchAcc, BorderLayout.CENTER);
		pnlSearchAcc.setLayout(new BorderLayout(0, 0));
		
		pnlIconSrc_Txt = new JPanel();
		pnlSearchAcc.add(pnlIconSrc_Txt, BorderLayout.CENTER);
		pnlIconSrc_Txt.setLayout(new BorderLayout(0, 0));
		
		txtSearchAcc = new JTextField();
		txtSearchAcc.setText("Search Account");
		pnlIconSrc_Txt.add(txtSearchAcc, BorderLayout.CENTER);
		txtSearchAcc.setMargin(new Insets(2, 10, 2, 10));
		txtSearchAcc.addFocusListener(focusListener);
		
		lblSearchAcc = new JLabel("");
		lblSearchAcc.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pnlIconSrc_Txt.add(lblSearchAcc, BorderLayout.EAST);
		lblSearchAcc.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(TourManager.class.getResource("search.png"))));
		lblSearchAcc.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 20));
		pnlSearchAcc.add(panel, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 20));
		pnlSearchAcc.add(panel_1, BorderLayout.SOUTH);
		
		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(250, 10));
		pnlSearchAcc.add(panel_2, BorderLayout.EAST);
		
		panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(250, 10));
		pnlSearchAcc.add(panel_6, BorderLayout.WEST);
		
		pnlContentAccDetail = new JPanel();
		pnlAccContent.add(pnlContentAccDetail, BorderLayout.CENTER);
		pnlContentAccDetail.setLayout(new BorderLayout(0, 0));
		
		pnlEdit_ListAcc = new JPanel();
		pnlContentAccDetail.add(pnlEdit_ListAcc, BorderLayout.CENTER);
		pnlEdit_ListAcc.setLayout(new BorderLayout(0, 0));
		
		pnlbtnEdit_ListAcc = new JPanel();
		pnlbtnEdit_ListAcc.setPreferredSize(new Dimension(10, 50));
		pnlEdit_ListAcc.add(pnlbtnEdit_ListAcc, BorderLayout.NORTH);
		pnlbtnEdit_ListAcc.setLayout(new BoxLayout(pnlbtnEdit_ListAcc, BoxLayout.X_AXIS));
		
		btnEditAcc = new JButton("Edit Account");
		btnEditAcc.setContentAreaFilled(false);
		btnEditAcc.setFocusPainted(false);
		btnEditAcc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlbtnEdit_ListAcc.add(btnEditAcc);
		btnEditAcc.addActionListener(actionListener);
			
		btnListAcc = new JButton("List Acccount");
		btnListAcc.setContentAreaFilled(false);
		btnListAcc.setFocusPainted(false);
		btnListAcc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlbtnEdit_ListAcc.add(btnListAcc);
		btnListAcc.addActionListener(actionListener);
		
		pnlEdit_ListAccDetail = new JPanel();
		pnlEdit_ListAcc.add(pnlEdit_ListAccDetail, BorderLayout.CENTER);
		pnlEdit_ListAccDetail.setLayout(new CardLayout(0, 0));
		
		pnlEditAcc = new JPanel();
		pnlEdit_ListAccDetail.add(pnlEditAcc, "pnlEditAcc");
		pnlEditAcc.setLayout(new BorderLayout(0, 0));
		
		scrollFillInforAcc = new JScrollPane();
		scrollFillInforAcc.setBorder(new TitledBorder(null, "Edit Account", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlEditAcc.add(scrollFillInforAcc, BorderLayout.CENTER);
		
		pnlFillAcc = new JPanel();
		pnlFillAcc.setBorder(null);
		scrollFillInforAcc.setViewportView(pnlFillAcc);
		pnlFillAcc.setLayout(new GridLayout(7, 1, 0, 0));
		
		pnlIdAcc = new JPanel();
		pnlIdAcc.setPreferredSize(new Dimension(320, 35));
		pnlFillAcc.add(pnlIdAcc);
		pnlIdAcc.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblIdAcc = new JLabel("ID Account");
		lblIdAcc.setPreferredSize(new Dimension(125, 25));
		pnlIdAcc.add(lblIdAcc);
		
		txtIdAcc = new JTextField();
		txtIdAcc.setPreferredSize(new Dimension(100, 25));
		pnlIdAcc.add(txtIdAcc);
		txtIdAcc.setColumns(20);
		
		pnlUserNameAcc = new JPanel();
		pnlUserNameAcc.setPreferredSize(new Dimension(320, 35));
		pnlFillAcc.add(pnlUserNameAcc);
		pnlUserNameAcc.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblUserNameAcc = new JLabel("User name");
		lblUserNameAcc.setPreferredSize(new Dimension(125, 25));
		pnlUserNameAcc.add(lblUserNameAcc);
		
		txtUserNameAcc = new JTextField();
		txtUserNameAcc.setPreferredSize(new Dimension(100, 25));
		txtUserNameAcc.setColumns(20);
		pnlUserNameAcc.add(txtUserNameAcc);
		
		pnlPassAcc = new JPanel();
		pnlPassAcc.setPreferredSize(new Dimension(320, 35));
		pnlFillAcc.add(pnlPassAcc);
		pnlPassAcc.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblPassAcc = new JLabel("Password");
		lblPassAcc.setPreferredSize(new Dimension(125, 25));
		pnlPassAcc.add(lblPassAcc);
		
		txtPassAcc = new JTextField();
		txtPassAcc.setPreferredSize(new Dimension(100, 25));
		txtPassAcc.setColumns(20);
		pnlPassAcc.add(txtPassAcc);
		
		pnlIdCusAcc = new JPanel();
		pnlIdCusAcc.setPreferredSize(new Dimension(320, 35));
		pnlFillAcc.add(pnlIdCusAcc);
		pnlIdCusAcc.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblIdCusAcc = new JLabel("ID Customer");
		lblIdCusAcc.setPreferredSize(new Dimension(125, 25));
		pnlIdCusAcc.add(lblIdCusAcc);
		
		txtIdCusAcc = new JTextField();
		txtIdCusAcc.setPreferredSize(new Dimension(100, 25));
		txtIdCusAcc.setColumns(20);
		pnlIdCusAcc.add(txtIdCusAcc);
		
		pnlPermissionAcc = new JPanel();
		pnlPermissionAcc.setPreferredSize(new Dimension(320, 35));
		pnlFillAcc.add(pnlPermissionAcc);
		pnlPermissionAcc.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblPermissionAcc = new JLabel("Permission");
		lblPermissionAcc.setPreferredSize(new Dimension(125, 25));
		pnlPermissionAcc.add(lblPermissionAcc);
		
		cbBoxPermissionAcc = new JComboBox();
		cbBoxPermissionAcc.setPreferredSize(new Dimension(225, 25));
		cbBoxPermissionAcc.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbBoxPermissionAcc.setModel(new DefaultComboBoxModel(new String[] {"Customer", "Admin"}));
		pnlPermissionAcc.add(cbBoxPermissionAcc);
		
		pnlButtonAcc = new JPanel();
		pnlButtonAcc.setBorder(null);
		pnlButtonAcc.setPreferredSize(new Dimension(10, 40));
		pnlEditAcc.add(pnlButtonAcc, BorderLayout.SOUTH);
		pnlButtonAcc.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAddAcc = new JButton("Add");
		btnAddAcc.setPreferredSize(new Dimension(100, 25));
		pnlButtonAcc.add(btnAddAcc);	
		
		btnDeleteAcc = new JButton("Delete");
		btnDeleteAcc.setPreferredSize(new Dimension(100, 25));
		pnlButtonAcc.add(btnDeleteAcc);
		
		pnlListAcc = new JPanel();
		pnlListAcc.setBorder(new TitledBorder(null, "List Account", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlListAcc.setBackground(new Color(255, 255, 255));
		pnlEdit_ListAccDetail.add(pnlListAcc, "pnlListAcc");
		pnlListAcc.setLayout(new BorderLayout(0, 0));
		
		Object [][] data5 = {
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
		
		String [] items5 = {"ID", "Name", "Area", "Number of days", "Number of peoples"};
		table = new JTable(data5,items5);
		pnlListAcc.add(table, BorderLayout.CENTER);
		
		panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(50, 10));
		pnlContentAccDetail.add(panel_3, BorderLayout.EAST);
		
		panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(50, 10));
		pnlContentAccDetail.add(panel_4, BorderLayout.WEST);
		
		panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(10, 60));
		pnlContentAccDetail.add(panel_5, BorderLayout.SOUTH);
		
		
		// ------------------------------ Create pnlStatisticalContent ------------------------------
		pnlStatisticalContent = new JPanel();
		pnlMainContent.add(pnlStatisticalContent, "pnlStatisticalContent");
		pnlStatisticalContent.setLayout(new BorderLayout(0, 0));
		
		// ------------------------------ Create pnlExportExcelContent ------------------------------
		pnlExportExcelContent = new JPanel();
		pnlMainContent.add(pnlExportExcelContent, "pnlExportExcelContent");
		pnlExportExcelContent.setLayout(new BorderLayout(0, 0));
		
		
			
	}
	
	

	// ZoomOutMenu function to make hidden pnlMenuDetail
	public void ZoomOutMenu() {
		MouseListener mouseListener = new ManagerControl(this);
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
	
	public void addPlaceholderStyle(JTextField jTextField) {
		Font font = jTextField.getFont();
		font = font.deriveFont(Font.ITALIC);
		jTextField.setFont(font);
		jTextField.setForeground(Color.gray);
	}
	
	public void removePlaceholderStyle(JTextField jTextField) {
		Font font = jTextField.getFont();
		font = font.deriveFont(Font.PLAIN|Font.BOLD);
		jTextField.setFont(font);
		jTextField.setForeground(Color.black);
	}
	
	
}
