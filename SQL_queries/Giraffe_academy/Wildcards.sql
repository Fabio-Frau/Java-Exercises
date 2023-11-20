-- % = any # characters, _ = one character

-- Find any client's who are an LLC
SELECT *
FROM client
WHERE client_name LIKE '%LLC';

-- Find any branch supplier who are in the label business
SELECT *
FROM branch_supplier
WHERE supplier_name LIKE '%Label%';

-- Find any employee born in October
SELECT *
FROM employee
WHERE birth_date LIKE '____-10-__';

-- Alternative way
SELECT *
FROM employee
WHERE birth_date LIKE '____-10%';

-- Find any client who are schools
SELECT *
FROM client
WHERE client_name LIKE '%school%';