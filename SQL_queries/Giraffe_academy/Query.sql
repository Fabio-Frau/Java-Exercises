SELECT * FROM USER;

SELECT * FROM userdetails;

SELECT * FROM USER, userdetails 
WHERE userdetails.userId = USER.id;

SELECT * FROM `user` AS u
 JOIN userdetails AS ud
 ON u.id = ud.userId;
 
 SELECT * FROM `user` AS u
 LEFT JOIN userdetails AS ud
 ON u.id = ud.userId;
 
  SELECT * FROM `user` AS u
RIGHT JOIN userdetails AS ud
 ON u.id = ud.userId;
 
 
 SELECT * FROM USER AS u 
 LEFT JOIN orders AS o
 ON o.userId = u.id;
 
 
 SELECT u.*, COUNT(u.id)
  FROM USER AS u
   LEFT JOIN orders AS o
	 ON o.userid = u.id
	 GROUP BY u.id;
	 
SELECT u.*, COUNT(o.id) AS numberOfOrders
FROM USER AS u
LEFT JOIN orders AS o
ON o.userId = u.id
GROUP BY u.id;


SELECT u.id, u.name, u.surname, u.email, COUNT(o.id) AS numberOfOrders
FROM user AS u
LEFT JOIN orders AS o
ON o.userId = u.id
GROUP BY u.id;

SELECT u.id, u.name, u.surname, u.email, COUNT(o.id) AS numberOfOrders
FROM user AS u
RIGHT JOIN orders AS o
ON o.userId = u.id
GROUP BY u.id;


SELECT u.id, u.name, u.surname, u.email, ud.favoriteAnimal , ud.longDescription , COUNT(o.id) AS numberOfOrders
FROM user AS u
LEFT JOIN orders AS o
ON o.userId = u.id
LEFT JOIN userdetails AS ud
ON ud.userId = u.id
GROUP BY u.id
ORDER BY numberOfOrders DESC;


SELECT * FROM(
	SELECT u.id, u.name, u.surname, u.email, ud.favoriteAnimal , ud.longDescription , COUNT(o.id) AS numberOfOrders
	FROM user AS u
	LEFT JOIN orders AS o
	ON o.userId = u.id
	LEFT JOIN userdetails AS ud
	ON ud.userId = u.id
	GROUP BY u.id
	ORDER BY numberOfOrders DESC
) AS orderData
WHERE numberOfOrders > 2;

UPDATE userdetails
SET goodBuyer = 1
WHERE userId IN ( 
SELECT id FROM(
	SELECT u.id, u.name, u.surname, u.email, ud.favoriteAnimal , ud.longDescription , COUNT(o.id) AS numberOfOrders
	FROM user AS u
	LEFT JOIN orders AS o
	ON o.userId = u.id
	LEFT JOIN userdetails AS ud
	ON ud.userId = u.id
	GROUP BY u.id
	ORDER BY numberOfOrders DESC
) AS orderData
WHERE numberOfOrders > 2
);



SELECT *
FROM orders AS o
LEFT JOIN orderItems AS oi
ON oi.orderId = o.id;


SELECT o.*, COUNT(oi.id)
FROM orders AS o
LEFT JOIN orderItems AS oi
ON oi.orderId = o.id
GROUP BY o.id;



SELECT o.*, COUNT(oi.id) AS itemDiversity, SUM(oi.itemQuantity) AS itemQuantity
FROM orders AS o
LEFT JOIN orderItems AS oi
ON oi.orderId = o.id
GROUP BY o.id;

SELECT *
FROM orders AS o
LEFT JOIN orderItems AS oi
ON oi.orderId = o.id
LEFT JOIN items AS i
ON i.id = oi.id;

SELECT *
FROM items AS i
LEFT JOIN orderItems AS oi
ON oi.itemId = i.id
LEFT JOIN orders AS o
ON o.id = oi.orderId;


SELECT i.*, SUM(oi.itemQuantity) AS sellQuantity
FROM items AS i
LEFT JOIN orderItems AS oi
ON oi.itemId = i.id
GROUP BY i.id;


SELECT i.*, SUM(oi.itemQuantity) AS sellQuantity, SUM(oi.itemQuantity)*i.price AS income
FROM items AS i
LEFT JOIN orderItems AS oi ON oi.itemId = i.id
GROUP BY i.id;


SELECT SUM(income) FROM (
	SELECT i.*, SUM(oi.itemQuantity) AS selleQuantity, SUM(oi.itemQuantity)*price AS income
	FROM items AS i
	LEFT JOIN orderItems AS oi ON oi.itemId = i.id
	GROUP BY i.id) AS inc;
	

SELECT * 
FROM user AS u
LEFT JOIN orders AS o ON o.userid = u.id
LEFT JOIN orderItems AS oi ON oi.orderId = o.id
LEFT JOIN items AS i ON i.id = oi.itemId;


SELECT u.*, SUM(oi.itemQuantity), COUNT(oi.id) AS itemDiversity
FROM user AS u
LEFT JOIN orders AS o ON o.userId = u.id
LEFT JOIN orderItems AS oi ON oi.orderId = o.id
LEFT JOIN items AS i ON i.id = oi.itemId
GROUP BY u.id;


SELECT id, NAME, surname, SUM(income) FROM(
	SELECT( u.*, SUM(oi.itemQuantity) AS quantity, SUM(oi.itemQuantity) * i.price AS income, COUNT(oi.id) AS itemDiversity
	FROM user AS u
	LEFT JOIN orders AS o ON o.userid = u.id
	LEFT JOIN orderitems AS oi ON oi.orderId = o.id
	LEFT JOIN items AS i ON oi.itemId = i.id
	GROUP BY u.id, i.id
) AS incomeTable
GROUP BY incomeTable.id;








	 
	 
	