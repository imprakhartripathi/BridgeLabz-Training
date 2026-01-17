package browserbuddy.impl;

import java.util.Stack;

public class TabManager {

    private TabHistory activeTab;
    private final Stack<TabHistory> closedTabs = new Stack<>();

    public void openNewTab() {
        activeTab = new TabHistory();
        System.out.println("New tab opened");
    }

    public TabHistory getActiveTab() {
        if (activeTab == null) {
            throw new IllegalStateException("No active tab");
        }
        return activeTab;
    }

    public void closeCurrentTab() {
        if (activeTab != null) {
            closedTabs.push(activeTab);
            activeTab = null;
            System.out.println("Tab closed");
        }
    }

    public void restoreLastClosedTab() {
        if (!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
            System.out.println("Tab restored");
        } else {
            System.out.println("No tabs to restore");
        }
    }
}
