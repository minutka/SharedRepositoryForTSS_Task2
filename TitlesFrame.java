import javax.swing.SwingUtilities;
import javax.swing.JFrame;


// 
// Decompiled by Procyon v0.5.30
// 

public class TitlesFrame extends JFrame
{
    public TitlesFrame() {
        this.initUI();
    }

    /**
     * <p>Setting parameters of TitlePanel</p>
     */
    private void initUI() {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(57));
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }

    /**
     * <p>Main method whose purpose is to start application</p>
     */
    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }
        });
    }
}
