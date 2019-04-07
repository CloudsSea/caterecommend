DROP TABLE
IF EXISTS `business`;

CREATE TABLE `business` (
	`business_id` VARCHAR (22) NOT NULL COMMENT '商户id',
	`business_id_int` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商户id(bigint)',
	`city` VARCHAR (64) DEFAULT '' COMMENT '城市',
	`full_address` VARCHAR (128) DEFAULT '0' COMMENT '完整地址',
	`latitude` VARCHAR (24) DEFAULT '' COMMENT '维度',
	`longitude` VARCHAR (24) DEFAULT '' COMMENT '经度',
	`name` VARCHAR (128) DEFAULT '' COMMENT '名称',
	`open` TINYINT (1) DEFAULT '0' COMMENT '营业',
	`review_count` BIGINT (20) DEFAULT '0' COMMENT '评论数量',
	`stars` BIGINT (20) DEFAULT '0' COMMENT '星星',
	`state` VARCHAR (12) DEFAULT '' COMMENT '状态',
	`type` VARCHAR (36) DEFAULT '' COMMENT '类型',
  PRIMARY KEY (`business_id_int`,`business_id`)
)COMMENT='商户表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;

DROP TABLE
IF EXISTS `bus_attribute`;

CREATE TABLE `bus_attribute` (
	`business_id` VARCHAR (22) NOT NULL COMMENT '商户id',
	`accepts_credit_cards` TINYINT (1) DEFAULT '0' COMMENT '支持信用卡',
	`accepts_insurance` TINYINT (1) DEFAULT '0' COMMENT '支持赔偿金',
	`ages_allowed` VARCHAR (32) DEFAULT '' COMMENT '年龄允许',
	`alcohol` VARCHAR (32) DEFAULT '' COMMENT '提供酒',
	`attire` VARCHAR (32) DEFAULT '' COMMENT '装饰',
	`byob` TINYINT (1) DEFAULT '0' COMMENT '自带酒',
	`byob_corkage` VARCHAR (32) DEFAULT '' COMMENT '自带酒或开瓶费',
	`by_appointment_only` TINYINT (1) DEFAULT '0' COMMENT '只支持预约',
	`caters` TINYINT (1) DEFAULT '0' COMMENT '承办宴席',
	`coat_check` TINYINT (1) DEFAULT '0' COMMENT '衣着检查',
	`corkage` TINYINT (1) DEFAULT '0' COMMENT '开瓶费',
	`delivery` TINYINT (1) DEFAULT '0' COMMENT '递送',
	`dogs_allowed` TINYINT (1) DEFAULT '0' COMMENT '宠物',
	`drive_thru` TINYINT (1) DEFAULT '0' COMMENT '乘车路过',
	`good_for_dancing` TINYINT (1) DEFAULT '0' COMMENT '适合跳舞',
	`good_for_groups` TINYINT (1) DEFAULT '0' COMMENT '适合集会',
	`good_for_kids` TINYINT (1) DEFAULT '0' COMMENT '适合孩子',
	`happy_hour` TINYINT (1) DEFAULT '0' COMMENT '优惠时段',
	`has_tv` TINYINT (1) DEFAULT '0' COMMENT '电视',
	`noise_level` VARCHAR (32) DEFAULT '' COMMENT '吵闹',
	`open_24_hours` TINYINT (1) DEFAULT '0' COMMENT '24h营业',
	`order_at_counter` TINYINT (1) DEFAULT '0' COMMENT '柜台订单',
	`outdoor_seating` TINYINT (1) DEFAULT '0' COMMENT '户外座位',
	`price_range` TINYINT (1) DEFAULT '0' COMMENT '价格波动',
	`smoking`  VARCHAR (32) DEFAULT ''  COMMENT '吸烟',
	`take_out` TINYINT (1) DEFAULT '0' COMMENT '打包',
	`takes_reservations` TINYINT (1) DEFAULT '0' COMMENT '订座',
	`waiter_service` TINYINT (1) DEFAULT '0' COMMENT '服务员',
	`wheelchair_accessible` TINYINT (1) DEFAULT '0' COMMENT '轮椅',
	`wi_fi` VARCHAR(12) DEFAULT '' COMMENT 'wi_fi',
  PRIMARY KEY (`business_id`)
)COMMENT='商户属性表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;

DROP TABLE
IF EXISTS `bus_ambience`;
CREATE TABLE `bus_ambience` (
	`business_id` VARCHAR (22) NOT NULL COMMENT '商户id',
	`casual` TINYINT (1) DEFAULT '0' COMMENT '休闲',
	`classy` TINYINT (1) DEFAULT '0' COMMENT '漂亮',
	`divey` TINYINT (1) DEFAULT '0' COMMENT '一般',
	`hipster` TINYINT (1) DEFAULT '0' COMMENT '低级',
	`intimate` TINYINT (1) DEFAULT '0' COMMENT '亲密',
	`romantic` TINYINT (1) DEFAULT '0' COMMENT '浪漫',
	`touristy` TINYINT (1) DEFAULT '0' COMMENT '适合游览',
	`trendy` TINYINT (1) DEFAULT '0' COMMENT '时髦',
	`upscale` TINYINT (1) DEFAULT '0' COMMENT '高级',
  PRIMARY KEY (`business_id`)
) COMMENT='商户氛围表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;
DROP TABLE
IF EXISTS `bus_dietary_restrictions`;

