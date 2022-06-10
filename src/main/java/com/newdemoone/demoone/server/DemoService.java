package com.newdemoone.demoone.server;

import com.newdemoone.demoone.domain.Demo;
import com.newdemoone.demoone.mapper.DemoMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
