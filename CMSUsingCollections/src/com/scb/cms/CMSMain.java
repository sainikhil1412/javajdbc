package com.scb.cms;

import com.scb.cms.controller.ClientController;


public class CMSMain {

	public static void main(String[] args) {
		ClientController cctrl = new ClientController();
		cctrl.selectClientCRUD();
	}

}
