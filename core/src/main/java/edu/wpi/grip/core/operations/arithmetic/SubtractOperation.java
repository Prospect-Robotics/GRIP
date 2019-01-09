package edu.wpi.grip.core.operations.arithmetic;

import edu.wpi.grip.core.Description;
import edu.wpi.grip.core.OperationDescription;
import edu.wpi.grip.core.sockets.InputSocket;
import edu.wpi.grip.core.sockets.OutputSocket;

import javax.inject.Inject;

@Description(
        name = "Subtract",
        summary = "Subtract one number by another",
        category = OperationDescription.Category.MATH
)
public class SubtractOperation extends TwoVariableMathOperation {

    @Inject
    public SubtractOperation(InputSocket.Factory inputSocketFactory, OutputSocket.Factory outputSocketFactory){
        super(inputSocketFactory,outputSocketFactory);
    }

    @Override
    protected Number operation(Number leftHand, Number rightHand){
        return leftHand.doubleValue() - rightHand.doubleValue();
    }
}
