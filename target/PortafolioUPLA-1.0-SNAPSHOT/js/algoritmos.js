function mostrar(elemento){


    const unidadActual = elemento.closest(".unidad");


    const contenido = unidadActual.querySelector(".contenido");


    const flecha = elemento.querySelector("span");



    // Cerrar las demás unidades

    document.querySelectorAll(".unidad").forEach(unidad => {


        if(unidad !== unidadActual){


            unidad.querySelector(".contenido").classList.remove("activo");


            unidad.querySelector(".cabecera span").textContent="▼";


        }


    });




    // Abrir o cerrar la unidad seleccionada


    contenido.classList.toggle("activo");



    if(contenido.classList.contains("activo")){


        flecha.textContent="▲";


    }else{


        flecha.textContent="▼";


    }



}