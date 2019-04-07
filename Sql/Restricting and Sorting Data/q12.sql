/*  Display all employee last names in which the third letter of the name is “a”.*/

SELECT
    last_name
FROM
    employees
WHERE
    last_name LIKE '__a%';