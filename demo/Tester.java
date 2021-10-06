package demo;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		//Create a list which stores information about all participants (List<Participant>)
		//Display the information about all the finalists as follows:
		
		List<Participant> participants = new ArrayList<>();
		participants.add(new Participant("Hazel", "Singing", 29.75f));
		participants.add(new Participant("Hudson", "Instrumental", 28.00f));
		participants.add(new Participant("Enoch", "Singing", 29.95f));
		participants.add(new Participant("Bonsy", "Dance", 27.75f));
		int counter = 1;
		for (Participant p : participants) {
			System.out.println("Participant " + counter + ":");
			System.out.println(p.getParticipantName());
			System.out.println(p.getParticipantTalent());
			System.out.println(p.getParticipantScore());
			counter++;
			System.out.println("");

		}
		//Print the name of the participant with the highest score along with the score:
		Float highestScore = participants.get(0).getParticipantScore();
		for (int i = 1; i < participants.size(); i++) {
			Float participantScore = participants.get(i).getParticipantScore();
			if (participantScore > highestScore) {
				highestScore = participantScore;
				System.out.println("The Participant with Highest Score is: ");
				System.out.println(participants.get(i).getParticipantName());
				System.out.println(highestScore);
			}

		}

	}

}
