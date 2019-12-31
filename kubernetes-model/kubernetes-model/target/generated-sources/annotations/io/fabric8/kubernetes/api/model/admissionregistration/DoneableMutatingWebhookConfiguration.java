package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableMutatingWebhookConfiguration extends MutatingWebhookConfigurationFluentImpl<DoneableMutatingWebhookConfiguration> implements Doneable<MutatingWebhookConfiguration>{

    private final MutatingWebhookConfigurationBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<MutatingWebhookConfiguration,MutatingWebhookConfiguration> function;

    public DoneableMutatingWebhookConfiguration(io.fabric8.kubernetes.api.builder.Function<MutatingWebhookConfiguration,MutatingWebhookConfiguration> function){
            super();this.builder=new MutatingWebhookConfigurationBuilder(this);this.function=function;
    }
    public DoneableMutatingWebhookConfiguration(MutatingWebhookConfiguration item,io.fabric8.kubernetes.api.builder.Function<MutatingWebhookConfiguration,MutatingWebhookConfiguration> function){
            super(item);this.builder=new MutatingWebhookConfigurationBuilder(this, item);this.function=function;
    }
    public DoneableMutatingWebhookConfiguration(MutatingWebhookConfiguration item){
            super(item);this.builder=new MutatingWebhookConfigurationBuilder(this, item);this.function=new Function<MutatingWebhookConfiguration, MutatingWebhookConfiguration>() {
    public MutatingWebhookConfiguration apply(MutatingWebhookConfiguration item) {
        return item;
    }
}
;
    }

    public MutatingWebhookConfiguration done(){
             return function.apply(builder.build());
    }




}
