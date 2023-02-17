-- 13. The directors of the movies in the "Harry Potter Collection", sorted alphabetically.
-- (4 rows)
SELECT DISTINCT
	p.person_name
FROM collection c
JOIN movie m ON c.collection_id = m.collection_id
JOIN person p ON m.director_id = p.person_id
WHERE c.collection_name LIKE '%Harry Potter%'
ORDER BY p.person_name ASC
