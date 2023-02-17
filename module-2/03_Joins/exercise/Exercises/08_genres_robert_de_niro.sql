-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later, sorted alphabetically.
-- (6 rows)
SELECT DISTINCT
	g.genre_name
FROM
	genre g
JOIN movie_genre mg ON g.genre_id = mg.genre_id
JOIN movie m ON m.movie_id = mg.movie_id
JOIN movie_actor ma ON m.movie_id = ma.movie_id
JOIN person p ON ma.actor_id = p.person_id
WHERE p.person_name ='Robert De Niro' AND m.release_date > '1/1/2010'
ORDER BY g.genre_name ASC

