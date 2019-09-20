package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.app.model.OrderMethod;

public class OrderMethodExcelView extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		  //Read Data
        List<OrderMethod> list = (List<OrderMethod>)model.get("list");
        //create a new sheet 
        Sheet sheet =workbook.createSheet("order");
        addHeader(sheet);
        addBody(sheet,list);
        

	}
	private void addHeader(Sheet sheet)
	{
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("id");
		row.createCell(1).setCellValue("orderMode");
		row.createCell(2).setCellValue("orderCode");
		row.createCell(3).setCellValue("orderType");
		row.createCell(4).setCellValue("Note");
		row.createCell(5).setCellValue("OrderAccpt");
	}
    private void addBody(Sheet sheet ,List<OrderMethod> list)
    {
    	int rowNum=0;
    	for(OrderMethod o:list)
    	{
    		Row row = sheet.createRow(1);
    		row.createCell(0).setCellValue(o.getId());
    		row.createCell(1).setCellValue(o.getOrderMode());
    		row.createCell(2).setCellValue(o.getOrderCode());
    		row.createCell(3).setCellValue(o.getOrderType());
    		row.createCell(4).setCellValue(o.getNote());
    		//row.createCell(5).setCellValue(o.getOrderAccpt());
    		
    	}
    	
    }

}
