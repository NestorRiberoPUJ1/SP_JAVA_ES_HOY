
function alertar() {
    alert("ALGO SUCEDIÓ");
}
function alertar2() {
    alert("ALGO SUCEDIÓ2");
}
function multiplicarCelula(event) {
    console.log(event);
    event.data();
    const newCelula = `<button class="btnCelula">Celula Generada</button>`;
    $(this).parent().append(newCelula);
}


/* Evento click en botones de tipo celula */
$(document).on("click", "button.btnCelula", alertar, multiplicarCelula)
$(document).on("click", "button.btnCelula2", alertar2, multiplicarCelula)

$("#dataTable tbody tr td").on("click", function () {
    console.log($(this).text());
});

$("form").on("submit", function (event) {
    alert("Handler for `submit` called.");
    event.preventDefault();
    console.log($(this).serialize());
    console.log($(this).serializeArray());
})



/* TRAVERSING */
$("#pwd").on("change", function () {
    const value = $(this).val()
    $(this).parent().parent().siblings("div").children("#dataTable").children().children("tr:nth-child(3)").children("td:last-child").text(value);
})

