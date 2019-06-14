# NoSense-Android
无感sdk，通过本文档可以轻松集成，创造收益。

### 权限管理，需要在manifest文件中添加以下权限
```java
 <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <uses-permission android:name="android.permission.READ_PHONE_STATE" />
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
  ```
  
### 集成代码
1、需要在applacation中添加以下代码
  ```java
   SDPSDK.getInstance().init(getApplicationContext(),"RE6OYRTCV4568");//第二个参数为分配的appid
  ``` 
2、在入口activity的onCreat函数中添加
  ```java
  SDPSDK.getInstance().initActivity(this);
  ```
  如果您的sdk版本>=23，那么需要进行 Android6.0以上的权限适配，同在如果activity中的onCreat函数中执行以下代码
  ```java
   if (Build.VERSION.SDK_INT >= 23) {
            checkAndRequestPermission();
        }else{
            SDPSDK.getInstance().start();
        }
   ```
   其中checkAndRequestPermission函数为权限校验，可以更改为自己项目中的校验权限函数。权限校验通过之后执行start函数。
   
  

## 混淆说明
内部进行了混淆，若您的项目有混淆需要添加以下配置：
```java
-dontwarn com.tianpeng.sdplink.**
-keep class com.tianpeng.sdplink.service.**{*;}
-keep class com.android.**{*;}
-keep class com.tianpeng.sdplink.http.**{	*;	}
```

