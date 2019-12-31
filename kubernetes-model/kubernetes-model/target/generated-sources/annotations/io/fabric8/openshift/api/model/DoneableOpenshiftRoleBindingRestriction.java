package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOpenshiftRoleBindingRestriction extends OpenshiftRoleBindingRestrictionFluentImpl<DoneableOpenshiftRoleBindingRestriction> implements Doneable<OpenshiftRoleBindingRestriction>{

    private final OpenshiftRoleBindingRestrictionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleBindingRestriction,OpenshiftRoleBindingRestriction> function;

    public DoneableOpenshiftRoleBindingRestriction(io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleBindingRestriction,OpenshiftRoleBindingRestriction> function){
            super();this.builder=new OpenshiftRoleBindingRestrictionBuilder(this);this.function=function;
    }
    public DoneableOpenshiftRoleBindingRestriction(OpenshiftRoleBindingRestriction item,io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleBindingRestriction,OpenshiftRoleBindingRestriction> function){
            super(item);this.builder=new OpenshiftRoleBindingRestrictionBuilder(this, item);this.function=function;
    }
    public DoneableOpenshiftRoleBindingRestriction(OpenshiftRoleBindingRestriction item){
            super(item);this.builder=new OpenshiftRoleBindingRestrictionBuilder(this, item);this.function=new Function<OpenshiftRoleBindingRestriction, OpenshiftRoleBindingRestriction>() {
    public OpenshiftRoleBindingRestriction apply(OpenshiftRoleBindingRestriction item) {
        return item;
    }
}
;
    }

    public OpenshiftRoleBindingRestriction done(){
             return function.apply(builder.build());
    }




}
