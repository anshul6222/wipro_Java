/* Create a report that displays the last name and hire date for all employees who were hired in 1994.  */
SELECT
    last_name,
    hire_date
FROM
    employees
WHERE
    hire_date LIKE '%94';