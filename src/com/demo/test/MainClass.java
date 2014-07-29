package com.demo.test;

import com.demo.controller.SampleController;
import com.demo.interf.IController;

public class MainClass {
	public static void main(String[] args) {
		IController sampleController = new SampleController();
		sampleController.initContoller();
	}
}
