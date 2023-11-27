create database infinite_august23;
use infinite_august23;
-- Create the employ table
CREATE TABLE employ (
    Empno INT PRIMARY KEY,
    name VARCHAR(255),
    gender VARCHAR(10),
    dept VARCHAR(50),
    desig VARCHAR(50),
    basic DECIMAL(10, 2)
);
-- Insert data into the employ table
INSERT INTO employ (Empno, name, gender, dept, desig, basic)
VALUES
    (1, 'rahul', 'male', 'java', 'ASE', 76456.00),
    (2, 'Ganesh', 'male', 'Dotnet', 'Expert', 77223.00),
    (3, 'sonali sahu', 'female', 'sql', 'expert', 79999.00),
    (4, 'Kaushik', 'male', 'Sql', 'Manager', 78255.00),
    (5, 'Shivangi', 'female', 'Sql', 'Expert', 78244.00),
    (6, 'sourav', 'male', 'java', 'programmer', 69453.00),
    (7, 'SatyaPrakash', 'male', 'Sql', 'DBA', 89422.00),
    (8, 'Tanya Arora', 'female', 'Dotnet', 'Manager', 87742.00),
    (9, 'satya', 'male', 'java', 'ASE', 76598.00),
    (10, 'piyush', 'male', 'JAVA', 'developer', 50000.00);