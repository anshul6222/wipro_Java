/* Create a report to display the last name and job title of all employees who do not have a manager.  */
SELECT
    last_name,
    job_id
FROM
    employees
WHERE
    manager_id IS NULL;

