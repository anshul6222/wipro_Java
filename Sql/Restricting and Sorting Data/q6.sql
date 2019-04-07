/* List employees who earn between $5,000 and $12,000, and are in department 20 or 50. Label the columns as
Employee and Monthly Salary, respectively.  */

SELECT
    first_name
    || ' '
    || last_name AS employee,
    salary   AS "Monthly Salary"
FROM
    employees
WHERE
    salary BETWEEN 5000 AND 12000
    AND department_id = 20
    OR department_id = 50;