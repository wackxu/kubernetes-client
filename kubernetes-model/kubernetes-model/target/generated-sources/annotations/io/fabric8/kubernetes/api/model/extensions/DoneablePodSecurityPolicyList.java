package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePodSecurityPolicyList extends PodSecurityPolicyListFluentImpl<DoneablePodSecurityPolicyList> implements Doneable<PodSecurityPolicyList>{

    private final PodSecurityPolicyListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodSecurityPolicyList,PodSecurityPolicyList> function;

    public DoneablePodSecurityPolicyList(io.fabric8.kubernetes.api.builder.Function<PodSecurityPolicyList,PodSecurityPolicyList> function){
            super();this.builder=new PodSecurityPolicyListBuilder(this);this.function=function;
    }
    public DoneablePodSecurityPolicyList(PodSecurityPolicyList item,io.fabric8.kubernetes.api.builder.Function<PodSecurityPolicyList,PodSecurityPolicyList> function){
            super(item);this.builder=new PodSecurityPolicyListBuilder(this, item);this.function=function;
    }
    public DoneablePodSecurityPolicyList(PodSecurityPolicyList item){
            super(item);this.builder=new PodSecurityPolicyListBuilder(this, item);this.function=new Function<PodSecurityPolicyList, PodSecurityPolicyList>() {
    public PodSecurityPolicyList apply(PodSecurityPolicyList item) {
        return item;
    }
}
;
    }

    public PodSecurityPolicyList done(){
             return function.apply(builder.build());
    }




}
