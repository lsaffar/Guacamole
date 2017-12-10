/**
 * 
 */
package Model;

import java.util.ArrayList;

/**
 * @author lea
 * 
 * Liste des participants
 *
 */
public class Participants<E> {

	private ArrayList<E> participantsList;
	
	/**
	 * Constructeur par default (List vide)
	 */
	public Participants() {
		this.participantsList = new ArrayList<E>();
	}

	/** 
	 * @return Liste des participants
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
	 * Rajoute un element dans la liste
	 * @param element
	 */
	public void addParticipantsList(E element) {
		this.participantsList.add(element);
	}

	@Override
	public String toString() {
		String toString = "";
		int tailleList = participantsList.size();
		
		for(int i = 0; i < tailleList; i++) {
			toString += participantsList.get(i) + " | ";
		}
		
		return toString;
	}
}
