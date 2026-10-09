package com.laioffer.netflix

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@ActivityScoped
class Car @Inject constructor(private val engine: Engine) {
}


//@Singleton
//@ActivityScoped
//class Engine @Inject constructor() {
//
//}

interface Engine {

}

class GasEngine() : Engine

@Module
@InstallIn(SingletonComponent::class)
object EngineModule {

    @Provides
    fun provideEngine(): Engine {
        return GasEngine()
    }
}
