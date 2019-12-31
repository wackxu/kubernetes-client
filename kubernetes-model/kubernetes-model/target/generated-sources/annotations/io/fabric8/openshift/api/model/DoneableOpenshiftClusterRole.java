package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOpenshiftClusterRole extends OpenshiftClusterRoleFluentImpl<DoneableOpenshiftClusterRole> implements Doneable<OpenshiftClusterRole>{

    private final OpenshiftClusterRoleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OpenshiftClusterRole,OpenshiftClusterRole> function;

    public DoneableOpenshiftClusterRole(io.fabric8.kubernetes.api.builder.Function<OpenshiftClusterRole,OpenshiftClusterRole> function){
            super();this.builder=new OpenshiftClusterRoleBuilder(this);this.function=function;
    }
    public DoneableOpenshiftClusterRole(OpenshiftClusterRole item,io.fabric8.kubernetes.api.builder.Function<OpenshiftClusterRole,OpenshiftClusterRole> function){
            super(item);this.builder=new OpenshiftClusterRoleBuilder(this, item);this.function=function;
    }
    public DoneableOpenshiftClusterRole(OpenshiftClusterRole item){
            super(item);this.builder=new OpenshiftClusterRoleBuilder(this, item);this.function=new Function<OpenshiftClusterRole, OpenshiftClusterRole>() {
    public OpenshiftClusterRole apply(OpenshiftClusterRole item) {
        return item;
    }
}
;
    }

    public OpenshiftClusterRole done(){
             return function.apply(builder.build());
    }




}
