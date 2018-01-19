package protocol;

import java.io.Serializable;

public class Protocol implements Serializable{
	private static final long serialVersionUID = 1861050339906354967L;
	protected boolean Protocol_Bool;
	private Integer Protocol_ID;
	public static int CHAT = 0,
					  GAME = 1,
					  PLAYER_ENTRY = 2,
					  GAME_RULE = 3,
					  GAME_STARTABLE = 4,
					  GAME_STARTER_KIT = 5,
					  RANKING = 6;

	public Protocol(int id){
		Protocol_ID = id;
	}
	
	public Protocol(int id, boolean bool) {
		Protocol_ID = id;
		Protocol_Bool = bool;
	}
	
	public Integer getProtocol_ID() {
		return Protocol_ID;
	}

	public void setProtocol_ID(Integer protocol_ID) {
		Protocol_ID = protocol_ID;
	}

	public boolean isProtocol_Bool() {
		return Protocol_Bool;
	}

	public void setProtocol_Bool(boolean protocol_Bool) {
		Protocol_Bool = protocol_Bool;
	}

}
