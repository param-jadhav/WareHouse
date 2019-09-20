package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.DocumentUpload;
import com.app.servce.IdocumentService;

@Controller
@RequestMapping("/document")
public class DocumentUploadController {

	@Autowired
	private IdocumentService service;
	
	@RequestMapping("/register")
	public String showDoc() {
		return "uploadDoc";
	}
      @RequestMapping(value="/upload",method=RequestMethod.POST)
	public String uploadDoc(@RequestParam Integer fid,@RequestParam CommonsMultipartFile fdoc)
	{
    	  System.out.println("welcome to u");
    	  if(fdoc!=null)
    	  {
    		  DocumentUpload d= new DocumentUpload();
    		  d.setFid(fid);
    		  d.setFileName(fdoc.getOriginalFilename());
    		  d.setFileData(fdoc.getBytes());
    		  service.saveDocument(d);
    		 
    	  }
    	  return "uploadDoc";
	}
    		  
    	  
		
	
}
