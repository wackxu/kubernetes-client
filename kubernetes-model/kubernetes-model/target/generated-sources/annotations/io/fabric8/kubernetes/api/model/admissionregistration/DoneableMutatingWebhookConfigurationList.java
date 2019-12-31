package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableMutatingWebhookConfigurationList extends MutatingWebhookConfigurationListFluentImpl<DoneableMutatingWebhookConfigurationList> implements Doneable<MutatingWebhookConfigurationList>{

    private final MutatingWebhookConfigurationListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<MutatingWebhookConfigurationList,MutatingWebhookConfigurationList> function;

    public DoneableMutatingWebhookConfigurationList(io.fabric8.kubernetes.api.builder.Function<MutatingWebhookConfigurationList,MutatingWebhookConfigurationList> function){
            super();this.builder=new MutatingWebhookConfigurationListBuilder(this);this.function=function;
    }
    public DoneableMutatingWebhookConfigurationList(MutatingWebhookConfigurationList item,io.fabric8.kubernetes.api.builder.Function<MutatingWebhookConfigurationList,MutatingWebhookConfigurationList> function){
            super(item);this.builder=new MutatingWebhookConfigurationListBuilder(this, item);this.function=function;
    }
    public DoneableMutatingWebhookConfigurationList(MutatingWebhookConfigurationList item){
            super(item);this.builder=new MutatingWebhookConfigurationListBuilder(this, item);this.function=new Function<MutatingWebhookConfigurationList, MutatingWebhookConfigurationList>() {
    public MutatingWebhookConfigurationList apply(MutatingWebhookConfigurationList item) {
        return item;
    }
}
;
    }

    public MutatingWebhookConfigurationList done(){
             return function.apply(builder.build());
    }




}
