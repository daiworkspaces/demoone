drop table if exists `category`;
CREATE TABLE IF NOT EXISTS `category` (
     `id` bigint not null comment 'id',
     `parent` bigint not null default 0 comment '父id',
     `name` varchar(50) not null comment '名称',
    `sort` int comment '顺序',
    primary key (`id`)
    )engine = innodb default charset =utf8mb4 comment '分类';

