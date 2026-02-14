package com.example.demo.Service;

public class DocumentFactory {
	
	public  static DocumentServiceInterface  createDocumentObject(String type)
	
	{
		if(type.equals("pdf")) {
			PdfServiceImpl ps=new PdfServiceImpl();
			return ps;
		}
		
		if(type.equals("excel")) {
			ExcelServiceImpl es=new ExcelServiceImpl();
			return es;
		}
		
		if(type.equals("word")) {
			WordSreviceIMpl ws=new WordSreviceIMpl();
			return ws;
		}
		
		
		
		
		return null;
	}

}
