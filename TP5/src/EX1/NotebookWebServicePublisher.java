package EX1;

import javax.xml.ws.Endpoint;

public class NotebookWebServicePublisher {
	public static void main(String[] args) throws ClassNotFoundException {
		Endpoint.publish("http://localhost:8888/ws/NoteBookService", new NotebookServiceImpl());
	}
}
