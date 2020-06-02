/*Ishita Kapur, UTA ID: 1001753123*/
/*3.  Write a query that will prepare a report for weekly Borrowing activity by Subject area, by Author, number of copies and number of days loaned out.*/
select Subject, Author_Name, isbn_copies_days.Copies_Loaned, isbn_copies_days.Days_Loaned
from book JOIN (select issue_book.ISBN as i_isbn, count(issue_book.ISBN) as Copies_Loaned, FLOOR(SUM(TIME_TO_SEC(TIMEDIFF(IFNULL(Return_Date, CURDATE()), Issue_Date)) / (3600 * 24))) as Days_Loaned
from issue_book
where issue_book.Issue_Date between adddate(now(),-7) and now()
group by issue_book.ISBN
order by issue_book.ISBN) as isbn_copies_days on book.isbn = isbn_copies_days.i_isbn
JOIN author on isbn_copies_days.i_isbn = author.isbn;