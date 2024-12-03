const cortarCadena = (cadena, longitud) => {
  if (cadena === undefined) {
    throw new Error(cadena + ": La cadena no puede estar indefinida");
  }
  if (typeof cadena !== "string") {
    throw new Error(cadena + ": El dato debe ser una cadena");
  }
  if (cadena.trim() === "") {
    throw new Error("La cadena no puede estar vacia");
  }
  if (longitud === undefined) {
    throw new Error("La longitud no puede estar indefinida");
  }
  if (typeof longitud !== "number") {
    throw new Error(longitud + ": La longitud debe ser numerico");
  }
  if (longitud <= 0) {
    throw new Error(
      longitud + ": La longitud no puede ser negativa o igual a 0"
    );
  }
  if (longitud >= cadena.length) {
    throw new Error(
      longitud +
        ": La longitud no puede ser igual o mayor a la cantidad de caracteres que contiene la cadena"
    );
  }
  return cadena.slice(0, longitud);
};

try {
  resultado = cortarCadena("hola amigos como estan", 21);
  console.log(resultado);
} catch (error) {
  console.error(error.message);
}
