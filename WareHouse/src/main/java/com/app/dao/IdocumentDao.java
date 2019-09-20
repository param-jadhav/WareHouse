package com.app.dao;

import java.util.List;

import com.app.model.DocumentUpload;

public interface IdocumentDao {

	public Integer saveDocument(DocumentUpload doc);
	public List<Object[]> GetDocumentIdandName();
}
