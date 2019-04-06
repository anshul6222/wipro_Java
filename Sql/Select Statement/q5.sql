/* Create a report of all employees and their job IDs.
 Display the last name concatenated with the job ID (separated by a comma and space) and name the column as "Employee and Title"*/
 
 SELECT 
    CONCAT(last_name, job_id) AS 'Employee and Title'
FROM
    employees;
 