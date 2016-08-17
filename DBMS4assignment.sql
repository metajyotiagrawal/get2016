INSERT into BookIssue values('2016-01-15','B124','E143','2016-01-10');
INSERT into BookIssue values('2016-01-10','B123','E154','2016-03-03');
INSERT into BookIssue values('2016-01-12','B125','E321','2016-08-10');




/*problem1*/

/*1)*/SELECT member_name
FROM members_details
WHERE (category=(SELECT category
FROM members_details
WHERE member_name='manish'));

/*2)*/SELECT m.member_name,BI.issue_dt,BI.due_date,t.title_name,return_dt
FROM BookIssue BI
INNER JOIN members_details m
ON m.member_id=BI.member_id
INNER JOIN Book b
ON b.accession_num=BI.accession_num
INNER JOIN BookReturn BR
ON BR.accession_num=BI.accession_num
INNER JOIN titles t
ON b.title_id=t.title_id
WHERE DATEDIFF(BR.return_dt,BI.due_date)>0;


/*3)*/SELECT m.member_name,BI.issue_dt,BI.due_date,b.title_id
FROM BookIssue BI
INNER JOIN members_details m
ON m.member_id=BI.member_id
INNER JOIN Book b
ON b.accession_num=BI.accession_num
INNER JOIN BookReturn BR
ON BR.accession_num=BI.accession_num
WHERE EXISTS (SELECT accession_num FROM BookIssue WHERE BI.accession_num=BR.accession_num);

/*4)*/SELECT accession_num,purchase_date,price,status
FROM Book
WHERE price=(SELECT MAX(price) FROM Book);

/*5)*/SELECT accession_num,price FROM Book
WHERE price=(SELECT MAX(price) FROM Book WHERE price<(SELECT MAX(price) FROM Book));

/*problem 2*/


/*1)*/ CREATE VIEW member_view
AS
SELECT member_name,BI.accession_num,BI.issue_dt,BR.return_dt,BI.due_date
FROM BookIssue BI
INNER JOIN BookReturn BR
ON BI.accession_num=BR.accession_num
INNER JOIN members_details m
ON BI.member_id=m.member_id;

SELECT  member_name,accession_num,issue_dt,return_dt,due_date FROM member_view;

/*2)*/  CREATE VIEW member_view2
AS
SELECT member_name ,member_id,
CASE category
WHEN 'F' THEN 'Faculty'
WHEN 'stu' THEN 'Student'
WHEN 'other' THEN 'others'
END
FROM members_details ;
SELECT * FROM member_view2;


/*3)*/  CREATE VIEW overallView
AS
SELECT subject_name,title_name,member_name,category,BI.issue_dt, return_dt,BI.due_date
FROM BookIssue BI
INNER JOIN members_details m
ON BI.member_id=m.member_id

INNER JOIN Book b
ON b.accession_num=BI.accession_num
INNER JOIN titles t
ON t.title_id= b.title_id
INNER JOIN subjects s
ON s.subject_id=t.subject_id
LEFT JOIN bookReturn BR
ON BR.issue_dt = BI.issue_dt;
SELECT * from overallView;

