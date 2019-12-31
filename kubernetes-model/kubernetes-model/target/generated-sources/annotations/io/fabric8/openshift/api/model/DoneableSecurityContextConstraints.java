package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSecurityContextConstraints extends SecurityContextConstraintsFluentImpl<DoneableSecurityContextConstraints> implements Doneable<SecurityContextConstraints>{

    private final SecurityContextConstraintsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SecurityContextConstraints,SecurityContextConstraints> function;

    public DoneableSecurityContextConstraints(io.fabric8.kubernetes.api.builder.Function<SecurityContextConstraints,SecurityContextConstraints> function){
            super();this.builder=new SecurityContextConstraintsBuilder(this);this.function=function;
    }
    public DoneableSecurityContextConstraints(SecurityContextConstraints item,io.fabric8.kubernetes.api.builder.Function<SecurityContextConstraints,SecurityContextConstraints> function){
            super(item);this.builder=new SecurityContextConstraintsBuilder(this, item);this.function=function;
    }
    public DoneableSecurityContextConstraints(SecurityContextConstraints item){
            super(item);this.builder=new SecurityContextConstraintsBuilder(this, item);this.function=new Function<SecurityContextConstraints, SecurityContextConstraints>() {
    public SecurityContextConstraints apply(SecurityContextConstraints item) {
        return item;
    }
}
;
    }

    public SecurityContextConstraints done(){
             return function.apply(builder.build());
    }




}
