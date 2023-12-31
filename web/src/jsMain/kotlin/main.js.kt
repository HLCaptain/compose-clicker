import androidx.compose.ui.window.Window
import illyan.clicker.App
import illyan.clicker.util.log.initNapier
import org.jetbrains.skiko.wasm.onWasmReady
import org.koin.core.context.startKoin
import org.koin.ksp.generated.defaultModule

fun main() {
    initNapier()
    startKoin { defaultModule() }
    onWasmReady {
        Window("demo") {
            App()
        }
    }
}