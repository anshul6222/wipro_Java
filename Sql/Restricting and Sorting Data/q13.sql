/*  Display the last names of all employees who have both an “a” and an “e” in their last name. */
SELECT
    last_name
FROM
    employees
WHERE
    last_name LIKE '%a%e%';