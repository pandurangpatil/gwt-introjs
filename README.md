gwt-introjs
===========


   GWT wrapper on top of Javascript library of introjs http://usablica.github.io/intro.js/
   
**Usage**
--------
Inherit main GWT module ```	<inherits name="com.agnie.gwt.introjs.IntroJs" />```

**Maven Dependency**
```
		<dependency>
			<groupId>com.agnie.gwt</groupId>
			<artifactId>introjs</artifactId>
			<version>1.0-SNAPSHOT</version>
			<scope>provided</scope>
		</dependency>
```

Sample Code

```
import com.agnie.gwt.introjs.client.AfterChangeEvent;
import com.agnie.gwt.introjs.client.AfterChangeHandler;
import com.agnie.gwt.introjs.client.BeforeChangeEvent;
import com.agnie.gwt.introjs.client.BeforeChangeHandler;
import com.agnie.gwt.introjs.client.ChangeEvent;
import com.agnie.gwt.introjs.client.ChangeHandler;
import com.agnie.gwt.introjs.client.CompleteEvent;
import com.agnie.gwt.introjs.client.CompleteHandler;
import com.agnie.gwt.introjs.client.ExitEvent;
import com.agnie.gwt.introjs.client.ExitHandler;
import com.agnie.gwt.introjs.client.IntroJs;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;

/**
 * @author Pandurang Patil
 *
 */
public class IntroJsEntryModuleTest implements EntryPoint {

    @Override
    public void onModuleLoad() {
        IntroJs instance = new IntroJs();
        instance.start();
        instance.addChangeHandler(new ChangeHandler() {

            @Override
            public void onChange(ChangeEvent event) {
                GWT.log("change event fired...");
            }
        });
        instance.addBeforeChangeHandler(new BeforeChangeHandler() {

            @Override
            public void onBeforeChange(BeforeChangeEvent event) {
                GWT.log("Before change event fired...");
            }
        });
        instance.addAfterChangeHandler(new AfterChangeHandler() {

            @Override
            public void onAfterChange(AfterChangeEvent event) {
                GWT.log("After change event fired...");
            }
        });

        instance.addCompleteHandler(new CompleteHandler() {

            @Override
            public void onComplete(CompleteEvent event) {
                GWT.log("On Complete event fired...");
            }
        });

        instance.addExitHandler(new ExitHandler() {

            @Override
            public void onExit(ExitEvent event) {
                GWT.log("Exit event fired...");
            }
        });
    }
}
```


**Maven Repository**

```
   <repositories>
      <repository>
         <id>Agnie repo</id>
         <url>https://github.com/pandurangpatil/mvn-repo/raw/master/releases</url>
      </repository>
   </repositories>
```

**Important Note:** 
------
Wrapper for all features are not added, Please feel free to make changes add wrappers for remaining features.

