package com.ycl.car;

/**
 * 常量
 * Created by y11621546 on 2017/1/17.
 */

public class ContantValue {
    private static String IP = "";

    public static String getIP() {
        return IP;
    }

    public static void setIP(String IP) {
        ContantValue.IP = IP;
    }

    public static final String BASE_URL = "http://60.28.240.35:6300/";
    //    天气接口
    public static final String WEATHER = "http://apis.baidu.com/heweather/weather/free";
    //    public static final String WEATHER = "https://free-api.heweather.com/v5/";
    public static final String APIKEY = "eeb745dcca57aec9004b969ef2e4994f";
    public static final String DEFAULT_VALUE = "中汽工程";
    public static final String TOOLBAR_TITLE = "toolbar_title";
    public static final String TOOLBAR_RIGHT = "toolbar_right";
    public static final String TOOLBAR_LEFT = "toolbar_left";
    //    新闻
    public static final String NEWS_URL = BASE_URL + "padApi/News/Index";
    //    帖子
    public static final String BULLETIN_URL = BASE_URL + "padApi/Community/GetBulletin";
    //    登录
    public static final String LOGIN_URL = BASE_URL + "padApi/Account/login";
    //    账号资料
    public static final String UPDATE_USER_INFO_URL = BASE_URL + "padApi/Account/UpdateInfo";
    //    实时报警
    public static final String GET_ALARM_REAL_TIME_URL = BASE_URL + "padApi/Alrm/GetAlrmRealTime";
    //    更改密码
    public static final String UPDATE_PWD_URL = BASE_URL + "padApi/Account/UpdatePassword";
    //    滚床
    public static final String DIAGRAN_ITEMS_URL = BASE_URL + "padApi/Diagrame/DiagramItems";
    //    维修资料
    public static final String MAINTAIN_DATA = BASE_URL + "padApi/ZqEquipDocument/ListsDoc";
    //    智能备件库
    public static final String COMPARE_PART_LIBRARY = BASE_URL + "padApi/ZqEquipSp/ListSp";
    //    智能备件--设备详情
    public static final String COMPARE_PART = BASE_URL + "padApi/ZqEquipSp/ListEquipSp";

    //PM预防性维修计划
    public static final String PM_MAINTAAIN_PLAN = BASE_URL + "padApi/ZqEquipPM/lists";
    //TPM点检
    public static final String TPM_CHECK = BASE_URL + "padApi/ZqEquipTPM/Lists";
    //PM记录
    public static final String PM_LIST_PLAN = BASE_URL + "padApi/ZqEquipPM/listsplan";
    //TPM记录
    public static final String TPM_LIST_PLAN = BASE_URL + "padApi/ZqEquipTPM/listsplan";
    //上传并获取图片
    public static final String GET_FILE = BASE_URL + "padApi/FilesOpera/GetFiles";
    //PM保存信息
    public static final String SAVE_PM_INFO = BASE_URL + "padApi/ZqEquipPM/SaveInfo";
    //TPM保存信息
    public static final String SAVE_TPM_INFO = BASE_URL + "padApi/ZqEquipTPM/SaveInfo";
    //设备信息
    public static final String EQ_INFO = BASE_URL + "padApi/ZqEquip/Info";
    //维修信息--设备详情
    public static final String ZqEquipRepair = BASE_URL + "padApi/ZqEquipRepair/lists";
    //保存维修信息
    public static final String ZqEquipRepairSaveInfo = BASE_URL + "padApi/ZqEquipRepair/SaveInfo";
    //获取设备管理下的类别
    public static final String GetMenuByParent = BASE_URL + "padApi/Account/GetMenuByParent";
    //获取设备管理下的类别下
    public static final String DiagramItemsForLoop = BASE_URL + "padApi/Diagrame/DiagramItemsForLoop";
    //点值
    public static final String DHPointValues2 = BASE_URL + "ZQAPI/pointValue/DHPointValues2";
    //    天气
    public static final String getWeather = BASE_URL + "PadApi/Weather/Index";
    //    获取通知数量
    public static final String getNotifiNum = BASE_URL + "PadApi/ZqEquipRepair/GetIndexCount";
    //   获取指定范围需要执行的PM
    public static final String getPMListTodoList = BASE_URL + "PadApi/ZqEquipPM/ListTodoList";
    //   获取指定范围需要执行的TPM
    public static final String getTPMListTodoList = BASE_URL + "PadApi/ZqEquipTPM/ListTodoList";
    //   获取历史预警信息
    public static final String getAlrmHistory = BASE_URL + "PadApi/Alrm/GetAlrmHistory";
    //获取推送消息
    public static final String getPushList = BASE_URL + "PadApi/PushInfo/lists";
    //获取通知消息
    public static final String getMessageList = BASE_URL + "PadApi/Message/List";
    //查看推送消息
    public static final String getPushDetailInfo = BASE_URL + "PadApi/PushInfo/detail";
    //    查看通知详情
    public static final String getMessageDetailInfo = BASE_URL + "PadApi/Message/Detail";
    //获取维修信息
    public static final String getRepairInfo = BASE_URL + "PadApi/ZqEquipRepair/GetInfo";
    //获取维修信息列表
    public static final String getRepairList = BASE_URL + "PadApi/ZqEquipRepair/lists";
    //修改维修信息
    public static final String saveRepairInfo = BASE_URL + "PadApi/ZqEquipRepair/SaveInfo";
    //获取台账信息
    public static final String getLedgerInfo = BASE_URL + "PadApi/ZqEquip/YListsEq";


}
