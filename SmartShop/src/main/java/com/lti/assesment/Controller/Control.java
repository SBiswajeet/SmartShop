package com.lti.assesment.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.assesment.Model.UserData;
import com.lti.assesment.Service.UserCRUD;
import com.lti.assesment.dao.UserRepo;


@RestController
public class Control {
	
	@Autowired 
	private UserCRUD userCRUD;
	
	@Autowired
	private UserRepo userrepository;

@PostMapping(path="/add") 
public @ResponseBody String addNewUser (
		@RequestBody UserData userdata
		) {
	
UserData n = new UserData();

n.setName(userdata.name);
n.setCategory(userdata.category);
n.setQuantity(userdata.quantity);
n.setRating(userdata.rating);
n.setTotalPrice(userdata.totalPrice);
n.setUnitPrice(userdata.unitPrice);

userCRUD.save(n);
return "Saved";
}

@PostMapping(path="/update") 
public @ResponseBody String updateNewUser (
		@RequestBody UserData userdata
		) {
	

UserData n = new UserData();
n.setProductId(userdata.productId);

n.setName(userdata.name);
n.setCategory(userdata.category);
n.setQuantity(userdata.quantity);
n.setRating(userdata.rating);
n.setTotalPrice(userdata.totalPrice);
n.setUnitPrice(userdata.unitPrice);

userCRUD.save(n);
return "Saved";
}


@GetMapping("/find")
public Optional<UserData> findByName(@RequestBody UserData userdata){
    return userCRUD.findById(userdata.productId);
}

@GetMapping("/search")
public List<UserData> SortProducts(@RequestBody UserData userdata) {
	return userrepository.findbycategory(userdata.category.toString(),userdata.name.toString());	
}

@DeleteMapping("/deleterating")
public void DeleteRatings() {	
	userrepository.deleteData();
}

@PutMapping("/calculatetotalprice")
public void updateData() {	
	userrepository.updateData();
}

@GetMapping(path="/all")
public @ResponseBody Iterable<UserData> getAllUsers() {
// This returns a JSON or XML with the users
return userCRUD.findAll();
}

}

