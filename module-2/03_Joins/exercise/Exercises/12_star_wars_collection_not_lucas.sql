-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas, sorted alphabetically.
-- (5 rows)
SELECT
	m.title
FROM collection c
JOIN movie m ON m.collection_id = c.collection_id
JOIN person p ON m.director_id = p.person_id
WHERE c.collection_name LIKE '%Star Wars%' AND person_name != 'George Lucas'
ORDER BY m.title ASC
