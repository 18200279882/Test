package com.unionpay.test;

public class Binary_Rpc_Thread extends Thread {
	
	private String name;
	public Binary_Rpc_Thread(String name) {
         this.name=name;// 给线程名字赋值
    }
	
	static int tick = 1;

	// 创建一个静态钥匙
	//static Object mylock = "hello";// 值是任意的
	
	// 重写run方法，实现买票操作
	@Override
	public void run() {
		while (tick  <=20) {
			//synchronized (mylock) {// 这个很重要，必须使用一个锁，进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
				if (tick <=20) {
					if (name.equals("bj")) {
						System.out.println("第"+tick+"次执行了"+name);
					}else{
						System.out.println("第"+tick+"次执行了"+name);
					}
					tick++;
				} else {
					System.out.println("结束！");
				}
			}
/*			try {
				sleep(1000);// 休息一秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/

		}
//	}
}
