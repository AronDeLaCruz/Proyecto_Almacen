# Proyecto_Almacen
Proyecto final para el curso Sistema de Información
Actualmente en fase de prototipado, estoy revisando 
que clases implementar, pero al menos la mayor 
parte del código base está hecho

Además de ver la interfaz(y el front-end en general)
que estará hecha en angular 
Para descargar cambiar a rama/branch completado que no sé cómo hacer merge v:

Pasos para que está cosa funcione

1.Instalar MySQL
  --https://dev.mysql.com/downloads/installer/
  --Se elige workbench y MySQserver
  --Si esto es insuficiente (posiblemente sí) mando el enlace de udemy o lo grabo
  --La contraseña será admin, el acceso es el predeterminado root

2.Instalar apache NetBeans
  --Abrir la carpeta del proyecto con abrir proyecto
  --Luego click derecho en la pestaña izquierda y pulsar la opción clean and build
  --Se puede hacer en otros IDE pero me da flojera probar
  --Saldra un error en donde la palabra "aot" aparece en algún punto. De ser así ignorar y seguir adelante. Delo contrario consultar

3.De vuelta a MySQL
  --Intentare crear un doc ala bak para reconstruir la BD o 
    un query, será en un par de días, caso contrario enviaré el diagrama 
    para crear las clases necesarias
  --[SQL Almacen.zip](https://github.com/AronDeLaCruz/Proyecto_Almacen/files/6882353/SQL.Almacen.zip)
  --Se descomprime en una carpeta y luega se eliga la opcion server/data import
  --No he probado esto asi que no se que pasara. avisar cualquier error


4.Otra vez en apache
  --En la misma pestaña a la izquierda donde están los archivos de la clase
    buscar la pestaña service, en caso contrario buscar en las opciones de 
    la parte superior, está en las 3 últimas de la derecha
  --Buscar la opción database, hacer click derecha para que salga la opcion nueva conexion
  --Luego aparecerá un cuadro, agregar el driver(archivo) de conexión
    con MySQL [conector.zip](https://github.com/AronDeLaCruz/Proyecto_Almacen/files/6882297/conector.zip)
  --Se completa los datos(Database:almacen,password:admin,marcar recordar contraseña y el resto se deja igual)
  --En JDBC(URL) se agrega al ultimo &allowPublicKeyRetrieval=true&useSSL=false&useTimezone=true&serverTimezone=UTC
  --Se vuelve a dar next(Sin schema)
  --Se borra "[root on Default schema]" y se agrega otra vez lo que pusimos en JDBC(URL)
  --Se finaliza
  --Para correr el archivo se va a Source Package/com.prueba.prototipo/PrototipoApplication.java. Se da click derecho y run file
  --De otra forma se bugea y da error de no detectar la main class
  --PROFIT
  

  
