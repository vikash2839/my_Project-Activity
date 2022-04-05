package com.ltts.playerproject.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.playerproject.bo.PlayerBo;
import com.ltts.playerproject.model.Player;

@RestController
public class ApplicationController {
	
	@Autowired
	PlayerBo pb;
	
	@RequestMapping("/")
	public String m1() {
		return "Hello Welcome";
	}
	@RequestMapping("index")
	public ModelAndView m2() {
		System.out.println("In controller");
		return new ModelAndView("index");
	}
	
	@RequestMapping("addplayer")
    public ModelAndView m3() {
		return new ModelAndView("insertplayer");

	}
	
	@RequestMapping(value="insert_the_player" ,method=RequestMethod.POST)
    public ModelAndView m4(HttpServletRequest req) {
		int pnum=Integer.parseInt(req.getParameter("pnum"));
		String pname=req.getParameter("pname");
		
		Player p = new Player();
		try {
			//pb.save();
			
		}catch(Exception e) {
			
		}
		return new ModelAndView("success");

	}
	
	@RequestMapping("viewplayers")
    public ModelAndView m5(Model m) {
		List<Player> li = pb.findAll();
		System.out.println(li);
		m.addAttribute("players",li);
		return new ModelAndView("viewdetails");

	}
	
	@RequestMapping("updateplayers")
    public ModelAndView m6(HttpServletRequest req) {
		int no=Integer.parseInt(req.getParameter("id"));
		System.out.println(no);
		Player p1 = pb.getById(no);
		//m.addAtttribute("player",p1);
		return new ModelAndView("updateplayer");

	}
	
	/*@RequestMapping("deleteplayers")
    public ModelAndView m7(HttpServletRequest req) {
		int no=Integer.parseInt(req.getParameter("id"));
		System.out.println(no);
		Player p1 = pb.getById(no);
		//m.addAtttribute("player",p1);
		return new ModelAndView("deleteplayer");

	}*/
	
}
