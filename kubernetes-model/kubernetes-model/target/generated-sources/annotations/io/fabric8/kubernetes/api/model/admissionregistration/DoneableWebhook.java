package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableWebhook extends WebhookFluentImpl<DoneableWebhook> implements Doneable<Webhook>{

    private final WebhookBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Webhook,Webhook> function;

    public DoneableWebhook(io.fabric8.kubernetes.api.builder.Function<Webhook,Webhook> function){
            super();this.builder=new WebhookBuilder(this);this.function=function;
    }
    public DoneableWebhook(Webhook item,io.fabric8.kubernetes.api.builder.Function<Webhook,Webhook> function){
            super(item);this.builder=new WebhookBuilder(this, item);this.function=function;
    }
    public DoneableWebhook(Webhook item){
            super(item);this.builder=new WebhookBuilder(this, item);this.function=new Function<Webhook, Webhook>() {
    public Webhook apply(Webhook item) {
        return item;
    }
}
;
    }

    public Webhook done(){
             return function.apply(builder.build());
    }




}
