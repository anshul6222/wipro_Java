/* Create a query to update Last_name of emp 202 to Higgins. */

UPDATE my_employee
SET
    last_name = 'Higgins'
WHERE
    employee_id = 202;