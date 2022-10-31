package model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import enums.RunType;
import lombok.Data;

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
