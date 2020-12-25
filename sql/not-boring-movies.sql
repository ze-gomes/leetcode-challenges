

-- https://leetcode.com/problems/not-boring-movies/
-- 620. Not Boring Movies

SELECT id, movie, description, rating
FROM cinema
WHERE description <> "boring" AND ( id % 2 ) <> 0
ORDER BY rating DESC;