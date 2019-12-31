package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableKubeSchema extends KubeSchemaFluentImpl<DoneableKubeSchema> implements Doneable<KubeSchema>{

    private final KubeSchemaBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<KubeSchema,KubeSchema> function;

    public DoneableKubeSchema(io.fabric8.kubernetes.api.builder.Function<KubeSchema,KubeSchema> function){
            super();this.builder=new KubeSchemaBuilder(this);this.function=function;
    }
    public DoneableKubeSchema(KubeSchema item,io.fabric8.kubernetes.api.builder.Function<KubeSchema,KubeSchema> function){
            super(item);this.builder=new KubeSchemaBuilder(this, item);this.function=function;
    }
    public DoneableKubeSchema(KubeSchema item){
            super(item);this.builder=new KubeSchemaBuilder(this, item);this.function=new Function<KubeSchema, KubeSchema>() {
    public KubeSchema apply(KubeSchema item) {
        return item;
    }
}
;
    }

    public KubeSchema done(){
             return function.apply(builder.build());
    }




}
