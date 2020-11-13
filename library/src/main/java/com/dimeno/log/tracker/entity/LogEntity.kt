package com.dimeno.log.tracker.entity

import java.io.Serializable

/**
 * log entity
 * Created by wangzhen on 2020/11/13.
 */
class LogEntity : Serializable {
    var date: String? = null
    var widgets: ArrayList<WidgetEntity>? = null
    var traces: ArrayList<String>? = null

    class WidgetEntity : Serializable {
        var widget: String? = null
        var text: String? = null
    }
}