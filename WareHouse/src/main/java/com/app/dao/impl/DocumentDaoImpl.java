package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IdocumentDao;
import com.app.model.DocumentUpload;
@Repository
public class DocumentDaoImpl implements IdocumentDao{

	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveDocument(DocumentUpload doc) {
		
		return (Integer)ht.save(doc);
		
	}
	@Override
	public List<Object[]> GetDocumentIdandName() {

		String hql = "select FID,FileName from com.app.model.DocumentUpload";
		List<Object[]>list =(List<Object[]>)ht.find(hql);
		return list;
	}

}
