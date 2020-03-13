package GuardedBlockSynchronized;

public class ConsumerSynchronized implements Runnable {
	LimitedBufferUnsafe<Product> buff;
	volatile boolean isAlive = false;

	public ConsumerSynchronized(LimitedBufferUnsafe<Product> buff) {
		this.buff = buff;
	}

	public void run() {
		isAlive = true;
		while (isAlive) {
			synchronized (buff) {
				while (buff.isEmpty()) {
					try {
						buff.wait(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (isAlive) {
					Product p = buff.get();
					//System.out.printf("%d %s\n",p.getCode(), Thread.currentThread().getName());
				}
				buff.notifyAll();
			}
		}
		System.out.printf(" %s finished consumer\n", Thread.currentThread().getName());
	}

	public void stop() {
		this.isAlive = false;
	}
}