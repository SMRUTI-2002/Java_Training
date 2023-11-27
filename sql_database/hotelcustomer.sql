drop database if exists task;
create database task;
use task;

CREATE TABLE HotelCustomer (
    CustomerID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    CheckInTime DATETIME NOT NULL,
    CheckOutTime DATETIME NOT NULL,
    RoomNumber INT NOT NULL
);

INSERT INTO HotelCustomer (Name, CheckInTime, CheckOutTime, RoomNumber)
VALUES ('Mahesh', '2023-09-23 14:00:00', '2023-09-25 12:00:00', 101),
('Depak', '2023-09-24 12:00:00', '2023-09-26 12:00:00', 102),
('Sweta', '2023-09-22 12:00:00', '2023-09-24 12:00:00', 103),
('Raghab', '2023-09-21 12:00:00', '2023-09-23 12:00:00', 104)

