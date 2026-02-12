package com.example.demo.Service;

public abstract class  DocumentServiceAbstruct implements DocumentServiceInterface {

	@Override
	public void readDataFromDb() {
			System.out.println("read data from Db");
		
	}
	
	public String printDocument() {
		readDataFromDb();
		processData();
	return	PrintData();
	}

	

	

}
