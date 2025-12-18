KnifeHub — Catálogo de Cuchillos con Autenticación y Favoritos

Aplicación móvil desarrollada para el FINAL — Aplicaciones Móviles
Instituto Da Vinci · Profesor: Sergio Medina

📱 Descripción

KnifeHub es una aplicación Android nativa desarrollada en Java, que permite a los usuarios autenticarse mediante Firebase Authentication y acceder a un catálogo de cuchillos con imágenes reales, vista de detalle y un sistema de favoritos persistente.

La aplicación está pensada como un proyecto integral que combina autenticación, navegación entre pantallas, listas dinámicas y persistencia de datos locales, cumpliendo con los contenidos vistos durante la cursada.

👤 Funcionalidades del usuario

El usuario puede:

Registrarse e iniciar sesión mediante email y contraseña (Firebase Auth)

Cerrar sesión de forma segura

Visualizar un listado dinámico de cuchillos (RecyclerView)

Acceder al detalle completo de cada cuchillo

Agregar o quitar cuchillos de favoritos

Visualizar una pantalla exclusiva de favoritos

Mantener los favoritos guardados incluso al cerrar la aplicación

Navegar entre pantallas utilizando Intents

🛠️ Tecnologías utilizadas

Java

Android Studio

Firebase Authentication

RecyclerView

ConstraintLayout / LinearLayout

SharedPreferences

Intents y Bundles

XML Layouts

Git + GitHub

Estructura principal del proyecto

   app/
 ├─ java/
 │   ├─ Knife.java
 │   ├─ KnifeData.java
 │   ├─ KnifeAdapter.java
 │   ├─ KnifeListActivity.java
 │   ├─ KnifeDetailActivity.java
 │   ├─ FavoritosActivity.java
 │   ├─ LoginActivity.java
 │   ├─ MainActivity.java
 │
 ├─ res/
 │   ├─ layout/
 │   │   ├─ activity_login.xml
 │   │   ├─ activity_main.xml
 │   │   ├─ activity_knife_list.xml
 │   │   ├─ activity_knife_detail.xml
 │   │   ├─ activity_favoritos.xml
 │   │   ├─ item_cuchillo.xml
 │   ├─ drawable/ (imágenes y shapes)
 │   ├─ values/ (colors, strings, themes)
 │
 ├─ AndroidManifest.xml


⭐ Funcionalidades principales

Autenticación de usuarios con Firebase Auth

Lista dinámica de productos mediante RecyclerView

Pantalla de detalle con información completa

Sistema de favoritos con persistencia local

Navegación entre actividades usando Intents

Gestión de sesión (login / logout)

Recursos organizados y reutilizables

Diseño claro, simple y funcional

🧪 Testing y validaciones

La autenticación funciona correctamente (login / registro / logout)

La sesión se mantiene activa hasta cerrar sesión

Los favoritos se conservan al cerrar la app

La navegación entre pantallas es correcta

Las listas se cargan dinámicamente sin errores

Las imágenes se visualizan correctamente

👤 Integrante

Ormazabal Marcelo
DNI: 29.356.069

Repositorio
https://github.com/marceloormazabal/final-am-acn4a-ormazabal-marcelo.git

Permisos

El repositorio fue compartido con el profesor: **@sergiomedinaio**
