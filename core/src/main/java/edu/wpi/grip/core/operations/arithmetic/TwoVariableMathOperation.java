package edu.wpi.grip.core.operations.arithmetic;

import com.google.common.collect.ImmutableList;
import edu.wpi.grip.core.Operation;
import edu.wpi.grip.core.sockets.InputSocket;
import edu.wpi.grip.core.sockets.OutputSocket;
import edu.wpi.grip.core.sockets.SocketHint;
import edu.wpi.grip.core.sockets.SocketHints;

import java.util.List;

abstract class TwoVariableMathOperation implements Operation {
    private final InputSocket<Number> leftHandNumberSocket;
    private final SocketHint<Number> leftHandNumberHint = SocketHints.Inputs.createNumberSpinnerSocketHint("a",0.0);
    private final InputSocket<Number> rightHandNumberSocket;
    private final SocketHint<Number> rightHandNumberHint = SocketHints.Inputs.createNumberSpinnerSocketHint("b",0.0);

    private final OutputSocket<Number> resultSocket;
    private final SocketHint<Number> resultHint = SocketHints.Outputs.createNumberSocketHint("result",0.0);

    public TwoVariableMathOperation(InputSocket.Factory inputSocketFactory, OutputSocket.Factory outputSocketFactory){
        leftHandNumberSocket = inputSocketFactory.create(leftHandNumberHint);
        rightHandNumberSocket = inputSocketFactory.create(rightHandNumberHint);
        resultSocket = outputSocketFactory.create(resultHint);
    }

    protected abstract Number operation(Number leftHand, Number rightHand);

    @Override
    @SuppressWarnings("unchecked")
    public void perform(){
        resultSocket.setValue(operation(
                leftHandNumberSocket.getValue().get(),
                rightHandNumberSocket.getValue().get()
        ));
    }

    @Override
    public List<InputSocket> getInputSockets() {
        return ImmutableList.of(
                leftHandNumberSocket,
                rightHandNumberSocket
        );
    }

    @Override
    public List<OutputSocket> getOutputSockets() {
        return ImmutableList.of(
                resultSocket
        );
    }
}
