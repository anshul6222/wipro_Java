/*  Delete employees whose name either first or last name has char seq of ‘man’ */

DELETE FROM my_employee
WHERE
    first_name LIKE '%man%'
    OR last_name LIKE '%man%';