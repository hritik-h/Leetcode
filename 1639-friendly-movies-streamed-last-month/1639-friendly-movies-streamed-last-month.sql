/* Write your PL/SQL query statement below */

select distinct(title) from content c join tvprogram t on c.content_id = t.content_id

where kids_content = 'Y' and program_date like '2020-06%' and content_type = 'Movies';
