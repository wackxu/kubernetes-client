package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOpenshiftRole extends OpenshiftRoleFluentImpl<DoneableOpenshiftRole> implements Doneable<OpenshiftRole>{

    private final OpenshiftRoleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OpenshiftRole,OpenshiftRole> function;

    public DoneableOpenshiftRole(io.fabric8.kubernetes.api.builder.Function<OpenshiftRole,OpenshiftRole> function){
            super();this.builder=new OpenshiftRoleBuilder(this);this.function=function;
    }
    public DoneableOpenshiftRole(OpenshiftRole item,io.fabric8.kubernetes.api.builder.Function<OpenshiftRole,OpenshiftRole> function){
            super(item);this.builder=new OpenshiftRoleBuilder(this, item);this.function=function;
    }
    public DoneableOpenshiftRole(OpenshiftRole item){
            super(item);this.builder=new OpenshiftRoleBuilder(this, item);this.function=new Function<OpenshiftRole, OpenshiftRole>() {
    public OpenshiftRole apply(OpenshiftRole item) {
        return item;
    }
}
;
    }

    public OpenshiftRole done(){
             return function.apply(builder.build());
    }




}
