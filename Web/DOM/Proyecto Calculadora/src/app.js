//iniciar
//configurarBotones
//manejarEventosButton
//actualizarPantalla
//calcular
//limpiarPantalla

const Calculadora = (() => {
  let entradaActual = "";
  let pantalla = null;
  let button = document.querySelectorAll("button");

  const iniciar = () => {
    pantalla = document.getElementById("pantalla");
    configurarBotones();
  };

  const configurarBotones = () => {
    button.forEach((button) => {
      button.addEventListener("click", manejarEventosButton);
    });
  };

  const manejarEventosButton = (evento) => {
    const value = evento.target.dataset.value;
    switch (value) {
      case "=":
        calcular();
        break;
      case "c":
        limpiarPantalla();
        break;
      default:
        actualizarPantalla(value);
        break;
    }
  };

  const actualizarPantalla = (value) => {
    entradaActual += value;
    pantalla.textContent = entradaActual;
  };

  const limpiarPantalla = () => {
    entradaActual = " ";
    pantalla.textContent = " ";
  };

  const calcular = () => {
    try {
      let resultado = eval(entradaActual);
      pantalla.textContent = resultado;
      entradaActual = resultado.toString();
    } catch (error) {
      pantalla.textContent = "Error";
      entradaActual = "";
    }
  };

  return { iniciar };
})();

Calculadora.iniciar();
