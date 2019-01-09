package edu.wpi.grip.core.operations.arithmetic;

import edu.wpi.grip.core.Description;
import edu.wpi.grip.core.OperationDescription;
import edu.wpi.grip.core.sockets.InputSocket;
import edu.wpi.grip.core.sockets.OutputSocket;

import javax.inject.Inject;

@Description(
        name = "Add",
        summary = "Add two numbers",
        category = OperationDescription.Category.MATH
)
public class AddOperation extends ArithmeticOperation{

    @Inject
    public AddOperation(InputSocket.Factory inputSocketFactory, OutputSocket.Factory outputSocketFactory){
        super(inputSocketFactory,outputSocketFactory);
    }

    @Override
    protected Number arithmeticOperation(Number leftHand, Number rightHand){
        return leftHand.doubleValue() + rightHand.doubleValue();
    }
}
