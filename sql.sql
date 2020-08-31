SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- 用户表
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT, -- 主键
  `username` VARCHAR(10) DEFAULT NULL, -- 用户名
  `password` VARCHAR(20) DEFAULT NULL, -- 密码
  `sex` VARCHAR(1) DEFAULT NULL, -- 性别
  `age` INT(4) NOT NULL DEFAULT '0', -- 年龄
  `telephone` VARCHAR(11) DEFAULT NULL,  -- 电话
  PRIMARY KEY  (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 比赛表
-- ----------------------------
DROP TABLE IF EXISTS `race`;
CREATE TABLE `race` (
  `id` INT(11) NOT NULL AUTO_INCREMENT, -- 主键
  `name` VARCHAR(10) DEFAULT NULL, -- 比赛名称
  `site` VARCHAR(10) DEFAULT NULL, -- 比赛路线
  `route` VARCHAR(10) DEFAULT NULL, -- 比赛路线
  `maxNumber` INT(8) NOT NULL DEFAULT '0',  -- 人数上限
  `registerNumber` INT(8) NOT NULL DEFAULT '0', -- 已报名人数
  `type` VARCHAR(10) DEFAULT NULL,  -- 比赛类型
  `startTime` VARCHAR(15) DEFAULT NULL,  -- 比赛开始时间
  `endTime` VARCHAR(15) DEFAULT NULL,  -- 报名截止时间
  `telephone` VARCHAR(11) DEFAULT NULL,  -- 举办方电话
  `email` VARCHAR(25) DEFAULT NULL, -- 举办方邮箱
  `sponsor` VARCHAR(15) DEFAULT NULL, -- 举办单位
  `assistant` VARCHAR(15) DEFAULT NULL, -- 协办单位
  `support` VARCHAR(15) DEFAULT NULL, -- 赞助单位
  `guidance` VARCHAR(15) DEFAULT NULL, -- 指导单位
  PRIMARY KEY  (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

-- ----------------------------
-- 中间表：因为一个用户可能对应多个比赛，所以把用户的id和对应的比赛id建立关系，以便于根据用户的id查询对应比赛的id(最后再根据比赛的id查询用户对应的比赛信息)
-- ----------------------------
DROP TABLE IF EXISTS `user_race`;
CREATE TABLE `user_race` (
  `user_id` INT(11) NOT NULL DEFAULT '0', -- user表的id
  `race_id` INT(11) NOT NULL DEFAULT '0', -- race表的id
  PRIMARY KEY  (`user_id`,`race_id`),
  KEY `race_id` (`race_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `race_id` FOREIGN KEY (`race_id`) REFERENCES `race` (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;







