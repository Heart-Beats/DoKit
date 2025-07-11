package com.didichuxing.doraemonkit.plugin.extension


/**
 * didi Create on 2023/3/21 .
 *
 * Copyright (c) 2023/3/21 by didiglobal.com.
 *
 * @author <a href="realonlyone@126.com">zhangjun</a>
 * @version 1.0
 * @Date 2023/3/21 6:10 下午
 * @Description 用一句话说明文件功能
 */

open class WebViewExtension(
    // 自定义 webview 全限定名， 其也会被 hook， 默认： android.webkit.WebView， com.tencent.smtt.sdk.WebView 以及类名含有 WebView 的类
    var webviewClassName: String = "",

    var network: Boolean = true,

    //  目前未实现
    var dokitWeb: Boolean = false,
    //  目前未实现
    var vConsole: Boolean = false
) {

    fun network(boolean: Boolean) {
        network = boolean
    }

    fun dokitWeb(boolean: Boolean) {
        dokitWeb = boolean
    }

    fun vConsole(boolean: Boolean) {
        vConsole = boolean
    }

    fun webviewClassName(webviewClassName: String) {
        this.webviewClassName = webviewClassName
    }

    override fun toString(): String {
        return "WebViewExtension(network=$network, dokitWeb=$dokitWeb, vConsole=$vConsole)"
    }


}
