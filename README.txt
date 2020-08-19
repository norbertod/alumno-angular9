-- cursos -- 
[
    {
        "id": 1,
        "nombre": "1° primaria",
        "createAt": "2020-08-12T23:34:09.009+00:00",
        "alumnos": []
    },
    {
        "id": 2,
        "nombre": "2° primaria",
        "createAt": "2020-08-12T23:34:32.709+00:00",
        "alumnos": []
    },
    {
        "id": 3,
        "nombre": "3° primaria",
        "createAt": "2020-08-12T23:34:54.994+00:00",
        "alumnos": []
    },
    {
        "id": 4,
        "nombre": "1° secundaria",
        "createAt": "2020-08-12T23:35:05.186+00:00",
        "alumnos": []
    },
    {
        "id": 5,
        "nombre": "2° secundaria",
        "createAt": "2020-08-12T23:35:08.709+00:00",
        "alumnos": []
    },
    {
        "id": 6,
        "nombre": "3° secundaria",
        "createAt": "2020-08-12T23:35:12.784+00:00",
        "alumnos": []
    },
    {
        "id": 7,
        "nombre": "4° secundaria",
        "createAt": "2020-08-12T23:35:17.044+00:00",
        "alumnos": []
    }
]
-- cursos --

-- alumnos --
[
    {
        "id": 1,
        "nombre": "Andrez",
        "apellido": "Guzman",
        "email": "profesor@mail.com",
        "createAt": "2020-08-12T21:30:27.120+00:00"
    },
    {
        "id": 2,
        "nombre": "Jhon",
        "apellido": "Doe",
        "email": "jhon@gmail.com",
        "createAt": "2020-08-12T21:31:46.843+00:00"
    },
    {
        "id": 3,
        "nombre": "Jose",
        "apellido": "Doe",
        "email": "jose@gmail.com",
        "createAt": "2020-08-12T21:35:35.795+00:00"
    }
]
-- alumnos --
--examenes--

{
    "nombre":"Examen de historia",
    "preguntas": [
        {"texto":"quien descubrio america"},
        {"texto":"en que año se descubrio america"},
        {"texto":"capital del imperio inca"}
    ]
}

--examenes--

--asignar examenes a un curso----
[
    {
        "id": 1,
        "nombre": "Examen de historia",
        "createAt": "2020-08-18T19:51:55.617+00:00",
        "preguntas": [
            {
                "id": 1,
                "texto": "quien descubrio centro america"
            },
            {
                "id": 3,
                "texto": "capital del imperio inca"
            },
            {
                "id": 4,
                "texto": "capital del imperio azteca"
            }
        ]
    }
]
--asignar examenes a un curso----

--asignaturas--

[
    {
        "id": 1,
        "nombre": "Matemáticas",
        "padre": null,
        "hijos": [
            {
                "id": 8,
                "nombre": "Algebra",
                "hijos": []
            },
            {
                "id": 9,
                "nombre": "Aritmética",
                "hijos": []
            },
            {
                "id": 10,
                "nombre": "Trigonometría",
                "hijos": []
            }
        ]
    },
    {
        "id": 2,
        "nombre": "Lenguaje",
        "padre": null,
        "hijos": [
            {
                "id": 11,
                "nombre": "Lectura y comprensión",
                "hijos": []
            },
            {
                "id": 12,
                "nombre": "Verbos",
                "hijos": []
            },
            {
                "id": 13,
                "nombre": "Gramática",
                "hijos": []
            }
        ]
    },
    {
        "id": 3,
        "nombre": "Inglés",
        "padre": null,
        "hijos": [
            {
                "id": 14,
                "nombre": "Inglés",
                "hijos": []
            },
            {
                "id": 15,
                "nombre": "Gramática",
                "hijos": []
            },
            {
                "id": 16,
                "nombre": "Verbos",
                "hijos": []
            }
        ]
    },
    {
        "id": 4,
        "nombre": "Ciencias Naturales",
        "padre": null,
        "hijos": [
            {
                "id": 17,
                "nombre": "Ciencias Naturales",
                "hijos": []
            },
            {
                "id": 18,
                "nombre": "Biología",
                "hijos": []
            },
            {
                "id": 19,
                "nombre": "Física",
                "hijos": []
            },
            {
                "id": 20,
                "nombre": "Quimica",
                "hijos": []
            }
        ]
    },
    {
        "id": 5,
        "nombre": "Ciencias Sociales y Historia",
        "padre": null,
        "hijos": [
            {
                "id": 21,
                "nombre": "Historia",
                "hijos": []
            },
            {
                "id": 22,
                "nombre": "Ciencias Sociales",
                "hijos": []
            },
            {
                "id": 23,
                "nombre": "Filosofía",
                "hijos": []
            }
        ]
    },
    {
        "id": 6,
        "nombre": "Música",
        "padre": null,
        "hijos": [
            {
                "id": 24,
                "nombre": "Música",
                "hijos": []
            }
        ]
    },
    {
        "id": 7,
        "nombre": "Artes",
        "padre": null,
        "hijos": [
            {
                "id": 25,
                "nombre": "Artes",
                "hijos": []
            }
        ]
    },
    {
        "id": 8,
        "nombre": "Algebra",
        "padre": {
            "id": 1,
            "nombre": "Matemáticas",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 9,
        "nombre": "Aritmética",
        "padre": {
            "id": 1,
            "nombre": "Matemáticas",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 10,
        "nombre": "Trigonometría",
        "padre": {
            "id": 1,
            "nombre": "Matemáticas",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 11,
        "nombre": "Lectura y comprensión",
        "padre": {
            "id": 2,
            "nombre": "Lenguaje",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 12,
        "nombre": "Verbos",
        "padre": {
            "id": 2,
            "nombre": "Lenguaje",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 13,
        "nombre": "Gramática",
        "padre": {
            "id": 2,
            "nombre": "Lenguaje",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 14,
        "nombre": "Inglés",
        "padre": {
            "id": 3,
            "nombre": "Inglés",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 15,
        "nombre": "Gramática",
        "padre": {
            "id": 3,
            "nombre": "Inglés",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 16,
        "nombre": "Verbos",
        "padre": {
            "id": 3,
            "nombre": "Inglés",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 17,
        "nombre": "Ciencias Naturales",
        "padre": {
            "id": 4,
            "nombre": "Ciencias Naturales",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 18,
        "nombre": "Biología",
        "padre": {
            "id": 4,
            "nombre": "Ciencias Naturales",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 19,
        "nombre": "Física",
        "padre": {
            "id": 4,
            "nombre": "Ciencias Naturales",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 20,
        "nombre": "Quimica",
        "padre": {
            "id": 4,
            "nombre": "Ciencias Naturales",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 21,
        "nombre": "Historia",
        "padre": {
            "id": 5,
            "nombre": "Ciencias Sociales y Historia",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 22,
        "nombre": "Ciencias Sociales",
        "padre": {
            "id": 5,
            "nombre": "Ciencias Sociales y Historia",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 23,
        "nombre": "Filosofía",
        "padre": {
            "id": 5,
            "nombre": "Ciencias Sociales y Historia",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 24,
        "nombre": "Música",
        "padre": {
            "id": 6,
            "nombre": "Música",
            "padre": null
        },
        "hijos": []
    },
    {
        "id": 25,
        "nombre": "Artes",
        "padre": {
            "id": 7,
            "nombre": "Artes",
            "padre": null
        },
        "hijos": []
    }
]

--asignaturas--