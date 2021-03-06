package clue.action;

public class PlayerActionChooseToken extends PlayerAction {
	// Member variables
	protected String tokenId;
	
	// Constructor
	public PlayerActionChooseToken(String playerId, String tokenId) {
		super(playerId, PlayerActionType.CHOOSE_TOKEN);
		this.tokenId = tokenId;
	}
	
	// Get methods
	public String getTokenId() {
		return tokenId;
	}
	
	// Output
	public String toString() {
		return "Player " + playerId + " chooses token " + tokenId;
	}
}
