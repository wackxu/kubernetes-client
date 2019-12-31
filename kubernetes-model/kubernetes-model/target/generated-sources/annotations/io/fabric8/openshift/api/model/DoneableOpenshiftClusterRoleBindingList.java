package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOpenshiftClusterRoleBindingList extends OpenshiftClusterRoleBindingListFluentImpl<DoneableOpenshiftClusterRoleBindingList> implements Doneable<OpenshiftClusterRoleBindingList>{

    private final OpenshiftClusterRoleBindingListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OpenshiftClusterRoleBindingList,OpenshiftClusterRoleBindingList> function;

    public DoneableOpenshiftClusterRoleBindingList(io.fabric8.kubernetes.api.builder.Function<OpenshiftClusterRoleBindingList,OpenshiftClusterRoleBindingList> function){
            super();this.builder=new OpenshiftClusterRoleBindingListBuilder(this);this.function=function;
    }
    public DoneableOpenshiftClusterRoleBindingList(OpenshiftClusterRoleBindingList item,io.fabric8.kubernetes.api.builder.Function<OpenshiftClusterRoleBindingList,OpenshiftClusterRoleBindingList> function){
            super(item);this.builder=new OpenshiftClusterRoleBindingListBuilder(this, item);this.function=function;
    }
    public DoneableOpenshiftClusterRoleBindingList(OpenshiftClusterRoleBindingList item){
            super(item);this.builder=new OpenshiftClusterRoleBindingListBuilder(this, item);this.function=new Function<OpenshiftClusterRoleBindingList, OpenshiftClusterRoleBindingList>() {
    public OpenshiftClusterRoleBindingList apply(OpenshiftClusterRoleBindingList item) {
        return item;
    }
}
;
    }

    public OpenshiftClusterRoleBindingList done(){
             return function.apply(builder.build());
    }




}
