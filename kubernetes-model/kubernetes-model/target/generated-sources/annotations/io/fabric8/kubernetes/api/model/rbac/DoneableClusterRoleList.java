package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableClusterRoleList extends ClusterRoleListFluentImpl<DoneableClusterRoleList> implements Doneable<ClusterRoleList>{

    private final ClusterRoleListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ClusterRoleList,ClusterRoleList> function;

    public DoneableClusterRoleList(io.fabric8.kubernetes.api.builder.Function<ClusterRoleList,ClusterRoleList> function){
            super();this.builder=new ClusterRoleListBuilder(this);this.function=function;
    }
    public DoneableClusterRoleList(ClusterRoleList item,io.fabric8.kubernetes.api.builder.Function<ClusterRoleList,ClusterRoleList> function){
            super(item);this.builder=new ClusterRoleListBuilder(this, item);this.function=function;
    }
    public DoneableClusterRoleList(ClusterRoleList item){
            super(item);this.builder=new ClusterRoleListBuilder(this, item);this.function=new Function<ClusterRoleList, ClusterRoleList>() {
    public ClusterRoleList apply(ClusterRoleList item) {
        return item;
    }
}
;
    }

    public ClusterRoleList done(){
             return function.apply(builder.build());
    }




}
