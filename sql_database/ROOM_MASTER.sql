
create Table ROOM_MASTER (
  room_no VARCHAR(15) NOT NULL UNIQUE,
   room_type VARCHAR(15) NOT NULL,
   status VARCHAR(15) NOT NULL
);

-- Insert simple Data
insert into ROOM_MASTER
 (room_no , room_type , status)
 values
 ('R0001' , 'AC','occupied'),
  ('R0002' , 'Suite','vacant'),
   ('R0003' , 'NonAC','vacant'),
    ('R0004' , 'NonAC','occupied'),
     ('R0005' , 'AC','vacant'),
      ('R0006' , 'AC','occupied');
      
select * from ROOM_MASTER;