CREATE TABLE `bus_dietary_restrictions` (
	`business_id` VARCHAR (22) NOT NULL COMMENT '商户id',
	`dairy_free` TINYINT (1) DEFAULT '0' COMMENT '不含乳制品',
	`gluten_free` TINYINT (1) DEFAULT '0' COMMENT '无谷蛋白',
	`halal` TINYINT (1) DEFAULT '0' COMMENT '伊斯兰',
	`kosher` TINYINT (1) DEFAULT '0' COMMENT '犹太教',
	`soy_free` TINYINT (1) DEFAULT '0' COMMENT '不含大豆',
	`vegan` TINYINT (1) DEFAULT '0' COMMENT '素食主义',
	`vegetarian` TINYINT (1) DEFAULT '0' COMMENT '素食',
  PRIMARY KEY (`business_id`)
)COMMENT='商户显著特点表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;

DROP TABLE
IF EXISTS `bus_good_for`;

CREATE TABLE `bus_good_for` (
	`business_id` VARCHAR (22) NOT NULL COMMENT '商户id',
	`breakfast` TINYINT (1) DEFAULT '0' COMMENT '早餐',
	`brunch` TINYINT (1) DEFAULT '0' COMMENT '早午餐',
	`dessert` TINYINT (1) DEFAULT '0' COMMENT '甜点',
	`dinner` TINYINT (1) DEFAULT '0' COMMENT '晚餐',
	`latenight` TINYINT (1) DEFAULT '0' COMMENT '深夜',
	`lunch` TINYINT (1) DEFAULT '0' COMMENT '午餐',
  PRIMARY KEY (`business_id`)

)COMMENT='商户优势餐表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;

DROP TABLE
IF EXISTS `bus_hair_types_specialized_in`;

CREATE TABLE `bus_hair_types_specialized_in` (
	`business_id` VARCHAR (22) NOT NULL COMMENT '商户id',
	`africanamerican` TINYINT (1) DEFAULT '0' COMMENT '非裔美籍',
	`asian` TINYINT (1) DEFAULT '0' COMMENT '亚洲',
	`coloring` TINYINT (1) DEFAULT '0' COMMENT '外貌',
	`curly` TINYINT (1) DEFAULT '0' COMMENT '卷毛',
	`extensions` TINYINT (1) DEFAULT '0' COMMENT '假发',
	`kids` TINYINT (1) DEFAULT '0' COMMENT '孩子',
	`perms` TINYINT (1) DEFAULT '0' COMMENT '烫发',
	`straightperms` TINYINT (1) DEFAULT '0' COMMENT '直烫发',
  PRIMARY KEY (`business_id`)

)COMMENT='商户美发表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;

DROP TABLE
IF EXISTS `bus_music`;

CREATE TABLE `bus_music` (
	`business_id` VARCHAR (22) NOT NULL COMMENT '商户id',
	`background_music` TINYINT (1) DEFAULT '0' COMMENT '背景音乐',
	`dj` TINYINT (1) DEFAULT '0' COMMENT 'DJ',
	`jukebox` TINYINT (1) DEFAULT '0' COMMENT '自动唱机',
	`karaoke` TINYINT (1) DEFAULT '0' COMMENT '卡拉OK',
	`live` TINYINT (1) DEFAULT '0' COMMENT '唱片',
	`video` TINYINT (1) DEFAULT '0' COMMENT '视频',
  PRIMARY KEY (`business_id`)

)COMMENT='商户音乐特点表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;

DROP TABLE
IF EXISTS `bus_parking`;

CREATE TABLE `bus_parking` (
	`business_id` VARCHAR (22) NOT NULL COMMENT '商户id',
	`garage` TINYINT (1) DEFAULT '0' COMMENT '车库',
	`lot` TINYINT (1) DEFAULT '0' COMMENT '大量车位',
	`street` TINYINT (1) DEFAULT '0' COMMENT '街边停车',
	`valet` TINYINT (1) DEFAULT '0' COMMENT '停车客服',
	`validated` TINYINT (1) DEFAULT '0' COMMENT '已确认',
  PRIMARY KEY (`business_id`)

)COMMENT='商户停车特点表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;

DROP TABLE
IF EXISTS `bus_hours`;

