
DROP TABLE
IF EXISTS `users`;

CREATE TABLE `users` (
	`user_id` VARCHAR (22) NOT NULL COMMENT '用户id',
	`average_stars` DOUBLE DEFAULT 0 COMMENT '平均评分',

  `compliments_cool` INTEGER UNSIGNED DEFAULT 0 COMMENT '酷赞美',
  `compliments_cute` INTEGER UNSIGNED DEFAULT 0 COMMENT '可爱赞',
  `compliments_funny` INTEGER UNSIGNED DEFAULT 0 COMMENT '有趣赞',
  `compliments_hot` INTEGER UNSIGNED DEFAULT 0 COMMENT '热点赞',
  `compliments_list` INTEGER UNSIGNED DEFAULT 0 COMMENT '列表赞',
  `compliments_more` INTEGER UNSIGNED DEFAULT 0 COMMENT '更多赞',
  `compliments_note` INTEGER UNSIGNED DEFAULT 0 COMMENT '笔记赞',
  `compliments_photos` INTEGER UNSIGNED DEFAULT 0 COMMENT '照片赞',
  `compliments_plain` INTEGER UNSIGNED DEFAULT 0 COMMENT '简单赞',
  `compliments_profile` INTEGER UNSIGNED DEFAULT 0 COMMENT '描述赞',
  `compliments_writer` INTEGER UNSIGNED DEFAULT 0 COMMENT '作者赞',


  `fans` INTEGER UNSIGNED DEFAULT 0 COMMENT '粉丝数',


  `name` VARCHAR (128) DEFAULT '' COMMENT '用户名',
  `review_count` INTEGER UNSIGNED DEFAULT 0 COMMENT '评论总数',
  `type` VARCHAR (22) DEFAULT '' COMMENT '类型(商家/用户?)',

  `votes_cool` INTEGER UNSIGNED DEFAULT 0 COMMENT '酷数',
  `votes_funny` INTEGER UNSIGNED DEFAULT 0 COMMENT '有趣数',
  `votes_useful` INTEGER UNSIGNED DEFAULT 0 COMMENT '有用数',

  `yelping_since` VARCHAR (22) DEFAULT '' COMMENT '注册时间',
  PRIMARY KEY (`user_id`)
)COMMENT='用户表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;




DROP TABLE
IF EXISTS `photo`;

CREATE TABLE `photo` (
  `business_id` VARCHAR (22) DEFAULT '' COMMENT '商户id',
  `caption` VARCHAR (512) DEFAULT '' COMMENT '标题',
  `label` VARCHAR (36) DEFAULT '' COMMENT '标签',
  `photo_id` VARCHAR (22) DEFAULT '' COMMENT '照片id',
  PRIMARY KEY (`photo_id`)
)COMMENT='照片表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;






DROP TABLE
IF EXISTS `review`;

CREATE TABLE `review` (
  `business_id` VARCHAR (22) DEFAULT '' COMMENT '商户id',
  `date` VARCHAR (22) DEFAULT '' COMMENT '日期',
  `review_id` VARCHAR (22) DEFAULT '' COMMENT '评论id',
  `stars` INTEGER UNSIGNED DEFAULT 0 COMMENT '平分',
  `text` TEXT  COMMENT '详情',
  `type` VARCHAR (22) DEFAULT '' COMMENT '类型',
  `user_id` VARCHAR (22) DEFAULT '' COMMENT '用户id',
  `user_name` VARCHAR (128) DEFAULT '' COMMENT '用户名',
  `cool` INTEGER UNSIGNED DEFAULT 0 COMMENT '酷',
  `funny` INTEGER UNSIGNED DEFAULT 0 COMMENT '有趣',
  `useful` INTEGER UNSIGNED DEFAULT 0 COMMENT '有用',
  PRIMARY KEY (`review_id`)
)COMMENT='评论表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;




DROP TABLE
IF EXISTS `votes`;

CREATE TABLE `votes` (
	`id` VARCHAR (22) NOT NULL COMMENT 'id',
  `user_id` VARCHAR (22) DEFAULT '' COMMENT '用户id',
  `user_name` VARCHAR (128) DEFAULT '' COMMENT '用户名',
	`be_review_id` VARCHAR (22) NOT NULL COMMENT '被评论id',
	`business_id`  VARCHAR (22) DEFAULT '' COMMENT '相关商户id',
  `cool`  TINYINT (1) DEFAULT '0' COMMENT '酷',
  `funny`  TINYINT (1) DEFAULT '0' COMMENT '有趣',
  `useful`  TINYINT (1) DEFAULT '0' COMMENT '有用',
  PRIMARY KEY (`id`)
)COMMENT='投票表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;




DROP TABLE
IF EXISTS `user_elite`;

CREATE TABLE `user_elite` (
	`id` VARCHAR (22) NOT NULL COMMENT 'id',
	`user_id`  VARCHAR (22) DEFAULT '' COMMENT '用户id',
	`year`  VARCHAR (64) DEFAULT '' COMMENT '年',
  PRIMARY KEY (`id`)
)COMMENT='年精英统计表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;




DROP TABLE
IF EXISTS `user_compliments`;

CREATE TABLE `user_compliments` (
	`id` VARCHAR (22) NOT NULL COMMENT 'id',
  `user_id`  VARCHAR (22) DEFAULT '' COMMENT '用户id',
  `user_name` VARCHAR (128) DEFAULT '' COMMENT '用户名',
  `be_user_id` VARCHAR (22) DEFAULT '' COMMENT '被赞赏用户id',
	`type`  VARCHAR (22) DEFAULT '' COMMENT '赞赏类型',
  `create_time` VARCHAR (22) DEFAULT '' COMMENT '创建时间',
  PRIMARY KEY (`id`)
)COMMENT='赞美表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;


DROP TABLE
IF EXISTS `user_friends`;

CREATE TABLE `user_friends` (
	`id` VARCHAR (22) NOT NULL COMMENT 'id',
  `user_id`  VARCHAR (22) DEFAULT '' COMMENT '用户id',
  `user_name` VARCHAR (128) DEFAULT '' COMMENT '用户名',
  `be_user_id` VARCHAR (22) DEFAULT '' COMMENT '被加好友id',
  `be_user_name` VARCHAR (128) DEFAULT '' COMMENT '好友用户名',
  `create_time` VARCHAR (22) DEFAULT '' COMMENT '创建时间',
  PRIMARY KEY (`id`)
)COMMENT='好友表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;





DROP TABLE
IF EXISTS `user_fans`;

CREATE TABLE `user_fans` (
	`id` VARCHAR (22) NOT NULL COMMENT 'id',
  `user_id`  VARCHAR (22) DEFAULT '' COMMENT '用户id',
  `user_name` VARCHAR (128) DEFAULT '' COMMENT '用户名',
  `famous_user_id` VARCHAR (22) DEFAULT '' COMMENT '明星用户id',
  `create_time` VARCHAR (22) DEFAULT '' COMMENT '创建时间',
  PRIMARY KEY (`id`)
)COMMENT='粉丝表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;







-- DROP TABLE
-- IF EXISTS `xxx`;
--
-- CREATE TABLE `xxx` (
-- 	`id` VARCHAR (22) NOT NULL COMMENT 'id',
-- 	`xxx`  VARCHAR (22) DEFAULT '' COMMENT 'xxx',
--   PRIMARY KEY (`id`)
-- )COMMENT='xxx' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;









