package com.summer.rest.org;

//import com.summer.service.impl.org.user.UserDao;
//import com.summer.service.impl.org.user.User;
import com.summer.service.org.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.sql.DataSource;

@RestController
@RequestMapping("/${summer.org.context-path:org}/users")
public class UserController {

//    private UserService userService;
//    private UserDao userDao;
//    //private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public UserController(UserDao userDao, UserService userService/*, PasswordEncoder passwordEncoder*/) {
//        this.userService = userService;
//        this.userDao = userDao;
//        //this.passwordEncoder = passwordEncoder;
//    }

//    @GetMapping
//    public List<UserPassQueryDto> get() {
//        return new ArrayList<>();
//    }

//    @PostMapping
//    //@JsonView(User.Basic.class)
//    public User post(@RequestBody User user) {
////        System.out.println(user);
////        //user.setPassword(passwordEncoder.encode(user.getPassword()));
////        UserWithRoles result = userService.createUser(user);
////        if (result == null)
////            return ResponseEntity.badRequest().build();
////        return ResponseEntity.status(HttpStatus.CREATED).body(result);
//        System.out.println(user);
//        return userDao.save(user);
//    }
//
//    @GetMapping("/{id}")
//    public UserProj getById(@PathVariable Long id) {
//        UserProj user = userService.findUserById(id);
//        System.out.println(user.getId());
//        System.out.println(user.getClass());
//        //System.out.println(user.isEnabled());
//        return user;
////        if (user == null)
////            return ResponseEntity.notFound().build();
////        return ResponseEntity.ok(user);
//    }



    @GetMapping
    public String get() {
        return "users";
    }
}
