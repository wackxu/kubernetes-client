package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableComponentStatusList extends ComponentStatusListFluentImpl<DoneableComponentStatusList> implements Doneable<ComponentStatusList>{

    private final ComponentStatusListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ComponentStatusList,ComponentStatusList> function;

    public DoneableComponentStatusList(io.fabric8.kubernetes.api.builder.Function<ComponentStatusList,ComponentStatusList> function){
            super();this.builder=new ComponentStatusListBuilder(this);this.function=function;
    }
    public DoneableComponentStatusList(ComponentStatusList item,io.fabric8.kubernetes.api.builder.Function<ComponentStatusList,ComponentStatusList> function){
            super(item);this.builder=new ComponentStatusListBuilder(this, item);this.function=function;
    }
    public DoneableComponentStatusList(ComponentStatusList item){
            super(item);this.builder=new ComponentStatusListBuilder(this, item);this.function=new Function<ComponentStatusList, ComponentStatusList>() {
    public ComponentStatusList apply(ComponentStatusList item) {
        return item;
    }
}
;
    }

    public ComponentStatusList done(){
             return function.apply(builder.build());
    }




}
