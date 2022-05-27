package com.newdemoone.demoone.server;
import com.newdemoone.demoone.domain.User;
import com.newdemoone.demoone.mapper.userMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private userMapper userMapper;

    public List<User> userList(){
        return userMapper.user();
    }

}
