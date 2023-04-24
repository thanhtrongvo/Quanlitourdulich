package controller;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import view.Manager;
import view.TourManager;

public class TourMngControl implements ActionListener, MouseListener{
	private TourManager tourManager;
	private Manager manager;
	
	public TourMngControl(Manager manager) {
		this.manager = manager;
	}

	public TourManager getTourManager() {
		return manager;
	}

	public void setTourManager(Manager manager) {
		this.manager = manager;
	}
	
	// Method abstract of ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tourManager.getBtnEditTour()) {
			tourManager.getCardLayoutEdit_ListTourDetail().show(tourManager.getPnlEdit_ListTourDetail(), "pnlEditTour");
		}else if(e.getSource() == tourManager.getBtnListTour()) {
			tourManager.getCardLayoutEdit_ListTourDetail().show(tourManager.getPnlEdit_ListTourDetail(), "pnlListTour");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == tourManager.getLblIconZoomOut()) {
			tourManager.ZoomOutMenu();
		}else if(e.getSource() == tourManager.getLblIconZoomIn()){
			tourManager.ZoomInMenu();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == tourManager.getLblIconZoomIn()){
			tourManager.getPnlZoom().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == tourManager.getLblIconZoomOut()) {
			tourManager.getPnlZoom().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == tourManager.getLblIconHome()) {
			tourManager.getPnlHome().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == tourManager.getLblIconSetting()) {
			tourManager.getPnlSetting().setBackground(new Color(187, 222, 251));

		}else if(e.getSource() == tourManager.getLblTourManager()) {
			tourManager.getPnlTourManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == tourManager.getLblCusManager()){
			tourManager.getPnlCusManager().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == tourManager.getLblDesManager()) {
			tourManager.getPnlDesManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == tourManager.getLblBillManager()){
			tourManager.getPnlBillManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == tourManager.getLblSerManager()) {
			tourManager.getPnlSerManager().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == tourManager.getLblHotelManager()){
			tourManager.getPnlHotelManager().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == tourManager.getLblAccManager()){
			tourManager.getPnlAccManager().setBackground(new Color(187, 222, 251));	
		}else if(e.getSource() == tourManager.getLblStatistical()) {
			tourManager.getPnlStatistical().setBackground(new Color(187, 222, 251));
		}else if(e.getSource() == tourManager.getLblExportExcel()) {
			tourManager.getPnlExportExcel().setBackground(new Color(187, 222, 251));
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == tourManager.getLblIconZoomIn()){
			tourManager.getPnlZoom().setBackground(new Color(33, 150, 243));	
		}else if(e.getSource() == tourManager.getLblIconZoomOut()) {
			tourManager.getPnlZoom().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == tourManager.getLblIconHome()) {
			tourManager.getPnlHome().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == tourManager.getLblIconSetting()) {
			tourManager.getPnlSetting().setBackground(new Color(33, 150, 243));
			
		}else if(e.getSource() == tourManager.getLblTourManager()) {
			tourManager.getPnlTourManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == tourManager.getLblCusManager()){
			tourManager.getPnlCusManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == tourManager.getLblDesManager()) {
			tourManager.getPnlDesManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == tourManager.getLblBillManager()){
			tourManager.getPnlBillManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == tourManager.getLblSerManager()) {
			tourManager.getPnlSerManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == tourManager.getLblHotelManager()){
			tourManager.getPnlHotelManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == tourManager.getLblAccManager()){
			tourManager.getPnlAccManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == tourManager.getLblStatistical()) {
			tourManager.getPnlStatistical().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == tourManager.getLblExportExcel()) {
			tourManager.getPnlExportExcel().setBackground(new Color(66, 165, 243));
		}		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == tourManager.getLblIconZoomIn()){
			tourManager.getPnlZoom().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == tourManager.getLblIconZoomOut()) {
			tourManager.getPnlZoom().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == tourManager.getLblIconHome()) {
			tourManager.getPnlHome().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == tourManager.getLblIconSetting()) {
			tourManager.getPnlSetting().setBackground(new Color(144, 202, 249));
		
		}else if(e.getSource() == tourManager.getLblTourManager()) {
			tourManager.getPnlTourManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == tourManager.getLblCusManager()){
			tourManager.getPnlCusManager().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == tourManager.getLblDesManager()) {
			tourManager.getPnlDesManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == tourManager.getLblBillManager()){
			tourManager.getPnlBillManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == tourManager.getLblSerManager()) {
			tourManager.getPnlSerManager().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == tourManager.getLblHotelManager()){
			tourManager.getPnlHotelManager().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == tourManager.getLblAccManager()){
			tourManager.getPnlAccManager().setBackground(new Color(144, 202, 249));	
		}else if(e.getSource() == tourManager.getLblStatistical()) {
			tourManager.getPnlStatistical().setBackground(new Color(144, 202, 249));
		}else if(e.getSource() == tourManager.getLblExportExcel()) {
			tourManager.getPnlExportExcel().setBackground(new Color(144, 202, 249));
		}	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource() == tourManager.getLblIconZoomIn()){
			tourManager.getPnlZoom().setBackground(new Color(33, 150, 243));	
		}else if(e.getSource() == tourManager.getLblIconZoomOut()) {
			tourManager.getPnlZoom().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == tourManager.getLblIconHome()) {
			tourManager.getPnlHome().setBackground(new Color(33, 150, 243));
		}else if(e.getSource() == tourManager.getLblIconSetting()) {
			tourManager.getPnlSetting().setBackground(new Color(33, 150, 243));
			
		}else if(e.getSource() == tourManager.getLblTourManager()) {
			tourManager.getPnlTourManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == tourManager.getLblCusManager()){
			tourManager.getPnlCusManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == tourManager.getLblDesManager()) {
			tourManager.getPnlDesManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == tourManager.getLblBillManager()){
			tourManager.getPnlBillManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == tourManager.getLblSerManager()) {
			tourManager.getPnlSerManager().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == tourManager.getLblHotelManager()){
			tourManager.getPnlHotelManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == tourManager.getLblAccManager()){
			tourManager.getPnlAccManager().setBackground(new Color(66, 165, 243));	
		}else if(e.getSource() == tourManager.getLblStatistical()) {
			tourManager.getPnlStatistical().setBackground(new Color(66, 165, 243));
		}else if(e.getSource() == tourManager.getLblExportExcel()) {
			tourManager.getPnlExportExcel().setBackground(new Color(66, 165, 243));
		}		
	}
	
}
