drop table if exists `infList`;
CREATE TABLE IF NOT EXISTS `infList` (
     `id` bigint not null comment 'id',
     `name` varchar(50) comment '名称',
     `category1_id` bigint comment '分类1',
     `category2_id` bigint comment '分类2',
     `description` varchar(200) comment '描述',
     `inf_name` varchar(200) comment '接口名称',
     `inf_mode` varchar(200) comment '接口模式post/get',
     `inf_address` varchar(200) comment '接口路径',
     `Execution_status` int comment '接口执行状态 1已执行，0未执行',
     `results` varchar(50) comment '执行结果',
     `results_details` varchar(1024) comment '结果详情',
     `inf_remarks` varchar(200) comment '备注信息',
     `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP comment '创建时间',
     `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
     `create_user` varchar(200) NOT NULL comment '创建者',
     primary key (`id`)
)engine = innodb default charset =utf8mb4 comment '接口列表';


insert into infList values (1,'京东',1,2,NULL,'模拟下单','post','/order/acceptor/pushJdMaster',1,'执行成功','message',null,now(),now(),'admin');
insert into infList values (2,'京东',1,2,NULL,'模拟关单','post','/order/acceptor/pushJdCloseMaster',0,'执行成功','message',null,now(),now(),'admin');

