declare variable $input := doc("ejercicio_2_bailes.xml");

(:a. Muestra el nombre de todos los bailes (contenido).:)

declare function local:bailes(){
  for $baile in $input//baile
  return $baile/nombre
  
};

(:b. Consigue el nombre de todos los bailes que se realizan en la sala número uno
(elemento).:)
declare function local:bailesala1(){
  
  for $baile in $input//baile
  where $baile/sala = 1
  return $baile/nombre
};
(:c. Muestra todos los bailes con toda su información que se imparten en la sala
número dos y cuyo precio sea menor que 35,00 EUROS (elemento).:)
declare function local:sala235(){
  
  for $baile in $input//baile
  where $baile/sala = 2 and $baile/precio <35
  return $baile
};
(:d. Obtén el nombre de todos los profesores que dan clase con cuotas mensuales
(contenido).:)
declare function local:profesor(){
  for $baile in $input//baile
  where $baile/precio/@cuota = "mensual"
  return $baile/profesor
};

(:e. Genera un nuevo documento XML que almacena la información de los bailes que
imparte el profesor "Jesús Lozano" con la siguiente estructura:

<bailes_lozano profesor="...">
<baile num="1">
<nombre>...</nombre>
<plazas>...</plazas>
<duracion>De ... A ...</duracion>
</baile>
<baile num="2">
...
</baile>
</bailes_lozano>:)
declare function local:xmls() {
  <bailes_lozano profesor="Jesús Lozano">
    {
      for $baile at $num in $input//baile
      where $baile/profesor = "Jesús Lozano"
      return 
        <baile num="{$num}">
          <nombre>{$baile/nombre}</nombre>
          <plazas>{$baile/plazas}</plazas>
          <duracion>De {$baile/comienzo} A {$baile/fin}</duracion>
        </baile>
    }
  </bailes_lozano>
};
(: Función f: Generar documento HTML para bailes trimestrales ordenados por plazas :)

declare function local:generarHTML() {
  let $bailes := for $baile in $input//baile
                 where $baile/precio/@cuota = "trimestral"
                 order by $baile/plazas
                 return $baile
  return
    <html>
      <head>
        <title>Bailes Trimestrales</title>
      </head>
      <body>
        <h1>Bailes con Cuota Trimestral</h1>
        <table border="1">
          <tr>
            <th>Nombre del Baile</th>
            <th>Profesor</th>
            <th>Plazas Ofertadas</th>
          </tr>
          {
            for $baile in $bailes
            return 
              <tr>
                <td>{ $baile/nombre/text() }</td>
                <td>{ $baile/profesor/text() }</td>
                <td>{ $baile/plazas/text() }</td>
              </tr>
          }
        </table>
      </body>
    </html>
};
(
"a. Muestra el nombre de todos los bailes (contenido).",
local:bailes(),
"",
"b. Consigue el nombre de todos los bailes que se realizan en la sala número uno (elemento).",
local:bailesala1(),
"",
"c. Muestra todos los bailes con toda su información que se imparten en la sala número dos y cuyo precio sea menor que 35,00 EUROS (elemento).",
local:sala235(),
"",
"d. Obtén el nombre de todos los profesores que dan clase con cuotas mensuales(contenido).",
local:profesor(),
"",
"e. Genera un nuevo documento XML que almacena la información de los bailes que
imparte el profesor con la siguiente estructura:",
local:xmls(),
"",
"f.
Genera un documento HTML con una tabla HTML que muestre el nombre del
baile, el profesor que lo imparte y el número de plazas ofertadas, pero
estableciendo la condición de ser bailes con cuota trimestral. Además, se
ordenarán de menor a mayor los bailes según el número de plazas disponibles.",
local:generarHTML()
)