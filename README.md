##STEPS TO PUBLISH A JAR 

WARNING: If jfrog artifactory is already installed and runnable **`jump to step 4`**

###JFrog Side
  1. download jfrog artifactory via https://www.jfrog.com/open-source/
  2. unzip the file onto a folder which will be the **artifactory_folder_home_path**
  3. run **artifactory.sh** file where located in **artifactory_folder_home_path\bin** folder 
  4. Ensure that if **http://localhost:8081/artifactory/** (this link represents artifactory url) is running or not
  
###Code Side
  1. pull the project from github
  2. change **artifactory_user** and **artifactory_password** fields as needed in gradle.properties file. 
  ```
  repository_url=http://localhost:8081/artifactory/plugins-release
  artifactory_user=*****
  artifactory_password=*****
  artifactory_contextUrl=http://localhost:8081/artifactory
  ```
  
  3. to avoid any conflict, version number can be incremented by the programmer if he/she is going to make any change. To do this
  open build.gradle file and modify **version**'s value
  4. in order to publish a jar, run below command 
  
    ```
    /gradlew clean build artifactoryPublish --stacktrace
    ```

##STEPS TO IMPORT A JAR AS DEPENDENCY

###sample Java Project build.gradle file

```gradle
group 'deneme'
version '1.0-SNAPSHOT'

apply plugin: 'java'

sourceCompatibility = 1.5

repositories {
    mavenCentral()
    maven { url "http://localhost:8081/artifactory/libs-release-local" }
}


dependencies {
    compile('com.mavi:restmodels:1.0.3')
    testCompile group: 'junit', name: 'junit', version: '4.11'
}
```


###sample Android Project build.gradle files

**1. Top level build.gradle file**
```gradle
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
  repositories {
    jcenter()
  }
  dependencies {
    classpath 'com.android.tools.build:gradle:2.2.3'
  }
}

allprojects {
  repositories {
    jcenter()
    maven { url "http://localhost:8081/artifactory/libs-release-local" }
  }
}

task clean(type: Delete) {
  delete rootProject.buildDir
}
```

**2. App level build.gradle file**
```gradle
apply plugin: 'com.android.application'

android {
  compileSdkVersion 25
  buildToolsVersion "25.0.1"
  defaultConfig {
    applicationId "com.mavi.artifactdeneme"
    minSdkVersion 15
    targetSdkVersion 25
    versionCode 1
    versionName "1.0"
    testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
  }
  buildTypes {
    release {
      minifyEnabled false
      proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
    }
  }
}

dependencies {
  compile fileTree(dir: 'libs', include: ['*.jar'])
  androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
    exclude group: 'com.android.support', module: 'support-annotations'
  })

  compile('com.mavi:restmodels:1.0.3')

  compile 'com.android.support:appcompat-v7:25.0.1'
  testCompile 'junit:junit:4.12'
}
```

