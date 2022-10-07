/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto001torresyguerrero;

/**
 *
 * @author Juano
 */
public class Proyecto001TorresyGuerrero {
      public static void main(String[] args) {
        System.out.println("Proyecto001");
        var deporte1 = new Deporte();
        var deporte2 = new Deporte();
        var deporte3 = new Deporte();

        deporte1.nombre = "Futbol";
        deporte1.tipo = "balonpie";
        deporte1.participantes = 11;
        deporte1.duracion = "90 minutos";

        deporte2.nombre = "Basquet";
        deporte2.tipo = "balonmano";
        deporte2.participantes = 10;
        deporte2.duracion = "48 minutos";

        deporte3.nombre = "Voley";
        deporte3.tipo = "balonmano";
        deporte3.participantes = 10;
        deporte3.duracion = "25 puntos";

        var pelicula1 = new Pelicula();
        var pelicula2 = new Pelicula();
        var pelicula3 = new Pelicula();

        pelicula1.nombre = "Aprueba de fuego";
        pelicula1.genero = "Tragedia";
        pelicula1.protagonista = "Kirk Cameron";
        pelicula1.año = 2008;

        pelicula2.nombre = "El gol";
        pelicula2.genero = "Nostalgia";
        pelicula2.protagonista = "Kuno Becker";
        pelicula2.año = 2005;

        pelicula3.nombre = "El infierno";
        pelicula3.genero = "Satira";
        pelicula3.protagonista = "Damian Alcazar";
        pelicula3.año = 2010;

        var zapato1 = new Zapato();
        var zapato2 = new Zapato();
        var zapato3 = new Zapato();

        zapato1.marca = "Adidas";
        zapato1.modelo = "Predator 10";
        zapato1.tipo = "Deportivo";
        zapato1.año = 2021;

        zapato2.marca = "Nike";
        zapato2.modelo = "Mercurial";
        zapato2.tipo = "Deportivo";
        zapato2.año = 2017;

        zapato3.marca = "Puma";
        zapato3.modelo = "Speed19";
        zapato3.tipo = "Casual";
        zapato3.año = 2018;

        var video1 = new Videojuego();
        var video2 = new Videojuego();
        var video3 = new Videojuego();

        video1.genero = "Accion";
        video1.peso = 50;
        video1.calificacion = 8;
        video1.lanzamiento = 2003;

        video2.genero = "Shooter";
        video2.peso = 30;
        video2.calificacion = 9;
        video2.lanzamiento = 2018;

        video3.genero = "Fantasia";
        video3.peso = 100;
        video3.calificacion = 4;
        video3.lanzamiento = 2012;

        var celu1 = new Celular();
        var celu2 = new Celular();
        var celu3 = new Celular();

        celu1.marca = "Apple";
        celu1.origen = "USA";
        celu1.lanzamiento = 2018;
        celu1.precio = 1000;

        celu2.marca = "Samsung";
        celu2.origen = "Japon";
        celu2.lanzamiento = 2022;
        celu2.precio = 1200;

        celu3.marca = "Xiaomi";
        celu3.origen = "China";
        celu3.lanzamiento = 2019;
        celu3.precio = 520;

        var bebida1 = new Bebida();
        var bebida2 = new Bebida();
        var bebida3 = new Bebida();

        bebida1.marca = "Vivan";
        bebida1.color = "Limon";
        bebida1.clasificacion = "Jugo natural";
        bebida1.precio = 50;

        bebida2.marca = "Imperial";
        bebida2.color = "Naranja";
        bebida2.clasificacion = "Gaseosa";
        bebida2.precio = 70;

        bebida3.marca = "Pony Malta";
        bebida3.color = "Malta";
        bebida3.clasificacion = "Gaseosa";
        bebida3.precio = 60;

        System.out.println("El deporte llamado " + deporte1.nombre
                + " es de tipo " + deporte1.tipo + " y consta de "
                + deporte1.participantes + " jugadores, ademas cada partido "
                + "dura "
                + deporte1.duracion);

        System.out.println(" El deporte llamado " + deporte2.nombre
                + " es de tipo " + deporte2.tipo + " y consta de "
                + deporte2.participantes + " jugadores, ademas cada partido"
                + " dura "
                + deporte2.duracion);

        System.out.println(" El deporte llamado " + deporte3.nombre
                + " es de tipo " + deporte3.tipo + " y consta de "
                + deporte3.participantes + " jugadores, ademas cada partido "
                + "dura "
                + deporte3.duracion);

        System.out.println("La pelicula llamada " + pelicula1.nombre
                + " es de "
                + " genero " + pelicula1.genero + " ,ademas su protagonista es "
                + pelicula1.protagonista + " y fue lanzada en "
                + pelicula1.año);

        System.out.println("La pelicula llamada " + pelicula2.nombre
                + " es de "
                + " genero " + pelicula2.genero + " , ademas su protagonista "
                + "es "
                + pelicula2.protagonista + " y fue lanzada en "
                + pelicula2.año);

        System.out.println("La pelicula llamada " + pelicula3.nombre
                + " es de "
                + " genero " + pelicula3.genero + " , ademas su protagonista "
                + "es "
                + pelicula3.protagonista + " y fue lanzada en "
                + pelicula3.año);

        System.out.println("El modelo de zapato " + zapato1.modelo + " es de"
                + " la "
                + " marca " + zapato1.marca + " , siendo un zapato de tipo "
                + zapato1.tipo + " el cual fue lanzado a la venta en "
                + zapato1.año);

        System.out.println("El modelo de zapato " + zapato2.modelo + " es de "
                + "la "
                + " marca " + zapato2.marca + " , siendo un zapato de tipo "
                + zapato2.tipo + " el cual fue lanzado a la venta en "
                + zapato2.año);

        System.out.println("El modelo de zapato " + zapato3.modelo + " es de"
                + " la "
                + " marca " + zapato3.marca + " , siendo un zapato de tipo "
                + zapato3.tipo + " el cual fue lanzado a la venta en "
                + zapato3.año);

        System.out.println("El genero del videojuegos es: " + video1.genero
                + " ,el peso es de: " + video1.peso + " Gb "
                + ", la puntuacion fue de: " + video1.calificacion
                + " y su lanzamiento "
                + "se dio en: " + video1.lanzamiento);

        System.out.println("El genero del videojuegos es: " + video2.genero
                + " ,el peso es de: " + video2.peso + " Gb "
                + ", la puntuacion fue de: " + video2.calificacion
                + " y su lanzamiento"
                + " se dio en: " + video2.lanzamiento);

        System.out.println("El genero del videojuegos es: " + video3.genero
                + " ,el peso es de: " + video3.peso + " Gb "
                + ", la puntuacion fue de: " + video3.calificacion
                + " y su lanzamiento"
                + " se dio en: " + video3.lanzamiento);

        System.out.println("La marca del celular es: " + celu1.marca
                + ", por lo el pais de origen:" + celu1.origen
                + "y el precio es de: " + celu1.precio + "dolares, "
                + "debido a su fecha "
                + "de lanzamiento en el: " + celu1.lanzamiento);

        System.out.println("La marca del celular es: " + celu2.marca
                + ", por lo el pais de origen:" + celu2.origen
                + "y el precio es de: " + celu2.precio + "dolares, "
                + "debido a su fecha "
                + "de lanzamiento en el: " + celu2.lanzamiento);

        System.out.println("La marca del celular es: " + celu3.marca
                + ", por lo el pais de origen:" + celu3.origen
                + "y el precio es de: " + celu3.precio + "dolares, "
                + "debido a su fecha"
                + " de lanzamiento en el: " + celu3.lanzamiento);

        System.out.println("La bebida es de marca: " + bebida1.marca + " ,"
                + "el sabor es de: " + bebida1.color
                + ", el precio es de: " + bebida1.precio + " ctv, y es: "
                + bebida1.clasificacion);

        System.out.println("La bebida es de marca: "
                + bebida2.marca + " ,"
                + "el sabor es de: " + bebida2.color
                + ", el precio es de: " + bebida2.precio + " ctv, y es: "
                + bebida2.clasificacion);

        System.out.println("La bebida es de marca: "
                + bebida3.marca
                + " ,el sabor es de: " + bebida3.color
                + ", el precio es de: " + bebida3.precio + " ctv, y es: "
                + bebida3.clasificacion);

    }
}



    

