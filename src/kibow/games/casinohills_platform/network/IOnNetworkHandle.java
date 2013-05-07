package kibow.games.casinohills_platform.network;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;

public interface IOnNetworkHandle {
	public void onNetwokrHandle(JSONObject result,
			ConnectionHandler connectionHandler, Activity activity)
			throws JSONException;
	public void onNetworkError();
}
