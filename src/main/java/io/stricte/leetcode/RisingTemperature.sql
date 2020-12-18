# +---------------+---------+
# | Column Name   | Type    |
# +---------------+---------+
# | id            | int     |
# | recordDate    | date    |
# | temperature   | int     |
# +---------------+---------+
# id is the primary key for this table.
# This table contains information about the temperature in a certain day.

# Weather
# +----+------------+-------------+
# | id | recordDate | Temperature |
# +----+------------+-------------+
# | 1  | 2015-01-01 | 10          |
# | 2  | 2015-01-02 | 25          |
# | 3  | 2015-01-03 | 20          |
# | 4  | 2015-01-04 | 30          |
# +----+------------+-------------+
#
# Result table:
# +----+
# | id |
# +----+
# | 2  |
# | 4  |
# +----+
# In 2015-01-02, temperature was higher than the previous day (10 -> 25).
# In 2015-01-04, temperature was higher than the previous day (30 -> 20).
select weather.id as 'Id'
from weather
         inner join weather w on DATEDIFF(weather.recordDate, w.recordDate) = 1
    and weather.Temperature > w.Temperature