package com.app.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IdocumentDao;
import com.app.model.DocumentUpload;
import com.app.servce.IdocumentService;
@Service
public class DocumentServiceImpl implements IdocumentService {

	@Autowired
	private IdocumentDao dao;
	@Override
	@Transactional
	public Integer saveDocument(DocumentUpload doc) {
		
		return dao.saveDocument(doc);
		
	}
	@Override
	public List<Object[]> GetDocumentIdandName() {
		// TODO Auto-generated method stub
		return dao.GetDocumentIdandName();
	}

}