CREATE TABLE `bus_hours` (
	`business_id` VARCHAR (22) NOT NULL COMMENT '商户id',
	`monday_open` VARCHAR (24) DEFAULT '' COMMENT '周一开店时间',
	`monday_close` VARCHAR (24) DEFAULT '' COMMENT '周一打烊时间',
	`thursday_open` VARCHAR (24) DEFAULT '' COMMENT '周二开店时间',
	`thursday_close` VARCHAR (24) DEFAULT '' COMMENT '周二打烊时间',
	`wednesday_open` VARCHAR (24) DEFAULT '' COMMENT '周三开店时间',
	`wednesday_close` VARCHAR (24) DEFAULT '' COMMENT '周三打烊时间',
	`saturday_open` VARCHAR (24) DEFAULT '' COMMENT '周四开店时间',
	`saturday_close` VARCHAR (24) DEFAULT '' COMMENT '周四打烊时间',
	`friday_open` VARCHAR (24) DEFAULT '' COMMENT '周五开店时间',
	`friday_close` VARCHAR (24) DEFAULT '' COMMENT '周五打烊时间',
	`tuesday_open` VARCHAR (24) DEFAULT '' COMMENT '周六开店时间',
	`tuesday_close` VARCHAR (24) DEFAULT '' COMMENT '周六打烊时间',
	`sunday_open` VARCHAR (24) DEFAULT '' COMMENT '周天开店时间',
	`sunday_close` VARCHAR (24) DEFAULT '' COMMENT '周天打烊时间',
  PRIMARY KEY (`business_id`)

)COMMENT='商户营业时间表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;

DROP TABLE
IF EXISTS `bus_category`;

CREATE TABLE `bus_category` (
	`id` VARCHAR (22) NOT NULL COMMENT 'id',
	`p_id` VARCHAR (22) DEFAULT '' COMMENT '父级id',
	`name` VARCHAR (256) DEFAULT '' COMMENT '分类名称',
  PRIMARY KEY (`id`)
)COMMENT='商户分类表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;

DROP TABLE
IF EXISTS `bus_mid_category`;
CREATE TABLE `bus_mid_category` (
	`id` VARCHAR (22) NOT NULL COMMENT 'id',
	`business_id` VARCHAR (22) NOT NULL COMMENT '商户id',
	`category_id` VARCHAR (22) NOT NULL COMMENT '分类表',
	`name` VARCHAR (256) DEFAULT '' COMMENT '分类名称',
  PRIMARY KEY (`id`)
)COMMENT='商户与商户分类中间表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;



DROP TABLE
IF EXISTS `bus_neighborhood`;

CREATE TABLE `bus_neighborhood` (
  `id` VARCHAR (22) NOT NULL COMMENT 'id',
	`business_id` VARCHAR (22) NOT NULL COMMENT '商户id',
	`neighborhood_id`  VARCHAR (22) DEFAULT '' COMMENT '邻居id',
	`name`  VARCHAR (64) DEFAULT '' COMMENT '邻居名字',
  PRIMARY KEY (`id`)
)COMMENT='商户邻居表' ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = COMPACT;

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `user_id` varchar(22) NOT NULL COMMENT '用户id',
  `user_id_int` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id(bigint)',
  `average_stars` double DEFAULT '0' COMMENT '平均评分',
  `compliments_cool` int(10) unsigned DEFAULT '0' COMMENT '酷赞美',
  `compliments_cute` int(10) unsigned DEFAULT '0' COMMENT '可爱赞',
  `compliments_funny` int(10) unsigned DEFAULT '0' COMMENT '有趣赞',
  `compliments_hot` int(10) unsigned DEFAULT '0' COMMENT '热点赞',
  `compliments_list` int(10) unsigned DEFAULT '0' COMMENT '列表赞',
  `compliments_more` int(10) unsigned DEFAULT '0' COMMENT '更多赞',
  `compliments_note` int(10) unsigned DEFAULT '0' COMMENT '笔记赞',
  `compliments_photos` int(10) unsigned DEFAULT '0' COMMENT '照片赞',
  `compliments_plain` int(10) unsigned DEFAULT '0' COMMENT '简单赞',
  `compliments_profile` int(10) unsigned DEFAULT '0' COMMENT '描述赞',
  `compliments_writer` int(10) unsigned DEFAULT '0' COMMENT '作者赞',
  `fans` int(10) unsigned DEFAULT '0' COMMENT '粉丝数',
  `name` varchar(128) DEFAULT '' COMMENT '用户名',
  `review_count` int(10) unsigned DEFAULT '0' COMMENT '评论总数',
  `type` varchar(22) DEFAULT '' COMMENT '类型(商家/用户?)',
  `votes_cool` int(10) unsigned DEFAULT '0' COMMENT '酷数',
  `votes_funny` int(10) unsigned DEFAULT '0' COMMENT '有趣数',
  `votes_useful` int(10) unsigned DEFAULT '0' COMMENT '有用数',
  `yelping_since` varchar(22) DEFAULT '' COMMENT '注册时间',
  PRIMARY KEY (`user_id_int`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='用户表';



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









