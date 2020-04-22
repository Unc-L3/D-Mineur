package nc.unc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Data
@AllArgsConstructor
public class Case {
    // TODO a terminer (listener)
    private Point position;
    private boolean mine;
}
