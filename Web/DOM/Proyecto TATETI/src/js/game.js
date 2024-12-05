import obtenerDatos from "./obtenerDatos.js";

let board = Array(9).fill(null);
let currentPlayer; // Variable global para el turno actual

const game = () => {
  const gameData = obtenerDatos(); // Obtener los datos actualizados al iniciar el juego
  currentPlayer = gameData.simbol; // Inicializar el turno con el símbolo seleccionado

  console.log(`Jugador inicial: ${currentPlayer}`);

  const formulario = document.querySelector(".formulario");
  formulario.style.display = "none";

  const casillas = document.querySelectorAll(".casilla");

  // Asignar eventos a las casillas (solo una vez)
  casillas.forEach((casilla) => {
    casilla.addEventListener("click", manejarEventosCasillas);
  });
};

const manejarEventosCasillas = (event) => {
  const valorCasilla = parseInt(event.target.dataset.casilla);
  const casilla = document.querySelector(`div[data-casilla="${valorCasilla}"]`);

  // Validar si la casilla ya está ocupada
  if (board[valorCasilla] !== null) {
    alert("Casilla ocupada");
    return;
  }

  // Actualizar el tablero lógico y la UI con el símbolo del jugador actual
  board[valorCasilla] = currentPlayer === "jugador1" ? "X" : "O";
  casilla.textContent = board[valorCasilla];

  console.log(`Jugador actual que hizo el movimiento: ${currentPlayer}`);

  // Cambiar el turno
  currentPlayer = currentPlayer === "jugador1" ? "jugador2" : "jugador1";
  console.log(`Siguiente turno: ${currentPlayer}`);

  // Verificar ganador o empate
  comprobarGanador();
};

const comprobarGanador = () => {
  console.log(board);

  // Combinaciones ganadoras
  const combinaciones = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8], // Filas
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8], // Columnas
    [0, 4, 8],
    [2, 4, 6], // Diagonales
  ];

  for (const combinacion of combinaciones) {
    const [a, b, c] = combinacion;
    if (board[a] && board[a] === board[b] && board[a] === board[c]) {
      // Inhabilitar el tablero
      const tablero = document.getElementById("tablero"); // Selecciona el contenedor del tablero
      tablero.classList.add("disabled"); // Agrega la clase "disabled"

      alert(
        `¡${
          currentPlayer === "jugador1" ? "Jugador 2" : "Jugador 1"
        } ha ganado!`
      );
      return;
    }
  }

  // Verificar empate
  if (board.every((casilla) => casilla !== null)) {
    // Inhabilitar el tablero
    const tablero = document.getElementById("tablero"); // Selecciona el contenedor del tablero
    tablero.classList.add("disabled"); // Agrega la clase "disabled"
    alert("¡Es un empate!");
  }
};

//to do {reinciar el juego despues de que haya un ganador o empate}

export default game;
