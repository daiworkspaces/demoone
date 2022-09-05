package com.newdemoone.demoone.server;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newdemoone.demoone.domain.Category;
import com.newdemoone.demoone.domain.CategoryExample;
import com.newdemoone.demoone.mapper.CategoryMapper;
import com.newdemoone.demoone.req.CategoryQueryReq;
import com.newdemoone.demoone.req.CategorySaveReq;
import com.newdemoone.demoone.resp.CategoryResp;
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
public class CategoryService {

    private static final Logger LOG = LoggerFactory.getLogger(CategoryService.class);


    @Resource
    private CategoryMapper categoryMapper;

    //引入雪花算法
    @Resource
    private SnowFlake snowFlake;

    public PageResp<CategoryResp> list(CategoryQueryReq req){

        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();


        //支持分页，代码要写在查询的开始。总页面才会生效。
        PageHelper.startPage(req.getPage(), req.getSize());
        //动态sql 当传了name参数就按照name条件查询，没有就查询全部
//没有就查询全部        if(!ObjectUtils.isEmpty(req.getName())){
//            criteria.andNameLike("%"+ req.getName()+"%");
//        }

        //criteria.andResultsLike("%"+req.getResults()+"%");
        List<Category> categoryList = categoryMapper.selectByExample(categoryExample);

        PageInfo<Category> pageInfo = new PageInfo<>(categoryList);
//        LOG.info("总行数："+pageInfo.getTotal());
//        LOG.info("总页数: "+pageInfo.getPages());
//        List<CategoryResp> respList =new ArrayList<>();
//        for (Category category : categoryList){
//            CategoryResp categoryResp = new CategoryResp();
//           BeanUtils.copyProperties(category,categoryResp);
//
//            CategoryResp categoryResp =
//            CopyUtil.copy(category,CategoryResp.class);
//
//            respList.add(categoryResp);
//        }


        List<CategoryResp> respList =
        CopyUtil.copyList(categoryList,CategoryResp.class);

        PageResp<CategoryResp> pageResp =new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(respList);
        return pageResp;

    }

    //编辑保存
    public void saveCategory(CategorySaveReq req){
        Category category = CopyUtil.copy(req,Category.class);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(new Date());
        if (ObjectUtils.isEmpty(req.getId())){
            //判断保存的数据是否有id 如果id为空就是保存编辑，否则就是新增
            category.setId(snowFlake.nextId());
//            category.setUpdateTime(date);
//            category.setCreateTime(date);

            categoryMapper.insert(category);
        }else {
            categoryMapper.updateByPrimaryKey(category);
        }
    }

    //删除
    public void delete(Long id){
        categoryMapper.deleteByPrimaryKey(id);
    }


}
