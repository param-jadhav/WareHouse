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

import com.app.model.OrderMethod;
import com.app.servce.OrderService;
import com.app.view.OrderMethodExcelView;
import com.app.view.OrderMethodPdfView;

@Controller
@RequestMapping("/order")
public class OrderMethodController {
	@Autowired
	private OrderService service;
	@RequestMapping("/register")
    public String showReg()
    {
		return "OrderMethodRegister"; 
    }
	@RequestMapping(value="/save", method=RequestMethod.POST)
    public String saveData(@ModelAttribute OrderMethod ord ,ModelMap map)
    {
		Integer id=service.saveOrderMethod(ord);
		String mes ="data succe";
		map.addAttribute("mes",mes);
		return "OrderMethodRegister";
	}
	@RequestMapping("/all")
	public String getAll(ModelMap map)
	{
		List<OrderMethod> uoms =service.getAllOrderMethod();
		map.addAttribute("list",uoms);
		return "OrderMethodData";
		
		
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam Integer id,ModelMap map)
	{
		service.deleteOrderMethod(id);
		List<OrderMethod> uoms = service.getAllOrderMethod();
		
		String mess="delete";
		map.addAttribute("list",uoms);
		map.addAttribute("mes",mess);
		return "OrderMethodData";
	}

	@RequestMapping("/view")
	public String getOne(@RequestParam Integer id,ModelMap map)
	{
		OrderMethod ord = service.getOneOrderMethod(id);
		map.addAttribute("ob",ord);
		return "orderMethodView";
	}
	@RequestMapping("/edit")
	public String showEdit(@RequestParam Integer id,ModelMap map)
	{
		OrderMethod u = service.getOneOrderMethod(id);
		map.addAttribute(id);
		map.addAttribute("ord",u);
		return "orderMethodEdit";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@ModelAttribute OrderMethod ord,ModelMap map)
	{	
		service.updateOrderMethod(ord);
		String mes ="data succesfuly save";
		map.addAttribute("mes", mes);
		List<OrderMethod> ords=service.getAllOrderMethod();
		map.addAttribute("list",ords);
		return "OrderMethodData";
		
	}
	@RequestMapping("/excel")
	public ModelAndView exportExcel(@RequestParam Integer id)
	{
		
		List<OrderMethod> uoms = null;
		if(id==null)
		{
		uoms = service.getAllOrderMethod();
		}
		else
		{
			OrderMethod u =service.getOneOrderMethod(id);
			uoms=Arrays.asList(u);
       	}
		ModelAndView m = new ModelAndView();
		m.setView(new OrderMethodExcelView());
		m.addObject("list", uoms);
		return m;
		
	}
	@RequestMapping("/pdf")
	public ModelAndView exportPdf(@RequestParam(required = false) Integer id)
	{
		
		List<OrderMethod> ord = null;
		if(id==null)
		{
		ord = service.getAllOrderMethod();
		}
		else
		{
			 
			ord=Arrays.asList(service.getOneOrderMethod(id));
       	}
		ModelAndView m = new ModelAndView();
		m.setView(new OrderMethodPdfView());
		m.addObject("list", ord);
		return m;
		
	}
	
	

}
 