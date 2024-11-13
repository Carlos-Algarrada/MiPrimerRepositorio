declare variable $input := doc("ejercicio_1_modulos_informatica.xml");

(:a. Consigue el nombre de los módulos que se imparten en el instituto:)

declare function local:nombresmodulos(){
    for $modulo in $input//modulo
    return $modulo/nombre
};
(: b. Muestra el nombre de los módulos del ciclo ASIR :)
declare function local:modulosASIR(){
  for $modulo in $input//modulo
  where $modulo/ciclo = "ASIR"
  return $modulo/nombre
};

(:c. Devuelve el nombre de los módulos que se imparten en el segundo curso de
cualquier ciclo (elemento). :)
declare function local:modulosegundocurso(){
  for $modulo in $input//modulo
  where $modulo/curso = "2"
  return $modulo/nombre
};

(:d. Devuelve el nombre de los módulos que se imparten en el primer curso de ASIR
(elemento) y ordénalos alfabéticamente.:)
declare function local:modulosprimercurso(){
  
  for $modulo in $input//modulo
  where $modulo/curso = "1"
  order by $modulo/nombre
  return $modulo/nombre
};

(:e. Obtén el nombre de los módulos con menos de 5 horas semanales (contenido).:)
declare function local:modulosmenos5(){
  for $modulo in $input//modulo
  where $modulo/horasSemanales < 5
  return $modulo/nombre
};
(:f. Devuelve el número de módulos que se imparten en el primer curso de ASIR
(número).:)
declare function local:numeromodulos(){
  count ($input//modulo[ciclo = "ASIR" and curso = 1])
};

(:g. Muestra las horas semanales de los módulos con más de 3 horas semanales
(contenido).:)
declare function local:horassemanales(){
  for $modulo in $input//modulo
  where $modulo/horasSemanales > 3
  return $modulo/horasSemanales
};

(
"a. Consigue el nombre de los módulos que se imparten en el instituto",
local:nombresmodulos(),
"",
"b. Muestra el nombre de los módulos del ciclo ASIR",
local:modulosASIR(),
"",
"c. Devuelve el nombre de los módulos que se imparten en el segundo curso de
cualquier ciclo (elemento).",
local:modulosegundocurso(),
"",
"d. Devuelve el nombre de los módulos que se imparten en el primer curso de ASIR
(elemento) y ordénalos alfabéticamente.",
local:modulosprimercurso(),
"",
"e. Obtén el nombre de los módulos con menos de 5 horas semanales (contenido).",
local:modulosmenos5(),
"",
"f. Devuelve el número de módulos que se imparten en el primer curso de ASIR
(número).",
local:numeromodulos(),
"",
"g. Muestra las horas semanales de los módulos con más de 3 horas semanales
(contenido).",
local:horassemanales()
)