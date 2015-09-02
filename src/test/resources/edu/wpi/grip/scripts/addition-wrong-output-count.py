import edu.wpi.grip.core as grip
import java.lang.Integer

inputs = [
    grip.SocketHint("a", java.lang.Integer),
    grip.SocketHint("b", java.lang.Integer),
]

outputs = [
    grip.SocketHint("sum", java.lang.Integer),
]

def perform(a, b):
    return a + b, 3
