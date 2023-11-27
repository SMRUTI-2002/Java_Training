use infinite_august23;

Insert into Employee(EmpId,EmpName,EmpEmail,MobileNo,DateOfJoin,Managerid,Leaveavail)
values(1000,'Sagar','sagar@gmail.com','847273444','2023-10-08',null,12),
(1001,'Abhishek','abhi225@gmail.com','847276766','2023-09-09',1000,12),
(1002,'Kaushik','kaushik@gmail.com','843577074','2023-01-01',1000,15),
(1003,'Smruti','smruti@gmail.com','954467737','2023-07-07',1001,14),
(1004,'Anirudh','anirudh@gmail.com','906544561','2023-07-09',1001,15),
(1005,'Shivangi','shiva123@gmail.com','987263537','2023-10-03',1002,12),
(1006,'Harash','harsh@gmail.com','908756781','2023-09-02',1002,12);

Insert into LeaveDetails (EmpId,LeaveStartDate,LeaveEndDate,leaveType,leaveReason)
values(1000,'2023-10-10', '2023-10-10', 'EL','going home'),
(1005,'2023-12-12', '2023-10-10', 'EL','Function'),
(1006,'2023-12-25', '2023-12-31', 'pL','My Marriage');

select * from LeaveDetails;