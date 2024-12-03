const contarCaracteres = (cadena) => {
  if (typeof cadena !== "string") {
    throw new Error("El dato debe ser una cadena");
  }
  if (cadena.trim() === "") {
    throw new Error("La cadena no puede estar vacia");
  }
  return cadena.trim().length;
};

try {
  let resultado = contarCaracteres("Hola mundo");
  console.log(resultado);
  // contarCaracteres(123);    el dato debe ser una cadena
  // contarCaracteres("");     la cadena no puede estar vacia
  // contarCaracteres(" ");   la cadena no puede estar vacia
} catch (error) {
  console.error(error.message);
}
