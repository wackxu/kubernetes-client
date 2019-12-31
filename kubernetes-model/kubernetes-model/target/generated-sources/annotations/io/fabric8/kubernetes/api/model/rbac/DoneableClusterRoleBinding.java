package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableClusterRoleBinding extends ClusterRoleBindingFluentImpl<DoneableClusterRoleBinding> implements Doneable<ClusterRoleBinding>{

    private final ClusterRoleBindingBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ClusterRoleBinding,ClusterRoleBinding> function;

    public DoneableClusterRoleBinding(io.fabric8.kubernetes.api.builder.Function<ClusterRoleBinding,ClusterRoleBinding> function){
            super();this.builder=new ClusterRoleBindingBuilder(this);this.function=function;
    }
    public DoneableClusterRoleBinding(ClusterRoleBinding item,io.fabric8.kubernetes.api.builder.Function<ClusterRoleBinding,ClusterRoleBinding> function){
            super(item);this.builder=new ClusterRoleBindingBuilder(this, item);this.function=function;
    }
    public DoneableClusterRoleBinding(ClusterRoleBinding item){
            super(item);this.builder=new ClusterRoleBindingBuilder(this, item);this.function=new Function<ClusterRoleBinding, ClusterRoleBinding>() {
    public ClusterRoleBinding apply(ClusterRoleBinding item) {
        return item;
    }
}
;
    }

    public ClusterRoleBinding done(){
             return function.apply(builder.build());
    }




}
