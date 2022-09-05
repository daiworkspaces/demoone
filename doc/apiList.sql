drop table if exists `apiList`;
CREATE TABLE IF NOT EXISTS `apiList` (
      `id` bigint not null comment 'id',
      `api_name` varchar(200) not null  comment '接口名称',
      `api_address` varchar(200) not null comment '接口路径',
      `api_category1_id` bigint not null comment '接口分类1',
      `api_category2_id` bigint not null comment '接口分类2',
      `api_status` varchar(200) not null default 1 comment '接口状态',
      `api_tag` varchar(200) not null  comment '接口tag',

    primary key (`id`)
    )engine = innodb default charset =utf8mb4 comment 'API列表';

insert into apiList values(1,'下单（新）','/order/batchCreateAsync',1,2,1,'下单tag');
insert into apiList values (2,'关单','/order/close',1,2,1,'关单tag');

