package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.OrderMethod;
import com.app.model.Uom;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class OrderMethodPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		response.addHeader("content-Disposition", "attachment;fileName=order.pdf");
		Paragraph p = new Paragraph();
		document.add(p);
		List<OrderMethod> ord = (List<OrderMethod>) model.get("list");
		PdfPTable table = new PdfPTable(6);
		table.addCell("id");
		table.addCell("ordermode");
		table.addCell("ordercode");
		table.addCell("ordertype");
		table.addCell("note");
		
		table.addCell("orderAccpt");
		
		for (OrderMethod u : ord) {
			table.addCell(u.getId().toString());
			table.addCell(u.getOrderMode());
			table.addCell(u.getOrderCode());
			table.addCell(u.getOrderType());
			table.addCell(u.getNote());
			table.addCell(u.getOrderAccpt().toString());

		}
		document.add(table);
		document.add(new Paragraph(new Date().toString()));

	}

}
