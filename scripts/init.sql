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
