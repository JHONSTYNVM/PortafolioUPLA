<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>

<html lang="es">


<head>


<meta charset="UTF-8">


<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>Crear cuenta - Portafolio UPLA</title>


<link rel="stylesheet" href="css/login.css">


</head>



<body>




<!-- ================= HEADER ================= -->


<header class="navbar">


<div class="marca">


<img src="img/logo_upla.png">


<div>


<h1>
Mi Portafolio
</h1>


<p>
Universidad Peruana Los Andes
</p>


</div>


</div>





<nav class="menu">


<a href="index.html">
Portafolio
</a>



<a href="login.jsp">
Iniciar sesión
</a>



<a href="registro.jsp" class="boton-menu">
Crear cuenta
</a>



</nav>


</header>







<!-- ================= REGISTRO ================= -->


<main class="zona-login">



<div class="contenedor-login">



<div class="tarjeta">





<img src="img/logo_upla.png" class="logo">





<h1>
Crear cuenta
</h1>





<p class="subtitulo">

Tu nombre aparecerá en la parte superior del portafolio.

</p>








<form action="UsuarioController" method="post">



<input type="hidden" name="accion" value="registrar">





<label>
Nombre completo
</label>



<input

type="text"

name="nombre"

placeholder="Nombres y apellidos"

required

>








<label>
Correo electrónico
</label>




<input

type="email"

name="correo"

placeholder="tucorreo@upla.edu.pe"

required

>








<label>
Contraseña
</label>




<input

type="password"

name="password"

placeholder="Mínimo 6 caracteres"

required

>









<button type="submit">

Crear cuenta

</button>







</form>









<p class="registro">


¿Ya tienes cuenta?



<a href="login.jsp">

Inicia sesión

</a>


</p>





</div>


</div>


</main>






</body>


</html>