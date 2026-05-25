\# Registro de Organización y Pair Programming

\#\# 1\. Integrantes del Equipo  
\* \*\*Alumno A (Identificador):\*\* ATALAYA LÓPEZ, ADRIÁN.  
\* \*\*Alumno B (Identificador):\*\* JIMÉNEZ RAMÍREZ, DANIEL.

\#\# 2\. Bitácora de Turnos de Programación

Describir fielmente qué partes exactas del código Java (métodos,  
clases o lógicas del menú) se teclearon en cada bloque bajo la autoría  
del conductor de turno:

\* \*\*Turno 1 (Conductor ADRIÁN ):\*\* : Se comenzó a realizar la clase mensaje, terminamos los atributos, constructores y empezamos con los métodos, hemos llegado hasta encriptar el cual estamos intentando realizar.

\* \*\*Turno 2 (Conductor DANIEL):\*\* Se implementaron los algoritmos del método reverse() y el desplazamiento de caracteres para la encriptación. Dedicamos todo este turno (45 minutos) a analizar el funcionamiento de dicho método y a evaluar las estructuras de datos disponibles. Finalmente nos decantamos por un array. Daniel realizó la mitad de la lógica y terminó su turno.

\* \*\*Turno 3 (Conductor  ADRIÁN ):\*\*  Adrián continuó con el método reverse y finalmente después de 15 min más terminamos este método. Analizamos el funcionamiento del método encriptar, para ver cómo podemos hacer en caso de superar la última letra del abecedario (z). Para ello caímos en que la mejor opción era trabajar con datos tipo char y para "dar la vuelta hacia delante (A) deberíamos restar 26 que es el total de letras del abecedario para ello. Terminamos el encriptar y cambiamos de piloto

\* \*\*Turno 4 (Conductor Daniel):\*\* : Ya con el método encriptar, Daniel escribió el inverso a encriptar que sería el desencriptar cuyo funcionamiento es el mismo pero al revés (tardamos unos 12 min en ello). Ya pensamos que teníamos la clase hecha, por ello volvimos a leer por si se nos olvidaba algo. Nos dimos cuenta de que el getFecha se nos había pasado y tuvimos que ir a las apis para recordar cómo funcionaba esta clase. Y también que el mensaje de base tiene que estar encriptado por lo que lo modificamos en getMensaje.

\* \*\*Turno 5 (Conductor Adrián):\*\*: Ya con la clase realizada pasamos a la clase Cola, la cual nos llama la atención ya que al leer que recibe un objeto genérico nos resulta extraño ya que lo que pensamos a primera vista es que sería un objeto de la clase mensaje. Rellenamos el atributo, constructor y métodos, el único que nos generó un poco más de dudas es el sacarDeCola porque no sabíamos si crear un nuevo objeto vacío en caso de no haber nada pero vimos que era innecesario. Por ello, optamos por una solución más limpia: realizar un control de errores previo y devolver simplemente null si la cola no contiene elementos.

\* \*\*Turno 6 (Conductor Daniel):\*\* Empezamos a analizar las distintas cosas que vamos a necesitar, primero que para el menú teníamos pensado utilizar la estructura switch y para la entrada de datos hemos pensado en usar BufferedReader para no depender de la clase leer. Pasamos al algoritmo, y empezamos a escribir la parte visual del menú seguido de esto pasamos al primer filtro que lo realizamos haciendo que el usuario no pueda introducir ningún número / carácter que no sea 1,2,3,4 que son las opciones del menú, creamos una variable para detectar que los datos que se van introduciendo sean los correctos esto lo hacemos.  

\* \*\*Turno 7 (Conductor Adrián):En esta fase, pasamos a implementar el primer caso del menú principal (case 1), correspondiente al envío instantáneo. Para ello, simplemente realizamos una llamada al constructor por defecto de la clase Mensaje, el cual inicializa automáticamente los atributos con los valores predeterminados de la práctica y añadimos el objeto resultante de forma directa a la cola mediante el método meterEnCola(). (esto nos lleva unos 20 minutos). Y empezamos a realizar el case 2 , para ellos nos planteamos varias opciones o dejar que en caso de que se equivoque el usuario ya que en las especificación si el usuario dejo un dato sin rellenar es erróneo, en este caso hacer que se vuelva al menú directamente o dejarle permitir que vuelva a introducir los datos. Finalmente creemos que la mejor opción es dejarle al usuario que introduzca los datos de nuevo ya que seria lo que mas nos gustaria que no hicieran a nosotros en esta situación.

\* \*\*Turno 8 (Conductor Daniel)**:**En el caso 2 introducimos los datos por teclado (Usuario, IP y Texto del mensaje). En caso de que algún campo se quede vacío, nos saltará un aviso diciendo que falta algún campo por rellenar y nos volverá a pedir los datos. Si todos los datos son correctos salvo si la ip es errónea se pone la por defecto declarada en el constructor, creamos un nuevo objeto Mensaje, lo metemos en la cola de mensajes, nos avisa por pantalla de que el mensaje ha sido metido en la cola y cambia la variable para poder salir del bucle. En el case 3, creamos una variable la cual saca un mensaje de la cola. Luego comprobamos si hay mensajes en la cola, si la cola está vacía sacará un mensaje por pantalla diciendo que la cola está vacía y si hay mensajes dentro pues nos sacará por pantalla la información de los datos introducidos (Usuario, fecha, ip y texto).

\* \*\*Turno 9  (Conductor Adrián): Ya solo nos quedaba terminar la opción 4, la cual es muy parecida a ejercicios anteriores o como el que realizamos en el examen , es decir un filtro, al igual que con el caso 2 también queremos que se repita hasta que la persona introduzca una respuesta que sea válida ( s o n). Como en el resto de casos también captura el posible error de desconexión con el teclado. Y una vez realizado esto termina el turno de Adrián, ahora Daniel se pondrá a probar el programa.

\* \*\*Turno 10  (Conductor Daniel): En este turno Daniel ha hecho las distintas pruebas del programa. Pruebas realizadas:

1. A iniciar el programa pide seleccionar una opción  
   1. Introducir un número que no sea del 1 al 4 → OK vuelve a salir el menú  
   2. Introducir una letra en vez de numeros → OK vuelve a salir el menú  
   3. Introducir caracteres especiales como (á, \#,$,’’) → OK vuelve a salir el menú  
2. Enviar mensaje instantáneo  
   1. Si no creas un mensaje primero se enviará lo establecido en el constructor que sería (Usuario: System, fecha: fecha del dia que sea, IP: 192.254.0.1, Texto: Por defecto)  
3. Enviar mensaje  
   1. Introducción usuario  
      1. Puedes meter cualquier cosa. Letras, caracteres, números, etc..  
   2. Introduccion IP:  
      1. Si introducimos una IP incorrecta, o algún carácter o letra → OK Devuelve IP por defecto establecida en el constructor.  
4. Salir  
   1. Si no hay ningún mensaje en cola, el programa se detendrá.  
   2. Si hay algún mensaje en cola te diría que hay mensajes en cola ¿Deseas salir del programa?  
      1. Si introduces un texto, carácter especial, número etc que no sea “S O N” volverá a preguntárselo.  
      2. Si introduces S o s saldrás del programa.  
      3. Si introduces N o n volverás al menú del programa.  
         

\#\# 3\. Evidencia del Trabajo Síncrono  
