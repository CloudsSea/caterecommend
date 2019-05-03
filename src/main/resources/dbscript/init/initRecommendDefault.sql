INSERT INTO recommend_default(business_id,recommend_value)
select business_id, convert(sumStars/theCount,decimal(15,5)) as recommend_value from (
	SELECT
		business_id business_id,
		theCount,
		sumStars
	FROM
		(
			SELECT
				business_id,
				count(0) theCount,
				SUM(stars) sumStars
			FROM
				review
			GROUP BY
				business_id
		) t1
	WHERE
		theCount > 100
) t2 order by recommend_value desc;