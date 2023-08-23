import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class sample extends JFrame {
    public static void main(String arg[]) throws Exception {
        new sample();
    }

    public sample() throws Exception {
        String s = "https://www.google.com";
        JEditorPane pane = new JEditorPane(s);
        pane.setEditable(false);
        final JEditorPane finalpane = pane;
        pane.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent r) {
                try {
                    if (r.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
                        finalpane.setPage(r.getURL());
                } catch (Exception e) {
                }
            }
        });
        setContentPane(new JScrollPane(pane));
        setSize(1000, 1000);
        setVisible(true);
    }
}
