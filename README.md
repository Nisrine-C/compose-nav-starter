# Jetpack Compose Navigation Demo

A simple Android app demonstrating best practices for navigation using Jetpack Compose. 

---

## Features

- **Modern UI:** Built fully with Jetpack Compose and Kotlin
- **Type-safe Navigation:** Utilizes Compose’s navigation Graph and sealed classes for routing
- **Multi-Screen Setup:** Easily switch between multiple screens with arguments
- **Project Structure:** Well-organized Kotlin packages for screens, navigation, and UI logic
- **Starter Reference:** Suitable for learning or bootstrapping Compose navigation

---

## Project Structure

```
app/
└── src/
    └── main/
        └── java/
            └── fr/
                └── iutlan/
                    └── a04_03_navigation/
                        ├── MainActivity.kt
                        ├── MainScreen.kt
                        ├── navigation/      # Navigation graph, route definitions
                        ├── Screen/          # Each screen as a composable function
                        └── ui/              # UI components, themes, etc
```

---

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Nisrine-C/JetPackCompose_Navigation_App.git
   ```
2. **Open with Android Studio (Arctic Fox or newer)**
3. **Build & Run:**  
   The app will launch on an emulator or device.

---

## Example: Navigation with Arguments

```kotlin
navController.navigate("profile/{$userId}")
```

- See `navigation` folder for route and argument passing.

---

## Requirements

- Android Studio (Arctic Fox or newer)
- Kotlin 1.5+
- Jetpack Compose 1.0+

---

## License

MIT (or your chosen license).

---

## Acknowledgments

- [Jetpack Compose Navigation documentation](https://developer.android.com/jetpack/compose/navigation)
- [Android Developers Samples](https://github.com/android/compose-samples)
