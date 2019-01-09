package edu.wpi.grip.core.operations.arithmetic;

import edu.wpi.grip.core.Description;
import edu.wpi.grip.core.OperationDescription;
import edu.wpi.grip.core.sockets.InputSocket;
import edu.wpi.grip.core.sockets.OutputSocket;

import javax.inject.Inject;

@Description(
        name = "Multiply",
        summary = "Multiply two numbers",
        category = OperationDescription.Category.MATH
)
public class MultiplyOperation extends TwoVariableMathOperation {

    @Inject
    public MultiplyOperation(InputSocket.Factory inputSocketFactory, OutputSocket.Factory outputSocketFactory){
        super(inputSocketFactory,outputSocketFactory);
    }

    @Override
    protected Number operation(Number leftHand, Number rightHand){
        return leftHand.doubleValue() * rightHand.doubleValue();
    }
}
