package practise.elevator.model;

public abstract class Request {

    protected final RequestType requestType;

    protected Request(RequestType requestType) {
        this.requestType = requestType;
    }

    public RequestType getRequestType() {
        return requestType;
    }
}

