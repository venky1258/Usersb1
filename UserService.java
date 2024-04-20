package com.mypack;
import java.util.ArrayList;  

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
//defining the business logic  
@Service  
public class UserService   
{  
@Autowired  
UserRepository userRepository1;  
//getting all books record by using the method findaAll() of CrudRepository  
/*
public List<User> getAllBooks()   
{  
List<User> books = new ArrayList<User>();  
userRepository1.findAll().forEach(books1 -> books.add(books1));  
return books;  
}  

 
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
	userRepository1.deleteById(id);  
}  
//updating a record  
public void update(User us, int uid)   
{  
	userRepository1.save(us);  
}  
*/
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(User us)   
{  
	userRepository1.save(us);  
} 

//getting a specific record by using the method findById() of CrudRepository  
public User getUsersById(int id)   
{  
return userRepository1.findById(id).get();  
}


public List<User> getUsers()  
{    
List<User>userRecords = new ArrayList<>();    
userRepository1.findAll().forEach(userRecords::add); 

return userRecords;    
} 

}  
