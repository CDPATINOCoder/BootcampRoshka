const bhakara = (a, b, c, operacion) => {
  if (!a || !b || !c) {
    return console.error("Asegúrate de ingresar los tres argumentos");
  }
  if (typeof a !== "number" || typeof b !== "number" || typeof c !== "number") {
    return console.error("Asegúrate de que todos los argumentos sean números");
  }
  if (typeof operacion !== "string") {
    return console.error("Asegúrate de que la operación sea un string");
  }
  if (!operacion) {
    return console.error("Asegúrate de ingresar la operación");
  }
  if (operacion.trim() === "") {
    return console.error("Asegúrate de ingresar una operación");
  }
  if (operacion !== "suma" && operacion !== "resta") {
    return console.error("Asegúrate de ingresar una operación válida");
  }

  const discriminante = Math.pow(b, 2) - 4 * a * c;

  if (discriminante < 0) {
    return console.error(
      "El discriminante no puede ser negativo, asegúrate de que los valores sean correctos para que la operación sea válida"
    );
  }

  if (operacion === "suma") {
    return ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a)).toFixed(2);
  }
  if (operacion === "resta") {
    return ((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a)).toFixed(2);
  }
};

resultado = bhakara(6.3242, 2, 1, "resta");
console.log(resultado);
