KnifeHub -- Catálogo de Cuchillos con Favoritos

Aplicación móvil desarrollada para el **Parcial 2 -- Aplicaciones
Móviles**\
Instituto Da Vinci · Profesor: Sergio Medina

Descripción

**KnifeHub** es una app Android nativa desarrollada en **Java**, que
muestra un catálogo de cuchillos con imágenes reales, detalle completo y
un sistema de favoritos **persistente** con SharedPreferences.

El usuario puede: - Visualizar una lista dinámica de cuchillos
(RecyclerView) - Ver detalles completos del producto - Agregar o quitar
favoritos - Navegar entre pantallas usando Intents - Guardar datos en
almacenamiento local

Tecnologías utilizadas

-   Java
-   Android Studio
-   RecyclerView
-   ConstraintLayout / LinearLayout
-   SharedPreferences
-   Intents y Bundles
-   XML Layouts
-   Git + GitHub

Estructura principal del proyecto

    app/
     ├─ java/
     │   ├─ Knife.java
     │   ├─ KnifeData.java
     │   ├─ KnifeAdapter.java
     │   ├─ KnifeListActivity.java
     │   ├─ KnifeDetailActivity.java
     │   ├─ FavoritosActivity.java
     │
     ├─ res/
     │   ├─ layout/
     │   │   ├─ activity_main.xml
     │   │   ├─ activity_knife_list.xml
     │   │   ├─ activity_knife_detail.xml
     │   │   ├─ activity_favoritos.xml
     │   │   ├─ item_cuchillo.xml
     │   ├─ drawable/ (imágenes)
     │   ├─ values/ (colors, strings, themes)
     │
     ├─ AndroidManifest.xml

⭐ Funcionalidades principales

-   Lista dinámica (RecyclerView)\
-   Pantalla de detalle con datos completos\
-   Botón para agregar/quitar favoritos\
-   Favoritos persistentes con SharedPreferences\
-   Navegación entre pantallas con Intents\
-   Recursos organizados (strings, colors, themes)\
-   Diseño limpio y funcional

Testing

-   La app mantiene los favoritos incluso al cerrar\
-   La navegación entre pantallas es correcta\
-   Todas las imágenes cargan sin errores\
-   Las listas funcionan dinámicamente

Integrantes

-   Ormazabal Marcelo // DNI 29356069

Repositorio

https://github.com/marceloormazabal/parcial-2-am-acn4a-ormazabal-marcelo.git

Permisos

El repositorio fue compartido con el profesor: **@sergiomedinaio**
