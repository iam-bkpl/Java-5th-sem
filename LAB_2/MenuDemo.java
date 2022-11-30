import java.awt.*;

class MenuDemo {
    MenuDemo() {
        Frame frame = new Frame("Menus Demo");
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu runMenu = new Menu("Run");
        Menu sourceMenu = new Menu("Source");
        Menu refactorMenu = new Menu("Refactor");
        Menu navigateMenu = new Menu("Navigate");
        Menu searchMenu = new Menu("Search");
        Menu projectMenu = new Menu("Project");
        Menu windowMenu = new Menu("Window");
        Menu helpMenu = new Menu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(runMenu);
        menuBar.add(sourceMenu);
        menuBar.add(refactorMenu);
        menuBar.add(navigateMenu);
        menuBar.add(searchMenu);
        menuBar.add(projectMenu);
        menuBar.add(windowMenu);
        menuBar.add(helpMenu);

        MenuItem openProject = new MenuItem("Open Project");
        MenuItem closeProject = new MenuItem("Close Project");
        MenuItem buildAll = new MenuItem("Build All");
        MenuItem buildProject = new MenuItem("Build Project");

        projectMenu.add(openProject);
        projectMenu.add(closeProject);
        projectMenu.add(buildAll);
        projectMenu.add(buildProject);

        frame.setMenuBar(menuBar);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MenuDemo md = new MenuDemo();

    }
}