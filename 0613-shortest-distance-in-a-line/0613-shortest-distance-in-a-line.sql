/* Write your PL/SQL query statement below */

select Min(abs(p1.x - p2.x)) as shortest  from point p1 join point p2

on p1.x != p2.x;
