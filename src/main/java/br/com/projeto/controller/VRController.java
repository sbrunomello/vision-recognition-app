package br.com.projeto.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tensorflow.ConcreteFunction;
import org.tensorflow.Signature;
import org.tensorflow.op.Ops;
import org.tensorflow.op.core.Placeholder;
import org.tensorflow.op.math.Add;
import org.tensorflow.types.TInt32;
import org.tensorflow.Tensor;
import org.tensorflow.TensorFlow;

@RestController
@RequestMapping("/api/v1")
public class VRController {
    @GetMapping("/teste")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("te amo aline meu amorzão!");
    }



//    public static void main2(String[] args) throws Exception {
//        System.out.println("Hello TensorFlow " + TensorFlow.version());
//
//        try (ConcreteFunction dbl = ConcreteFunction.create(RunApplication::dbl);
//             Tensor<TInt32> x = TInt32.scalarOf(10);
//             Tensor<TInt32> dblX = dbl.call(x).expect(TInt32.DTYPE)) {
//            System.out.println(x.data().getInt() + " doubled is " + dblX.data().getInt());
//        }
//    }
//
//    private static Signature dbl(Ops tf) {
//        Placeholder<TInt32> x = tf.placeholder(TInt32.DTYPE);
//        Add<TInt32> dblX = tf.math.add(x, x);
//        return Signature.builder().input("x", x).output("dbl", dblX).build();
//    }

}
