package com.sixtwo.structural.adapter.basic;

/**
 * @author zhangshuaifei
 * @description 圆形插头键盘适配器，可以调用圆形插头的键盘，同时也可以提供USB插头的功能给客户端
 *              1）将键盘作为变量来访问功能
 *              2）使适配器继承键盘，从而调用键盘的功能(java只支持单继承，所以此方法有局限性)
 * @date 2019/4/13 15:00
 */
public class KeyBoardAdapter implements Target{

    private KeyBoard keyBoard;

    public KeyBoardAdapter(KeyBoard keyBoard){
        this.keyBoard = keyBoard;
    }

    @Override
    public void USBPlug() {
        keyBoard.circlePlug();
    }
}
