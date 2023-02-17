-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection", sorted alphabetically.
-- (28 rows)
SELECT DISTINCT
	p.person_name
FROM
	person p
JOIN movie_actor ma ON p.person_id = ma.actor_id
JOIN movie m ON ma.movie_id = m.movie_id
JOIN collection c ON m.collection_id = c.collection_id
WHERE c.collection_name LIKE '%Back to the Future%'
ORDER BY p.person_name ASC

