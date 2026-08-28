# Write your MySQL query statement below
select e.name as employee
from Employee e,Employee m
where e.managerId=m.id
and e.salary>m.salary;

