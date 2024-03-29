package org.mns237.controller;
import javax.validation.Valid;
import java.util.List;
import org.mns237.entity.Users;
import org.mns237.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://idrice24.github.io/mns/cms/login", maxAge = 3600)
public class LoginController{
	@Autowired
	private UserService userService;

	public LoginController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/")
	public String appStart(){
		return " welcome to my wep app ";
	}

	@GetMapping("/home")
	public String homePage(){
		return " welcome to the home page. We hope ou will enjoy  welcome to the home page.  We hope ou will enjoy  our app is under maint....";
	}

	//show all users
	@GetMapping("/users")
	public List<Users> getAllUsers(){ return userService.getAllUsers();
	 }

	//get total nuber of users
	@GetMapping("/totalUser")
	public long getTotalUsers(){ return userService.getTotalUsers();
	 }

@GetMapping("/register")
	public String appRegister(){
		Users user = new Users();

		return "adding a new user ........"+ user;
	}

	@PostMapping("/register")
	public String createNewUser(@Valid Users user, BindingResult bindingResult){
		Users userExists = userService.findUserByEmail(user.getEmail());
		if(userExists != null){
			bindingResult
			.rejectValue("email", "error.user", "there is already a user registered with the email provided");

		}
		if(bindingResult.hasErrors()){
			System.out.println("System Error please try again");
		}else{
			userService.saveUser(user);
			System.out.println("user has been registered successfully");
		}
		return "waiting for request........";
	}

	@GetMapping("/login")
	public String adminHome(){
		System.out.print("user login in dashboard");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Users user = userService.findUserByEmail(auth.getName());
		System.out.print("Welcome" + user.getUsername() + " " + user.getfName() + " " + "( " + user.getEmail()+ ")" );
		System.out.println("Content Available Only for Users with Admin Role");

		return "Welcome admin " + user.getUsername();
	}

}
