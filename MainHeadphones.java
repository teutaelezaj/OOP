
public class MainHeadphones {

	public static void main(String[] args) {
		Headphones h = new Headphones();

		
		System.out.println(h.color);
		System.out.println(h.charge);
		System.out.println(h.controls);
		
		System.out.println(h.power);
		
		h.powerOn();
		
		System.out.println(h.power);
		
		h.powerOff();
		
		System.out.println(h.power);
		
	}

}
