select room_no, room_type
FROM ROOM_MASTER
Group by room_no , room_type
HAVING count(*) > 1;