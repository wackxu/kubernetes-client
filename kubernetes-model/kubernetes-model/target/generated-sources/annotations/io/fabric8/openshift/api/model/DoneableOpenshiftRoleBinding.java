package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOpenshiftRoleBinding extends OpenshiftRoleBindingFluentImpl<DoneableOpenshiftRoleBinding> implements Doneable<OpenshiftRoleBinding>{

    private final OpenshiftRoleBindingBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleBinding,OpenshiftRoleBinding> function;

    public DoneableOpenshiftRoleBinding(io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleBinding,OpenshiftRoleBinding> function){
            super();this.builder=new OpenshiftRoleBindingBuilder(this);this.function=function;
    }
    public DoneableOpenshiftRoleBinding(OpenshiftRoleBinding item,io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleBinding,OpenshiftRoleBinding> function){
            super(item);this.builder=new OpenshiftRoleBindingBuilder(this, item);this.function=function;
    }
    public DoneableOpenshiftRoleBinding(OpenshiftRoleBinding item){
            super(item);this.builder=new OpenshiftRoleBindingBuilder(this, item);this.function=new Function<OpenshiftRoleBinding, OpenshiftRoleBinding>() {
    public OpenshiftRoleBinding apply(OpenshiftRoleBinding item) {
        return item;
    }
}
;
    }

    public OpenshiftRoleBinding done(){
             return function.apply(builder.build());
    }




}
