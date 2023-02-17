-- 9. The titles of movies directed by James Cameron, sorted alphabetically.
-- (6 rows)
SELECT
	m.title
FROM movie m
JOIN person p ON m.director_id = p.person_id
WHERE p.person_name = 'James Cameron'
ORDER BY m.title ASC
