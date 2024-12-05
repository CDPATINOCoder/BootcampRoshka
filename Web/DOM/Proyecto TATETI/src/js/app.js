import validarDatos from "./validarDatos.js";
import game from "./game.js";

document.addEventListener("DOMContentLoaded", () => {
  const startGame = document.getElementById("iniciar-juego");
  startGame.addEventListener("click", () => {
    try {
      //funcion de validacion de datos
      validarDatos(); //puede retornar un error o no
      console.log("Datos validados");
      //funcion de obtencion de datos
      //funcion de comprobar ganador
      game();
    } catch (error) {
      alert(error);
    }
  });
});
