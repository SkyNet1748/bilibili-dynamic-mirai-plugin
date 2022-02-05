package top.colter.mirai.plugin.bilibili.data

import net.mamoe.mirai.console.data.ReadOnlyPluginConfig
import net.mamoe.mirai.console.data.ValueDescription
import net.mamoe.mirai.console.data.value

object BiliPluginConfig : ReadOnlyPluginConfig("BiliPluginConfig") {

    @ValueDescription("管理员")
    val admin: String by value("")

    @ValueDescription("推送模式\n0: 文字推送\n1: 图片推送")
    val pushMode: Int by value(1)

    @ValueDescription("添加订阅时是否允许 bot 自动关注未关注的用户")
    val autoFollow: Boolean by value(true)

    @ValueDescription("Bot 关注时保存的分组(最长16字符)")
    val followGroup: String by value("Bot关注")

    @ValueDescription("检测间隔(推荐 15-30) 单位秒")
    val interval: Int by value(15)

    @ValueDescription("直播检测间隔(与动态检测独立) 单位秒")
    val liveInterval: Int by value(20)

    @ValueDescription("低频检测时间段与倍率(例: 3-8x2 三点到八点检测间隔为正常间隔的2倍) 24小时制")
    val lowSpeed: String by value("0-0x2")

    @ValueDescription("图片推送模式用的字体, 详细请看 readme")
    val font: String by value("")

    @ValueDescription("动态/视频推送文字模板, 参数请看 readme")
    val pushTemplate: String by value("{name}@{type}\n{link}")

    @ValueDescription("直播推送文字模板, 如不配置则与上面的动态推送模板一致")
    val livePushTemplate: String by value("")

    //@Suppress(stringSerialization = DOUBLE_QUOTATION)
    @ValueDescription("cookie, 请使用双引号")
    val cookie: String by value("")

    @ValueDescription("百度翻译")
    val baiduTranslate: Map<String, String> by value(
        mapOf(
            //是否开启百度翻译
            "enable" to "false",
            //百度翻译api密钥
            "APP_ID" to "",
            "SECURITY_KEY" to ""
        )
    )

}
