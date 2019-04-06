package demo1;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * @author carzy.
 * @date 13:37 2019/4/2
 */
public class HelloWorld {

    public static void main(String[] args) {

        Observable<Integer> observable = Observable.fromArray(1, 2, 3, 4, 5, 6, 7);

        Observer<Integer> observer = new Observer<>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("绑定订阅");
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("收到消息: " + integer);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("异常");
            }

            @Override
            public void onComplete() {
                System.out.println("完成");
            }
        };

        observable.subscribe(observer);

    }

}
