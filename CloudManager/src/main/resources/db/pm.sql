CREATE table adminInfo (adminNo NUMERIC(10) PRIMARY KEY AUTO_INCREMENT, adminId VARCHAR(20) NOT NULL, adminPassword VARCHAR(20) NOT NULL, adminName VARCHAR(20) NOT NULL);
--SET WRITE_DELAY 20
--SET SCHEMA PUBLIC
insert into adminInfo (adminNo, adminId,adminPassword) values(1,"admin","0000");