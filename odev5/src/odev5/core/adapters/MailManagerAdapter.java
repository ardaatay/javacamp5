package odev5.core.adapters;

public class MailManagerAdapter implements MailService {

	@Override
	public void send(String from, String message) {
		System.out.println("Mail g�nderildi " + from);
	}
}