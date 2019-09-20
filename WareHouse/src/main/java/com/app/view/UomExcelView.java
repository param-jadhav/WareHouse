package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.app.model.Uom;


public class UomExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
                      //Read Data
		              List<Uom> list = (List<Uom>)model.get("list");
		              //create a new sheet 
		              Sheet sheet =workbook.createSheet("uoms");
		              addHeader(sheet);
		              addBody(sheet,list);
		              
		              
	}
	private void addHeader(Sheet sheet)
	{
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("id");
		row.createCell(1).setCellValue("type");
		row.createCell(2).setCellValue("model");
		row.createCell(3).setCellValue("discription");
	}
    private void addBody(Sheet sheet ,List<Uom> list)
    {
    	int rowNum=0;
    	for(Uom u :list)
    	{
    		Row row = sheet.createRow(1);
    		row.createCell(0).setCellValue(u.getId());
    		row.createCell(1).setCellValue(u.getUomType());
    		row.createCell(2).setCellValue(u.getUomModel());
    		row.createCell(3).setCellValue(u.getDescription());
    		
    	}
    	
    }
}
