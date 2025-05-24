WITH
  RankedEmployees AS (
    SELECT *, DENSE_RANK() OVER(ORDER BY salary DESC) AS `rank`
    FROM Employee
  )
SELECT MIN(salary) AS SecondHighestSalary
FROM RankedEmployees
WHERE `rank` = 2;