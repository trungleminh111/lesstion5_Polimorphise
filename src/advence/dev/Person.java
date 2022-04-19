package advence.dev;

public class Person {
	private String name;
	private int old;
	public Person(String name, int old) {
		super();
		this.name = name;
		this.old = old;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		if(old>=1) {
			this.old = old;
	}
  }
}
