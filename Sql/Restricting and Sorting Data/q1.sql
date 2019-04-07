*Create a report that displays the last name and salary of employees who earn more than $12,000.*/

SELECT
    last_name,
    salary
FROM
    employees
WHERE
    salary > 12000;