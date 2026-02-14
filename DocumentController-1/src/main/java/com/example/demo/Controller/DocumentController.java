package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DocumentFactory;
import com.example.demo.Service.DocumentServiceInterface;
import com.example.demo.Service.ExcelServiceImpl;
import com.example.demo.Service.PdfServiceImpl;

@RestController
public class DocumentController {
	
	
	
	
	
	@GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type) {
		
		DocumentServiceInterface ds=DocumentFactory.createDocumentObject(type);
		
		
	return	ds.printDocument();
	

		}

}
