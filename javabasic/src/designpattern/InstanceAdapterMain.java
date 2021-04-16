package designpattern;

abstract class BeforeTarget {
	abstract void process();
}

class InstanceAdapter extends BeforeTarget {
	private PrevSystem prevSystem;
	
	public InstanceAdapter() {
		super();
		prevSystem = new PrevSystem();
	}


	@Override
	public void process() {
		prevSystem.prevProcess();
	}
}

public class InstanceAdapterMain {
	public static void main(String[] args) {
		BeforeTarget target = new InstanceAdapter();
		target.process();
	}
}
