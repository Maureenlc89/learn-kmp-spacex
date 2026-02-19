package composedemo.data.remote

import composedemo.domain.entity.RocketLaunch
import kotlinx.coroutines.flow.Flow

interface IRemoteRocketLaunchesDataSource {
    fun latestLaunches(): Flow<List<RocketLaunch>>
}