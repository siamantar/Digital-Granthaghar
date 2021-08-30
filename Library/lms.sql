BEGIN TRANSACTION;

CREATE TABLE IF NOT EXISTS "librarian" (
	"id"	INTEGER,
	"name"	varchar(100) NOT NULL,
	"password"	varchar(100) NOT NULL,
	"email"	varchar(100) NOT NULL,
	"address"	varchar(200) NOT NULL,
	"city"	varchar(100) NOT NULL,
	"contact"	varchar(20) NOT NULL,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "issuebooks" (
	"id"	INTEGER,
	"bookcallno"	varchar(50) NOT NULL,
	"studentid"	int NOT NULL,
	"studentname"	varchar(50) NOT NULL,
	"studentcontact"	varchar(20) NOT NULL,
	"issueddate"	timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "books" (
	"id"	INTEGER,
	"callno"	varchar(100) NOT NULL UNIQUE,
	"name"	varchar(100) NOT NULL,
	"author"	varchar(100) NOT NULL,
	"publisher"	varchar(100) NOT NULL,
	"quantity"	int NOT NULL,
	"issued"	int NOT NULL DEFAULT 0,
	"added_date"	timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY("id" AUTOINCREMENT)
);

INSERT INTO "librarian" ("id","name","password","email","address","city","contact") VALUES (1,'Prabhakar','ppp','prabhakar@gmail.com','javatpoint','noida','9998328238'),
 (2,'sumedh','sumesh','sumesh@gmail.com','Kuch Bhi','noida','93823932823'),
 (3,'abhi','abhi','abhi@gmail.com','javatpoint','noida','92393282323'),
 (4,'asd','asd','kjb','kjnb','kljn','lkjn');
INSERT INTO "issuebooks" ("id","bookcallno","studentid","studentname","studentcontact","issueddate") VALUES (4,'A@4',23,'kk','932992932','2016-07-19 18:43:16'),
 (6,'A@4',335,'Sumedh','95676565756','2016-07-19 18:44:34'),
 (7,'A@4',87,'abhishek','9329882382','2016-07-19 18:46:12'),
 (8,'A@4',1234,'asd','345345345','2020-12-22 06:47:02');
INSERT INTO "books" ("id","callno","name","author","publisher","quantity","issued","added_date") VALUES (1,'A@4','C In Depth','Shrivastav','BPB',1,3,'2016-07-19 19:37:56'),
 (2,'B@1','DBMS','Korth','Pearson',3,0,'2016-07-18 18:39:52'),
 (3,'G@12','Let''s see','Yashwant Kanetkar','BPB',10,0,'2016-07-18 23:02:14'),
 (4,'A@12','asd','asdf','asdfa',1,0,'2020-12-19 05:38:32'),
 (5,'Z@9','english 2nd','none','unknown',5,0,'2020-12-20 16:36:04');
 (6,'Z@10','english 2nd','none','unknown',5,0,'2020-12-20 16:36:04');
 
COMMIT;
