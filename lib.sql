USE libraryinformation;
SET FOREIGN_KEY_CHECKS=0;
DELETE FROM BookIssue;
INSERT into BookIssue values('2016-01-15','B123','E123','2016-04-03');
INSERT into BookIssue values('2016-02-05','B124','E124','2016-03-10');
INSERT into BookIssue values('2016-05-15','B125','E125','2016-08-03');
INSERT into BookIssue values('2016-09-10','B126','E126','2016-12-15');
INSERT into BookIssue values('2016-10-05','B127','E127','2016-10-10');
DELETE FROM bookReturn;
INSERT into BookReturn values('2016-04-03','B123','E321','2016-01-15');
INSERT into BookReturn values('2016-03-10','B124','E321','2016-02-05');
INSERT into BookReturn values('2016-08-03','B126','E128','2016-05-15');
INSERT into BookReturn values('2016-12-15','B125','E128','2016-09-10');
INSERT  into titles values('T128','Go DBMS11','S124','P124');
INSERT  into titles values('T134','Go DBMS12','S124','P124');
INSERT into titles values('T127','Go DBMS21','S125','P125');
INSERT into titles values('T135','Go DBMS22','S125','P125');
INSERT into titles values('T131','Go DBMS31','S126','P126');
DELETE FROM members_details;
INSERT into members_details values('E321','karthik','E-45 PIC','chennai','stu');
INSERT into members_details values('E124','manish','B-45 malvi park','Kanpur','F');
INSERT into members_details values('E128','manisha','B-99 krishna nagar','shimla','F');
INSERT into members_details values('E123','raj','A-32 raja park','delhi','stu');
INSERT into members_details values('E129','riya','B-32 rani park','punjab','stu');
INSERT into members_details values('E143','priyanka','A-66 bani park','jaipur','other');
INSERT into members_details values('E154','rishabh','A-69 raja park','goa','other');
DELETE FROM Book;
ALTER TABLE Book
DROP title_id;
ALTER TABLE Book
ADD title_id VARCHAR(10);
INSERT into Book values('B123','1995-05-13',250,1,'T128');
INSERT into Book values('B124','1995-05-13',230,0,'T134');
INSERT into Book values('B125','2000-05-13',300,1,'T127');
INSERT into Book values('B126','1998-05-13',550,0,'T135');
INSERT into Book values('B222','1995-05-13',250,1,'T128');
INSERT into Book values('B333','1995-05-13',230,0,'T134');
INSERT into Book values('B444','2000-05-13',300,1,'T127');
INSERT into Book values('B555','1998-05-13',550,0,'T134');
INSERT into authors values('A124','R C sharma');
INSERT into authors values('A125','R K Meena');
INSERT into authors values('A126','N P narayana');
INSERT into title_author values('T128','A123');
INSERT into title_author values('T134','A123');
INSERT into title_author values('T127','A124');
INSERT into title_author values('T135','A124');
INSERT into title_author values('T131','A126');





/* Problem 1  */

/*1)*/ SELECT member_name,BI.member_id,title_id,BI.accession_num,due_date,BI.issue_dt,(DATEDIFF(BR.return_dt,BR.issue_dt)/30) AS issued_months
FROM bookIssue BI
INNER JOIN Book B
ON B.accession_num=BI.accession_num
INNER JOIN members_details m
ON m.member_id = BI.member_id
INNER JOIN bookReturn BR
ON BR.accession_num=BI.accession_num
WHERE DATEDIFF(BR.return_dt,BR.issue_dt)>60
ORDER BY m.member_name;

/*2)*/  SELECT member_name ,LENGTH(member_name) AS maxlength
FROM members_details
WHERE (SELECT MAX(LENGTH(member_name))FROM members_details)= LENGTH(member_name) ;


/*3)*/ SELECT COUNT(issue_dt) AS totalBookIssued FROM bookReturn;


/*problem 2*/


/*1)*/ SELECT subject_name,s.subject_id,COUNT(s.subject_id) AS NoOfBooksPurchased
FROM subjects s
INNER JOIN titles t
ON t.subject_id=s.subject_id
GROUP BY t.subject_id;


/*2)*/ SELECT issue_dt,accession_num,member_id,due_date
FROM bookIssue 
WHERE DATEDIFF(due_date,issue_dt) >60;


/*3)*/  SELECT * FROM Book
WHERE price>(SELECT MIN(price) FROM Book);



/*problem 3*/


/*1)*/ SELECT category, COUNT(category) AS totalMembers
FROM members_details
GROUP BY category;

/*2)*/ SELECT b.title_id,t.title_name,COUNT(b.title_id) AS total_purchased
FROM Book b
INNER JOIN titles t
ON b.title_id=t.title_id
GROUP BY b.title_id;


/*3)*/ SELECT issue_dt,accession_num,b.member_id,due_date,m.category
FROM bookIssue b
INNER JOIN members_details m
ON b.member_id=m.member_id
WHERE m.category NOT IN('F');

/*4)*/ SELECT a.author_id,author_nm,COUNT(t.author_id) AS total_books_purchased
FROM title_author t
INNER JOIN Book b
ON b.title_id=t.title_id
INNER JOIN authors a
ON a.author_id = t.author_id
GROUP BY t.author_id
HAVING total_books_purchased >1;
















