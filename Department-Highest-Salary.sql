WITH ms AS (
    SELECT 
        d.name AS Department, e.name AS Employee, e.salary, 
        MAX(e.salary) OVER (PARTITION BY e.departmentId) AS max_salary
    FROM Employee e
    LEFT JOIN Department d ON e.departmentId = d.id
)
SELECT 
    Department, Employee, salary AS Salary FROM ms
WHERE salary = max_salary;
