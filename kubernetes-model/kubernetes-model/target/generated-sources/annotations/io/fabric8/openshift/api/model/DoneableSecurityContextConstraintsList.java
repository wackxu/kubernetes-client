package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSecurityContextConstraintsList extends SecurityContextConstraintsListFluentImpl<DoneableSecurityContextConstraintsList> implements Doneable<SecurityContextConstraintsList>{

    private final SecurityContextConstraintsListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SecurityContextConstraintsList,SecurityContextConstraintsList> function;

    public DoneableSecurityContextConstraintsList(io.fabric8.kubernetes.api.builder.Function<SecurityContextConstraintsList,SecurityContextConstraintsList> function){
            super();this.builder=new SecurityContextConstraintsListBuilder(this);this.function=function;
    }
    public DoneableSecurityContextConstraintsList(SecurityContextConstraintsList item,io.fabric8.kubernetes.api.builder.Function<SecurityContextConstraintsList,SecurityContextConstraintsList> function){
            super(item);this.builder=new SecurityContextConstraintsListBuilder(this, item);this.function=function;
    }
    public DoneableSecurityContextConstraintsList(SecurityContextConstraintsList item){
            super(item);this.builder=new SecurityContextConstraintsListBuilder(this, item);this.function=new Function<SecurityContextConstraintsList, SecurityContextConstraintsList>() {
    public SecurityContextConstraintsList apply(SecurityContextConstraintsList item) {
        return item;
    }
}
;
    }

    public SecurityContextConstraintsList done(){
             return function.apply(builder.build());
    }




}
