const obtenerDatos = () => {
  const player1 = document.getElementById("jugador1").value.trim();
  const player2 = document.getElementById("jugador2").value.trim();
  const simbol = document.querySelector('input[name="simbolo"]:checked')?.value;
  return { player1, player2, simbol };
};

export default obtenerDatos;
