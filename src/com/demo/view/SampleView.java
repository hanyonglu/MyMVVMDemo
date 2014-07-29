package com.demo.view;

import com.demo.interf.IBaseView;
import com.demo.interf.IModel;

public class SampleView implements IBaseView{
	private IModel sampleModel;
	
	public SampleView(IModel sampleModel) {
		this.sampleModel = sampleModel;
	}
	
	public void initViews() {
		// Show the window's views
		// 如果能将SampleModel直接绑定在View上更好
		// 此处为了简化，便直接打印出相关内容
		System.out.println("my name = " + sampleModel.getUser().getName() + "\n年龄 = " + 
				sampleModel.getUser().getAge() + "\n职业 = " + 
				sampleModel.getUserRoleList().get(0).getRoleName());
	}
}
