package com.sixtwo.creation.builder.basic;

/**
 * @author zhangshuaifei
 * @description 宇宙飞船----使用建造者模式来进行构建，其中包含：轨道舱、发动机、逃逸塔
 * @date 2019/4/12 21:33
 */
public class AirShip {
    private OrbitalModule orbitalModule;//轨道舱
    private Engine engine;//发动机
    private EscapeTower escapeTower;//逃逸塔

    public void launch(){
        System.out.println("轨道舱："+orbitalModule+"----ready！");
        System.out.println("发动机："+engine+"----ready！");
        System.out.println("逃逸塔："+escapeTower+"----ready！");
        System.out.println("Airship is ready to go,commander！");
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}

