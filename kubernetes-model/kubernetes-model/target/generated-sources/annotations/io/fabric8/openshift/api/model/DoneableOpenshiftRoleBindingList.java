package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOpenshiftRoleBindingList extends OpenshiftRoleBindingListFluentImpl<DoneableOpenshiftRoleBindingList> implements Doneable<OpenshiftRoleBindingList>{

    private final OpenshiftRoleBindingListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleBindingList,OpenshiftRoleBindingList> function;

    public DoneableOpenshiftRoleBindingList(io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleBindingList,OpenshiftRoleBindingList> function){
            super();this.builder=new OpenshiftRoleBindingListBuilder(this);this.function=function;
    }
    public DoneableOpenshiftRoleBindingList(OpenshiftRoleBindingList item,io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleBindingList,OpenshiftRoleBindingList> function){
            super(item);this.builder=new OpenshiftRoleBindingListBuilder(this, item);this.function=function;
    }
    public DoneableOpenshiftRoleBindingList(OpenshiftRoleBindingList item){
            super(item);this.builder=new OpenshiftRoleBindingListBuilder(this, item);this.function=new Function<OpenshiftRoleBindingList, OpenshiftRoleBindingList>() {
    public OpenshiftRoleBindingList apply(OpenshiftRoleBindingList item) {
        return item;
    }
}
;
    }

    public OpenshiftRoleBindingList done(){
             return function.apply(builder.build());
    }




}
