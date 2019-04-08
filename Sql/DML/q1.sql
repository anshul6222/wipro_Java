/* Run the below script
Create table MY_EMPLOYEE 
as
Select employee_id,first_name,last_name,department_id,salary from EMPLOYEES where 1=2;  */

CREATE TABLE my_employee
    AS
        SELECT
            employee_id,
            first_name,
            last_name,
            department_id,
            salary
        FROM
            employees
        WHERE
            1 = 2;