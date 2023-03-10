package com.knoldus.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: ping.proto")
public final class CoreServiceGrpc {

  private CoreServiceGrpc() {}

  public static final String SERVICE_NAME = "sms.core.CoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.knoldus.model.PingRequest,
      com.knoldus.model.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.knoldus.model.PingRequest.class,
      responseType = com.knoldus.model.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.knoldus.model.PingRequest,
      com.knoldus.model.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<com.knoldus.model.PingRequest, com.knoldus.model.PingResponse> getPingMethod;
    if ((getPingMethod = CoreServiceGrpc.getPingMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getPingMethod = CoreServiceGrpc.getPingMethod) == null) {
          CoreServiceGrpc.getPingMethod = getPingMethod = 
              io.grpc.MethodDescriptor.<com.knoldus.model.PingRequest, com.knoldus.model.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sms.core.CoreService", "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.knoldus.model.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.knoldus.model.PingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("Ping"))
                  .build();
          }
        }
     }
     return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoreServiceStub newStub(io.grpc.Channel channel) {
    return new CoreServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CoreServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CoreServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CoreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(com.knoldus.model.PingRequest request,
        io.grpc.stub.StreamObserver<com.knoldus.model.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.knoldus.model.PingRequest,
                com.knoldus.model.PingResponse>(
                  this, METHODID_PING)))
          .build();
    }
  }

  /**
   */
  public static final class CoreServiceStub extends io.grpc.stub.AbstractStub<CoreServiceStub> {
    private CoreServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreServiceStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.knoldus.model.PingRequest request,
        io.grpc.stub.StreamObserver<com.knoldus.model.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CoreServiceBlockingStub extends io.grpc.stub.AbstractStub<CoreServiceBlockingStub> {
    private CoreServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.knoldus.model.PingResponse ping(com.knoldus.model.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CoreServiceFutureStub extends io.grpc.stub.AbstractStub<CoreServiceFutureStub> {
    private CoreServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.knoldus.model.PingResponse> ping(
        com.knoldus.model.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.knoldus.model.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.knoldus.model.PingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.knoldus.model.CoreGrpcApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CoreService");
    }
  }

  private static final class CoreServiceFileDescriptorSupplier
      extends CoreServiceBaseDescriptorSupplier {
    CoreServiceFileDescriptorSupplier() {}
  }

  private static final class CoreServiceMethodDescriptorSupplier
      extends CoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CoreServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CoreServiceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
