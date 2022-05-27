drop table if exists `case`;
CREATE TABLE IF NOT EXISTS `case` (
    `id` INT NOT NULL,
     `user_id` INT NOT NULL,
     `case_id` INT NOT NULL COMMENT '用例编号',
      `case_name` VARCHAR(45) NOT NULL COMMENT '用例名称',
    `case_state` VARCHAR(45) NULL COMMENT '用例状态,（0 草稿，1评审中，2评审通过，3评审未通过，4废弃）',
    `case_version` VARCHAR(45) NULL COMMENT '用例版本',
    `case_Maintainer` VARCHAR(45) NULL COMMENT '用例维护人',
    `Degree of importance` VARCHAR(45) NULL COMMENT '重要程度(0 P0,1P1,2P2,3P3,4P4)',
    `case_type` VARCHAR(45) NULL COMMENT '用例类型(0 功能测试，1性能测试 ，2接口测，3兼容性测试)',
    PRIMARY KEY (`id`)
    )
    ENGINE = InnoDB;