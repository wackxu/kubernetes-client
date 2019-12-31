package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableGroupRestriction extends GroupRestrictionFluentImpl<DoneableGroupRestriction> implements Doneable<GroupRestriction>{

    private final GroupRestrictionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<GroupRestriction,GroupRestriction> function;

    public DoneableGroupRestriction(io.fabric8.kubernetes.api.builder.Function<GroupRestriction,GroupRestriction> function){
            super();this.builder=new GroupRestrictionBuilder(this);this.function=function;
    }
    public DoneableGroupRestriction(GroupRestriction item,io.fabric8.kubernetes.api.builder.Function<GroupRestriction,GroupRestriction> function){
            super(item);this.builder=new GroupRestrictionBuilder(this, item);this.function=function;
    }
    public DoneableGroupRestriction(GroupRestriction item){
            super(item);this.builder=new GroupRestrictionBuilder(this, item);this.function=new Function<GroupRestriction, GroupRestriction>() {
    public GroupRestriction apply(GroupRestriction item) {
        return item;
    }
}
;
    }

    public GroupRestriction done(){
             return function.apply(builder.build());
    }




}
