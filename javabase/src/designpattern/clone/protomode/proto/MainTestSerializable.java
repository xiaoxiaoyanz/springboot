package designpattern.clone.protomode.proto;

import designpattern.clone.protomode.EventTemplate;

import java.io.*;
import java.util.Random;


public class MainTestSerializable {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int i = 0;
		int MAX_COUNT = 10;
		EventTemplate et = new EventTemplate("9月份信用卡账单", "国庆抽奖活动...");

		Mail mail = new Mail(et);

		while (i < MAX_COUNT) {
			// 以下是每封邮件不同的地方
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(mail);
			byte[] bytes = bos.toByteArray();

			ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bis);
			Mail cloneMail = (Mail)ois.readObject();
			cloneMail.setContent(getRandString(5) + ",先生（女士）:你的信用卡账单..."
					+ mail.getTail());
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8)
					+ ".com");
			// 然后发送邮件
			sendMail(cloneMail);
			i++;
		}

	}

	public static String getRandString(int maxLength) {
		String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}

	public static void sendMail(Mail mail) {
		System.out.println("标题：" + mail.getSubject() + "\t收件人："
				+ mail.getReceiver() + "\t内容：" + mail.getContent()
				+ "\t....发送成功！");
	}

}
