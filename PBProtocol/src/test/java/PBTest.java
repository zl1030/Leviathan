import com.zl1030.leviathan.pb.EchoServiceGrpc;
import com.zl1030.leviathan.pb.GameModel;
import com.zl1030.leviathan.pb.RPC;
import io.grpc.stub.StreamObserver;
import org.junit.Test;

/**
 * @Author: zl1030
 * @Date: 2018/3/20 20:46
 */

public class PBTest {

    @Test
    public void Test() {

        GameModel.Person.Builder personBuilder = GameModel.Person.newBuilder();
        personBuilder.setEmail("abc");
        personBuilder.setId(1);
        personBuilder.setName("zl");

        GameModel.Person person = personBuilder.build();

        RPC.FooRequest.Builder request = RPC.FooRequest.newBuilder();
        request.setPerson(person);

    }

    class EchoServiceImpl extends EchoServiceGrpc.EchoServiceImplBase {
        @Override
        public void foo(RPC.FooRequest request, StreamObserver<RPC.FooResponse> responseObserver) {
            super.foo(request, responseObserver);
        }

        @Override
        public void foo2(GameModel.Person request, StreamObserver<GameModel.Person> responseObserver) {
            super.foo2(request, responseObserver);
        }
    }
}
