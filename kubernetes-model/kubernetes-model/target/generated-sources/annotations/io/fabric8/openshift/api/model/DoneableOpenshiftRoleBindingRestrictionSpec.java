package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOpenshiftRoleBindingRestrictionSpec extends OpenshiftRoleBindingRestrictionSpecFluentImpl<DoneableOpenshiftRoleBindingRestrictionSpec> implements Doneable<OpenshiftRoleBindingRestrictionSpec>{

    private final OpenshiftRoleBindingRestrictionSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleBindingRestrictionSpec,OpenshiftRoleBindingRestrictionSpec> function;

    public DoneableOpenshiftRoleBindingRestrictionSpec(io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleBindingRestrictionSpec,OpenshiftRoleBindingRestrictionSpec> function){
            super();this.builder=new OpenshiftRoleBindingRestrictionSpecBuilder(this);this.function=function;
    }
    public DoneableOpenshiftRoleBindingRestrictionSpec(OpenshiftRoleBindingRestrictionSpec item,io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleBindingRestrictionSpec,OpenshiftRoleBindingRestrictionSpec> function){
            super(item);this.builder=new OpenshiftRoleBindingRestrictionSpecBuilder(this, item);this.function=function;
    }
    public DoneableOpenshiftRoleBindingRestrictionSpec(OpenshiftRoleBindingRestrictionSpec item){
            super(item);this.builder=new OpenshiftRoleBindingRestrictionSpecBuilder(this, item);this.function=new Function<OpenshiftRoleBindingRestrictionSpec, OpenshiftRoleBindingRestrictionSpec>() {
    public OpenshiftRoleBindingRestrictionSpec apply(OpenshiftRoleBindingRestrictionSpec item) {
        return item;
    }
}
;
    }

    public OpenshiftRoleBindingRestrictionSpec done(){
             return function.apply(builder.build());
    }




}
