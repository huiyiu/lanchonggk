package com.lanchong.constant;


public class RedisServerKeys {
	// 项目前缀
	public final static  String PROJECT_NAME = ":";
	// 手机验证码
	public final static String VERIFY_CODE = PROJECT_NAME + "VC:SMS:";
	// 图片验证码
	public final static String IMG_VC = PROJECT_NAME + "VC:IMG:";
	// 注册手机短信一天获取次数限制
	public final static String REG_SMS_LIMITED = PROJECT_NAME + "SMS:REG:";
	// AB版切换KEY
	public final static String DAY_TIME_COUNTER = PROJECT_NAME + "COUNTER:DAY:";
	// 配资倍数限制KEY mutiple
	public final static String TRADE_LIMITED_MUTIPLE = PROJECT_NAME + "CLIMITED:MUTIPLE";
	// 关闭配资类型
	public final static String TRADE_LIMITED_PZTYPE = PROJECT_NAME + "TRADE:LIMITED:PZTYPE";
	// 流水号
	public final static String COUNTER = PROJECT_NAME + "CT:";
	// 交易路由开关
	public final static String TRADE_ROOTER = PROJECT_NAME + "TRADE:ROOTER";
	// 踢出当前登录的用户
	public final static String USER_KICKOUT = PROJECT_NAME + "U:KO:";
	//个人推广短信分享，每日可获取分享短信的次数
	public final static String USER_SHAREMSG_COUNT = PROJECT_NAME + "U:SHAREMSG:COUNT:";
	//个人连续签到的天数
	public final static String USER_SIGNIN_COUNT = PROJECT_NAME + "U:SIGNIN:COUNT:";

	//订阅频道
	public final static String SMS_SUBSCRIBE_CHANNEL = PROJECT_NAME + "SMS:SUB:CN";

	//对触及警戒线的合约用户发送触及短信限制
	public final static String ALERT_SMS = "CONTRACT_ALERTPERCENT_";
}
