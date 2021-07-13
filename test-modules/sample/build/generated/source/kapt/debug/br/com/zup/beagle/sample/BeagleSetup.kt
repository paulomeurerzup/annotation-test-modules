@file:Suppress("OverridingDeprecatedMember", "DEPRECATION", "UNCHECKED_CAST")

package br.com.zup.beagle.sample

import br.com.zup.beagle.analytics.Analytics
import br.com.zup.beagle.android.`data`.serializer.adapter.generic.TypeAdapterResolver
import br.com.zup.beagle.android.action.Action
import br.com.zup.beagle.android.action.FormLocalActionHandler
import br.com.zup.beagle.android.components.form.core.ValidatorHandler
import br.com.zup.beagle.android.imagedownloader.BeagleImageDownloader
import br.com.zup.beagle.android.logger.BeagleLogger
import br.com.zup.beagle.android.navigation.BeagleControllerReference
import br.com.zup.beagle.android.navigation.DeepLinkHandler
import br.com.zup.beagle.android.networking.HttpClient
import br.com.zup.beagle.android.networking.HttpClientFactory
import br.com.zup.beagle.android.networking.urlbuilder.UrlBuilder
import br.com.zup.beagle.android.operation.Operation
import br.com.zup.beagle.android.setup.BeagleConfig
import br.com.zup.beagle.android.setup.BeagleSdk
import br.com.zup.beagle.android.setup.DesignSystem
import br.com.zup.beagle.android.store.StoreHandler
import br.com.zup.beagle.android.view.BeagleActivity
import br.com.zup.beagle.android.widget.WidgetView
import br.com.zup.beagle.newanalytics.AnalyticsProvider
import java.lang.Class
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.Map

public final class BeagleSetup : BeagleSdk {
  public override val formLocalActionHandler: FormLocalActionHandler =
      br.com.zup.beagle.sample.AppFormLocalActionHandler()

  public override val deepLinkHandler: DeepLinkHandler =
      br.com.zup.beagle.sample.AppDeepLinkHandler()

  public override val httpClient: HttpClient = br.com.zup.beagle.sample.config.HttpClientDefault()

  public override val httpClientFactory: HttpClientFactory? = null

  public override val designSystem: DesignSystem =
      br.com.zup.beagle.android.moduleb.design.ModuleBDesignSystem()

  public override val storeHandler: StoreHandler =
      br.com.zup.beagle.sample.config.StoreHandlerDefault()

  public override val urlBuilder: UrlBuilder? = null

  public override val analytics: Analytics = br.com.zup.beagle.sample.AppAnalytics()

  public override val analyticsProvider: AnalyticsProvider? = null

  public override val logger: BeagleLogger = br.com.zup.beagle.sample.config.BeagleLoggerDefault()

  public override val imageDownloader: BeagleImageDownloader? = null

  public override val config: BeagleConfig = br.com.zup.beagle.android.modulea.ModuleABeagleConfig()

  public override val serverDrivenActivity: Class<BeagleActivity> =
      br.com.zup.beagle.android.moduleb.ModuleBController1::class.java as Class<BeagleActivity>

  public override val controllerReference: BeagleControllerReference = RegisteredControllers()

  public override val typeAdapterResolver: TypeAdapterResolver = RegisteredCustomTypeAdapter

  public override val validatorHandler: ValidatorHandler = RegisteredCustomValidator

  public override fun registeredWidgets(): List<Class<WidgetView>> =
      RegisteredWidgets.registeredWidgets()

  public override fun registeredOperations(): Map<String, Operation> =
      RegisteredOperations.registeredOperations()

  public override fun registeredActions(): List<Class<Action>> =
      RegisteredActions.registeredActions()
}
