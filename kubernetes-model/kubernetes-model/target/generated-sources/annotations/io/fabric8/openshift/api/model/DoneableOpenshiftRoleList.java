package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOpenshiftRoleList extends OpenshiftRoleListFluentImpl<DoneableOpenshiftRoleList> implements Doneable<OpenshiftRoleList>{

    private final OpenshiftRoleListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleList,OpenshiftRoleList> function;

    public DoneableOpenshiftRoleList(io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleList,OpenshiftRoleList> function){
            super();this.builder=new OpenshiftRoleListBuilder(this);this.function=function;
    }
    public DoneableOpenshiftRoleList(OpenshiftRoleList item,io.fabric8.kubernetes.api.builder.Function<OpenshiftRoleList,OpenshiftRoleList> function){
            super(item);this.builder=new OpenshiftRoleListBuilder(this, item);this.function=function;
    }
    public DoneableOpenshiftRoleList(OpenshiftRoleList item){
            super(item);this.builder=new OpenshiftRoleListBuilder(this, item);this.function=new Function<OpenshiftRoleList, OpenshiftRoleList>() {
    public OpenshiftRoleList apply(OpenshiftRoleList item) {
        return item;
    }
}
;
    }

    public OpenshiftRoleList done(){
             return function.apply(builder.build());
    }




}
