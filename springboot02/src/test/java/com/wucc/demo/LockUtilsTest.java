package com.wucc.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.wucc.demo.LockUtils.lock;
import static com.wucc.demo.LockUtils.unlock;

/**
 * ⼯作10年的前阿⾥P7分享Java、算法、数据库⽅⾯的技术⼲货！坚信⽤技术改变命运，让家
 ⼈过上更体⾯的⽣活！
 * 关注公众号：⼤侠学JAVA获取更多⾼质量资料
 */
@Slf4j
public class LockUtilsTest {
	//测试重复获取和重复释放
	@Test
	public void test1() throws Exception {
		String lock_key = "key1";
		for (int i = 0; i < 10; i++) {
			lock(lock_key, 10000L, 1000);
		}
		for (int i = 0; i < 9; i++) {
			unlock(lock_key);
		}
	}
	//获取之后不释放，超时之后被thread1获取
	@Test
	public void test2() throws Exception {
		String lock_key = "key2";
		lock(lock_key, 5000L, 1000);
		Thread thread1 = new Thread(() -> {
			try {
				try {
					lock(lock_key, 5000L, 7000);
				} finally {
					unlock(lock_key);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		thread1.setName("thread1");
		thread1.start();
		thread1.join();
	}
}
