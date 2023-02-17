-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985.
-- Order the results by actor from oldest to youngest.
-- (20 rows)

SELECT DISTINCT
	p.person_name
	,birthday
FROM person p
JOIN movie_actor ma ON p.person_id = ma.actor_id
JOIN movie m ON ma.movie_id = m.movie_id
WHERE p.birthday < '12/31/1959' AND p.birthday > '01/01/1950'
AND m.release_date > '01/01/1985' AND m.release_date < '12/31/1985'
ORDER BY birthday ASC