package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableWebhookClientConfig extends io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigFluentImpl<DoneableWebhookClientConfig> implements Doneable<io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig>{

    private final io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfigBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig,io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig> function;

    public DoneableWebhookClientConfig(io.fabric8.kubernetes.api.builder.Function<io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig,io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig> function){
            super();this.builder=new WebhookClientConfigBuilder(this);this.function=function;
    }
    public DoneableWebhookClientConfig(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig item,io.fabric8.kubernetes.api.builder.Function<io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig,io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig> function){
            super(item);this.builder=new WebhookClientConfigBuilder(this, item);this.function=function;
    }
    public DoneableWebhookClientConfig(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig item){
            super(item);this.builder=new WebhookClientConfigBuilder(this, item);this.function=new Function<io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig, io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig>() {
    public io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig apply(io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig item) {
        return item;
    }
}
;
    }

    public io.fabric8.kubernetes.api.model.apiextensions.WebhookClientConfig done(){
             return function.apply(builder.build());
    }




}
