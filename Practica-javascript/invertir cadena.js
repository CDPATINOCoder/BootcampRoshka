const invertirPalabras = (cadena = "") => {
  if (!cadena) {
    console.error("La cadena está vacía");
    return;
  }
  if (typeof cadena !== "string") {
    console.error("El dato recibido no es una cadena");
    return;
  }
  return cadena.split("").reverse().join("");
};
let resultado = invertirPalabras("Hola mundo");
console.log(resultado);
