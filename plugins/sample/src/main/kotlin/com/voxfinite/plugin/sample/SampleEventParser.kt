package com.voxfinite.plugin.sample

import com.voxfinite.logvue.api.LogEventParser
import com.voxfinite.logvue.api.models.LogCatMessage2
import com.voxfinite.logvue.api.models.LogItem
import com.voxfinite.logvue.api.models.LogLevel2
import org.pf4j.Extension

@Extension
class SampleEventParser : LogEventParser {

    companion object {
        private const val ADB_TAG = "SampleLogging"
        private const val PREFIX = "Saved Event ID"
    }

    override fun filters(): List<String> {
        return arrayListOf(ADB_TAG)
    }

    override fun validate(logCatMessage2: LogCatMessage2): Boolean {
        val header = logCatMessage2.header
        return header.logLevel == LogLevel2.DEBUG && header.tag == ADB_TAG
                && logCatMessage2.message.startsWith(PREFIX)
    }

    override fun parse(logCatMessage2: LogCatMessage2): LogItem {
        TODO("Not yet implemented")
    }
}
