const str = "OSELNKTEPT-ANUEEREE";
const filas = str.length / 4;
const columnas = 4;
const object = { length: Math.ceil(filas) }
const matriz = Array.from(object, () => Array(columnas).fill(0));

let index = 0;



// Rellenar por columnas
for (let j = 0; j < columnas; j++) {
  for (let i = 0; i < filas; i++) {
    matriz[i][j] = str[index++] ?? 'X';
  }
}

console.table(matriz);
let mensaje = ""

//leer mensaje
for (let i =0; i<filas; i++){
    for (let j=0; j<columnas; j++){
        mensaje += matriz[i][j]
    }
}

console.log(mensaje.split('X').join(''));


