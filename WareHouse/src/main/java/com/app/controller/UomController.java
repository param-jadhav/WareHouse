package com.app.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Uom;
import com.app.servce.UomService;
import com.app.util.UomUtil;
import com.app.view.UomExcelView;
import com.app.view.UomPdfView;

@Controller
@RequestMapping("/uom")
public class UomController {
	@Autowired
	private UomUtil util;
	@Autowired
	private ServletContext servlet;
	@Autowired 
	private UomService service; 
	@RequestMapping("/reg")
    public String showReg(ModelMap map)
    {
		map.addAttribute("uom", new Uom());
		return "UomRegister"; 

    }
	//================second method to save data============================
	@RequestMapping(value="/save", method=RequestMethod.POST)
     public String saveData(@ModelAttribute Uom uom ,ModelMap map)
     {
		Integer id=service.saveUom(uom);
		String mes ="data success";
		map.addAttribute("mess",mes);
		return "UomRegister";
	}
	//=============dipaly all data third method=============
	@RequestMapping("/all")
	public String getAll(ModelMap map)
	{
		List<Uom> uoms =service.getAllUom();
		map.addAttribute("list",uoms);
		return "uomData";
	}
	//================delete all record in table fourth method=========
	@RequestMapping("/delete")
	public String delete(@RequestParam Integer id,ModelMap map)
	{
		service.deleteUom(id);
		List<Uom> uoms = service.getAllUom();
		
		String mess="delete";
		map.addAttribute("list",uoms);
		map.addAttribute("mes",mess);
		return "uomData";
	}
	//========edit the record in table
	@RequestMapping("/edit")
	public String showEdit(@RequestParam Integer id,ModelMap map)
	{
		Uom u = service.getOneUom(id);
		map.addAttribute("uom", new Uom());
		map.addAttribute(id);
		map.addAttribute("uom",u);
		return "UomEdit";
	}
	//=============update data in table===========
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@ModelAttribute Uom uom,ModelMap map)
	{	
		service.updateUom(uom);
		String mes ="data succesfuly save";
		map.addAttribute("mes", mes);
		List<Uom> uoms=service.getAllUom();
		map.addAttribute("list",uoms);
		return "uomData";
		
	}
	@RequestMapping("/view")
	public String getOne(@RequestParam Integer id,ModelMap map)
	{
		Uom uom = service.getOneUom(id);
		map.addAttribute("ob", uom);
		return "uomView";
	}
	//8
	@RequestMapping("/excel")
	public ModelAndView exportExcel(@RequestParam Integer id)
	{
		
		List<Uom> uoms = null;
		if(id==null)
		{
		uoms = service.getAllUom();
		}
		else
		{
			Uom u =service.getOneUom(id);
			uoms=Arrays.asList(u);
       	}
		ModelAndView m = new ModelAndView();
		m.setView(new UomExcelView());
		m.addObject("list", uoms);
		return m;
		
	}
	
	
	@RequestMapping("/pdf")
	public ModelAndView exportPdf(@RequestParam(required = false) Integer id)
	{
		
		List<Uom> uoms = null;
		if(id==null)
		{
		uoms = service.getAllUom();
		}
		else
		{
			 
			uoms=Arrays.asList(service.getOneUom(id));
       	}
		ModelAndView m = new ModelAndView();
		m.setView(new UomPdfView());
		m.addObject("list", uoms);
		return m;
		
	}
	@RequestMapping("/chart")
	public String genChart()
		{
			List<Object[]> list =service.getUomTypeAndCount();
			String path =servlet.getRealPath("/");
			util.genPie(path, list);
			return  "uomPie";
		}
	}
	
	
	


