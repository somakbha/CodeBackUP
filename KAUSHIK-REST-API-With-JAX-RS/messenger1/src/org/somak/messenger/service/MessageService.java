package org.somak.messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.somak.messenger.database.DatabaseClass;
import org.somak.messenger.exception.DataNotFoundException;
import org.somak.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public MessageService() {
		messages.put(1L, new Message(1, "hello world", "somak"));
		messages.put(2L, new Message(2, "hello bangalore", "somak"));
	}

	public List<Message> getAllMessages() {

		return new ArrayList<Message>(messages.values());
	}
	
	public List<Message> getAllMessagesForYear(int year) {
		List<Message> messagesForYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for (Message message : messages.values()) {
			cal.setTime(message.getCreated());
			if (cal.get(Calendar.YEAR) == year) {
				messagesForYear.add(message);
			}
		}
		return messagesForYear;
	}
	
	public List<Message> getAllMessagesPaginated(int start, int size) {
		ArrayList<Message> list = new ArrayList<Message>(messages.values());
		if (start + size > list.size()) return new ArrayList<Message>();
		return list.subList(start, start + size); 
	}
	

	public Message getMessage(long msgId) {

		Message msg=messages.get(msgId);
		if (msg==null)
		{
		throw new DataNotFoundException("no message found");
		}
		return msg;
	}

	public Message addMessage(Message msg) {
		long messageid = messages.size() + 1;
		msg.setId(messageid);
		messages.put(messageid, msg);
		return msg;
	}

	public Message updateMessage(Message msg) {
		if (msg.getId() <= 0) {
			return null;

		}
		messages.put(msg.getId(), msg);
		return msg;
	}

	public Message deleteMessage(long msgId) {

		return messages.remove(msgId);

	}

	// old implementation

	/*
	 * Message m1=new Message(1, "hello world", "somak"); Message m2=new Message(1,
	 * "hello jersey", "saptak"); Message m3=new Message(1, "hello bengaluru",
	 * "piyali");
	 * 
	 * public List<Message> getAllMessages() { ArrayList <Message> list=new
	 * ArrayList <Message> (); list.add(m1); list.add(m2); list.add(m3);
	 * 
	 * return list; }
	 */

}