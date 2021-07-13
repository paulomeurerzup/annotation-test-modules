package br.com.zup.beagle.android.registrar

import kotlin.Pair
import kotlin.String
import kotlin.collections.List

public final object PropertiesRegistrarSample {
  public fun registeredProperties(): List<Pair<String, String>> {
    val registeredProperties = listOf<Pair<String, String>>(
       	Pair("formLocalActionHandler", """br.com.zup.beagle.sample.AppFormLocalActionHandler()"""),
    	Pair("deepLinkHandler", """br.com.zup.beagle.sample.AppDeepLinkHandler()"""),
    	Pair("httpClient", """br.com.zup.beagle.sample.config.HttpClientDefault()"""),
    	Pair("storeHandler", """br.com.zup.beagle.sample.config.StoreHandlerDefault()"""),
    	Pair("analytics", """br.com.zup.beagle.sample.AppAnalytics()"""),
    	Pair("logger", """br.com.zup.beagle.sample.config.BeagleLoggerDefault()"""),

    )
    return registeredProperties
  }
}
