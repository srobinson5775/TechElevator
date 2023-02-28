-- select the park name, campground name, open_from_mm, open_to_mm & daily_fee ordered by park name and then campground name
-- (expected: 7 rows, starting with "Blackwoods")

SELECT p.name, c.name, c.open_from_mm, c.open_to_mm, c.daily_fee
FROM campground c
JOIN park p ON c.park_id = p.park_id
ORDER BY p.name ASC, c.name ASC;


-- select the park name and the total number of campgrounds for each park ordered by park name
-- (expected: 3 rows, starting with "Acadia")
SELECT p.name, COUNT(campground_id)
FROM park p
JOIN campground c ON p.park_id = c.park_id
GROUP BY p.name
ORDER BY p.name ASC;


-- select the park name, campground name, site number, max occupancy, accessible, max rv length, utilities where the campground name is 'Blackwoods'
-- (expected: 12 rows)
SELECT DISTINCT park.name, campground.name, site.site_number, site.max_occupancy, site.accessible, site.max_rv_length, utilities
FROM site
JOIN campground ON site.campground_id = campground.campground_id
JOIN park on campground.park_id = park.park_id
WHERE campground.name = 'Blackwoods'


-- select site number, reservation name, reservation from and to date ordered by reservation from date
-- (expected: 44 rows, starting with the earliest date)
SELECT s.site_number, r.name, r.from_date, r.to_date
FROM reservation r
JOIN site s ON r.site_id = s.site_id
ORDER BY r.from_date DESC
