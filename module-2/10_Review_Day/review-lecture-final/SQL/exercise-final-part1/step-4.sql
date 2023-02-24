-- select the park name, campground name, open_from_mm, open_to_mm & daily_fee ordered by park name and then campground name
-- (expected: 7 rows, starting with "Blackwoods")
select p.name as park, c.name as campground, c.open_from_mm, c.open_to_mm, daily_fee
from park p
join campground c on c.park_id = p.park_id
order by park, campground;

-- select the park name and the total number of campgrounds for each park ordered by park name
-- (expected: 3 rows, starting with "Acadia")
select p.name, count(c.*)
from park p
join campground c on c.park_id = p.park_id
group by p.park_id
order by p.name;

-- select the park name, campground name, site number, max occupancy, accessible, max rv length, utilities where the campground name is 'Blackwoods'
-- (expected: 12 rows)
select
	p.name as park,
	c.name as campground,
	s.site_number,s.max_occupancy,s.accessible,s.max_rv_length,s.utilities
from park p
join campground c on c.park_id = p.park_id
join site s on s.campground_id = c.campground_id
where c.name = 'Blackwoods';

-- select site number, reservation name, reservation from and to date ordered by reservation from date
-- (expected: 44 rows, starting with the earliest date)
select
	s.site_number,r.name, r.from_date,r.to_date
from reservation r
join site s on s.site_id = r.site_id
order by from_date;
