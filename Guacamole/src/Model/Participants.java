/**
 * 
 */
package Model;

import java.util.ArrayList;

/**
 * @author lea
 *
 */
public class Participants<E> {

	private ArrayList<E> participantsList;

	public Participants() {
		this.participantsList = new ArrayList<>();
	}

	public Participants(ArrayList<E> participantsList) {
		this.participantsList = participantsList;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<E> getParticipantsList() {
		return participantsList;
	}

	/**
	 * 
	 * @param participantsList
	 */
	public void setParticipantsList(ArrayList<E> participantsList) {
		this.participantsList = participantsList;
	}

	/**
	 * 
	 * @param element
	 */
	public void addParticipantsList(E element) {
		this.participantsList.add(element);
	}

	/**
	 * 
	 * @param element
	 * @return <code>true</code> si <code>element</code> est dans la liste.
	 */
	public boolean contains(E element) {
		return participantsList.contains(element);
	}

	@Override
	public String toString() {
		String toString = "";
		int tailleList = participantsList.size();

		for (int i = 0; i < tailleList; i++) {
			toString += participantsList.get(i) + " | ";
		}

		return toString;
	}
}
