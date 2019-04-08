/* Create a query to increase salary by 10% for all employees in dept 90. */

UPDATE my_employee
SET
    salary = salary + (.1 * salary )
WHERE
    department_id = 90;