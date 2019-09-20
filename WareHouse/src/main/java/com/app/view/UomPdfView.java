package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Uom;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class UomPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String,Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		response.addHeader("content-Disposition","attachment;fileName=uom.pdf");
		Paragraph p = new Paragraph();
		document.add(p);
		List<Uom> uoms = (List<Uom>) model.get("list");
		PdfPTable table = new PdfPTable(4);
		table.addCell("id");
		table.addCell("model");
		table.addCell("type");
		table.addCell("note");
		for (Uom u : uoms) {
			table.addCell(u.getId().toString());
			table.addCell(u.getUomModel());
			table.addCell(u.getUomType());
			table.addCell(u.getDescription());

		}
		document.add(table);
		document.add(new Paragraph(new Date().toString()));

	}

}
