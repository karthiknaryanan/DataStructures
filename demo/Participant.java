package demo;

public class Participant {

	private String participantName;
	private String participantTalent;
	private Float participantScore;

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public String getParticipantTalent() {
		return participantTalent;
	}

	public void setParticipantTalent(String participantTalent) {
		this.participantTalent = participantTalent;
	}

	public Float getParticipantScore() {
		return participantScore;
	}

	public void setParticipantScore(Float participantScore) {
		this.participantScore = participantScore;
	}

	public Participant(String participantName, String participantTalent, Float participantScore) {
		this.participantName = participantName;
		this.participantTalent = participantTalent;
		this.participantScore = participantScore;
	}
	
	

}
