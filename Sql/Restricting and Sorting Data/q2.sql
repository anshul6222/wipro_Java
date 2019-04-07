/* Create a report that displays the last name and department number for employee number 176. */

SELECT
    last_name,
    department_id
FROM
    employees
WHERE
    employee_id = 176;