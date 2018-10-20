package com.skilldistillery.gym.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.gym.data.GymDAO;
import com.skilldistillery.gym.entities.Gym;

@Controller
public class GymMVCController {
	@Autowired
	private GymDAO gymDAO;

	@RequestMapping(path = "home.do")
	public String index() {
		return "WEB-INF/views/home.jsp";
	}

	@RequestMapping(path = "showAllGymMembers.do", method = RequestMethod.GET)
	public ModelAndView showAllGymMembers() {
		ModelAndView mv = new ModelAndView();
		List<Gym> gymMembers = gymDAO.findAll();
		mv.addObject("gymMembers", gymMembers);
		mv.setViewName("WEB-INF/views/allGymMembers.jsp");
		return mv;
	}

	@RequestMapping(path = "addAGymMember.do", method = RequestMethod.POST)
	public ModelAndView addAGymMember(String firstName, String lastName, Integer age, String gender, Double weight) {
		ModelAndView mv = new ModelAndView();
		Gym gymMember = new Gym(firstName, lastName, age, gender, weight);
		gymMember = gymDAO.add(gymMember);
		mv.addObject("gymMember", gymMember);

		System.out.println(gymMember);
		if (!gymMember.equals(null)) {
			mv.setViewName("WEB-INF/views/success.jsp");
		}
		
		else {
			mv.setViewName("WEB-INF/views/create.jsp");
		}
		return mv;
	}

	@RequestMapping(path = "searchByKeyword.do", params = "keyword", method = RequestMethod.GET)
	public ModelAndView getGymMember(String keyword) {
		ModelAndView mv = new ModelAndView();
		List<Gym> gym = gymDAO.findByKeyword(keyword);
		mv.addObject("gymMembers", gym);
		mv.setViewName("WEB-INF/views/details.jsp");
		return mv;
	}
	
	@RequestMapping(path = "searchByID.do", params = "id", method = RequestMethod.GET)
	public ModelAndView getGymMember(int id) {
		ModelAndView mv = new ModelAndView();
		Gym gym = gymDAO.findById(id);
		mv.addObject("gym", gym);
		mv.setViewName("WEB-INF/views/details.jsp");
		return mv;
	}

	@RequestMapping(path = "updateGymMember.do", method = RequestMethod.GET)
	public ModelAndView updateGymMember(int id) {
		ModelAndView mv = new ModelAndView();
		Gym gymMember = gymDAO.findById(id);
		mv.addObject("gym", gymMember);
		mv.setViewName("WEB-INF/views/update.jsp");
		return mv;
	}
	
	@RequestMapping(path = "update.do", method = RequestMethod.POST)
	public ModelAndView updateGymMemberHelper(Integer id, String firstName, String lastName, Integer age, String gender, Double weight) {
		ModelAndView mv = new ModelAndView();
		Gym updatedMember = gymDAO.findById(id);
		updatedMember.setFirstName(firstName);
		updatedMember.setLastName(lastName);
		updatedMember.setAge(age);
		updatedMember.setGender(gender);
		updatedMember.setLastName(lastName);
		
		updatedMember = gymDAO.update(updatedMember);
		mv.addObject("gym", updatedMember);
		mv.setViewName("WEB-INF/views/details.jsp");
		
		return mv;
	}

	@RequestMapping(path = "deleteGymMember.do", method = RequestMethod.GET)
	public ModelAndView deleteGymMember(int id) {
		ModelAndView mv = new ModelAndView();
		boolean deleted = gymDAO.deletedById(id);
		if (deleted == true) {
		mv.setViewName("WEB-INF/views/success.jsp");
		}
		else {
			mv.setViewName("WEB-INF/views/home.jsp");
		}
		return mv;
	}
}
