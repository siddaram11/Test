package whatsapp;

public class WhatsApp2 extends WhatsApp1 {
	@Override
	public void sendMessage() {
		super.sendMessage();
		System.out.println("Double  Tick Supported");
	}

	public void call() {
		System.out.println("Voice Calling is Supported");
		System.out.println("Voice Calling is Supported");
	}

}
