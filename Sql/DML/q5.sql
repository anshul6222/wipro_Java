/* Insert one record with listing the column names avoiding salary column in the
insert statement where salary value remain undetermined. Check whether data is inserted
employee_id first_name last_name department_id salary
201       Michael        Hartstein   20          13000
202       Pat             Fay          20         (null)
203       Susan           Mavris        40        (null) */

INSERT INTO my_employee (
    employee_id,
    first_name,
    last_name,
    department_id
) VALUES (
    203,
    'Susan',
    'Marvis',
    40
);

/*checking*/

SELECT
    *
FROM
    my_employee;