package compose.project.demo.composedemo

import androidx.compose.ui.window.ComposeUIViewController

// composeApp/src/iosMain/kotlin/compose/project/demo/composedemo/MainViewController.kt
fun MainViewController() = ComposeUIViewController(configure = { initKoin() }) { App() }