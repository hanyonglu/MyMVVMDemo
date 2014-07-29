package com.demo.controller;

import com.demo.datarep.SampleData;
import com.demo.interf.IBaseView;
import com.demo.interf.IController;
import com.demo.interf.IData;
import com.demo.interf.IModel;
import com.demo.view.SampleView;
import com.demo.viewmodel.SampleModel;

public class SampleController implements IController{
	public SampleController() {
		
	}
	
	public void initContoller() {
		IData sampleData = new SampleData();
		IModel sampleModel = new SampleModel(sampleData);
		IBaseView sampleView = new SampleView(sampleModel);
		sampleView.initViews();
	}
}
