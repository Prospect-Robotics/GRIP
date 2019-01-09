package edu.wpi.grip.core.operations.arithmetic;

import edu.wpi.grip.core.Description;
import edu.wpi.grip.core.OperationDescription;
import edu.wpi.grip.core.sockets.InputSocket;
import edu.wpi.grip.core.sockets.OutputSocket;

import javax.inject.Inject;

@Description(
        name = "Modulo",
        summary = "Modulo two numbers", //TODO: bad summary
        category = OperationDescription.Category.MATH
)
public class ModuloOperation extends ArithmeticOperation{

    @Inject
    public ModuloOperation(InputSocket.Factory inputSocketFactory, OutputSocket.Factory outputSocketFactory){
        super(inputSocketFactory,outputSocketFactory);
    }

    @Override
    protected Number arithmeticOperation(Number leftHand, Number rightHand){
        return leftHand.doubleValue() % rightHand.doubleValue();
    }
}
