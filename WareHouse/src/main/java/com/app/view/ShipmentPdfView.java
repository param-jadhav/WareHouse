package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.OrderMethod;
import com.app.model.ShipmentType;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ShipmentPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		response.addHeader("content-Disposition", "attachment;fileName=order.pdf");
		Paragraph p = new Paragraph();
		document.add(p);
		List<ShipmentType>  shipe = (List<ShipmentType>) model.get("list");
		PdfPTable table = new PdfPTable(6);
		table.addCell("id");
		table.addCell("shipmentMode");
		table.addCell("shipmentCode");
		table.addCell("shipmentEnable");
		table.addCell("shipmentGrade");
		table.addCell("description");
		
		
		for (ShipmentType u : shipe) {
			table.addCell(u.getId().toString());
			table.addCell(u.getShipmentMode());
			table.addCell(u.getShipmentCode());
			table.addCell(u.getShipmentEnable());
			table.addCell(u.getShipmentGrade());
			table.addCell(u.getDescription());

		}
		document.add(table);
		document.add(new Paragraph(new Date().toString()));


	}

}
