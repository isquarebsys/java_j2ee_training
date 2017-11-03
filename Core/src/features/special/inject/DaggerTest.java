package features.special.inject;

import javax.inject.Inject;

public class DaggerTest {
	@Inject
    BackendService backendService; // 
    private MyComponent component;

    private DaggerTest() {
        component = DaggerMyComponent.builder().build();
        component.inject(this);
    }

    private void callServer() {
        boolean callServer = backendService.callServer();
        if (callServer) {
            System.out.println("Server call was successful. ");
        } else {
            System.out.println("Server call failed. ");
        }
    }

    public static void main(String[] args) {
    	DaggerTest main = new DaggerTest();
        main.callServer();
    }
}
