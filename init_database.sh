#!/bin/bash
mysql -h 0.0.0.0 -P 3306 -u opbaquero -p springdb < ./scripts/init.sql
