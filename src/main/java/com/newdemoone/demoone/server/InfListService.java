package com.newdemoone.demoone.server;

import com.newdemoone.demoone.domain.InfList;
import com.newdemoone.demoone.mapper.InfListMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InfListService {

    @Resource
    private InfListMapper infListMapper;

    public List<InfList> list(){
        return infListMapper.selectByExample(null);
    }
}
