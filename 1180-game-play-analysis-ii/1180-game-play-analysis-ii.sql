/* Write your PL/SQL query statement below */

select a.player_id , a.device_id from Activity a where a.event_date = (
select min(a2.event_date) from activity a2 where a.player_id = a2.player_id
)



