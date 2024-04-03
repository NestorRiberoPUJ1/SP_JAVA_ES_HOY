
/* 
Cambia
algo que se quiere encontrar
contiene informacion
informacion que se va a solicitar
elemento conjunto dentro de la computadora
un dato
cambia en el tiempo
*/
/* Debug */

console.log("HOLA A TODOS");

var edad = 26; /* variables globales */
let nombre = "Nestor";    /* variables locales */
var graduado = true; /* valor booleano */
let altura = 1.85;  /* valor decimal */

console.log(nombre, edad);



var botonRojo = document.querySelector("#btnSend");
botonRojo.innerHTML = "HOLA A TODOS";
console.log(botonRojo);

var botonesRojos = document.querySelectorAll(".btn-red");
console.log(botonesRojos);

/*  
<button id="btnSend3" class="btn">HOLA 3</button>
.btn-blue {
    background-color: lightblue;
    color: white;
    border: 2px solid dodgerblue;
}
*/
var botonNeutro = document.getElementById("btnSend3");   //Seleccion del elemento
console.log(botonNeutro);
console.log(botonNeutro.classList);
botonNeutro.classList.add("btn-blue");  //Modificacion de la lista de clase
console.log(botonNeutro.classList);


function saludar() {
    console.log("SALUDOS...");
}

/* EsCUCHADOR DE EVENTOS PARA REALIZAR ALGUNA FUNCION */
botonNeutro.addEventListener("click", () => {
    /* alert("HICISTE CLICK"); */
    botonNeutro.classList.toggle("btn-blue");
})


/* AHORA VAMOS A USAR JQUERY PARA HACER LO MISMO */
/*
 var botonRojo = document.querySelector("#btnSend");
botonRojo.innerHTML = "HOLA A TODOS"; 
*/
// selector . atributo ( valor )
$("#btn2Send").text("HOLA A TODOS");

console.log($(".btn-red"));

/* 
var botonNeutro = document.getElementById("btnSend3");
botonNeutro.classList.add("btn-blue");
*/
// selector . atributo ( valor )
$("#btn2Send3").addClass("btn-blue");
$("#btn2Send3").click(function ()  {
    // selector . atributo ( valor )
    $(this).toggleClass("btn-blue");
})



/* OTROS EJEMPLOS DE JQUERY */

/* Seleccionar h1 de la section */
console.log($("section h1:first-child"))
$("section h1:first-child").css("color", "red");
console.log($("section h1:first-child").css("font-size"));
$("section h1:first-child").css("font-size", "48px")
console.log($("section h1:first-child").css("font-size"));

/* THIS */

$("section h1").mouseover(function () {
    $(this).css("text-shadow","4px 4px 2px rgba(0,0,0,0.6)");
})
$("section h1").mouseout(function () {
    $(this).css("text-shadow","0px 0px 0px rgba(0,0,0,0)");
})