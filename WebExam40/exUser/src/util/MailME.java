package util;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailME {
	String FROM = "kkang17859@naver.com";
	String FROMNAME = "최문환";
	String subject;
	String TO = "newinn94@naver.com";
	String SMTP_USERNAME = "kkang17859";
	String SMTP_PASSWORD = "Aansghks123!";
	String HOST = "smtp.naver.com";
	// String BODY = contents;//밑에서 처리함
//          
//          String.join(
//   System.getProperty("line.separator"),
//   "<h1>메일 내용</h1>",
//   "<p>이 메일은 아름다운 사람이 "+contents+"보낸 아름다운 메일입니다!</p>");
	int PORT = 587;

	public MailME() {
	};

	public MailME(String subject, String contents, String email)
			throws AddressException, UnsupportedEncodingException, MessagingException {
		this.subject = subject;
		this.TO = email;
		mailsend(contents);
	}

	public void mailsend(String contents) throws UnsupportedEncodingException, MessagingException {

		Properties props = System.getProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.port", PORT);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props);

		MimeMessage msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(FROM, FROMNAME));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
		msg.setSubject(subject);
		msg.setContent(contents, "text/html;charset=UTF-8");

		Transport transport = session.getTransport();

		try {
			System.out.println("Sending...");

			transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
			transport.sendMessage(msg, msg.getAllRecipients());

			System.out.println("Email sent!");
		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			transport.close();
		}
	}

	int imsi() {
		int imsi = (int) Math.random() * 10;

		return 1;
	}
}
