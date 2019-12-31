package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableClusterRole extends ClusterRoleFluentImpl<DoneableClusterRole> implements Doneable<ClusterRole>{

    private final ClusterRoleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ClusterRole,ClusterRole> function;

    public DoneableClusterRole(io.fabric8.kubernetes.api.builder.Function<ClusterRole,ClusterRole> function){
            super();this.builder=new ClusterRoleBuilder(this);this.function=function;
    }
    public DoneableClusterRole(ClusterRole item,io.fabric8.kubernetes.api.builder.Function<ClusterRole,ClusterRole> function){
            super(item);this.builder=new ClusterRoleBuilder(this, item);this.function=function;
    }
    public DoneableClusterRole(ClusterRole item){
            super(item);this.builder=new ClusterRoleBuilder(this, item);this.function=new Function<ClusterRole, ClusterRole>() {
    public ClusterRole apply(ClusterRole item) {
        return item;
    }
}
;
    }

    public ClusterRole done(){
             return function.apply(builder.build());
    }




}
