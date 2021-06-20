package ue7.port;

import java.util.ArrayList;
import java.util.List;

public class Port {
	
	public static void main(String[] args) {
		final Containership s = new Containership("Annemarie",
				200, 40, 700);
		final List<Container> containers = new ArrayList<>();
		
		while (true) {
			Container c = Terminal.createContainer();
			try {
				if (Terminal.load(s, c)) containers.add(c);
			} catch(ContainerLoadingException ex) {
				System.out.println("Error loading the container: " + ex.toString());
			}
			s.listFreight();
		}
	}
	
}
