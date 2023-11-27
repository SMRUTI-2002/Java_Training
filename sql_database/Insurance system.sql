drop database if exists Insurance_System;
create database Insurance_System;
use Insurance_System;
CREATE TABLE Insurance_Details (
    Insurance_id INT PRIMARY KEY,
    Insurance_Name VARCHAR(255) NOT NULL,
    Type VARCHAR(50) NOT NULL,
    PremiumStart DATE NOT NULL,
    PremiumEnd DATE NOT NULL,
    MinPeriod INT NOT NULL,
    MaxPeriod INT NOT NULL,
    LaunchDate DATE NOT NULL,
    Status VARCHAR(20) NOT NULL
);
INSERT INTO Insurance_Details (Insurance_id, Insurance_Name, Type, PremiumStart, PremiumEnd, MinPeriod, MaxPeriod, LaunchDate, Status)
VALUES  (1, 'Life Insurance', 'Life', '2023-01-01', '2023-12-31', 5, 30, '2022-11-15', 'Active'),
    (2, 'Car Insurance', 'Auto', '2023-02-01', '2023-12-31', 1, 10, '2023-01-15', 'Active'),
    (3, 'Home Insurance', 'Property', '2023-03-01', '2023-12-31', 2, 20, '2023-02-15', 'Active'),
    (4, 'Health Insurance', 'Health', '2023-04-01', '2023-12-31', 3, 15, '2023-03-15', 'Active'),
    (5, 'Travel Insurance', 'Travel', '2023-05-01', '2023-12-31', 1, 30, '2023-04-15', 'Active'),
    (6, 'Pet Insurance', 'Pet', '2023-06-01', '2023-12-31', 1, 5, '2023-05-15', 'Active'),
    (7, 'Renters Insurance', 'Property', '2023-07-01', '2023-12-31', 1, 10, '2023-06-15', 'Active'),
    (8, 'Boat Insurance', 'Boat', '2023-08-01', '2023-12-31', 1, 10, '2023-07-15', 'Active'),
    (9, 'Motorcycle Insurance', 'Auto', '2023-09-01', '2023-12-31', 1, 5, '2023-08-15', 'Active'),
    (10, 'Dental Insurance', 'Health', '2023-10-01', '2023-12-31', 2, 20, '2023-09-15', 'Active'),
    (11, 'Renter\'s Insurance', 'Property', '2023-11-01', '2023-12-31', 1, 5, '2023-10-15', 'Active'),
    (12, 'Flood Insurance', 'Property', '2023-12-01', '2023-12-31', 1, 3, '2023-11-15', 'Active'),
    (13, 'Liability Insurance', 'General', '2023-12-01', '2023-12-31', 1, 5, '2023-12-01', 'Active'),
    (14, 'Cyber Insurance', 'Technology', '2023-12-01', '2023-12-31', 1, 2, '2023-12-05', 'Active'),
    (15, 'RV Insurance', 'Auto', '2023-12-01', '2023-12-31', 2, 20, '2023-12-10', 'Active'),
    (16, 'Homeowners Insurance', 'Property', '2023-12-01', '2023-12-31', 3, 25, '2023-12-15', 'Active'),
    (17, 'Term Life Insurance', 'Life', '2023-12-01', '2023-12-31', 5, 30, '2023-12-20', 'Active'),
    (18, 'Boat Insurance', 'Boat', '2023-12-01', '2023-12-31', 2, 10, '2023-12-25', 'Active'),
    (19, 'Commercial Auto Insurance', 'Auto', '2023-12-01', '2023-12-31', 1, 10, '2023-12-30', 'Active'),
    (20, 'Home Warranty Insurance', 'Property', '2023-12-01', '2023-12-31', 1, 5, '2023-12-31', 'Active'),
    (21, 'Travel Insurance', 'Travel', '2023-12-01', '2023-12-31', 1, 30, '2024-01-01', 'Active'),
    (22, 'Pet Insurance', 'Pet', '2023-12-01', '2023-12-31', 1, 5, '2024-01-05', 'Active'),
    (23, 'Life Insurance', 'Life', '2023-12-01', '2023-12-31', 5, 30, '2024-01-10', 'Active'),
    (24, 'Auto Insurance', 'Auto', '2023-12-01', '2023-12-31', 2, 15, '2024-01-15', 'Active'),
    (25, 'General Insurance', 'General', '2023-12-01', '2023-12-31', 1, 5, '2024-01-20', 'Active'),
    (26, 'Property Insurance', 'Property', '2023-12-01', '2023-12-31', 2, 20, '2024-01-25', 'Active'),
    (27, 'Life Insurance', 'Life', '2023-12-01', '2023-12-31', 5, 30, '2024-02-01', 'Active'),
    (28, 'Auto Insurance', 'Auto', '2023-12-01', '2023-12-31', 2, 10, '2024-02-05', 'Active'),
    (29, 'Health Insurance', 'Health', '2023-12-01', '2023-12-31', 3, 15, '2024-02-10', 'Active'),
    (30, 'Travel Insurance', 'Travel', '2023-12-01', '2023-12-31', 1, 30, '2024-02-15', 'Active');
