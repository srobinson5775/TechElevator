-- 23. The name and date established of parks opened in the 1960s (6 rows)
SELECT park_name, date_established
FROM park
WHERE date_established > '12/31/1959' AND date_established < '1/1/1970';
