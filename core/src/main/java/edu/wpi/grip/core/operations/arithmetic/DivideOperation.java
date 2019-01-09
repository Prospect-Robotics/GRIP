package edu.wpi.grip.core.operations.arithmetic;

import edu.wpi.grip.core.Description;
import edu.wpi.grip.core.OperationDescription;
import edu.wpi.grip.core.sockets.InputSocket;
import edu.wpi.grip.core.sockets.OutputSocket;

import javax.inject.Inject;

@Description(
        name = "Divide",
        summary = "Divide one number by another",
        category = OperationDescription.Category.MATH
)
public class DivideOperation extends ArithmeticOperation{

    @Inject
    public DivideOperation(InputSocket.Factory inputSocketFactory, OutputSocket.Factory outputSocketFactory){
        super(inputSocketFactory,outputSocketFactory);
    }

    @Override
    protected Number arithmeticOperation(Number leftHand, Number rightHand){
        return leftHand.doubleValue() / rightHand.doubleValue();
    }
}
