package com.newdemoone.demoone.server;

import com.newdemoone.demoone.domain.InfList;
import com.newdemoone.demoone.domain.InfListExample;
import com.newdemoone.demoone.mapper.InfListMapper;
import com.newdemoone.demoone.req.InfListReq;
import com.newdemoone.demoone.resp.InfListResp;
import com.newdemoone.demoone.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class InfListService {

    @Resource
    private InfListMapper infListMapper;

    public List<InfListResp> list(InfListReq req){
        InfListExample infListExample = new InfListExample();
        InfListExample.Criteria criteria = infListExample.createCriteria();

        //动态sql 当传了name参数就按照name条件查询，没有就查询全部
        if(!ObjectUtils.isEmpty(req.getName())){
            criteria.andNameLike("%"+ req.getName()+"%");
        }

        //criteria.andResultsLike("%"+req.getResults()+"%");
        List<InfList> infListList = infListMapper.selectByExample(infListExample);

//        List<InfListResp> respList =new ArrayList<>();
//        for (InfList infList : infListList){
//            InfListResp infListResp = new InfListResp();
//           BeanUtils.copyProperties(infList,infListResp);
//
//            InfListResp infListResp =
//            CopyUtil.copy(infList,InfListResp.class);
//
//            respList.add(infListResp);
//        }
        List<InfListResp> respList =
        CopyUtil.copyList(infListList,InfListResp.class);
        return respList;

    }
}
