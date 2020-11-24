package com.wucc.lesson0.demo03;

import com.wucc.lesson0.demo03.scope.ThreadScope;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.transform.Source;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-18 14:44
 */
public class ThreadScopeTest {

	public static void main(String[] args) throws InterruptedException {
		String beanXml = "classpath:/com/wucc/lesson0/demo03/bean.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(){
			@Override
			protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
				beanFactory.registerScope(ThreadScope.THREAD_SCOPE,new ThreadScope());
				super.postProcessBeanFactory(beanFactory);
			}
		};
		applicationContext.setConfigLocation(beanXml);
		applicationContext.refresh();

		for (int i = 0;i<10;i++){
			new Thread(() -> {
				System.out.println(Thread.currentThread()+","+applicationContext.getBean("threadBean"));
				System.out.println(Thread.currentThread()+","+applicationContext.getBean("threadBean"));
			}).start();
			TimeUnit.SECONDS.sleep(1);
		}
	}



}
