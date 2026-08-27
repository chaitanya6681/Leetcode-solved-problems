# Write your MySQL query statement below
select sell_date,COUNT(DISTINCT product) AS num_sold,GROUP_CONCAT(distinct product order by product) as products
FROM Activities
GROUP BY sell_date;