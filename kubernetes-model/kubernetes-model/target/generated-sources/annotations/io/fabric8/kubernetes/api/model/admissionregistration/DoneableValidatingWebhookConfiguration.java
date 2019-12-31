package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableValidatingWebhookConfiguration extends ValidatingWebhookConfigurationFluentImpl<DoneableValidatingWebhookConfiguration> implements Doneable<ValidatingWebhookConfiguration>{

    private final ValidatingWebhookConfigurationBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ValidatingWebhookConfiguration,ValidatingWebhookConfiguration> function;

    public DoneableValidatingWebhookConfiguration(io.fabric8.kubernetes.api.builder.Function<ValidatingWebhookConfiguration,ValidatingWebhookConfiguration> function){
            super();this.builder=new ValidatingWebhookConfigurationBuilder(this);this.function=function;
    }
    public DoneableValidatingWebhookConfiguration(ValidatingWebhookConfiguration item,io.fabric8.kubernetes.api.builder.Function<ValidatingWebhookConfiguration,ValidatingWebhookConfiguration> function){
            super(item);this.builder=new ValidatingWebhookConfigurationBuilder(this, item);this.function=function;
    }
    public DoneableValidatingWebhookConfiguration(ValidatingWebhookConfiguration item){
            super(item);this.builder=new ValidatingWebhookConfigurationBuilder(this, item);this.function=new Function<ValidatingWebhookConfiguration, ValidatingWebhookConfiguration>() {
    public ValidatingWebhookConfiguration apply(ValidatingWebhookConfiguration item) {
        return item;
    }
}
;
    }

    public ValidatingWebhookConfiguration done(){
             return function.apply(builder.build());
    }




}
