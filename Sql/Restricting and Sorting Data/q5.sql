/* Display the last name and department ID of all employees in departments 20 or 50
in ascending alphabetical order by name. */

SELECT
    last_name,
    department_id
FROM
    employees
WHERE
    department_id = 20
    OR department_id = 50
ORDER BY
    last_name;
    


