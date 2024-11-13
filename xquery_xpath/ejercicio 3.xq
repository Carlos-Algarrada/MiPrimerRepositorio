declare variable $input := doc("ejercicio_3_libros.xml");
declare variable $comentarios := doc("ejercicio_3_libros_comentarios.xml");

(: a. Muestra los títulos de todos los libros (contenido). :)
declare function local:titulosLibros() {
  for $libro in $input//libro
  return $libro/titulo/text()
};

(: b. Consigue el nombre de todos los libros del año 2000 (elemento). :)
declare function local:librosAno2000() {
  for $libro in $input//libro[@year = 2000]
  return $libro/titulo
};

(: c. Devuelve todos los títulos de los libros entre el año 1995 y 2000, ambos incluidos (elemento). :)
declare function local:librosEntre1995y2000() {
  for $libro in $input//libro[@year >= 1995 and @year <= 2000]
  return $libro/titulo
};

(: d. Obtén todos los títulos de los libros que tengan algún autor de apellido ‘Stevens’ (contenido). :)
declare function local:librosAutorStevens() {
  for $libro in $input//libro
  where $libro/autor/apellido = "Stevens"
  return $libro/titulo/text()
};

(: e. Muestra los títulos de todos los libros almacenados de la editorial "Addison-Wesley" con "for" y "let". :)
declare function local:librosAddisonWesleyFor() {
  for $libro in $input//libro
  where $libro/editorial = "Addison-Wesley"
  return $libro/titulo
};

declare function local:librosAddisonWesleyLet() {
  let $libros := $input//libro[editorial = "Addison-Wesley"]
  return $libros/titulo
};

(: f. Consigue todos los títulos de los libros que tengan un solo autor ordenados por precio (elemento). :)
declare function local:librosUnAutorPorPrecio() {
  for $libro in $input//libro
  where count($libro/autor) = 1
  order by xs:decimal($libro/precio)
  return $libro/titulo
};

(: g. Devuelve todos los títulos de los libros que tengan más de dos autores ordenados por su título (elemento). :)
declare function local:librosMasDeDosAutores() {
  for $libro in $input//libro
  where count ($libro/autor) > 2
  order by $libro/titulo
  return $libro/titulo
};

(: h. Devuelve el título y el año de cada uno de los libros junto con el número de autores de cada libro (elemento). :)
declare function local:librosConNumAutores() {
  for $libro in $input//libro
  return <libro>
           <titulo>{$libro/titulo}</titulo>
           <anio>{$libro/@year}</anio>
           <num_autores>{count($libro/autor)}</num_autores>
         </libro>
};

(: i. Genera el XML con el resumen de cada libro. :)
declare function local:resumenBib() {
  <resumen_bib>
  {
    for $libro in $input//libro
    return <libro>
             <titulo>{$libro/titulo}</titulo>
             <anio>{$libro/@year}</anio>
             <num_autores>{count($libro/autor)}</num_autores>
           </libro>
  }
  </resumen_bib>
};

(: j. Devuelve los títulos de todos los libros y los apellidos de sus dos primeros autores con "et al." si hay más de dos. :)
declare function local:resumenBibAutores() {
  <resumen_bib>
  {
    for $libro in $input//libro
    let $autores := $libro/autor
    return <libro>
             <titulo>{$libro/titulo}</titulo>
             <autores>
               {for $a in subsequence($autores/apellido, 1, 2) return <apellido>{$a}</apellido>}
               {if (count($autores) > 2) then <apellido>et al.</apellido> else ()}
             </autores>
           </libro>
  }
  </resumen_bib>
};

(: k. Devuelve los títulos, editoriales y comentarios o sin_comentario si no tienen comentario. :)
declare function local:resumenBibComentarios() {
  <resumen_bib_com>
  {
    for $libro in $input//libro
    let $titulo := $libro/titulo
    let $comentario := $comentarios//entrada[titulo = $titulo]/comentario
    return <libro>
             <titulo>{$titulo}</titulo>
             <editorial>{$libro/editorial}</editorial>
             {if ($comentario) then <comentario>{$comentario/text()}</comentario> else <sin_comentario/>}
           </libro>
  }
  </resumen_bib_com>
};

(: l. Devuelve los títulos de libros donde al menos uno de los autores es 'Stevens' (elemento). :)
declare function local:librosConAlgunAutorStevens() {
  for $libro in $input//libro
  where some $a in $libro/autor satisfies $a/apellido = "Stevens"
  return $libro/titulo
};

(: m. Devuelve los títulos donde todos los autores son 'Stevens' (elemento). :)
declare function local:librosConTodosAutoresStevens() {
  for $libro in $input//libro
  where every $a in $libro/autor satisfies $a/apellido = "Stevens"
  return $libro/titulo
};

(: n. Devuelve los apellidos distintos de los autores (elemento) usando "distinct-values". :)
declare function local:apellidosUnicosAutores() {
  distinct-values($input//libro/autor/apellido)
};

(: o. Usa "empty()" y "exists()" en dos consultas distintas inventadas. :)
declare function local:emptyConsulta() {
  empty($input//libro[precio < 10])
};

declare function local:existsConsulta() {
  exists($input//libro[editorial = "Addison-Wesley"])
};

(
  "a. Títulos de todos los libros:",
  local:titulosLibros(),
  "",
  "b. Libros del año 2000:", 
  local:librosAno2000(),
  "",
  "c. Libros entre 1995 y 2000:", 
  local:librosEntre1995y2000(),
  "",
  "d. Libros con autor 'Stevens':", 
  local:librosAutorStevens(),
  "",
  "e. Libros de 'Addison-Wesley' con 'for':", 
  local:librosAddisonWesleyFor(),
  "",
  "e. Libros de 'Addison-Wesley' con 'let':", 
  local:librosAddisonWesleyLet(),
  "",
  "f. Libros con un autor por precio:", 
  local:librosUnAutorPorPrecio(),
  "",
  "g. Libros con más de dos autores:", 
  local:librosMasDeDosAutores(),
  "",
  "h. Libros con título, año y número de autores:", 
  local:librosConNumAutores(),
  "",
  "i. Resumen en XML de libros:", 
  local:resumenBib(),
  "j. Resumen de autores con et al.:", 
  local:resumenBibAutores(),
  "",
  "k. Resumen con comentarios:", 
  local:resumenBibComentarios(),
  "",
  "l. Libros con algún autor 'Stevens':", 
  local:librosConAlgunAutorStevens(),
  "",
  "m. Libros con todos los autores 'Stevens':", 
  local:librosConTodosAutoresStevens(),
  "",
  "n. Apellidos únicos de autores:", 
  local:apellidosUnicosAutores(),
  "",
  "o. Consulta con empty():", 
  local:emptyConsulta(),
  "",
  "o. Consulta con exists():", 
  local:existsConsulta()
)
