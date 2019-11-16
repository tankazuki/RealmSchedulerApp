package kazuki.app.realmschedulerapp

import android.app.Application
import io.realm.Realm

class RealmSchedulerAppApplication : Application() {
    override fun onCreate(){
        super.onCreate()
        Realm.init(this)
    }
}