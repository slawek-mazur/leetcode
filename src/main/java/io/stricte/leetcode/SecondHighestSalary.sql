# Runtime: 161 ms, faster than 96.00% of MySQL online submissions for Second Highest Salary.
# Memory Usage: 0B, less than 100.00% of MySQL online submissions for Second Highest Salary.
select max(Salary) as SecondHighestSalary
from Employee
where Salary <> (select max(Salary) from Employee)