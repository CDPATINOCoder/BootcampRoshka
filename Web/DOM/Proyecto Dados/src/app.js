const dadoRandom = (() => {
  let dado = null;
  const dadoContainer = document.getElementById("dado-container");

  const divDado1 = `<div class="dado" id="dado1">
      <div class="punto"></div>
</div>`;

  const divDado2 = `<div class="dado" id="dado2">
                    <div class="punto"></div>
                    <div class="punto"></div>
                  </div>`;

  const divDado3 = `<div class="dado" id="dado3">
                    <div class="punto"></div>
                    <div class="punto"></div>
                    <div class="punto"></div>
                  </div>`;

  const divDado4 = `<div class="dado" id="dado4">
                    <div class="punto"></div>
                    <div class="punto"></div>
                    <div class="punto"></div>
                    <div class="punto"></div>
                  </div>`;

  const divDado5 = `<div class="dado" id="dado5">
                    <div class="punto"></div>
                    <div class="punto"></div>
                    <div class="punto"></div>
                    <div class="punto"></div>
                    <div class="punto"></div>
                  </div>`;

  const divDado6 = `<div class="dado" id="dado6">
                    <div class="punto"></div>
                    <div class="punto"></div>
                    <div class="punto"></div>
                    <div class="punto"></div>
                    <div class="punto"></div>
                    <div class="punto"></div>
                  </div>`;

  const generarDado = () => {
    return Math.floor(Math.random() * 6) + 1;
  };

  const iniciar = () => {
    configurarBoton();
  };

  const configurarBoton = () => {
    let button = document.querySelector("button");
    button.addEventListener("click", manejarClick);
  };

  const manejarClick = () => {
    dado = generarDado();
    insertarDadoDiv();
  };

  const actualizarPantalla = () => {
    const dado = document.querySelector(".dado");
    if (dado) {
      dado.remove();
    }
  };

  const insertarDadoDiv = () => {
    switch (dado) {
      case 1:
        actualizarPantalla();
        dadoContainer.insertAdjacentHTML("afterbegin", divDado1);
        break;
      case 2:
        actualizarPantalla();
        dadoContainer.insertAdjacentHTML("afterbegin", divDado2);
        break;
      case 3:
        actualizarPantalla();
        dadoContainer.insertAdjacentHTML("afterbegin", divDado3);
        break;
      case 4:
        actualizarPantalla();
        dadoContainer.insertAdjacentHTML("afterbegin", divDado4);
        break;
      case 5:
        actualizarPantalla();
        dadoContainer.insertAdjacentHTML("afterbegin", divDado5);
        break;
      case 6:
        actualizarPantalla();
        dadoContainer.insertAdjacentHTML("afterbegin", divDado6);
        break;
    }
  };

  return {
    iniciar,
  };
})();

dadoRandom.iniciar();
