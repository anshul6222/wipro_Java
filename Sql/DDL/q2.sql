/* Populate the DEPT table with data from the DEPARTMENTS table. Include only columns that you need.
Insert dept Id 10 and Name Accounts
Insert dept Id as null and Name as TT
Correct by giving 20 and TT
Insert A1 as Id and Accounts
Correct by giving 30 and Accounts */

INSERT INTO dept VALUES (
    10,
    'Accounts'
);

INSERT INTO dept VALUES (
    20,
    'TT'
);

INSERT INTO dept VALUES (
    1,
    'Accounts'
);

/* the following query will give an error because of unique constraint in departments table. The error is as follows:
INSERT INTO dept
    SELECT
        department_id,
        department_name
    FROM
        departments
Error report -
ORA-00001: unique constraint (HR.PK_DEPT) violated*/


UPDATE dept
SET
    dept_id = 30
WHERE
    dept_id = 1;

INSERT INTO dept
    SELECT
        department_id,
        department_name
    FROM
        departments;

