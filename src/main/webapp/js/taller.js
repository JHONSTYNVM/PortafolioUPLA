function mostrar(elemento){

    const unidad = elemento.closest(".unidad");

    const contenido = unidad.querySelector(".contenido");

    const flecha = elemento.querySelector("span");


    contenido.classList.toggle("activo");


    if(contenido.classList.contains("activo")){

        flecha.textContent="▲";

    }else{

        flecha.textContent="▼";

    }

}