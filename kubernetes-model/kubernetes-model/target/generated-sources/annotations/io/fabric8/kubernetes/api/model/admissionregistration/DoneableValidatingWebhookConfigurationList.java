package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableValidatingWebhookConfigurationList extends ValidatingWebhookConfigurationListFluentImpl<DoneableValidatingWebhookConfigurationList> implements Doneable<ValidatingWebhookConfigurationList>{

    private final ValidatingWebhookConfigurationListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ValidatingWebhookConfigurationList,ValidatingWebhookConfigurationList> function;

    public DoneableValidatingWebhookConfigurationList(io.fabric8.kubernetes.api.builder.Function<ValidatingWebhookConfigurationList,ValidatingWebhookConfigurationList> function){
            super();this.builder=new ValidatingWebhookConfigurationListBuilder(this);this.function=function;
    }
    public DoneableValidatingWebhookConfigurationList(ValidatingWebhookConfigurationList item,io.fabric8.kubernetes.api.builder.Function<ValidatingWebhookConfigurationList,ValidatingWebhookConfigurationList> function){
            super(item);this.builder=new ValidatingWebhookConfigurationListBuilder(this, item);this.function=function;
    }
    public DoneableValidatingWebhookConfigurationList(ValidatingWebhookConfigurationList item){
            super(item);this.builder=new ValidatingWebhookConfigurationListBuilder(this, item);this.function=new Function<ValidatingWebhookConfigurationList, ValidatingWebhookConfigurationList>() {
    public ValidatingWebhookConfigurationList apply(ValidatingWebhookConfigurationList item) {
        return item;
    }
}
;
    }

    public ValidatingWebhookConfigurationList done(){
             return function.apply(builder.build());
    }




}
