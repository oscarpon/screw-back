DROP TABLE IF EXISTS products;

DROP TABLE IF EXISTS suppliers;

CREATE TABLE `products` (
  `id_products` INT NOT NULL,
  `name_product` VARCHAR(300) NULL,
  PRIMARY KEY (`id_products`),
  UNIQUE INDEX `name_product_UNIQUE` (`name_product` ASC) VISIBLE);
  
 CREATE TABLE `suppliers` (
  `id_suppliers` INT NOT NULL,
  `name_suppliers` VARCHAR(45) NULL,
  PRIMARY KEY (`id_suppliers`),
  UNIQUE INDEX `name_suppliers_UNIQUE` (`name_suppliers` ASC) VISIBLE);
  
  INSERT INTO `products`
(`id_products`,
`name_product`)
VALUES
(85678,
'Leche desnatada');

INSERT INTO `products`
(`id_products`,
`name_product`)
VALUES
(16007,
'Leche Entera');

INSERT INTO `products`
(`id_products`,
`name_product`)
VALUES
(16008,
'Tostadas integrales');

INSERT INTO `suppliers`
(`id_suppliers`,
`name_suppliers`)
VALUES
(8437008,
"Hacendado");

INSERT INTO `suppliers`
(`id_suppliers`,
`name_suppliers`)
VALUES
(8437009,
"Central Lechera Asturiana");
