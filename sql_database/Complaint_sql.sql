drop database if exists complaint;
create database complaint;
use complaint;
Create Table Complaint
(
   ComplaintID varchar(30) primary key,
   ComplaintType varchar(30),
   CDescription varchar(100),
   ComplaintDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   Severity varchar(20),
   Status varchar(30) default 'Pending'
);

insert into Complaint(ComplaintID, ComplaintType, CDescription,ComplaintDate, Severity)
VALUES ('1', 'Service Issue', 'Slow internet connection','2023-10-05 10:15:00', 'High'),
('2', 'Billing Error', 'Incorrect charges on the bill', '2023-10-05 14:30:00','Medium'),
('3', 'Product Defect', 'Phone screen cracked upon delivery','2023-10-05 13:20:00', 'High'),
('4', 'Service Interruption', 'No phone service for 2 days','2023-10-05 15:45:00', 'High'),
('5', 'Billing Dispute', 'Overcharged for premium subscription','2023-10-05 12:00:00', 'Medium');

Create Table Resolve
(
   ResolveID varchar(30) Primary Key,
   ComplaintID varchar(30),
   ComplaintDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   ResolveDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   ResolvedBy varchar(30),
   Comments varchar(100)
);

INSERT INTO Resolve (ResolveID, ComplaintID,ComplaintDate, ResolveDate,ResolvedBy, Comments)
VALUES ('101', '1','2023-10-02  09:30:00', '2023-10-02  15:45:00','Support Team A', 'Issue resolved. Internet speed increased.'),
('102', '2','2023-10-03  11:15:00', '2023-10-03  14:20:00','Billing Department', 'Billing error corrected, refund issued.'),
('103', '3','2023-10-04  10:00:00', '2023-10-04  16:30:00', 'Quality Assurance Team', 'Replacement phone sent to customer.'),
('104', '4','2023-10-05  10:30:00', '2023-10-05  15:20:00', 'Technical Support Team', 'Service restored after server maintenance.'),
('105', '5','2023-10-06  11:10:00', '2023-10-03  17:20:00', 'Billing Department', 'Billing error corrected, credit applied.');