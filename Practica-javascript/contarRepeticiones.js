const contarPalabra = (cadena = "", palabra = undefined) => {
  if (!cadena) {
    return console.error("La cadena está vacía");
  }
  if (typeof cadena !== "string") {
    return console.error("El dato ingresado no es una cadena");
  }
  if (palabra === undefined || typeof palabra !== "string" || palabra === "") {
    return console.error(
      "Asegúrate de que la palabra a buscar esté definida y sea de tipo string."
    );
  }

  // Convertir todo a minúsculas para hacer la búsqueda insensible a mayúsculas
  cadena = cadena.toLowerCase();
  palabra = palabra.toLowerCase();

  // Separar la cadena en palabras y filtrar las que coinciden con la palabra buscada
  const palabras = cadena.split(" ");
  const conteo = palabras.filter((elemento) => elemento === palabra).length;

  // Devolver el resultado
  if (conteo > 0) {
    return console.log(`La palabra '${palabra}' se repitió ${conteo} veces`);
  } else {
    return console.warn("La palabra ingresada no fue encontrada");
  }
};

// Ejemplo de uso
contarPalabra("Hola amigos como están hola holaaaaaa hola", "hola"); // 3
contarPalabra("Hola amigos como están hola holaaaaaa hola", "penbe"); // La palabra ingresada no fue encontrada
