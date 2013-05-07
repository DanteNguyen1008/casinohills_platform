package kibow.games.casinohills_platform.network;

public class PlatformEntity {
	// Implement single ton
	private static PlatformEntity INSTANCE = null;

	protected PlatformEntity() {

	}

	public static PlatformEntity getInstance() {
		if (INSTANCE == null)
			INSTANCE = new PlatformEntity();
		return INSTANCE;
	}
	
	public ConnectionHandler connectionHandler;
	public final static String SIGNIN_TASK = "login";
	public final static String SIGNUP_TASK = "signup";
	public final static String SIGNOUT_TASK = "logout";
	public final static String CHANGE_PASSWORD_TASK = "changepassword";
	public final static String FORGOT_PASSWORD_TASK = "resetpassword";

	public final static String STARTGAME_TASK = "bet";

	public final static String VIEW_HISTORY = "view_bet_history";
	public final static String VIEW_HISTORY_NEXT = "view_bet_history_next";
	
	public final static String GAME_ID = "29498045139779584";
}
