package org.fao.bdtms.controller;


import org.fao.bdtms.model.CreateUser;
import org.fao.bdtms.response.ServiceResponse;
import org.fao.bdtms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	 private UserService userService;
	
	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	   /*---Add new User---*/
	   @PostMapping("/user")
	   public ServiceResponse<CreateUser> saveInternalUser(@RequestBody CreateUser user) {	
	
		    ServiceResponse<CreateUser> serviceResponse = userService.save(user);
		    if(serviceResponse.isSuccessful()){
		    	serviceResponse.getResult();	
		    }
	        return serviceResponse;
	     // return ResponseEntity.ok().body("New User has been saved with ID:" + id);
	   }

	   /*---Get a User by id---
	   @GetMapping("/user/{id}")
	   public ResponseEntity<User> get(@PathVariable("id") long id) {
	      User user = userService.get(id);
	      return ResponseEntity.ok().body(user);
	   }

	   ---get all User---
	   @GetMapping("/user")
	   public ResponseEntity<List<User>> list() {
	      List<User> users = userService.list();
	      return ResponseEntity.ok().body(users);
	   }

	   ---Update a User by id---
	   @PutMapping("/user/{id}")
	   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody User user) {
		   userService.update(id, user);
	      return ResponseEntity.ok().body("User has been updated successfully.");
	   }

	   ---Delete a User by id---
	   @DeleteMapping("/user/{id}")
	   public ResponseEntity<?> delete(@PathVariable("id") long id) {
		   userService.delete(id);
	      return ResponseEntity.ok().body("User has been deleted successfully.");
	   }*/

}
