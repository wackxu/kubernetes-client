package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableWebHookTrigger extends WebHookTriggerFluentImpl<DoneableWebHookTrigger> implements Doneable<WebHookTrigger>{

    private final WebHookTriggerBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<WebHookTrigger,WebHookTrigger> function;

    public DoneableWebHookTrigger(io.fabric8.kubernetes.api.builder.Function<WebHookTrigger,WebHookTrigger> function){
            super();this.builder=new WebHookTriggerBuilder(this);this.function=function;
    }
    public DoneableWebHookTrigger(WebHookTrigger item,io.fabric8.kubernetes.api.builder.Function<WebHookTrigger,WebHookTrigger> function){
            super(item);this.builder=new WebHookTriggerBuilder(this, item);this.function=function;
    }
    public DoneableWebHookTrigger(WebHookTrigger item){
            super(item);this.builder=new WebHookTriggerBuilder(this, item);this.function=new Function<WebHookTrigger, WebHookTrigger>() {
    public WebHookTrigger apply(WebHookTrigger item) {
        return item;
    }
}
;
    }

    public WebHookTrigger done(){
             return function.apply(builder.build());
    }




}
