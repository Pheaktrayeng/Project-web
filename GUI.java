package mini_project;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

class GUI {
    void banner() {
        bannerRunning("                                    Welcome to                              ");
        bannerRunning("                             Stock Management System                        ");
        System.out.println("-----------------------------------------------------------------------");
        bannerRunning("   SSSSSSSSSSSSSSS RRRRRRRRRRRRRRRRR                GGGGGGGGGGGGG  1111111   ");
        bannerRunning(" SS:::::::::::::::SR::::::::::::::::R            GGG::::::::::::G 1::::::1   ");
        bannerRunning("S:::::SSSSSS::::::SR::::::RRRRRR:::::R         GG:::::::::::::::G1:::::::1   ");
        bannerRunning("S:::::S     SSSSSSSRR:::::R     R:::::R       G:::::GGGGGGGG::::G111:::::1   ");
        bannerRunning("S:::::S              R::::R     R:::::R      G:::::G       GGGGGG   1::::1   ");
        bannerRunning("S:::::S              R::::R     R:::::R     G:::::G                 1::::1   ");
        bannerRunning(" S::::SSSS           R::::RRRRRR:::::R      G:::::G                 1::::1   ");
        bannerRunning("  SS::::::SSSSS      R:::::::::::::RR       G:::::G    GGGGGGGGGG   1::::l   ");
        bannerRunning("    SSS::::::::SS    R::::RRRRRR:::::R      G:::::G    G::::::::G   1::::l   ");
        bannerRunning("       SSSSSS::::S   R::::R     R:::::R     G:::::G    GGGGG::::G   1::::l   ");
        bannerRunning("            S:::::S  R::::R     R:::::R     G:::::G        G::::G   1::::l   ");
        bannerRunning("            S:::::S  R::::R     R:::::R      G:::::G       G::::G   1::::l   ");
        bannerRunning("SSSSSSS     S:::::SRR:::::R     R:::::R       G:::::GGGGGGGG::::G111::::::111");
        bannerRunning("S::::::SSSSSS:::::SR::::::R     R:::::R        GG:::::::::::::::G1::::::::::1");
        bannerRunning("S:::::::::::::::SS R::::::R     R:::::R          GGG::::::GGG:::G1::::::::::1");
        bannerRunning(" SSSSSSSSSSSSSSS   RRRRRRRR     RRRRRRR             GGGGGG   GGGG111111111111");
        System.out.println();
        loading();
    }

    private void bannerRunning(String text) {
        System.out.println(text);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void loading() {
        for (int i = 0; i < "Please wait...".length(); i++) {
            System.out.print("Please wait...".charAt(i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    void menu() {
        System.out.println();
        Table t = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
        t.addCell("    *)Display | W)rite | R)ead | U)pdate | D)elete | F)irst | P)revious | N)ext | L)ast    ");
        t.addCell("     S)earch | G)oto | Se)t row | Sa)ve | Ba)ck up | Re)store | H)elp | E)xit              ");
        System.out.println(t.render());
    }

}
