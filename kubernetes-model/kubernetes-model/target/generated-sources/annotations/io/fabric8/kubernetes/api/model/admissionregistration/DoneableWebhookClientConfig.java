package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableWebhookClientConfig extends WebhookClientConfigFluentImpl<DoneableWebhookClientConfig> implements Doneable<WebhookClientConfig>{

    private final WebhookClientConfigBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<WebhookClientConfig,WebhookClientConfig> function;

    public DoneableWebhookClientConfig(io.fabric8.kubernetes.api.builder.Function<WebhookClientConfig,WebhookClientConfig> function){
            super();this.builder=new WebhookClientConfigBuilder(this);this.function=function;
    }
    public DoneableWebhookClientConfig(WebhookClientConfig item,io.fabric8.kubernetes.api.builder.Function<WebhookClientConfig,WebhookClientConfig> function){
            super(item);this.builder=new WebhookClientConfigBuilder(this, item);this.function=function;
    }
    public DoneableWebhookClientConfig(WebhookClientConfig item){
            super(item);this.builder=new WebhookClientConfigBuilder(this, item);this.function=new Function<WebhookClientConfig, WebhookClientConfig>() {
    public WebhookClientConfig apply(WebhookClientConfig item) {
        return item;
    }
}
;
    }

    public WebhookClientConfig done(){
             return function.apply(builder.build());
    }




}
