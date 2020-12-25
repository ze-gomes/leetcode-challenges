-- https://leetcode.com/problems/combine-two-tables/
-- 175. Combine Two Tables


SELECT FirstName, LastName, City, State
FROM Person LEFT JOIN
Address ON Person.personId = Address.personID;