/* Display the last name, job, and salary for all employees whose
jobs are either those of a sales representative or of a stock clerk,
and whose salaries are not equal to $2,500, $3,500, or $7,000.  SA_REP ST_CLERK */

SELECT
    last_name,
    job_id,
    salary
FROM
    employees
WHERE
    job_id = 'SA_REP'
    OR job_id = 'ST_CLERK'
    AND salary NOT IN (
        2500,
        3500,
        7000
    );