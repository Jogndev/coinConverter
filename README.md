<h1>Conversor de Monedas</h1>
<p>Este proyecto consiste en una aplicación escrita en JAVA, tratándose de un conversor de monedas que recibe del usuario una denominacion base, una moneda que debe seleccionar y un monto a convertir. Realiza una solicitud a la API de ExchangeRate-API para procesar los datos y generar de esta forma la conversión necesaria.</p>

<h2>Funcionalidades</h2>
<ol>
<li>Realizar una conversión de una moneda a otra.</li>
<li>Consultar el historial de conversiones realizadas.</li>
</ol>
<h2>Requisitos</h2>
<ul>
<li>Java 8 o superior.</li>
<li>Acceso a internet para consultar las tasas de conversión en tiempo real.</li>
</ul>
<h2>Uso</h2>
<ol>
<li>Ejecutar el programa Principal.java.</li>
<li>Seguir las instrucciones del menú para realizar conversiones o consultar el historial.</li>
</ol>
<h2>Ejemplo de uso:</h2>
<p>Posibles entradas y respuestas del programa:</p>

<h3>Ejecutar el programa:</h3>
<ul>
Abre una terminal o línea de comandos.
<li>Navega hasta el directorio donde se encuentra el archivo Principal.java.</li>
<li>Compila el archivo Principal.java utilizando el comando 'javac Principal.java'</li>
<li>Ejecuta el programa compilado utilizando el comando 'java Principal'</li>
</ul>

<h3>Iniciando el programa: </h3>
<p>Luego de ejecutar el programa, se mostrará el siguiente menú, en el cual el usuario deberá escoger la opción a realizar digitándo el número correspondiente.</p>
<img src="https://github.com/Jogndev/coinConverter/blob/main/principal.PNG">

<p>Si el usuario ingresa una opción diferente se mostrará un mensaje de opción inválida y deberá ingresar nuevamente una opción.
Opción inválida en menú principal</p>

<img src="https://github.com/Jogndev/coinConverter/blob/main/principalerror.PNG">

<h3>Ingresando monedas:</h3>
<p>Si el usuario ingresa la opción 1 en el menú principal, se mostrará el siguiente menú, en el cual deberá seleccionar la moneda base o de origen de la conversión ingresando las tres letras correspondientes a la denominación.</p>
<img src="https://github.com/Jogndev/coinConverter/blob/main/denominacionBase.PNG">

<p>Si el usuario ingresa una opción diferente a las opciones disponibles se mostrará un mensaje de opción no disponible y deberá ingresar nuevamente una moneda disponible.</p>
<img src="https://github.com/Jogndev/coinConverter/blob/main/errorMoneda.PNG">

<p>Cuando el usuario ha ingresado una moneda base válida deberá escoger una moneda objetivo, de igual manera si ingresa una moneda no disponible deberá ingresar una moneda válida. Luego de esto deberá ingresar la cantidad a convertir.</p>
<img src="https://github.com/Jogndev/coinConverter/blob/main/denominacionFinal.PNG">


<h3>Ingresando cantidad a convertir:</h3>
<p>Si el usuario ingresa una cantidad inválida (diferente de un número), deberá ingresar nuevamente una cantidad válida.</p>
<img src="https://github.com/Jogndev/coinConverter/blob/main/montoError.PNG">

<p>Cuando el usuario ha introducido una cantidad válida, se imprimirá el resultado y la información de la conversión solicitada.</p>
<img src="https://github.com/Jogndev/coinConverter/blob/main/montoValid.PNG">

<h3>Consultando historial de conversiones:</h3>
<p>En el menú principal, el usuario puede digitar la opción 2 para ver el historial detallado de conversiones realizadas con fecha y hora de estas.</p>

<img src="https://github.com/Jogndev/coinConverter/blob/main/registro.PNG">


<h3>Saliendo del programa:</h3>
<p>Finalmente, el usuario puede seleccionar la opción 3 para terminar el programa.</p>
<img src="https://github.com/Jogndev/coinConverter/blob/main/salir.PNG">

<h2>Librerías utilizadas</h2>
<ul>
<li>Gson: Utilizado para manejar los datos JSON obtenidos de la API.</li>
<li>Java ttpClient: Para realizar las solicitudes HTTP a la API de ExchangeRate-API.</li>
</ul>
