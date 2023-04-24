package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.CustomerManager;


public class CustomerMngControl implements ActionListener, MouseListener{
	
	private CustomerManager customerManager;
	
	public CustomerMngControl(CustomerManager customerManager) {
		this.customerManager = customerManager;
	}

	public CustomerManager getCusManager() {
		return customerManager;
	}

	public void setCusManager(CustomerManager customerManager) {
		this.customerManager = customerManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == customerManager.getBtnEditCus()) {
			customerManager.getCardLayoutEdit_ListCusDetail().show(customerManager.getPnlEdit_ListCusDetail(), "pnlEditCus");
		}else if(e.getSource() == customerManager.getBtnListCus()) {
			customerManager.getCardLayoutEdit_ListCusDetail().show(customerManager.getPnlEdit_ListCusDetail(), "pnlListCus");
		}else if(e.getSource() == customerManager.getLblTourManager()) {
			
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == customerManager.getLblIconZoomOut()) {
			customerManager.ZoomOutMenu();
		}else if(e.getSource() == customerManager.getLblIconZoomIn()){
			customerManager.ZoomInMenu();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == customerManager.getLblIconZoomIn()){
			customerManager.getPnlZoom().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == customerManager.getLblIconZoomOut()) {
			customerManager.getPnlZoom().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == customerManager.getLblIconHome()) {
			customerManager.getPnlHome().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == customerManager.getLblIconSetting()) {
			customerManager.getPnlSetting().setBackground(new Color(187, 222, 251));

		}else if(e.getSource() == customerManager.getLblTourManager()) {
			customerManager.getPnlTourManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == customerManager.getLblCusManager()){
			customerManager.getPnlCusManager().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == customerManager.getLblDesManager()) {
			customerManager.getPnlDesManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == customerManager.getLblBillManager()){
			customerManager.getPnlBillManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == customerManager.getLblSerManager()) {
			customerManager.getPnlSerManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == customerManager.getLblHotelManager()){
			customerManager.getPnlHotelManager().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == customerManager.getLblAccManager()){
			customerManager.getPnlAccManager().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == customerManager.getLblStatistical()) {
			customerManager.getPnlStatistical().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == customerManager.getLblExportExcel()) {
			customerManager.getPnlExportExcel().setBackground(new Color(187, 222, 251));
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == customerManager.getLblIconZoomIn()){
			customerManager.getPnlZoom().setBackground(new Color(33, 150, 243));	
		}else if(e.getSource() == customerManager.getLblIconZoomOut()) {
			customerManager.getPnlZoom().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == customerManager.getLblIconHome()) {
			customerManager.getPnlHome().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == customerManager.getLblIconSetting()) {
			customerManager.getPnlSetting().setBackground(new Color(33, 150, 243));
			
		}else if(e.getSource() == customerManager.getLblTourManager()) {
			customerManager.getPnlTourManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == customerManager.getLblCusManager()){
			customerManager.getPnlCusManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == customerManager.getLblDesManager()) {
			customerManager.getPnlDesManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == customerManager.getLblBillManager()){
			customerManager.getPnlBillManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == customerManager.getLblSerManager()) {
			customerManager.getPnlSerManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == customerManager.getLblHotelManager()){
			customerManager.getPnlHotelManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == customerManager.getLblAccManager()){
			customerManager.getPnlAccManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == customerManager.getLblStatistical()) {
			customerManager.getPnlStatistical().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == customerManager.getLblExportExcel()) {
			customerManager.getPnlExportExcel().setBackground(new Color(66, 165, 243));
		}		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == customerManager.getLblIconZoomIn()){
			customerManager.getPnlZoom().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == customerManager.getLblIconZoomOut()) {
			customerManager.getPnlZoom().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == customerManager.getLblIconHome()) {
			customerManager.getPnlHome().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == customerManager.getLblIconSetting()) {
			customerManager.getPnlSetting().setBackground(new Color(144, 202, 249));
		
		}else if(e.getSource() == customerManager.getLblTourManager()) {
			customerManager.getPnlTourManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == customerManager.getLblCusManager()){
			customerManager.getPnlCusManager().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == customerManager.getLblDesManager()) {
			customerManager.getPnlDesManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == customerManager.getLblBillManager()){
			customerManager.getPnlBillManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == customerManager.getLblSerManager()) {
			customerManager.getPnlSerManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == customerManager.getLblHotelManager()){
			customerManager.getPnlHotelManager().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == customerManager.getLblAccManager()){
			customerManager.getPnlAccManager().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == customerManager.getLblStatistical()) {
			customerManager.getPnlStatistical().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == customerManager.getLblExportExcel()) {
			customerManager.getPnlExportExcel().setBackground(new Color(144, 202, 249));
		}	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource() == customerManager.getLblIconZoomIn()){
			customerManager.getPnlZoom().setBackground(new Color(33, 150, 243));	
		}else if(e.getSource() == customerManager.getLblIconZoomOut()) {
			customerManager.getPnlZoom().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == customerManager.getLblIconHome()) {
			customerManager.getPnlHome().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == customerManager.getLblIconSetting()) {
			customerManager.getPnlSetting().setBackground(new Color(33, 150, 243));
			
		}else if(e.getSource() == customerManager.getLblTourManager()) {
			customerManager.getPnlTourManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == customerManager.getLblCusManager()){
			customerManager.getPnlCusManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == customerManager.getLblDesManager()) {
			customerManager.getPnlDesManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == customerManager.getLblBillManager()){
			customerManager.getPnlBillManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == customerManager.getLblSerManager()) {
			customerManager.getPnlSerManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == customerManager.getLblHotelManager()){
			customerManager.getPnlHotelManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == customerManager.getLblAccManager()){
			customerManager.getPnlAccManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == customerManager.getLblStatistical()) {
			customerManager.getPnlStatistical().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == customerManager.getLblExportExcel()) {
			customerManager.getPnlExportExcel().setBackground(new Color(66, 165, 243));
		}		
	}

}
