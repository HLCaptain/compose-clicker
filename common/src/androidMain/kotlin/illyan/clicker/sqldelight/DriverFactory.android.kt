package illyan.clicker.data.sqldelight

import android.content.Context
import app.cash.sqldelight.async.coroutines.synchronous
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.db.SqlSchema
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import org.koin.core.context.GlobalContext.get

actual suspend fun provideSqlDriver(schema: SqlSchema<QueryResult.AsyncValue<Unit>>): SqlDriver {
    return AndroidSqliteDriver(schema.synchronous(), get().get<Context>(), "demo.db")
}
