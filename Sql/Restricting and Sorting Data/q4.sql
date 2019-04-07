/* Create a report to display the last name, job ID, and hire date for employees with the last names of Matos
and Taylor.
Order the query in ascending order by the hire date. */
SELECT
    last_name   AS "Last Name",
    job_id      AS "Job Id",
    hire_date   AS "Hire Date"
FROM
    employees
WHERE
    last_name = 'Matos'
    OR last_name = 'Taylor';