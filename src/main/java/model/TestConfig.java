package model;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@Data
@JsonAutoDetect
public class TestConfig {
      @JsonProperty("run_type")
      private String runType;
      @JsonProperty("selenium_remote_url")
      private String remoteUrl;
      @JsonProperty("selenium_browser")
      private String browser;
      @JsonProperty("browser_version")
      private String browserVersion;
      @JsonProperty("browser_size")
      private String browserSize;
      @JsonProperty("selenium_headless")
      private Boolean headless;
      @JsonProperty("base_url")
      private String baseUrl;
      @JsonProperty("fast_set_value")
      private Boolean fastSetValue;
      @JsonProperty("selenium_timeout")
      private long timeout;
      @JsonProperty("selenide_save_page_source")
      private Boolean savePageSource;
      @JsonProperty("selenium_vnc")
      private Boolean vnc;
      @JsonProperty("selenide_screenshots")
      private Boolean screenshots;

      public boolean isRemoteType() {
            return RunType.REMOTE.getValue().equalsIgnoreCase(runType);
      }

}
