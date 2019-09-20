package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.ShipmentType;
import com.app.servce.ShipmentTypeService;
import com.app.view.ShipmentPdfView;
@Controller
@RequestMapping("/ship")
public class shipmentTypeController {
	@Autowired 
	private ShipmentTypeService service;
	@RequestMapping("/reg")
	public String show()
	{
		return "ShipmentTypeRegister"; 
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
    public String saveData(@ModelAttribute ShipmentType uom ,ModelMap map)
    {
		Integer id=service.saveShipment(uom);
		String mes ="data succe";
		map.addAttribute("mes",mes);
		return "ShipmentTypeRegister";
	}
	@RequestMapping("/all")
	public String getAll(ModelMap map)
	{
		List<ShipmentType> uoms =service.getAllShipment();
		map.addAttribute("list",uoms);
		return "ShipmentTypeData";
		
		
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam Integer id,ModelMap map)
	{
		service.deleteShipment(id);
		List<ShipmentType> uoms = service.getAllShipment();
		
		String mess="delete";
		map.addAttribute("list",uoms);
		map.addAttribute("mes",mess);
		return "ShipmentTypeData";
	}
	@RequestMapping("/edit")
	public String showEdit(@RequestParam Integer id,ModelMap map)
	{
		ShipmentType u = service.getOneShipment(id);
		map.addAttribute(id);
		map.addAttribute("uom",u);
		String s = "data updated";
		map.addAttribute("mes",s);
		
		return "ShipmentTypeEdit";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@ModelAttribute ShipmentType uom,ModelMap map)
	{	
		service.updateShipment(uom);
		String mess ="data succesfuly save";
		map.addAttribute("mes", mess);
		List<ShipmentType> uoms=service.getAllShipment();
		map.addAttribute("list",uoms);
		return "ShipmentTypeData";
		
	}
	@RequestMapping("/view")
	public String getOne(@RequestParam Integer id,ModelMap map)
	{
		ShipmentType  sh = service.getOneShipment(id);
		map.addAttribute("ob", sh);
		return "shipmentTypeView";
	}
	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam (required = false) Integer id)
	{
		List<ShipmentType> ship = null;
		if(id==null)
		{
		
			ship = service.getAllShipment();
		}
		else {
		
			ship=Arrays.asList(service.getOneShipment(id));
	      	}
		ModelAndView m = new ModelAndView();
		m.setView(new ShipmentPdfView());
		m.addObject("list", ship);
		return m;
		
	}
	
	
	


}
