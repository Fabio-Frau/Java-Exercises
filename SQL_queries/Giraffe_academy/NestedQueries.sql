-- Nested queries

-- Find names of all employees who have sold over 30000 to a single client

SELECT employee.first_name, employee.last_name
FROM employee
WHERE employee.emp_id IN (
	SELECT works_with.emp_Id
	FROM works_with
	WHERE works_with.total_sales >= 30000
);

-- Find all clients who are handled by the branch that Michael Scott manages
-- assume you know Michael's ID

SELECT client.client_name
FROM client
WHERE client.branch_id = (
	SELECT branch.branch_id 
	FROM branch 
	WHERE branch.mgr_id = 102
);

-- Alternative way not knowing Michael's ID
SELECT client.client_name
FROM client
WHERE client.branch_id = (
	SELECT branch.branch_id 
	FROM branch 
	WHERE branch.mgr_id = (
		SELECT employee.emp_id
		FROM employee
		WHERE first_name = 'Michael' AND last_name = 'Scott'
	)
);