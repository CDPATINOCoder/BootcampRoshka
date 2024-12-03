const crearArregloSeparado = (cadena, separador) => {
  if (!cadena) {
    throw new Error(cadena + ": La cadena no puede estar indefinida");
  }
  if (typeof cadena !== "string") {
    throw new Error(cadena + ": La cadena debe ser de tipo string");
  }
  if (cadena.trim() === "") {
    throw new Error("La cadena no puede estar vacia");
  }
  if (separador === undefined) {
    throw new Error("El separador no puede estar indefinido");
  }
  if (typeof separador !== "string") {
    throw new Error(separador + ": El separador debe ser de tipo string");
  }
  if (!cadena.includes(separador)) {
    throw new Error(
      separador + ": El separador no se encuentra dentro de la cadena"
    );
  }
  if (separador === "") {
    return cadena.split("").filter((caracter) => caracter != " ");
  }
  return cadena.trim().split(separador);
};

try {
  let resultado = crearArregloSeparado();
  console.log(resultado);
} catch (error) {
  console.error(error.message);
}
