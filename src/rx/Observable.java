package rx;

import jsinterop.annotations.JsType;
import rx.functions.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * The Observable object represents a push based collection.
 * 
 * The Observer and Objects interfaces provide a generalized mechanism for push-based notification,
 * also known as the observer design pattern. The Observable object represents the object that sends
 * notifications (the provider); the Observer object represents the class that receives them (the
 * observer).
 *
 * Created by bduisenov on 20/05/16.
 */
@JsType(name = "Observable", namespace = "Rx", isNative = true)
public class Observable<T> {

    /**
     * Merges the specified observable sequences into one observable sequence by using the selector
     * function whenever any of the observable sequences produces an element. This can be in the
     * form of an argument list of observables or an array. If the result selector is omitted, a
     * list with the elements will be yielded.
     */
    public native static <T1, T2, R> Observable<R> combineLatest(Observable<? extends T1> o1, Observable<? extends T2> o2,
            Func2<? super T1, ? super T2, ? extends R> combineFunction);

    public native static <T1, T2, T3, R> Observable<R> combineLatest(Observable<? extends T1> o1,
            Observable<? extends T2> o2, Observable<? extends T3> o3,
            Func3<? super T1, ? super T2, ? super T3, ? extends R> combineFunction);

    public native static <T1, T2, T3, T4, R> Observable<R> combineLatest(Observable<? extends T1> o1,
            Observable<? extends T2> o2, Observable<? extends T3> o3, Observable<? extends T4> o4,
            Func4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> combineFunction);

    public native static <T1, T2, T3, T4, T5, R> Observable<R> combineLatest(Observable<? extends T1> o1,
            Observable<? extends T2> o2, Observable<? extends T3> o3, Observable<? extends T4> o4,
            Observable<? extends T5> o5,
            Func5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> combineFunction);

    public native static <T1, T2, T3, T4, T5, T6, R> Observable<R> combineLatest(Observable<? extends T1> o1,
            Observable<? extends T2> o2, Observable<? extends T3> o3, Observable<? extends T4> o4,
            Observable<? extends T5> o5, Observable<? extends T6> o6,
            Func6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> combineFunction);

    public native static <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> combineLatest(Observable<? extends T1> o1,
            Observable<? extends T2> o2, Observable<? extends T3> o3, Observable<? extends T4> o4,
            Observable<? extends T5> o5, Observable<? extends T6> o6, Observable<? extends T7> o7,
            Func7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> combineFunction);

    public native static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> combineLatest(Observable<? extends T1> o1,
            Observable<? extends T2> o2, Observable<? extends T3> o3, Observable<? extends T4> o4,
            Observable<? extends T5> o5, Observable<? extends T6> o6, Observable<? extends T7> o7,
            Observable<? extends T8> o8,
            Func8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> combineFunction);

    public native static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> combineLatest(Observable<? extends T1> o1,
            Observable<? extends T2> o2, Observable<? extends T3> o3, Observable<? extends T4> o4,
            Observable<? extends T5> o5, Observable<? extends T6> o6, Observable<? extends T7> o7,
            Observable<? extends T8> o8, Observable<? extends T9> o9,
            Func9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> combineFunction);

    public native static <T, R> Observable<R> combineLatest(List<? extends Observable<? extends T>> sources,
            FuncN<? extends R> combineFunction);

    public native static <T, R> Observable<R> combineLatest(Iterable<? extends Observable<? extends T>> sources,
            FuncN<? extends R> combineFunction);

    /**
     * Returns an observable sequence that produces a value after each period
     */
    public native static Observable<Long> interval(long period);

    //FIXME public native static Observable<Long> interval(long period, Scheduler scheduler);

    /**
     * Converts arguments to an observable sequence.
     */
    public native static <T> Observable<T> of(T... args);

    /**
     * Returns an observable sequence that produces a value after dueTime has elapsed and then after
     * each period. Note for rx.lite.js, only relative time is supported.
     */
    public native static Observable<Long> timer(long initialDelay);

    public native static Observable<Long> timer(long initialDelay, long period);

    // FIXME public native static Observable<Long> timer(long initialDelay, long period, Scheduler scheduler);

}
