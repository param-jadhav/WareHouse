package com.app.servce;

import java.util.List;

import com.app.model.DocumentUpload;

public interface IdocumentService {

	public Integer saveDocument(DocumentUpload doc);
	public List<Object[]> GetDocumentIdandName();
}
