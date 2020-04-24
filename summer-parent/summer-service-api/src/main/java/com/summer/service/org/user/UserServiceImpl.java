//package com.summer.service.impl.org.user;
//
//import com.summer.service.impl.org.role.RoleServiceImpl;
//import com.summer.service.org.role.RoleDtoR;
//
//import com.summer.service.org.user.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@Service
// @Transactional(transactionManager = "orgTxManager")
//public class UserServiceImpl implements UserService {
//
//    private UserDao userDao;
//    private ModelMapper modelMapper;
//
//    @Autowired
//    public UserServiceImpl(UserDao userDao, ModelMapper modelMapper) {
//        this.userDao = userDao;
//        this.modelMapper = modelMapper;
//    }
//
//    @Override
//    public List<UserDto> findAllUsers() {
//        return null;
//    }
//
//    @Override
//    public UserDto createUser(UserPost user) {
//        User entity = fromDtoC(user);
//        try {
//            userDao.saveAndFlush(entity);
//            System.out.println(entity);
//            return toDtoR(entity);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return null;
//        }
//        return null;
//    }
//
//    @Override
//    public UserDto findUserById(Long id) {
//        return userDao.findUserWithRolesById(id);
//    }
//
//    public static User fromDtoC(UserPayload user) {
//        return new User(user.getUsername(), user.getPassword(), user.getEnabled());
//    }
//
//    public static UserDto toDtoR(User user) {
//        Set<RoleDtoR> roles = user.getRoles().stream().map(RoleServiceImpl::toDtoR).collect(Collectors.toSet());
//        return null;
//    }
//
//
//    @Override
//    public String foobar() {
//        return null;
//    }
//
//    @Override
//    public UserPassQueryDto findUser() {
//        return null;
//    }
//
