const generarNumeroAleatorio = (id) => {
  if (!id) {
    throw new Error("El id es requerido");
  }
  if (typeof id !== "string") {
    throw new Error("El id debe ser un string");
  }
  if (id.trim() === "") {
    throw new Error("El id no debe estar vacío");
  }
  let elemento = document.getElementById(id);
  if (!elemento) {
    throw new Error(`No se encontró ningún elemento con el id ${id}`);
  }
  let numeroAleatorio = Math.floor(Math.random() * 100000);
  elemento.innerHTML = numeroAleatorio;
};

generarNumeroAleatorio("numero");
