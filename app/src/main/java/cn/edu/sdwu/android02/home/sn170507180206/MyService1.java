package cn.edu.sdwu.android02.home.sn170507180206;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import java.util.Random;

public class MyService1 extends Service {
    private Random random;
    private MyBinder myBinder;

    @Override
    public void onCreate() {
        super.onCreate();
        random=new Random();
        myBinder=new MyBinder();

}

    public MyService1() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        Log.i(MyService1 .class.toString(),"onBind");
        return  myBinder;
    }
    @Override
    public boolean onUnbind(Intent intent) {
        Log.i(MyService1 .class.toString(),"onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        Log.i(MyService1 .class.toString(),"onDestory");
        super.onDestroy();
    }

    public class MyBinder extends Binder {
        public MyService1 getRandomService(){
            return MyService1.this;
        }
    }

    public int genRandom(){
        return random.nextInt();
    }
}






















