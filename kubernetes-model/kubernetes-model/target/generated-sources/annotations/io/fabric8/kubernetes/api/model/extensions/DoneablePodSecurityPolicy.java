package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePodSecurityPolicy extends PodSecurityPolicyFluentImpl<DoneablePodSecurityPolicy> implements Doneable<PodSecurityPolicy>{

    private final PodSecurityPolicyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodSecurityPolicy,PodSecurityPolicy> function;

    public DoneablePodSecurityPolicy(io.fabric8.kubernetes.api.builder.Function<PodSecurityPolicy,PodSecurityPolicy> function){
            super();this.builder=new PodSecurityPolicyBuilder(this);this.function=function;
    }
    public DoneablePodSecurityPolicy(PodSecurityPolicy item,io.fabric8.kubernetes.api.builder.Function<PodSecurityPolicy,PodSecurityPolicy> function){
            super(item);this.builder=new PodSecurityPolicyBuilder(this, item);this.function=function;
    }
    public DoneablePodSecurityPolicy(PodSecurityPolicy item){
            super(item);this.builder=new PodSecurityPolicyBuilder(this, item);this.function=new Function<PodSecurityPolicy, PodSecurityPolicy>() {
    public PodSecurityPolicy apply(PodSecurityPolicy item) {
        return item;
    }
}
;
    }

    public PodSecurityPolicy done(){
             return function.apply(builder.build());
    }




}
