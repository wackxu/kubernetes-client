package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableTemplateList extends TemplateListFluentImpl<DoneableTemplateList> implements Doneable<TemplateList>{

    private final TemplateListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TemplateList,TemplateList> function;

    public DoneableTemplateList(io.fabric8.kubernetes.api.builder.Function<TemplateList,TemplateList> function){
            super();this.builder=new TemplateListBuilder(this);this.function=function;
    }
    public DoneableTemplateList(TemplateList item,io.fabric8.kubernetes.api.builder.Function<TemplateList,TemplateList> function){
            super(item);this.builder=new TemplateListBuilder(this, item);this.function=function;
    }
    public DoneableTemplateList(TemplateList item){
            super(item);this.builder=new TemplateListBuilder(this, item);this.function=new Function<TemplateList, TemplateList>() {
    public TemplateList apply(TemplateList item) {
        return item;
    }
}
;
    }

    public TemplateList done(){
             return function.apply(builder.build());
    }




}
