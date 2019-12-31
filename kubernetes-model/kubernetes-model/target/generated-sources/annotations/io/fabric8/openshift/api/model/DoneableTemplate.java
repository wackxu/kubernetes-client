package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableTemplate extends TemplateFluentImpl<DoneableTemplate> implements Doneable<Template>{

    private final TemplateBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Template,Template> function;

    public DoneableTemplate(io.fabric8.kubernetes.api.builder.Function<Template,Template> function){
            super();this.builder=new TemplateBuilder(this);this.function=function;
    }
    public DoneableTemplate(Template item,io.fabric8.kubernetes.api.builder.Function<Template,Template> function){
            super(item);this.builder=new TemplateBuilder(this, item);this.function=function;
    }
    public DoneableTemplate(Template item){
            super(item);this.builder=new TemplateBuilder(this, item);this.function=new Function<Template, Template>() {
    public Template apply(Template item) {
        return item;
    }
}
;
    }

    public Template done(){
             return function.apply(builder.build());
    }




}
