import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

public class Star{
    /**
     * <p>Method for creating shape of star</p>
     * @param arms number of line elements of star
     * @param center coordinates for center
     * @param rOuter for calculating position of points
     * @param rInner for calculating position of points
     * @return created shape
     * */
     Shape createStar(final int arms, final Point center, final double rOuter, final double rInner) {
        final double angle = 3.141592653589793 / arms;
        final GeneralPath path = new GeneralPath();
        for (int i = 0; i < 2 * arms; ++i) {
            final double r = ((i & 0x1) == 0x0) ? rOuter : rInner;
            final Point2D.Double p = new Point2D.Double(center.x + Math.cos(i * angle) * r, center.y + Math.sin(i * angle) * r);
            if (i == 0) {
                path.moveTo(p.getX(), p.getY());
            }
            else {
                path.lineTo(p.getX(), p.getY());
            }
        }
        path.closePath();
        return path;
    }
}
