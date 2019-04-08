/* Insert one record without listing the column names in the insert statement. Check whether data is inserted
Eg:
employee_id    first_name    last_name    department_id     salary
201             Michael       Hartstein      20          13000  */

INSERT INTO my_employee 
    SELECT
        employee_id,
        first_name,
        last_name,
        department_id,
        salary
    FROM
        employees
    WHERE
        employee_id = 201;

SELECT
    *
FROM
    my_employee;

