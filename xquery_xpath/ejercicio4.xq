declare variable $input := doc("ejercicio_4_clase.xml");

(: a. Obtener el número de alumnos de la clase :)
declare variable $numAlumnos := count($input//alumno);

(: b. Obtener el número de módulos que se imparten :)
declare variable $numModulos := count($input//asignatura);

(: c. Obtener el nombre y apellidos de todos los alumnos matriculados en algún módulo :)
declare variable $alumnosMatriculados := distinct-values(
    for $nota in $input//nota
    let $alumno := $input//alumno[@cod = $nota/@alum]/apenom
    return $alumno
);

(: d. Obtener las calificaciones del alumno de código "n43483437" en cada uno de sus módulos :)
declare variable $calificacionesAlumno := 
    <alumno cod="n43483437">
        {
            for $nota in $input//nota[@alum = "n43483437"]
            let $modulo := $input//asignatura[@cod = $nota/@asig]/@nombre
            return <modulo>
                       <nombre_modulo>{data($modulo)}</nombre_modulo>
                       <nota>{data($nota/@calificacion)}</nota>
                   </modulo>
        }
    </alumno>;

(: e. Obtener los nombres de los alumnos matriculados en LMSGI y sus notas, ordenados por notas descendente :)
declare variable $alumnosLMSGI := 
    <lmsgi>
        {
            for $nota in $input//nota[@asig = "a4"]
            let $alumno := $input//alumno[@cod = $nota/@alum]
            order by $nota/@calificacion descending
            return <alumno>
                       <nombre>{data($alumno/apenom)}</nombre>
                       <nota>{data($nota/@calificacion)}</nota>
                   </alumno>
        }
    </lmsgi>;

(: f. Obtener los nombres de los alumnos matriculados en LMSGI que hayan aprobado, ordenados por nota descendente :)
declare variable $alumnosLMSGIAprobados := 
    <lmsgi>
        {
            for $nota in $input//nota[@asig = "a4" and @calificacion >= 5]
            let $alumno := $input//alumno[@cod = $nota/@alum]
            order by $nota/@calificacion descending
            return <alumno>
                       <nombre>{data($alumno/apenom)}</nombre>
                       <nota>{data($nota/@calificacion)}</nota>
                   </alumno>
        }
    </lmsgi>;

(
    "a. Número de alumnos de la clase",
    $numAlumnos,
    "",
    "b. Número de módulos que se imparten",
    $numModulos,
    "",
    "c. Nombre y apellidos de todos los alumnos matriculados en algún módulo",
    $alumnosMatriculados,
    "",
    "d. Calificaciones del alumno de código 'n43483437' en cada uno de sus módulos",
    $calificacionesAlumno,
    "",
    "e. Alumnos matriculados en LMSGI y sus notas (ordenados de forma descendente)",
    $alumnosLMSGI,
    "",
    "f. Alumnos matriculados en LMSGI que han aprobado, ordenados por nota descendente",
    $alumnosLMSGIAprobados
)