# ProductListApp 📱

Aplicación Android desarrollada en Kotlin para mostrar un listado de productos.

## Características

- Visualización de productos en una lista con RecyclerView
- Arquitectura MVVM con ViewModel
- Pruebas unitarias para verificar el comportamiento de carga de datos

## Requisitos

- Android Studio Electric Eel o superior
- Kotlin 1.9+
- SDK Android 21+

## Cómo ejecutar

1. Cloná o descomprimí este proyecto.
2. Abrí Android Studio y seleccioná `Open Project`.
3. Ejecutá la app en un emulador o dispositivo.
4. Para correr los tests, hacé clic derecho en `ProductViewModelTest` > `Run`.

## Estructura

```
├── data/
│   └── Product.kt
├── ui/
│   ├── ProductAdapter.kt
│   ├── ProductViewModel.kt
│   └── MainActivity.kt
├── layout/
│   ├── activity_main.xml
│   └── item_product.xml
└── test/
    └── ProductViewModelTest.kt
```

---

Desarrollado para QA testing en entorno e-commerce 🧪🛒
