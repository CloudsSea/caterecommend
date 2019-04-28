DROP TABLE data_collect;
CREATE TABLE data_collect (
  `review_id` VARCHAR (22) DEFAULT '' COMMENT '评论id',
	`business_id_int` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商户id(bigint)',
  `user_id_int` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id(bigint)',
  UNIQUE INDEX review ('review_id')
);

INSERT INTO data_collect
SELECT
	user_id,
	business_id,
	stars
FROM
	 (
		SELECT
			t2.user_id_int user_id,
			t3.business_id_int business_id,
			t1.stars
		FROM
			review t1
		JOIN users t2 ON t1.user_id = t2.user_id
		JOIN business t3 ON t1.business_id = t3.business_id
	) t ;