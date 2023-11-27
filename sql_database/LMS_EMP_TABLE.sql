use infinite_august23;

drop table if exists LeaveDetails;

drop table If exists Emploee;

Create Table Employee
(
    EmpId INT Primary Key,
    EmpNmae varchar(30),
	EmpEmail varchar(30),
    MobileNo varchar(30),
    DataOfJoin Date,
    ManagerId INT,
    LeavaeAvail INT
);
