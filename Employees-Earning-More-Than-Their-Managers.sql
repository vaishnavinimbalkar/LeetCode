SELECT e1.name as Employee FROM Employee e1
INNER JOIN employee e2 ON e2.id=e1.managerId
WHERE e1.salary > e2.salary

