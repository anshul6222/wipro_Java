/* /* Create a query to display the last name, job ID, hire date, and employee ID for each employee, 
with the employee ID appearing first.
Provide an alias STARTDATE for the HIRE_DATE column.*/

SELECT 
    emp_no, last_name, hire_date AS STARTDATE
FROM
    employees;