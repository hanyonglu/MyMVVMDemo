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
		// ����ܽ�SampleModelֱ�Ӱ���View�ϸ���
		// �˴�Ϊ�˼򻯣���ֱ�Ӵ�ӡ���������
		System.out.println("my name = " + sampleModel.getUser().getName() + "\n���� = " + 
				sampleModel.getUser().getAge() + "\nְҵ = " + 
				sampleModel.getUserRoleList().get(0).getRoleName());
	}
}
