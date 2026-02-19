package compose.project.demo.composedemo.di.modules

import composedemo.data.remote.IRemoteRocketLaunchesDataSource
import composedemo.data.remote.RemoteRocketLaunchesDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.koin.dsl.module

val dataModule = module {
    single<IRemoteRocketLaunchesDataSource> {
        RemoteRocketLaunchesDataSource(
            get(),
            Dispatchers.IO
        )
    }
}