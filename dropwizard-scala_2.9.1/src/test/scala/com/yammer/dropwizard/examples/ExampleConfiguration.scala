package com.yammer.dropwizard.examples

import com.yammer.dropwizard.config.Configuration
import org.codehaus.jackson.annotate.JsonProperty

class ExampleConfiguration extends Configuration {
  @JsonProperty
  var saying: String = "Hello, world!"
}
