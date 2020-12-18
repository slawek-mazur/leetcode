# For example, the table:
# +---------+------------+
# | student | class      |
# +---------+------------+
# | A       | Math       |
# | B       | English    |
# | C       | Math       |
# | D       | Biology    |
# | E       | Math       |
# | F       | Computer   |
# | G       | Math       |
# | H       | Math       |
# | I       | Math       |
# +---------+------------+
# Should output:
# +---------+
# | class   |
# +---------+
# | Math    |
# +---------+
# Runtime: 246 ms, faster than 76.39% of MySQL online submissions for Classes More Than 5 Students.
# Memory Usage: 0B, less than 100.00% of MySQL online submissions for Classes More Than 5 Students.
select class
from (select distinct student, class from courses) as dist
group by class
having count(*) >= 5;