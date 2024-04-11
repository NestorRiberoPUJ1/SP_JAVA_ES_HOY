


/* SELECTOR. EVENTO ( argumentos) */

$("#btnSubscribe").on("click", function () {
    /* $(this)=> elemento que disparó el evento */
    $(this).parent().hide();

})

/* SELECTOR. EVENTO ( argumentos) */
$(".scoreCounter").on("click", function () {
    /* INCREMENTO DE 1 para el texto convertido a valor numerico */
    let score = parseInt($(this).text()) + 1;
    /* Asignacion del nuevo valor al texto del elemento que disparó el evento */
    $(this).text(score);
})

$(window).on("load", function () {
    console.log("PAGE JUST LOADED");
    setTimeout(function () {
        alert("EL JUEGO TERMINÓ");
    }, 13000)
})
