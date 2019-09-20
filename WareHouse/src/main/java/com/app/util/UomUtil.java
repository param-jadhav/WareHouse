package com.app.util;

import java.io.File;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class UomUtil {
	public void genPie(String path,List<Object[]> list)
	{
		//create datset
		DefaultPieDataset dataset = new DefaultPieDataset();
		for(Object[] ob:list)
		{
			dataset.setValue(ob[0].toString(),new Double(ob[1].toString()));
			
			
		}
		
		//create jfreeChART
		JFreeChart chart = ChartFactory.createPieChart3D("Uom pie chart", dataset);
		
		//save image
		try {
			ChartUtils.saveChartAsJPEG(new File (path +"/resources/images/uompie.jpg"),
					chart,400,600);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
