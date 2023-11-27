use hms;
drop table if exists  Patient_Report ;
CREATE TABLE Patient_Report (
    Report_Id INT PRIMARY KEY,
    pid  varchar(15) unique not NULL,
    TestCode VARCHAR(255),
    TestName VARCHAR(255),
    TestDescription TEXT,
    Cost DECIMAL(10, 2),
    Comments TEXT,
     FOREIGN KEY (pid) REFERENCES patient_master(pid),
     CHECK (TestCode LIKE 'T%'),
    CHECK (LENGTH(TestName) >= 5),
    CHECK (Cost >= 50)
);