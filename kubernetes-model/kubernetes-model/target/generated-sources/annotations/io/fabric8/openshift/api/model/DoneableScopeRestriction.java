package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableScopeRestriction extends ScopeRestrictionFluentImpl<DoneableScopeRestriction> implements Doneable<ScopeRestriction>{

    private final ScopeRestrictionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ScopeRestriction,ScopeRestriction> function;

    public DoneableScopeRestriction(io.fabric8.kubernetes.api.builder.Function<ScopeRestriction,ScopeRestriction> function){
            super();this.builder=new ScopeRestrictionBuilder(this);this.function=function;
    }
    public DoneableScopeRestriction(ScopeRestriction item,io.fabric8.kubernetes.api.builder.Function<ScopeRestriction,ScopeRestriction> function){
            super(item);this.builder=new ScopeRestrictionBuilder(this, item);this.function=function;
    }
    public DoneableScopeRestriction(ScopeRestriction item){
            super(item);this.builder=new ScopeRestrictionBuilder(this, item);this.function=new Function<ScopeRestriction, ScopeRestriction>() {
    public ScopeRestriction apply(ScopeRestriction item) {
        return item;
    }
}
;
    }

    public ScopeRestriction done(){
             return function.apply(builder.build());
    }




}
