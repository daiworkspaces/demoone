package com.newdemoone.demoone.server;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newdemoone.demoone.domain.InfList;
import com.newdemoone.demoone.domain.InfListExample;
import com.newdemoone.demoone.mapper.InfListMapper;
import com.newdemoone.demoone.req.InfListQueryReq;
import com.newdemoone.demoone.req.InfListSaveReq;
import com.newdemoone.demoone.resp.InfListResp;
import com.newdemoone.demoone.resp.PageResp;
import com.newdemoone.demoone.util.CopyUtil;
import com.newdemoone.demoone.util.SnowFlake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class InfListService {

    private static final Logger LOG = LoggerFactory.getLogger(InfListService.class);


    @Resource
    private InfListMapper infListMapper;

    //引入雪花算法
    @Resource
    private SnowFlake snowFlake;

    public PageResp<InfListResp> list(InfListQueryReq req){

        InfListExample infListExample = new InfListExample();
        InfListExample.Criteria criteria = infListExample.createCriteria();


        //支持分页，代码要写在查询的开始。总页面才会生效。
        PageHelper.startPage(req.getPage(), req.getSize());
        //动态sql 当传了name参数就按照name条件查询，没有就查询全部
        if(!ObjectUtils.isEmpty(req.getName())){
            criteria.andNameLike("%"+ req.getName()+"%");
        }

        //criteria.andResultsLike("%"+req.getResults()+"%");
        List<InfList> infListList = infListMapper.selectByExample(infListExample);

        PageInfo<InfList> pageInfo = new PageInfo<>(infListList);
//        LOG.info("总行数："+pageInfo.getTotal());
//        LOG.info("总页数: "+pageInfo.getPages());
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

        PageResp<InfListResp> pageResp =new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(respList);
        return pageResp;

    }

    //编辑保存
    public void saveInfList(InfListSaveReq req){
        InfList infList = CopyUtil.copy(req,InfList.class);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(new Date());
        if (ObjectUtils.isEmpty(req.getId())){
            //判断保存的数据是否有id 如果id为空就是保存编辑，否则就是新增
            infList.setId(snowFlake.nextId());
            infList.setUpdateTime(date);
            infList.setCreateTime(date);

            infListMapper.insert(infList);
        }else {
            infListMapper.updateByPrimaryKey(infList);
        }
    }

    //删除
    public void delete(Long id){
        infListMapper.deleteByPrimaryKey(id);
    }


}
