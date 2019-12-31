package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRoleBinding extends RoleBindingFluentImpl<DoneableRoleBinding> implements Doneable<RoleBinding>{

    private final RoleBindingBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RoleBinding,RoleBinding> function;

    public DoneableRoleBinding(io.fabric8.kubernetes.api.builder.Function<RoleBinding,RoleBinding> function){
            super();this.builder=new RoleBindingBuilder(this);this.function=function;
    }
    public DoneableRoleBinding(RoleBinding item,io.fabric8.kubernetes.api.builder.Function<RoleBinding,RoleBinding> function){
            super(item);this.builder=new RoleBindingBuilder(this, item);this.function=function;
    }
    public DoneableRoleBinding(RoleBinding item){
            super(item);this.builder=new RoleBindingBuilder(this, item);this.function=new Function<RoleBinding, RoleBinding>() {
    public RoleBinding apply(RoleBinding item) {
        return item;
    }
}
;
    }

    public RoleBinding done(){
             return function.apply(builder.build());
    }




}
