package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableClusterRoleBindingList extends ClusterRoleBindingListFluentImpl<DoneableClusterRoleBindingList> implements Doneable<ClusterRoleBindingList>{

    private final ClusterRoleBindingListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ClusterRoleBindingList,ClusterRoleBindingList> function;

    public DoneableClusterRoleBindingList(io.fabric8.kubernetes.api.builder.Function<ClusterRoleBindingList,ClusterRoleBindingList> function){
            super();this.builder=new ClusterRoleBindingListBuilder(this);this.function=function;
    }
    public DoneableClusterRoleBindingList(ClusterRoleBindingList item,io.fabric8.kubernetes.api.builder.Function<ClusterRoleBindingList,ClusterRoleBindingList> function){
            super(item);this.builder=new ClusterRoleBindingListBuilder(this, item);this.function=function;
    }
    public DoneableClusterRoleBindingList(ClusterRoleBindingList item){
            super(item);this.builder=new ClusterRoleBindingListBuilder(this, item);this.function=new Function<ClusterRoleBindingList, ClusterRoleBindingList>() {
    public ClusterRoleBindingList apply(ClusterRoleBindingList item) {
        return item;
    }
}
;
    }

    public ClusterRoleBindingList done(){
             return function.apply(builder.build());
    }




}
