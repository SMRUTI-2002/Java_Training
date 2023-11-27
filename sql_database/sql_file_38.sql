create database hms;

 

use hms;

SELECT room_no FROM ROOM_MASTER 
WHERE room_no NOT IN (SELECT room_no FROM ROOM_ALLOCATION);