CREATE TABLE Customer_Details (
    Cust_ID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Gender VARCHAR(10),
    DateOfBirth DATE,
    UserName VARCHAR(50),
    PassCode VARCHAR(50),
    Status VARCHAR(20)
);

INSERT INTO Customer_Details (Cust_ID, FirstName, LastName, Gender, DOB, UserName, PassCode, Status)
VALUES
   (1, 'John', 'Doe', 'Male', '1990-05-15', 'johndoe', 'password123', 'Active'),
    (2, 'Jane', 'Smith', 'Female', '1985-09-22', 'janesmith', 'securepass', 'Inactive'),
    (3, 'Bob', 'Johnson', 'Male', '1982-03-10', 'bobjohnson', '12345', 'Active'),
    (4, 'Sarah', 'Johnson', 'Female', '1995-08-18', 'sarahj', 'securepass123', 'Active'),
    (5, 'Michael', 'Williams', 'Male', '1980-12-05', 'michaelw', 'pass321', 'Inactive'),
    (6, 'Emily', 'Davis', 'Female', '1992-06-30', 'emilyd', 'davis777', 'Active'),
    (7, 'David', 'Wilson', 'Male', '1978-04-20', 'davidw', 'wilson123', 'Active'),
    (8, 'Alice', 'Miller', 'Female', '1987-03-15', 'alicem', 'miller456', 'Inactive'),
    (9, 'Daniel', 'Brown', 'Male', '1998-07-12', 'danielb', 'brown888', 'Active'),
    (10, 'Olivia', 'Jones', 'Female', '1989-10-28', 'oliviaj', 'jones99', 'Inactive');
    
    
    CREATE TABLE Customer_Authorization (
    Auth_ID INT PRIMARY KEY,
    Cust_ID INT,
    Otp INT,
    Status VARCHAR(20)
);


INSERT INTO Customer_Authorization (Auth_ID, Cust_ID, Otp, Status)
VALUES
    (1, 1, 123456, 'Active'),
    (2, 2, 654321, 'Active'),
    (3, 3, 987654, 'Inactive'),
    (4, 4, 456789, 'Active');
    
CREATE TABLE Customer_Policy (
    PolicyId INT AUTO_INCREMENT PRIMARY KEY,
    Cust_Id INT,
    Insurance_id INT,
    InsuranceAmount DECIMAL(10, 2),
    PayMode VARCHAR(20),
    InitialAmount DECIMAL(10, 2),
    RegisterDate DATE
);


INSERT INTO Customer_Policy (Cust_Id, Insurance_id, InsuranceAmount, PayMode, InitialAmount, RegisterDate)
VALUES
    (1, 1, 1000.00, 'YEARLY', 500.00, '2023-01-15'),
    (2, 2, 800.00, 'HALFYEARLY', 400.00, '2023-02-20'),
    (3, 3, 1200.00, 'QUARTERLY', 300.00, '2023-03-25'),
    (4, 4, 1500.00, 'MONTHLY', 200.00, '2023-04-30'),
    (5, 5, 1100.00, 'YEARLY', 600.00, '2023-05-15'),
    (6, 6, 900.00, 'HALFYEARLY', 500.00, '2023-06-20'),
    (7, 7, 1300.00, 'QUARTERLY', 400.00, '2023-07-25'),
    (8, 8, 1400.00, 'MONTHLY', 300.00, '2023-08-30'),
    (9, 9, 1050.00, 'YEARLY', 550.00, '2023-09-15'),
    (10, 10, 950.00, 'HALFYEARLY', 450.00, '2023-10-20');
   
