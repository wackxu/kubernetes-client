package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePodSecurityPolicySpec extends PodSecurityPolicySpecFluentImpl<DoneablePodSecurityPolicySpec> implements Doneable<PodSecurityPolicySpec>{

    private final PodSecurityPolicySpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodSecurityPolicySpec,PodSecurityPolicySpec> function;

    public DoneablePodSecurityPolicySpec(io.fabric8.kubernetes.api.builder.Function<PodSecurityPolicySpec,PodSecurityPolicySpec> function){
            super();this.builder=new PodSecurityPolicySpecBuilder(this);this.function=function;
    }
    public DoneablePodSecurityPolicySpec(PodSecurityPolicySpec item,io.fabric8.kubernetes.api.builder.Function<PodSecurityPolicySpec,PodSecurityPolicySpec> function){
            super(item);this.builder=new PodSecurityPolicySpecBuilder(this, item);this.function=function;
    }
    public DoneablePodSecurityPolicySpec(PodSecurityPolicySpec item){
            super(item);this.builder=new PodSecurityPolicySpecBuilder(this, item);this.function=new Function<PodSecurityPolicySpec, PodSecurityPolicySpec>() {
    public PodSecurityPolicySpec apply(PodSecurityPolicySpec item) {
        return item;
    }
}
;
    }

    public PodSecurityPolicySpec done(){
             return function.apply(builder.build());
    }




}
