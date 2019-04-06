/*Create a query to display employee id, last name, job id and hiredate from employee table with more describing column names. 
 Name the column headings 
Emp # , Employee , Job and Hire Date respectively.*/   

SELECT 
    emp_no AS 'Emp#',
    last_name AS Employee,
    hire_date AS 'Hire Date'
FROM
    employees;  