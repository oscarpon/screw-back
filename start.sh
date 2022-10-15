#!/bin/bash
echo "Compilando backend..."
mvn -f screw -P docker clean install
echo "Compilación terminada!"
echo "Arrancando proyecto con docker"
docker-compose up
