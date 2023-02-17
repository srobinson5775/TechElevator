-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in. 
-- Order the results by the actor names (A-Z) and then by movie title (A-Z). 
-- (48 rows)

SELECT
	p.person_name,
	m.title
FROM movie AS m
JOIN movie_actor AS ma ON m.movie_id = ma.movie_id
JOIN person AS p ON ma.actor_id = p.person_id
WHERE p.person_name LIKE '% Jones'
ORDER BY p.person_name ASC, m.title ASC

