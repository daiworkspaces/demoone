drop table if exists user;
CREATE TABLE IF NOT EXISTS `user` (
    `id` INT NOT NULL,
    `user_name` VARCHAR(45) NOT NULL COMMENT '用户名',
    `password` VARCHAR(45) NOT NULL COMMENT '密码',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`))ENGINE = InnoDB;
insert into user values (1,'WangSan','123456','2022-05-27 14:19:00','2022-05-27 14:19:00');
