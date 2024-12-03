const actualizarInnerHTML = (id, contenido) => {
  if (!id) {
    throw new Error("El id es requerido");
  }
  if (typeof id !== "string") {
    throw new Error("El id debe ser un string");
  }
  if (id.trim() === "") {
    throw new Error("El id no debe estar vacío");
  }
  if (!contenido) {
    throw new Error("El contenido es requerido");
  }
  if (typeof contenido !== "string") {
    throw new Error("El contenido debe ser un string");
  }
  if (contenido.trim() === "") {
    throw new Error("El contenido no debe estar vacío");
  }
  let elemento = document.getElementById(id);
  if (!elemento) {
    throw new Error(`No se encontró ningún elemento con el id ${id}`);
  }
  elemento.innerHTML = contenido;
};

actualizarInnerHTML("tituloPrincipal", "<h1>Lorem ipsum</h1>");

actualizarInnerHTML(
  "parrafoPrincipal",
  "<p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ratione fugiat obcaecati hic accusamus esse aliquid veniam, delectus eveniet voluptatum molestias dolorum consectetur laborum facilis deleniti minus! Unde harum enim saepe?</p>"
);
