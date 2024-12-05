const validarDatos = () => {
  let player1 = document.getElementById("jugador1").value.trim();
  let player2 = document.getElementById("jugador2").value.trim();
  let simbol = document.querySelector('input[name="simbolo"]:checked')?.value;

  if (!player1) {
    throw new Error("El nombre del jugador 1 no puede estar vacio");
  }
  if (!player2) {
    throw new Error("El nombre del jugador 2 no puede estar vacio");
  }
  if (!simbol) {
    throw new Error("Debe seleccionar para que jugador sera X");
  }
  if (player1 === player2) {
    throw new Error("Los nombres de los jugadores no pueden ser iguales");
  }
};

export default validarDatos;
