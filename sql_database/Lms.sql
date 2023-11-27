create database lms;
use lms;
drop table if exists LeaveDetails;

drop table If exists Employee;

Create Table Employee
(
	EmpId INT Primary Key,
    EmpName varchar(30),
    EmpEmail varchar(30),
    MobileNo varchar(30),
    DateOfJoin Date,
    ManagerId INT,
    LeaveAvail INT
);

Create Table LeaveDetails
(
	LeaveId INT Primary Key auto_increment,
    EmpId INT,
    LeaveStartDate Date,
    LeaveEndDate Date,
    noOfDays INT,
    leaveType ENUM('EL','PL','ML'),
    leaveStatus ENUM('PENDING','ACCEPTED','REJECTED') default 'PENDING',
    leaveReason varchar(30),
    appliedOn TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Foreign KEY(EmpID) REFERENCES Employee(EmpID)
);