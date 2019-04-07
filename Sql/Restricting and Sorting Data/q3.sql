/* To find high-salary and low-salary employees.
Create a query to display the last name and salary for any employee whose salary
is not in the range of $5,000 to $12,000 */    

SELECT
    last_name,
    salary
FROM
    employees
WHERE
    salary NOT BETWEEN 5000 AND 12000;