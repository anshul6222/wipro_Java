/*Create the EMP table based on the following table instance chart. Save the statement in a script called lab_10_03.sql , 
and then execute the statement in the script to create the table. Confirm that the table is created.
Specification-  Values
Column Name: ID, LAST_NAME, FIRST_NAME, DEPT_ID
Key Type: PK,  -,  -, FK
Nulls /Unique:  -,  Not null,  -,  -,
FK Table:   -,  -,    -, Dept
FK Column:   -,   -,  -,  ID
Data type: NUMBER, VARCHAR2, VARCHAR2, NUMBER
Length: 7, 25, 25, 7

Insert 101,Sam,Sundar,10
Insert 101,Ram,Krishna,20
Insert 102,Gopi,null,40
Insert 103,null,ram,20 */

CREATE TABLE emp (
    id           NUMBER(7),
    last_name    VARCHAR2(25)
        CONSTRAINT ln NOT NULL,
    first_name   VARCHAR2(25),
    dept_id      NUMBER(7),
    CONSTRAINT emp_pk PRIMARY KEY ( id ),
    CONSTRAINT emp_fk FOREIGN KEY ( dept_id )
        REFERENCES dept ( dept_id )
);

INSERT INTO emp VALUES (
    101,
    'SAM',
    'SUNDAR',
    10
);

/* the following query will fetch an error because of the unique constraint of the primary key adn id 101 is already present
in the table. The error is as follows:
ORA-00001: unique constraint (HR.EMP_PK) violated*/

INSERT INTO emp VALUES (
    101,
    'RAM',
    'KRISHNA',
    20
);

INSERT INTO emp VALUES (
    102,
    'GOPI',
    NULL,
    40
);

/* the following query will fetch an error because of the NOT NULL constraint of the last name column. The error is as follows:
Error report -
ORA-01400: cannot insert NULL into ("HR"."EMP"."LAST_NAME")*/

INSERT INTO emp VALUES (
    103,
    NULL,
    ram,
    20
);

