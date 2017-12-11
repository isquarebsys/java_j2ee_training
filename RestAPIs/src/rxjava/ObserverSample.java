package rxjava;

import rx.Observable;
import rx.Subscriber;

public class ObserverSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observable<Integer> source = Observable.range(1, 5);

		// defining the consumer
		Subscriber<Integer> consumer = new Subscriber<Integer>() {
			@Override
			public void onNext(Integer number) {
				System.out.println(number);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("error");
			}

			@Override
			public void onCompleted() {
				System.out.println("completed");
			}
		};
		// connecting the consumer to source
		source.subscribe(consumer);
	}
}
