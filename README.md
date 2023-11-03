# apiRest-SecurityJWT-token
Previamente en la bd debe existir cualquier usuarios, y la clave que le vas a colocar es 
$2a$10$e59rGaFvpijWXLh03j0aZOzBYQNrIRIjlB8sGwLvBL35fecblsW1m
que es igual a la palabra "password", sin las comillas

Para obtener el token desde postman
Post localhost:8080/login

en el Body, seleccionar raw y al final seleccionar JSON

{
    "email":"alexander@gmail.com",
    "password":"password"
}

En los header de respuestas te traera el token que luego pordras utilizar. Ejmeplo: Bearer eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJhY2hhbGVAYmN2Lm9yZy52ZSIsImV4cCI6MTY5Nzk4NTUyMCwibm9tYnJlIjoiYWxleGFuZGVyIn0.dkYtrLIOu9Jc4GCmAd40vkmX5zvoatR0YTGCoc_dRRADV5JYv8ARXotoYeJb2r2
siendo el token todo lo que esta despues de Bearer

Por ejemplo:

Get http://localhost:8080/api/users/listUsers

Authorization Type Bearer Token   eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJhY2hhbGVAYmN2Lm9yZy52ZSIsImV4cCI6MTY5Nzk4NTUyMCwibm9tYnJlIjoiYWxleGFuZGVyIn0.dkYtrLIOu9Jc4GCmAd40vkmX5zvoatR0YTGCoc_dRRADV5JYv8ARXotoYeJb2r2

