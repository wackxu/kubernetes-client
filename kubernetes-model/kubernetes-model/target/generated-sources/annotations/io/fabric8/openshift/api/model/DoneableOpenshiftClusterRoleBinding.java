package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOpenshiftClusterRoleBinding extends OpenshiftClusterRoleBindingFluentImpl<DoneableOpenshiftClusterRoleBinding> implements Doneable<OpenshiftClusterRoleBinding>{

    private final OpenshiftClusterRoleBindingBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OpenshiftClusterRoleBinding,OpenshiftClusterRoleBinding> function;

    public DoneableOpenshiftClusterRoleBinding(io.fabric8.kubernetes.api.builder.Function<OpenshiftClusterRoleBinding,OpenshiftClusterRoleBinding> function){
            super();this.builder=new OpenshiftClusterRoleBindingBuilder(this);this.function=function;
    }
    public DoneableOpenshiftClusterRoleBinding(OpenshiftClusterRoleBinding item,io.fabric8.kubernetes.api.builder.Function<OpenshiftClusterRoleBinding,OpenshiftClusterRoleBinding> function){
            super(item);this.builder=new OpenshiftClusterRoleBindingBuilder(this, item);this.function=function;
    }
    public DoneableOpenshiftClusterRoleBinding(OpenshiftClusterRoleBinding item){
            super(item);this.builder=new OpenshiftClusterRoleBindingBuilder(this, item);this.function=new Function<OpenshiftClusterRoleBinding, OpenshiftClusterRoleBinding>() {
    public OpenshiftClusterRoleBinding apply(OpenshiftClusterRoleBinding item) {
        return item;
    }
}
;
    }

    public OpenshiftClusterRoleBinding done(){
             return function.apply(builder.build());
    }




}
