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

	@RequestMapping(path = "addAGymMember.do", params = { "firstName", "lastName", "classesAttended",
			"favoriteEquipment", "age", "gender", "weight", "height" }, method = RequestMethod.POST)
	public ModelAndView addAGymMember(String firstName, String lastName, String classesAttended,
			String favoriteEquipment, Integer age, String gender, Integer weight, Double height) {
		ModelAndView mv = new ModelAndView();
		Gym gymMember = new Gym(firstName, lastName, classesAttended, favoriteEquipment, age, gender, weight, height);
		gymMember = gymDAO.add(gymMember);
		mv.addObject("gymMember", gymMember);

		if (!gymMember.equals(null)) {
			mv.setViewName("WEB-INF/views/success.jsp");
		}
		else {
			//does this print?
			System.out.println("Your request was not completed");
			mv.setViewName("WEB-INF/views/create.jsp");
		}
		return mv;
	}

	@RequestMapping(path = "showAllGymMemberDetails.do", params = "id", method = RequestMethod.GET)
	public ModelAndView getGymMember(int id) {
		ModelAndView mv = new ModelAndView();
		Gym gymMemberDetails = gymDAO.findById(id);
		mv.addObject("gym", gymMemberDetails);
		mv.setViewName("WEB-INF/views/details.jsp");
		return mv;
	}

	@RequestMapping(path = "updateGymMember.do", method = RequestMethod.GET)
	public ModelAndView updateGymMember(int id) {
		ModelAndView mv = new ModelAndView();
		Gym updateGymMember = gymDAO.findById(id);
		mv.addObject("updateGymMembers", updateGymMember);
		mv.setViewName("WEB-INF/views/update.jsp");
		return mv;
	}

	@RequestMapping(path = "deleteGymMember.do", method = RequestMethod.GET)
	public ModelAndView deleteGymMember(int id) {
		ModelAndView mv = new ModelAndView();
		Gym deleteGymMember = gymDAO.findById(id);
		mv.addObject("deleteGymMembers", deleteGymMember);
		mv.setViewName("WEB-INF/views/delete.jsp");
		return mv;
	}
}
