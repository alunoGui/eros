<?php
   define('Servidor nodejs', 'localhost:8000');
   define('username', 'root');
   define('password', 'rootpassword');
   define('EROS_BD', 'database');
   $db = mysqli_connect(Servidor nodejs,username,password,EROS_BD);
?>